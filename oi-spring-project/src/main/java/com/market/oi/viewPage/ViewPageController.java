package com.market.oi.viewPage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.market.oi.member.MemberVO;

@Controller
@RequestMapping("/viewPage/**")
public class ViewPageController {

	@Autowired
	public ViewPageService viewPageService;


	@GetMapping("viewList")
	public void viewList()throws Exception {

	}
	
	


	@GetMapping("viewProfile")
	public ModelAndView viewProfile(MemberVO memberVO) throws Exception{

		ModelAndView mv = new ModelAndView();
		memberVO=viewPageService.getUsername(memberVO);
		mv.addObject("memberVO",memberVO);
		mv.setViewName("viewPage/viewProfile");
		
		System.out.println(memberVO);

		
		return mv;
	}

	@GetMapping("viewPurchase-sell")
	public ModelAndView getPurchasesell(MemberVO memberVO)throws Exception{
		
		ModelAndView mv = new ModelAndView();
		memberVO=viewPageService.getUsername(memberVO);
		mv.addObject("memberVO",memberVO);
		mv.setViewName("viewPage/viewPurchase-sell");
		
		System.out.println(memberVO);

		
		return mv;

	}

	@GetMapping("viewReview")
	public ModelAndView getreview(MemberVO memberVO)throws Exception{
		
		ModelAndView mv = new ModelAndView();
		memberVO=viewPageService.getUsername(memberVO);
		mv.addObject("memberVO",memberVO);
		mv.setViewName("viewPage/viewReview");
		
		System.out.println(memberVO);

		
		return mv;
	}
	@GetMapping("viewReview-seller")
	public ModelAndView getreviewSeller(MemberVO memberVO)throws Exception{
		ModelAndView mv = new ModelAndView();
		memberVO=viewPageService.getUsername(memberVO);
		mv.addObject("memberVO",memberVO);
		mv.setViewName("viewPage/viewReview-seller");
		
		System.out.println(memberVO);

		
		return mv;
	}
	@GetMapping("viewReview-buyer")
	public ModelAndView getreviewBuyer(MemberVO memberVO)throws Exception{
		ModelAndView mv = new ModelAndView();
		memberVO=viewPageService.getUsername(memberVO);
		mv.addObject("memberVO",memberVO);
		mv.setViewName("viewPage/viewReview-buyer");
		
		System.out.println(memberVO);

		
		return mv;
	}
	@GetMapping("viewVillage")
	public ModelAndView getVillage(MemberVO memberVO)throws Exception{
		ModelAndView mv = new ModelAndView();
		memberVO=viewPageService.getUsername(memberVO);
		mv.addObject("memberVO",memberVO);
		mv.setViewName("viewPage/viewVillage");
		
		System.out.println(memberVO);

		
		return mv;
	}
	@GetMapping("viewVillage-list")
	public ModelAndView getVillageList(MemberVO memberVO)throws Exception{
		ModelAndView mv = new ModelAndView();
		memberVO=viewPageService.getUsername(memberVO);
		mv.addObject("memberVO",memberVO);
		mv.setViewName("viewPage/viewVillage-list");
		
		System.out.println(memberVO);

		
		return mv;
	}
	@GetMapping("viewVillage-comment")
	public ModelAndView getVillageComment(MemberVO memberVO)throws Exception{
		ModelAndView mv = new ModelAndView();
		memberVO=viewPageService.getUsername(memberVO);
		mv.addObject("memberVO",memberVO);
		mv.setViewName("viewPage/viewVillage-comment");
		
		System.out.println(memberVO);

		
		return mv;
	}

}
