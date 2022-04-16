package webshop.com.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import webshop.com.Dto.PaginatesDto;
import webshop.com.Service.User.CategoryServiceImpl;
import webshop.com.Service.User.PaginatesServiceImpl;

@Controller
public class CategoryController extends BaseController {

	@Autowired
	private CategoryServiceImpl categoryServiceImpl;
	@Autowired
	private PaginatesServiceImpl paginatesServiceImpl;

	int totalProductPage = 9;

	@RequestMapping(value = { "/category/{id}" })
	public ModelAndView Product(@PathVariable String id) {

		int pageStart = 1;
		int totalData = categoryServiceImpl.GetAllProductsByID(Integer.parseInt(id)).size();
		PaginatesDto paginatesInfo = paginatesServiceImpl.GetInfoPaginates(totalData, totalProductPage, pageStart);
		_mvShare.addObject("idCategory", id);
		_mvShare.addObject("paginateInfo", paginatesInfo);
		_mvShare.addObject("productsPaginate",
				categoryServiceImpl.GetDataProductsPaginates(Integer.parseInt(id),paginatesInfo.getStart(), totalProductPage));

		_mvShare.setViewName("user/products/category");
		return _mvShare;
	}

	@RequestMapping(value = { "/category/{id}/{currentPage}" })
	public ModelAndView Product(@PathVariable String id,@PathVariable String currentPage) {
		int totalData = categoryServiceImpl.GetAllProductsByID(Integer.parseInt(id)).size();
		PaginatesDto paginatesInfo = paginatesServiceImpl.GetInfoPaginates(totalData, totalProductPage,
				Integer.parseInt(currentPage));
		_mvShare.addObject("idCategory", id);
		_mvShare.addObject("paginateInfo", paginatesInfo);
		_mvShare.addObject("productsPaginate",
				categoryServiceImpl.GetDataProductsPaginates(Integer.parseInt(id),paginatesInfo.getStart(),totalProductPage));

		_mvShare.setViewName("user/products/category");
		return _mvShare;
	}
}
