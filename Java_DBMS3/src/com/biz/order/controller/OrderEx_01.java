package com.biz.order.controller;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.biz.order.DAO.OrderDAO;
import com.biz.order.config.DBconnect;
import com.biz.order.model.OrderVO;

public class OrderEx_01 
{
	public static void main(String[] args) 
	{
		SqlSession sqlSession = DBconnect.getSqlSessionFactory().openSession(true);
		
		OrderDAO orderDAO = sqlSession.getMapper(OrderDAO.class);
		
		List<OrderVO> orderList = orderDAO.selectAll() ;
		
		System.out.println("================================");
		System.out.println("주문 리스트");
		System.out.println("================================");
		for(OrderVO vo : orderList)
		{
			System.out.print(vo.getO_num()   + "\t" + 
							 vo.getO_cnum()  + "\t" + 
							 vo.getO_pcode() + "\t" +
							 vo.getO_price() + "\t" +
							 vo.getO_qty() 	 + "\t" +
							 vo.getO_price() + "\n");
		}
		
		
	}
}
