package egovframework.let.temptemp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.let.temptemp.service.TempTempVO;
import egovframework.let.temptemp.service.TemptempService;

@Controller
public class TempTempcontroller {
	
	@Autowired
	TemptempService temptempService;
    
    
    //리스트 출력
	@RequestMapping(value="/temptemp/selectList.do")
 	public String selectList (TempTempVO searchVO, ModelMap model) throws Exception {
		List<TempTempVO> list = temptempService.selectList(searchVO);
		
		model.addAttribute("list",list);
		
		return "temptemp/SelectList";
	}    


	

	
}