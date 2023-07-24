package com.july.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.july.webapp.model.Product;
import com.july.webapp.service.ProductService;

@Controller

public class ProductController {
	
	private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @Autowired 
	  ProductService productservice;
	  
	  @RequestMapping(value = "/test", method = RequestMethod.GET)
	  
	  @ResponseBody 
	  public String test() { 
		  return "test";
	  
	  }
	  
	  @RequestMapping(value = "/products", method = RequestMethod.GET)
	 
	  @ResponseBody public List<Product> getallproducts(){
		  List<Product> products = productservice.allProducts();
	  
	  return products;
	  }
	 
	  @RequestMapping( value ="/total-price" ,method=RequestMethod.GET)
	  @ResponseBody
	    public int CalctotalPrice() {
	    	int totalPrice =productservice.calculateTotalPrice();
			return totalPrice;
	    }

//    @GetMapping("/products")
//    public String getAllProducts(Model model) {
//        List<Product> products = productService.getAllProducts();
//        double totalPrice = productService.getTotalPriceOfAllProducts();
//        model.addAttribute("products", products);
//        model.addAttribute("totalPrice", totalPrice);
//        return "products"; // This maps to the products.jsp file in the views folder.
//    }

}
