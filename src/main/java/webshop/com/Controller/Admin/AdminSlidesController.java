package webshop.com.Controller.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminSlidesController {

	@RequestMapping(value = {"admin/admin_slides"})
	public ModelAndView AdminSlides() {
		ModelAndView view = new ModelAndView();
		view.setViewName("admin/slides/index");
		return view;
	}
	
}
