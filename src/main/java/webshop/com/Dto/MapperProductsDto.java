package webshop.com.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperProductsDto implements RowMapper<ProductsDto>{

	@Override
	public ProductsDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductsDto dto = new ProductsDto();
		dto.setId_product(rs.getLong("id_product"));
		dto.setId_category(rs.getInt("id_category"));
		dto.setSizes(rs.getString("sizes"));
		dto.setName(rs.getString("name"));
		dto.setPrice(rs.getDouble("price"));
		dto.setSale(rs.getInt("sale"));
		dto.setTitle(rs.getString("title"));
		dto.setHighlight(rs.getBoolean("highlight"));
		dto.setNew_product(rs.getBoolean("new_product"));
		dto.setDetails(rs.getString("details"));
		dto.setId_color(rs.getLong("id_color"));
		dto.setName_color(rs.getString("name_color"));
		dto.setCode_color(rs.getString("code_color"));
		dto.setImg(rs.getString("img"));
		dto.setCreated_at(rs.getDate("created_at"));
		dto.setUpdated_at(rs.getDate("updated_at"));

		return dto;
	}

}
