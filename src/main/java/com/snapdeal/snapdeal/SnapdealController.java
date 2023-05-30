/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.snapdeal.snapdeal;

import java.util.HashMap;
import java.util.Map;

import javax.management.Query;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.snapdeal.snapdeal.Model.Register;
import com.snapdeal.snapdeal.Repositry.RegisterRepository;

/**
 *
 * @author Lenovo
 */
@Controller
public class SnapdealController {  
	 
	private Map<String, Register> users;
	
    @RequestMapping("/register")
    public String register(){
        return "register";
    }  
    
    @Autowired 
    private RegisterRepository register_repo ; 
    public SnapdealController(RegisterRepository register_repo) {
		this.users = new HashMap<>();
		this.register_repo = register_repo;
	}
	@RequestMapping(value="/registeruser",method=RequestMethod.POST) 
    public String registerUser(@RequestParam String password , @RequestParam String  userName ,@RequestParam String email ) { 
    	 
		if(register_repo.existsById(email)) {
			return "register"; 
			// user already exists
		}
    	Register user =  new Register();
    	user.setEmail(email);
    	user.setPassword(password);
    	user.setUserName(userName);
    	this.register_repo.save(user);  
    	System.out.println("user");
		return "signin";
    	
    }
    @RequestMapping("/map")
    public String map(){
        return "map";
    } 
    @RequestMapping("/details")
    public String details(){
        return "details";
    } 
    @RequestMapping("/cart")
    public String cart(){
        return "cart";
    } 
    
    @RequestMapping("/signin")
    public String signin(){
        return "signin";
    }  
    @RequestMapping(value="/loginuser", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password) {

    	Register user = users.get(email);
        if (user != null && user.getPassword().equals(password)) {
            System.out.println("Login successful!");
            return "home";
        } else {
            System.out.println("Invalid username or password!");
            return "signin";
        }
    	 
    	
    	
    }
    @RequestMapping("/home")
    public String home(){
        return "home";
    }  
    @RequestMapping("/men")
    public String men(){
        return "men";
    }
    @RequestMapping("/women")
    public String women(){
        return "women";
    }
    @RequestMapping("/kitchen")
    public String kitchen(){
        return "kitchen";
    }
    @RequestMapping("/kids")
    public String kids(){
        return "kids";
    }
    @RequestMapping("/beauty")
    public String beauty(){
        return "beauty";
    }
    @RequestMapping("/Electronics")
    public String electronics(){
        return "Electronics";
    }
    @RequestMapping("/sports")
    public String sports(){
        return "sports";
    }
    @RequestMapping("/wishlist")
    public String Wishlist(){
        return "wishlist";
    }
    @RequestMapping("/settings")
    public String settings(){
        return "settings";
    }   
     @RequestMapping("/logout")
    public String logout(){
        return "logout";
    }  
    @RequestMapping("/edit")
    public String edit(){
        return "edit";
    }  
    @RequestMapping("/watch")
    public String watch(){
        return "watch";
    }
    @RequestMapping("/Aboutus")
    public String Aboutus(){
        return "Aboutus";
    }
    @RequestMapping("/Bank")
    public String Bank(){
        return "Bank";
    }
    @RequestMapping("/Payment")
    public String Payment(){
        return "Payment";
    }
    @RequestMapping("/adidas")
    public String adidas(){
        return "adidas";
    }  
    @RequestMapping("/approne")
    public String approne(){
        return "approne";
    }
    @RequestMapping("/baby")
    public String baby(){
        return "baby";
    }
    @RequestMapping("/babyshoes")
    public String babyshoes(){
        return "babyshoes";
    }
    @RequestMapping("/ball")
    public String ball(){
        return "ball";
    }
    @RequestMapping("/bb")
    public String bb(){
        return "bb";
    }
    @RequestMapping("/bed")
    public String bed(){
        return "bed";
    }
    @RequestMapping("/braslate")
    public String braslate(){
        return "braslate";
    }
    @RequestMapping("/bupi")
    public String bupi(){
        return "bupi";
    }
    @RequestMapping("/compact")
    public String compact(){
        return "compact";
    }
    @RequestMapping("/computer")
    public String computer(){
        return "computer";
    }
    @RequestMapping("/cooler")
    public String cooler(){
        return "cooler";
    }
    @RequestMapping("/curtain")
    public String curtain(){
        return "curtain";
    }
    @RequestMapping("/ear")
    public String ear(){
        return "ear";
    }
    @RequestMapping("/formals")
    public String formals(){
        return "formals";
    }
    @RequestMapping("/foundation")
    public String foundation(){
        return "foundation";
    }
    @RequestMapping("/froke")
    public String froke(){
        return "froke";
    }
     @RequestMapping("/glass")
    public String glass(){
        return "glass";
    }
    @RequestMapping("/fridge")
    public String fridge(){
        return "fridge";
    }
    @RequestMapping("/gown")
    public String gown(){
        return "gown";
    }
    @RequestMapping("/hat")
    public String hat(){
        return "hat";
    }
    @RequestMapping("/hatkids")
    public String hatkids(){
        return "hatkids";
    }
    @RequestMapping("/jeans")
    public String jeans(){
        return "jeans";
    }
    @RequestMapping("/jewellary")
    public String jewellary(){
        return "jewellary";
    }
     @RequestMapping("/jk")
    public String jk(){
        return "jk";
    }
     @RequestMapping("/juiceset")
    public String juiceset(){
        return "juiceset";
    }
     @RequestMapping("/jump")
    public String jump(){
        return "jump";
    }
     @RequestMapping("/kettle")
    public String kettle(){
        return "kettle";
    }
     @RequestMapping("/kids1")
    public String kids1(){
        return "kids1";
    }
     @RequestMapping("/kids2")
    public String kids2(){
        return "kids2";
    }
     @RequestMapping("/knife")
    public String knife(){
        return "knife";
    }
     @RequestMapping("/kurta")
    public String kurta(){
        return "kurta";
    }
     @RequestMapping("/kurti")
    public String kurti(){
        return "kurti";
    }
 @RequestMapping("/lagori")
    public String lagori(){
        return "lagori";
    }
     @RequestMapping("/laptop")
    public String laptop(){
        return "laptop";
    }
     @RequestMapping("/lehenga")
    public String lehenga(){
        return "lehenga";
    }
     @RequestMapping("/lipstick")
    public String lipstick(){
        return "lipstick";
    }
     @RequestMapping("/material")
    public String material(){
        return "material";
    }
     @RequestMapping("/mixer")
    public String mixer(){
        return "mixer";
    }
     @RequestMapping("/miror")
    public String miror(){
        return "miror";
    }
     @RequestMapping("/mobile")
    public String mobile(){
        return "mobile";
    }
      @RequestMapping("/net")
    public String net(){
        return "net";
    }
     @RequestMapping("/night")
    public String night(){
        return "night";
    }
     @RequestMapping("/oven")
    public String oven(){
        return "oven";
    }
     @RequestMapping("/pan")
    public String pan(){
        return "pan";
    }
     @RequestMapping("/pot")
    public String pot(){
        return "pot";
    }
     @RequestMapping("/puma")
    public String puma(){
        return "puma";
    }
     @RequestMapping("/saari")
    public String saari(){
        return "saari";
    }
     @RequestMapping("/sandal")
    public String sandal(){
        return "sandal";
    }
     @RequestMapping("/sandalkids")
    public String sandalkids(){
        return "sandalkids";
    }
     @RequestMapping("/shirts")
    public String shirts(){
        return "shirts";
    }
     @RequestMapping("/shoeskids")
    public String shoeskids(){
        return "shoeskids";
    }
     @RequestMapping("/tab")
    public String tab(){
        return "tab";
    }
     @RequestMapping("/top")
    public String top(){
        return "top";
    }
     @RequestMapping("/tshirt")
    public String tshirt(){
        return "tshirt";
    }
     @RequestMapping("/tv")
    public String tv(){
        return "tv";
    }
     @RequestMapping("/upi")
    public String upi(){
        return "upi";
    }
     @RequestMapping("/washing amchine")
    public String washingamchine(){
        return "washing amchine";
    }
     @RequestMapping("/waterheater")
    public String waterheater(){
        return "waterheater";
    }
     @RequestMapping("/wboys")
    public String wboys(){
        return "wboys";
    }
     @RequestMapping("/western")
    public String western(){
        return "western";
    }
    @RequestMapping("/womentrouser")
    public String womentrouser(){
        return "womentrouser";
    }
    @RequestMapping("/mode")
    public String mode(){
        return "mode";
    }
    @RequestMapping("/chappal")
    public String chappal(){
        return "chappal";
    }

    
    @RequestMapping("/womenbraslate")
    public String Braslate(){
        return "womenbraslate";
    }
    @RequestMapping("/language")
    public String language(){
        return "language";
    }
    @RequestMapping("/Tracking_1")
    public String Tracking_1(){
        return "Tracking_1";
    }
    
}
