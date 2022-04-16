package webshop.com.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webshop.com.Dto.ProductsDto;
import webshop.com.Entity.Categorys;
import webshop.com.Entity.Menus;
import webshop.com.Entity.Slides;

@Service
public interface IHomeService {
	@Autowired
	public List<Slides> GetDataSlide();

	public List<Categorys> GetDataCategorys();

	public List<Menus> GetDataMenus();
	
	public List<ProductsDto> GetNewProductsDto();
	
	public List<ProductsDto> GetHighlightProductsDto();
}
