package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.Complain;
import com.example.service.ComplainService;

@Controller
@RequestMapping("/")
public class ComplainController {

	@Autowired
	private ComplainService complainService;
	
    @GetMapping("login")
    public String login() {
        return "login";
    }
    
    
    //07052018
    @RequestMapping(value="loginaction", method=RequestMethod.GET)
    public String loginaction(ModelMap modelMap) {
    	System.out.println("from login action*******************");
    	modelMap.put("complains", complainService.findAll());
        return "complain/index";
    }
	
	@RequestMapping(value="complain", method=RequestMethod.GET)
	public String index(ModelMap modelMap){
		modelMap.put("complains", complainService.findAll());
		return "complain/index";
	}
	
	@RequestMapping(value="complain/detail/{id}", method = RequestMethod.GET)
	public String detail(@PathVariable("id") Integer id,  ModelMap modelMap){
		modelMap.put("complain", complainService.find(id));
		return "complain/detail";
	}
	
	@RequestMapping(value="complain/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable("id") Integer id,  ModelMap modelMap){
		complainService.delete(id);
		modelMap.put("complains", complainService.findAll());
		return "complain/index";
	}
	
	
	//07052018
//	@RequestMapping(value = "complain/new", method=RequestMethod.GET)
//    public String newProduct(ModelMap modelMap){
//		System.out.println("*********From the new method*********");
//		modelMap.put("complain", new Complain());
//        return "complain/productForm";
//    }
	
	
	@RequestMapping(value = "complain/new", method=RequestMethod.GET)
    public String newProduct(ModelMap modelMap){
		System.out.println("*********From the new method*********");
		modelMap.put("complain", new Complain());
        return "complain/complainForm";
    }
	
	
	@RequestMapping(value = "complain/create", method = RequestMethod.POST)
    public String saveProduct(Complain product){
		complainService.saveProduct(product);
        return "redirect:/complain/";
    }
	
	@RequestMapping(value="complain/edit/{id}", method = RequestMethod.GET)
	public String edit(@PathVariable("id") Integer id,  ModelMap modelMap){
		modelMap.put("complain", complainService.find(id));
		return "complain/productUpdateForm";
	}
	
	@RequestMapping(value="complain/update/{id}", method = RequestMethod.POST)
	public String update(Complain product){
		complainService.edit(product);
		System.out.println("********In side the update block*********");
		return "redirect:/complain/";
	}
}
