package webshop.com.Controller.User;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import webshop.com.Dto.CartDto;
import webshop.com.Service.User.CartServiceImpl;

@Controller
public class CartController extends BaseController {

	@Autowired
	private CartServiceImpl cartServiceImpl = new CartServiceImpl();

	@RequestMapping(value = { "ListCart" })
	public ModelAndView ListCart() {
	
		_mvShare.addObject("menus", _homeServiceImpl.GetDataMenus());
		_mvShare.addObject("slides", _homeServiceImpl.GetDataSlide());
		_mvShare.addObject("categorys", _homeServiceImpl.GetDataCategorys());
		_mvShare.addObject("h_products", _homeServiceImpl.GetHighlightProductsDto());
		_mvShare.addObject("n_products", _homeServiceImpl.GetNewProductsDto());
		
		_mvShare.setViewName("user/cart/list_cart");
		return _mvShare;
	}
	
	
	@RequestMapping(value = "AddCart/{id}")
	public String AddCart(HttpServletRequest request,HttpSession session, @PathVariable long id) {
		HashMap<Long, CartDto> cart = (HashMap<Long, CartDto>)session.getAttribute("Cart");
		if(cart == null) {
			cart = new HashMap<Long, CartDto>();
		}
		cart = cartServiceImpl.AddCart(id, cart);
		session.setAttribute("Cart", cart);
		session.setAttribute("TotalQuantyCart", cartServiceImpl.TotalQuanty(cart));
		session.setAttribute("TotalPriceCart", cartServiceImpl.TotalPrice(cart));
		return "redirect:"+request.getHeader("Referer");
	}
	
	@RequestMapping(value = "EditCart/{id}/{quanty}")
	public String EditCart(HttpServletRequest request,HttpSession session, @PathVariable long id,@PathVariable int quanty) {
		HashMap<Long, CartDto> cart = (HashMap<Long, CartDto>)session.getAttribute("Cart");
		if(cart == null) {
			cart = new HashMap<Long, CartDto>();
		}
		cart = cartServiceImpl.EditCart(id, quanty, cart);
		session.setAttribute("Cart", cart);
		session.setAttribute("TotalQuantyCart", cartServiceImpl.TotalQuanty(cart));
		session.setAttribute("TotalPriceCart", cartServiceImpl.TotalPrice(cart));
		return "redirect:"+request.getHeader("Referer");
	}
	
	@RequestMapping(value = "DeleteCart/{id}")
	public String DeleteCart(HttpServletRequest request,HttpSession session, @PathVariable long id) {
		HashMap<Long, CartDto> cart = (HashMap<Long, CartDto>)session.getAttribute("Cart");
		if(cart == null) {
			cart = new HashMap<Long, CartDto>();
		}
		cart = cartServiceImpl.DeleteCart(id, cart);
		session.setAttribute("Cart", cart);
		session.setAttribute("TotalQuantyCart", cartServiceImpl.TotalQuanty(cart));
		session.setAttribute("TotalPriceCart", cartServiceImpl.TotalPrice(cart));
		return "redirect:"+request.getHeader("Referer");
	}
}
