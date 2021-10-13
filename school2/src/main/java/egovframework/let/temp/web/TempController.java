package egovframework.let.temp.web;


import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.let.temp.service.TempService;
import egovframework.let.temp.service.TempVO;
import egovframework.let.utl.fcc.service.EgovStringUtil;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

@Controller
public class TempController {

	@Resource(name= "tempService")
	private TempService tempService;
	
	@RequestMapping(value = "/temp/select.do")
	public String select(@ModelAttribute("searchVO") TempVO searchVO, HttpServletRequest request, ModelMap model) 
	throws Exception {
		TempVO result = tempService.selectTemp(searchVO);
		
		model.addAttribute("result", result);
		
		return "temp/TempSelect";
	}
	
	/*@RequestMapping(value="/temp/list.do")
	public String list(Model model) throws Exception {
		List<TempVO> list = tempService.list();
		
		model.addAttribute("list", list);
		
		return "temp/TempSelect";
	}*/
	
	@RequestMapping(value="/temp/list.do")
	public String list(@ModelAttribute("searchVO") TempVO searchVO, HttpServletRequest request, ModelMap model) throws Exception {
		List<EgovMap> result = tempService.list(searchVO);
		
		model.addAttribute("result", result);
		
		return "temp/TempList";
	}
	
	
	/*@RequestMapping(value = "/temp/regist.do")
	public String tempRegist(@ModelAttribute("searchVO") TempVO searchVO, HttpServletRequest request, ModelMap model) 
	throws Exception {
		System.out.println(searchVO.getTempId());
		
		List<EgovMap> list = tempService.list(searchVO);
		
		model.addAttribute("list", list);
		
		return "temp/TempRegist";
	}*/
	
	@RequestMapping(value = "/temp/tempRegist.do")
	public String tempRegist(@ModelAttribute("searchVO") TempVO searchVO, HttpServletRequest request, ModelMap model) 
	throws Exception {
		TempVO result = new TempVO();
		
		if(!EgovStringUtil.isEmpty(searchVO.getTempId())) {
			result = tempService.selectTemp(searchVO);
		}
		model.addAttribute("result", result);
		
		return "temp/TempRegist";
	}
	
	@RequestMapping(value= "/temp/selectList.do")
	public String selectList(@ModelAttribute("searchVO")TempVO searchVO, HttpServletRequest request, ModelMap model) throws Exception{
		PaginationInfo paginationInfo = new PaginationInfo();
		
		paginationInfo.setCurrentPageNo(searchVO.getPageIndex());
		paginationInfo.setRecordCountPerPage(searchVO.getPageUnit());
		paginationInfo.setPageSize(searchVO.getPageSize());
		
		searchVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
		searchVO.setLastIndex(paginationInfo.getLastRecordIndex());
		searchVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());
		
		List<EgovMap> resultList = tempService.selectTempList(searchVO);
		model.addAttribute("resultList", resultList);
		
		int totcnt = tempService.selectTempListCnt(searchVO);
		
		paginationInfo.setTotalRecordCount(totcnt);
		model.addAttribute("paginationInfo", paginationInfo);
		
		return "temp/TempSelectList";		
	}
	
	/*
	@RequestMapping(value = "/temp/tempRegist.do")
	public String tempRegist(@ModelAttribute("searchVO")TempVO searchVO, HttpServletRequest request, ModelMap model) throws Exception {
		System.out.println("aa");
		
		return "temp/TempRegist";
	}
	*/
	
	/*@RequestMapping(value = "/temp/insert.do")
	public String insert(@ModelAttribute("searchVO")TempVO searchVO, HttpServletRequest request, ModelMap model) 
			throws Exception{
		
		if(searchVO.getTempId().isEmpty()) {
			tempService.insertTemp(searchVO);
		} else {
			tempService.updateTemp(searchVO);
		}
		
		return "redirect:/temp/list.do";
	}*/
	
	@RequestMapping(value ="temp/insert.do")
	public String insert(@ModelAttribute("searchVO")TempVO searchVO, HttpServletRequest request, ModelMap model) throws Exception {
		tempService.insertTemp(searchVO);
		
		return "redirect:/temp/selectList.do";
	}
	
	@RequestMapping(value="/temp/delete.do")
	public String delete(@ModelAttribute("searchVO")TempVO searchVO, HttpServletRequest request, ModelMap model) throws Exception {
		tempService.deleteTemp(searchVO);
		
		return "redirect:/temp/selectList.do";
	}
	
	@RequestMapping(value="temp/update.do")
	public String update(@ModelAttribute("searchVO")TempVO searchVO, HttpServletRequest request, ModelMap model) throws Exception {
		tempService.updateTemp(searchVO);
		
		return "redirect:/temp/selectList.do";
	}
}
