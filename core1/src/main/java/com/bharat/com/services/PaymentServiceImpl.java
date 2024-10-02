package com.bharat.com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bharat.com.dao.PaymentDAO;
@Service
public class PaymentServiceImpl implements PaymentService {
	@Autowired // Tells Spring that PaymentDAO will automatically wired at runtime by searching implementation class for this
	// which PaymentDAOImpl and finally inject here 
	private PaymentDAO dao;

	public PaymentDAO getDao() {
		return dao;
	}

	public void setDao(PaymentDAO dao) {
		this.dao = dao;
	}

}
