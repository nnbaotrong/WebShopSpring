package webshop.com.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webshop.com.Dao.CategorysDao;
import webshop.com.Dao.MenusDao;
import webshop.com.Dao.ProductsDao;
import webshop.com.Dao.SlidesDao;
import webshop.com.Dto.ProductsDto;
import webshop.com.Entity.Categorys;
import webshop.com.Entity.Menus;
import webshop.com.Entity.Slides;

@Service
public class HomeServiceImpl implements IHomeService {

	@Autowired
	private SlidesDao slidesDao;

	@Autowired
	private CategorysDao categorysDao;

	@Autowired
	private MenusDao menusDao;
	@Autowired
	private ProductsDao productsDao;

	@Override
	public List<Slides> GetDataSlide() {
		return slidesDao.GetDataSlide();
	}

	@Override
	public List<Categorys> GetDataCategorys() {
		return categorysDao.GetDataCategorys();
	}

	@Override
	public List<Menus> GetDataMenus() {
		return menusDao.GetDataMenus();
	}

	@Override
	public List<ProductsDto> GetNewProductsDto() {
		List<ProductsDto> list = productsDao.GetNewProducts();
		return list;
	}

	@Override
	public List<ProductsDto> GetHighlightProductsDto() {
		List<ProductsDto> list = productsDao.GetHighlightProducts();
		return list;
	}

}
