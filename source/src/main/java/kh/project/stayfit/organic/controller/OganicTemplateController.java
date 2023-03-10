package kh.project.stayfit.organic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/oganic")
public class OganicTemplateController {
	@GetMapping("/all")
	public String all() {
		return "/oganic/all";
	}
	@GetMapping("/blog_details")
	public String blog_details() {
		return "oganic/blog-details";
	}
	@GetMapping("/blog")
	public String blog() {
		return "oganic/blog";
	}
	@GetMapping("/checkout")
	public String checkout() {
		return "oganic/checkout";
	}
	@GetMapping("/contact")
	public String contact() {
		return "oganic/contact";
	}
	@GetMapping("/index")
	public String index() {
		return "oganic/index";
	}
	@GetMapping("/shop_details")
	public String shop_details() {
		return "oganic/shop-details";
	}
	@GetMapping("/shop_grid")
	public String shop_grid() {
		return "oganic/shop-grid";
	}
	@GetMapping("/shoping_cart")
	public String shop_cart() {
		return "oganic/shoping-cart";
	}
}
