package webshop.com.Dao;

import org.springframework.stereotype.Repository;

import webshop.com.Entity.Users;

@Repository
public class UsersDao extends BaseDao{

//	private StringBuffer SqlString() {
//		StringBuffer  sql = new StringBuffer();
//		sql.append("INSERT ");
//		sql.append("INTO `users` ");
//		sql.append("( ");
//		sql.append("    `id`, ");
//		sql.append("    `user`, ");
//		sql.append("    `password`, ");
//		sql.append("    `display_name`, ");
//		sql.append("    `address` ");
//		sql.append(") ");
//		sql.append("VALUES ");
//		sql.append("( ");
//		sql.append("    '[value-1]', ");
//		sql.append("    '[value-2]', ");
//		sql.append("    '[value-3]', ");
//		sql.append("    '[value-4]', ");
//		sql.append("    '[value-5]' ");
//		sql.append(") ");
//
//		return sql;
//
//	}
	
	public int AddAccount(Users user){

		StringBuffer  sql = new StringBuffer();
		sql.append("INSERT ");
		sql.append("INTO `users` ");
		sql.append("( ");
		sql.append("    `user`, ");
		sql.append("    `password`, ");
		sql.append("    `display_name`, ");
		sql.append("    `address` ");
		sql.append(") ");
		sql.append("VALUES ");
		sql.append("( ");
		sql.append("    "+user.getUser()+", ");
		sql.append("    "+user.getPassword()+", ");
		sql.append("    "+user.getDisplay_name()+", ");
		sql.append("    "+user.getAddress()+" ");
		sql.append(") ");
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	} 
}
