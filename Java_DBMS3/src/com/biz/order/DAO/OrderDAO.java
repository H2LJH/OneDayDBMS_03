package com.biz.order.DAO;

import java.util.List;

import com.biz.order.model.OrderVO;

public interface OrderDAO 
{
	public List<OrderVO> selectAll();
}
