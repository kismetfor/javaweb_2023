package com.cn.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.handlers.ScalarHandler;

/**
 * 数据库操作工具类
 */
public class DBUtils {
	private static DataSource datasource;
	/**
	 * 1、C3P0连接池的配置文件名称必须为c3p0-config.xml
	 * 2、读取配置文件、加载驱动类、创建连接等操作均由连接池自动完成
	 */
	static {
		try {	
			datasource = new ComboPooledDataSource();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取数据库链接
	 */
	public static Connection getConnection(){
		Connection connection = null;	
		try {
			connection = datasource.getConnection();			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	/**
	 * 执行更新操作:增加、修改、删除
	 * @param sql SQL语句
	 * @param parameters SQL参数
	 * @return 0失败、1成功
	 */
	public static Integer executeUpdate(String sql,Object ...parameters){
		Connection connection = getConnection();
		QueryRunner queryRunner = new QueryRunner();
		Integer result = 0;
		try {
			if(parameters == null){
				result = queryRunner.update(connection, sql);
			}else{
				result = queryRunner.update(connection, sql, parameters);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		return result;
	}
	
	/**
	 * 执行更新操作:增加、修改、删除
	 */
	public static Integer executeUpdate(String sql){
		Object [] parameters=null;
		return executeUpdate(sql, parameters);
	}
	
	/**
	 * 执行查询操作
	 * @param <T> 实体泛型
	 * @param sql SQL语句
	 * @param clazz 实体的Class
	 * @param parameters SQL参数
	 * @return 存放Bean的list
	 */
	public static <T> List<T> executeQuery(String sql,Class<T> clazz,Object ...parameters){
		Connection connection = getConnection();
		List<T> list = null;
		try{
			QueryRunner queryRunner = new QueryRunner();
			BeanListHandler<T> beanListHandler = new BeanListHandler<T>(clazz);
			if(parameters == null){
				list = queryRunner.query(connection, sql,beanListHandler); 
			}else{
				list = queryRunner.query(connection, sql,beanListHandler,parameters); 
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * 执行查询操作
	 */
	public static <T> List<T> executeQuery(String sql,Class<T> clazz){
		Object [] parameters=null;
		return executeQuery(sql,clazz,parameters);
	}

	/**
	 * 查询记录数
	 */
	public static int getCount(String sql){
		Connection connection = getConnection();
		QueryRunner queryRunner = new QueryRunner();
		Integer count = null;
		try {
			Long longCount= (Long) queryRunner.query(connection,sql,new ScalarHandler(1));
			count = longCount.intValue();
			System.out.println("count="+count);
		}catch (Exception e){
			e.printStackTrace();
		}
		return count;
	}
}

