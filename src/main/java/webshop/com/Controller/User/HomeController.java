package webshop.com.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController extends BaseController{
	;

	@RequestMapping(value = { "/", "home" })
	public ModelAndView Index() {
	
		_mvShare.addObject("menus", _homeServiceImpl.GetDataMenus());
		_mvShare.addObject("slides", _homeServiceImpl.GetDataSlide());
		_mvShare.addObject("categorys", _homeServiceImpl.GetDataCategorys());
		_mvShare.addObject("h_products", _homeServiceImpl.GetHighlightProductsDto());
		_mvShare.addObject("n_products", _homeServiceImpl.GetNewProductsDto());
		_mvShare.setViewName("user/index");
		return _mvShare;
	}

	@RequestMapping(value = { "/produc" })
	public ModelAndView Product() {
		ModelAndView mv = new ModelAndView("user/product");
		return mv;
	}

}
