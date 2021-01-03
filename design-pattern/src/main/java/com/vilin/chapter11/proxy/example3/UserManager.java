package com.vilin.chapter11.proxy.example3;
import java.util.*;
import java.sql.*;

/**
 * 代理对象，代理用户数据对象
 */
public class UserManager {	
	/**
	 * 根据部门编号来获取该部门下的所有人员
	 * @param depId 部门编号
	 * @return 该部门下的所有人员
	 */
	public Collection<UserModelApi> getUserByDepId(String depId)throws Exception{
		Collection<UserModelApi> col = new ArrayList<UserModelApi>();
		Connection conn = null;
		try{
			conn = this.getConnection();
			//只需要查询userId和name两个值就可以了
			String sql = "select u.userId,u.name "
				+"from tbl_user u,tbl_dep d "
				+"where u.depId=d.depId and d.depId like ?";

			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+depId+"%");
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				//这里是创建的代理对象UserModel的对象
				Proxy proxy = new Proxy(new UserModel());
				//只是设置userId和name两个值就可以了
				proxy.setUserId(rs.getString("userId"));
				proxy.setName(rs.getString("name"));
				
				col.add(proxy);
			}
			
			rs.close();
			pstmt.close();
		}finally{
			conn.close();
		}
		return col;
	}
	/**
	 * 获取与数据库的连接
	 * @return 数据库的连接
	 */
	private Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC", "root", "Lw@1985105");
	}
}
