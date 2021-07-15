package com.project.EmptySpace.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.EmptySpace.Entity.Property;
import com.project.EmptySpace.Repository.PropertyRepository;

@Controller
@RequestMapping(path="/Home")
public class PropertyController {
	
	@Autowired
	private PropertyRepository propertyRepository;
	
	@PostMapping(path="/add")
	public @ResponseBody String addProperty(@RequestParam int user_id,@RequestParam int width,@RequestParam int area,@RequestParam int length,@RequestParam int pincode,@RequestParam String address,@RequestParam int price,@RequestParam int ph_num,@RequestParam int status) {
		Property p = new Property();
		p.setUser_id(user_id);
		p.setWidth(width);
		p.setArea(area);
		p.setLength(length);
		p.setPincode(pincode);
		p.setAddress(address);
		p.setPrice(price);
		p.setPh_num(ph_num);
		p.setStatus(status);
		propertyRepository.save(p);
		return "Saved Successfully";
	}
	
	@GetMapping(path="/")
	public @ResponseBody Iterable<Property> getAllProperties(){
		return propertyRepository.findAll();
	}
	
}
