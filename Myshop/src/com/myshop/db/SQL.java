package com.myshop.db;

public class SQL {
	
	//final 상수는 변수를 대문자로 작성 
	//Customer
	public static final String INSERT_CUSTOMER = "Insert into `customer` set "
												+ "`custId` =?,"
												+ "`name`=?,"
												+ "`hp` =?,"
												+ "`addr` =?,"
												+ "`rdate` =NOW()";
	public static final String SELECT_CUSTOMER = "select * from `Customer` where "
													+ "`custId`=?";
	public static final String SELECT_CUSTOMERS = "SELECT * FROM `order` AS a "
												+ "JOIN `Product` as b on a.orderProduct = b.prodNo "
												+ "WHERE `orderId=?` "
												+ "ORDER BY `orderDate` DESC";

	public static final String UPDATE_CUSTOMER = "";
	public static final String DELETE_CUSTOMER = "";
	
	//Order
	public static final String INSERT_ORDER = "";
	public static final String SELECT_ORDER = "";
	public static final String SELECT_ORDERS = "";
	public static final String UPADATE_ORDER = "";
	public static final String DELETE_ORDER = "";
	
	//Product
	public static final String INSERT_PRODUCT = "";
	public static final String SELECT_PRODUCT = "";
	public static final String SELECT_PRODUCTS = "";
	public static final String UPDATE_PRODUCT = "";
	public static final String DELETE_PRODUCT = "";

}
