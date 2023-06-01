package com.mycom.mvc02;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	@RequestMapping("/bbs/view.do")
	public String view() {
		return "bbs/view";
	}

	@RequestMapping("/bbs/content.do")
	public String content(Model model) {
		model.addAttribute("user", "홍길동");
		return "/bbs/content";
	}

	@RequestMapping("/bbs/reply.do")
	public ModelAndView reply(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("users", "홍씨 집안 사람들");
		mv.addObject("age", "40");
		mv.setViewName("/bbs/reply");

		return mv;
	}

	@RequestMapping("/search/search.do")
	public String search(HttpServletRequest request, Model model) {
		String search = request.getParameter("search");
		model.addAttribute("search", search);
		return "search/search";
	}
//	@RequestMapping("/search/search.do")
//	public String search(@RequestParam("search") String search, Model model) {
//		model.addAttribute("search", search);
//		return "search/search";
//	}
//	

	@RequestMapping(method = RequestMethod.POST, value = "/searchOk")
	public String searchOk(HttpServletRequest request, Model model) {
		String search = request.getParameter("search");
		model.addAttribute("search", search);
		return "searchOk";
	}
//	@RequestMapping("/register/registerOk.do")
//	public String registerOk(@RequestParam("userId") String userId,
//	                         @RequestParam("userPass") String userPass,
//	                         @RequestParam("userName") String userName,
//	                         @RequestParam("userEmail") String userEmail,
//	                         @RequestParam("userMobile") String userMobile,
//	                         Model model) {
//		Register rg = new Register();
//		rg.setUserId(userId);
//		rg.setUserPass(userPass);
//		rg.setUserName(userName);
//		rg.setUserEmail(userEmail);
//		rg.setUserMobile(userMobile);
//	    
//		model.addAttribute("member", rg);
//
//		return "member/registerOk"; // registerOk.jsp 경로 반환
//	}

//	@RequestMapping("/member/registerOk.do")
//	public String registerOk(HttpServletRequest request, Model model) {
//		String userId = request.getParameter("userId");
//		String userPass = request.getParameter("userPass");
//		String userName = request.getParameter("userName");
//		String userEmail = request.getParameter("userEmail");
//		String userMobile = request.getParameter("userMobile");
//
//		Register rg = new Register();
//		rg.setUserId(userId);
//		rg.setUserPass(userPass);
//		rg.setUserName(userName);
//		rg.setUserEmail(userEmail);
//		rg.setUserMobile(userMobile);
//		model.addAttribute("member", rg);
//
//		return "member/registerOk"; // registerOk.jsp 경로 반환
//	}

	@RequestMapping("/member/registerOk.do")
	public String registerOk(Register register) {
		return "member/registerOk";
	}

	@RequestMapping("/member/register.do")
	public String register() {
		return "member/register";
	}

	@RequestMapping("/0601/member")
	public String member() {
		return "0601/member";
	}

// 받는 1번방법
//	@RequestMapping("/0601/memberok")
//	public String memberok(HttpServletRequest request, Model model) {
//		Member mb = new Member();
//		mb.setUserid(request.getParameter("userid"));
//		mb.setUserpass(request.getParameter("userpass"));
//		mb.setUsernum(request.getParameter("usernum"));
//		model.addAttribute("mem", mb);
//		return "0601/memberok";
//	}

	// 받는 2번방법
//	@RequestMapping("/0601/memberok")
//	public String memberok(
//@RequestParam("userid") String userid,
//@RequestParam("userpass") String userpass,
//			@RequestParam("usernum") String usernum, Model model) {
//		Member mb = new Member();
//		mb.setUserid(userid);
//		mb.setUserpass(userpass);
//		mb.setUsernum(usernum);
//		model.addAttribute("mem", mb);
//		return "0601/memberok";
//	}
	
	// 받는 3번방법
	@RequestMapping("/0601/memberok")
	public String memberok(@ModelAttribute("mem") Member member) {
//변수 이름 바꾸려면 @ModelAttribute
		return "0601/memberok";
	}

}
