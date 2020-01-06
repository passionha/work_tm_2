package kr.byweb.tm.user.anlysStd.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.byweb.tm.user.anlysStd.model.AnlysStd;
import kr.byweb.tm.user.anlysStd.svc.AnlysStdService;

@Controller
public class AnlysStdController {
	
	@Autowired
	AnlysStdService anlysStdService;
	
	/*
	@RequestMapping("/")
	public String getAnlysStdList(Model model) {
		model.addAttribute("name", "홍길동");
		return "anlysStdList";
	}
	*/
	
	@RequestMapping("/getAnlysStdList")
	public AnlysStd getAnlysStdList() {
		return anlysStdService.getAnlysStdList();
	}
}
