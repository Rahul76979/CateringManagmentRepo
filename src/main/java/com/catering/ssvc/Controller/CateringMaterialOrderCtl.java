package com.catering.ssvc.Controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(value="*")
@RequestMapping("/materialOrder")
public class CateringMaterialOrderCtl {

//	@PostMapping("addMaterialOrder")
//	public String addMaterialOrder(@RequestBody CateringMaterialOrderEntity orderObject)
//	{
//		try {
//			JSONObject jsonData = new JSONObject(orderObject);
//		} catch (JSONException e) {
//			e.printStackTrace();
//		}
//		String customerName = orderObject.getCustomerName();
//		return "success";
//	}
	
	@GetMapping("/testJenkins")
	public String getForJenkins()
	{
		return "Your API is working for Jenkins";
	}
}
