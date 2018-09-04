package com.cg.service;

import com.cg.bean.NumberBean;

public class AddServiceImpl implements IAddService{

	NumberBean bean= new NumberBean();

	@Override
	public int addNumbers(int num1, int num2) throws NullPointerException {
		
		bean.setNumber1(num1);
		bean.setNumber2(num2);
		
		return (bean.getNumber1()+bean.getNumber2());
	}
	
	
}
