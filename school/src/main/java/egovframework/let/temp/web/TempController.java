package egovframework.let.temp.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.let.temp.service.TempService;
import egovframework.let.temp.service.TempVO;

@Controller
public class TempController {
	
	@Resource(name="tempService")
	private TempService tempService;
	
//	//임시데이터 가져오기
//	@RequestMapping(value = "/temp/select.do")
//	public String select(@ModelAttribute("searchVO") TempVO searchVO, HttpServletRequest request, ModelMap model) throws Exception{
//		TempVO result = tempService.selectTemp(searchVO);
//		model.addAttribute("result", result);
//		return "temp/TempSelect";
//	}
	
	//임시데이터 등록
	@RequestMapping(value = "/temp/tempRegist.do")
	public String tempRegist(@ModelAttribute("searchVO") TempVO searchVO, HttpServletRequest request, ModelMap model) throws Exception{
		return "temp/TempRegist";
	}
	
//	//임시데이터 등록하기
//	@RequestMapping(value = "/temp/insert.do")
//	public String insert(@ModelAttribute("searchVO") TempVO searchVO, HttpServletRequest request, ModelMap model) throws Exception{
//		String tempId = tempService.insertTemp(searchVO);
//		return "redirect:/temp/select.do?tempId=" +tempId;
//	}
	
	
	//임시데이터 등록하기
	@RequestMapping(value = "/temp/insert.do")
	public String insert(@ModelAttribute("searchVO") TempVO searchVO, HttpServletRequest request, ModelMap model) throws Exception{
		String tempId = tempService.insertTemp(searchVO);
		return "redirect:/temp/select.do";
	}
	
	
	//이부분 지우기
	//임시데이터 가져오기
	@RequestMapping(value = "/temp/select.do")
	public String list(@ModelAttribute("searchVO") TempVO searchVO, HttpServletRequest request, ModelMap model) throws Exception{
		List<TempVO> result = new ArrayList<TempVO>();
		result = tempService.selectList(searchVO);
		model.addAttribute("result", result);
		return "temp/TempSelect";
	}
}
