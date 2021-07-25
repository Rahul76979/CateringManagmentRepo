package com.catering.ssvc.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catering.ssvc.Repository.CateringMaterialOrderRepo;

@Service
public class CateringMaterialOrderService {

	@Autowired
	private CateringMaterialOrderRepo repo;
	
	
}
