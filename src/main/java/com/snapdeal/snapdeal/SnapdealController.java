/*



 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.snapdeal.snapdeal;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.snapdeal.snapdeal.Model.Admin;
import com.snapdeal.snapdeal.Model.Cart;
import com.snapdeal.snapdeal.Model.Order;
import com.snapdeal.snapdeal.Model.Product;
import com.snapdeal.snapdeal.Repositry.AdminRepository;
import com.snapdeal.snapdeal.Repositry.OrderRepository;
import com.snapdeal.snapdeal.Repositry.ProductRepositroy;
import com.snapdeal.snapdeal.Service.ProductService;


import com.snapdeal.snapdeal.Model.Register;
import com.snapdeal.snapdeal.Model.Wishlist;
import com.snapdeal.snapdeal.Repositry.RegisterRepository;
import com.snapdeal.snapdeal.Repositry.WishlistRepository;
import com.snapdeal.snapdeal.Repositry.cartrepository;

/**
 *
 * @author Lenovo
 */
@Controller
public class SnapdealController {  
	 
	@Autowired
 	private AdminRepository admin_repo;  
 	
 	@Autowired
 	private ProductRepositroy product_repo; 
 	@Autowired
 	private cartrepository cart_repo; 
 	
  @Autowired
  private WishlistRepository wishlist_repo ;  
  @Autowired 
  private OrderRepository order_repo;
	
    @RequestMapping("/register")
    public String register(Model model){ 
model.addAttribute("register", new Register());
        return "register";
    }  
    
    @Autowired 
    private RegisterRepository register_repo ; 
    public SnapdealController(RegisterRepository register_repo) {
		this.register_repo = register_repo;
	}
	@RequestMapping(value="/registeruser",method=RequestMethod.POST) 
    public String registerUser(@ModelAttribute("register") Register user, Model model ) {
		this.register_repo.save(user);
		model.addAttribute("register", new Register());
		System.out.println("user"+ user);
		
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
    public String cart(Model model){   
    	List<Cart> cartItems = cart_repo.findAll();
    	model.addAttribute("cartItems", cartItems);
        return "cart";
    } 
    
    @RequestMapping("/signin")
    public String signindefault(){
        return "signin";
    }  
    @RequestMapping(value="/loginuser", method=RequestMethod.POST)
    public String loginUserofcustomer(String email, String password, Model model) {
    	Register  user = register_repo.findByEmail(email);
         if (user != null && user.getPassword().equals(password)) {
             model.addAttribute("user", user);
             return "home";
         } else {
             model.addAttribute("error", "Invalid username or password");
             return "signin";
         }
    }   	
         
     	@RequestMapping("/registerasadmin")
     	public String registerAdmin(Model model) {
     model.addAttribute("admin", new Admin());
     		return "registerAdmin";
     	}
     	 
     	@RequestMapping(value="/registeradmin",method=RequestMethod.POST) 
         public String registerUser(@ModelAttribute("admin") Admin user, Model model ) {
     		this.admin_repo.save(user);
     		model.addAttribute("admin", new Admin());
     		System.out.println("user"+ user);
     		
     		return "siginAdmin"; 
         	 
     	} 		
         	
         
     	 @RequestMapping("/siginasadmin")
     	    public String signin(){
     	        return "siginAdmin";
     	    }  
     	 @RequestMapping(value="/loginadmin", method=RequestMethod.POST)
     	    public String loginUser(String email, String password, Model model) {
     	    	Admin user = admin_repo.findByEmail(email);
     	         if (user != null && user.getPassword().equals(password)) {
     	             model.addAttribute("user", user);
     	             return "addproduct";
     	         } else {
     	             model.addAttribute("error", "Invalid username or password");
     	             return "siginAdmin";
     	         }
     	    
     	   }  
     	 @RequestMapping("/addproduct")
     	    public String navigateProduct(Model model) { 
     		 model.addAttribute("product", new Product());
     	    	return "addproduct";
     	    }  
     	 @RequestMapping(value="/productinfo",method=RequestMethod.POST)
     	 public String addProduct(@ModelAttribute  Product product,Model model)  { 
     		 this.product_repo.save(product);
     		 model.addAttribute("product", new Product());
     		 System.out.println("product" + product);
     		 return "addproduct";
     	 } 
    	
    	
    
    @RequestMapping("/home")
    public String home(){
        return "home";
    }  
    @RequestMapping("/men")
    public String men(Model model){
    	String categoryName = "men";
    	List<Product> products = this.product_repo.findByCategoryName(categoryName);
    	model.addAttribute("products", products);
        return "men";
    }
    @RequestMapping("/women")
    public String women(Model model){ 
    	String categoryName = "women";
    	List<Product> products = this.product_repo.findByCategoryName(categoryName);
    	model.addAttribute("products", products);
        return "women";
    }
    @RequestMapping("/kitchen")
    public String kitchen(Model model){ 
    	String categoryName = "kitchen";
    	List<Product> products = this.product_repo.findByCategoryName(categoryName);
    	model.addAttribute("products", products);
        return "kitchen";
    }
    @RequestMapping("/kids")
    public String kids(Model model){ 
    	String categoryName = "kids";
    	List<Product> products = this.product_repo.findByCategoryName(categoryName);
    	model.addAttribute("products", products);
        return "kids";
    }
    @RequestMapping("/beauty")
    public String beauty(Model model){ 
    	String categoryName = "beauty";
    	List<Product> products = this.product_repo.findByCategoryName(categoryName);
    	model.addAttribute("products", products);
        return "beauty";
    }
    @RequestMapping("/Electronics")
    public String electronics(Model model){
    	String categoryName = "electronics";
    	List<Product> products = this.product_repo.findByCategoryName(categoryName);
    	model.addAttribute("products", products);
        return "Electronics";
    }
    @RequestMapping("/sports")
    public String sports(Model model){  
    String categoryName = "sports";
    	List<Product> products = this.product_repo.findByCategoryName(categoryName);
    	model.addAttribute("products", products);
    	
        return "sports";
    }
    @RequestMapping("/wishlist")
    public String Wishlist(Model model){ 
    	List<Wishlist> wishlistItems = wishlist_repo.findAll();
    	model.addAttribute("wishlistItems",wishlistItems );
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
    
    @RequestMapping(value="/addtocart", method = RequestMethod.POST)
    public String addToCart(@RequestParam("productId") String productId) {
        // Retrieve the product from the ProductRepository using the product ID
        Product product = product_repo.findById(productId).orElse(null);

        if (product != null) {
            // Create a new CartItem and save it to the CartRepository
            Cart cartItem = new Cart();
            cartItem.setProductId(productId);
            cartItem.setImage(product.getImage());
            cartItem.setPrice(product.getPrice());
            cartItem.setProductName(product.getProductName());
            this.cart_repo.save(cartItem);
        }
            return "successcart";
       
    }  
    @RequestMapping(value="/addwishlist", method = RequestMethod.POST)
    public String addToWishlist(@RequestParam("productId") String productId) {
        // Retrieve the product from the ProductRepository using the product ID
        Product product = product_repo.findById(productId).orElse(null);

        if (product != null) {
            // Create a new CartItem and save it to the CartRepository
            Wishlist wishlist = new Wishlist();
            wishlist.setProductId(productId);
            wishlist.setImage(product.getImage());
            wishlist.setProductName(product.getProductName());
            wishlist.setPrice(product.getPrice());
            this.wishlist_repo.save(wishlist);
        }
            return "successwishlist";
       
    }  
    @RequestMapping(value="/buynow", method = RequestMethod.POST)
    public String orderProduct(@RequestParam("productId") String productId) {
        // Retrieve the product from the ProductRepository using the product ID
        Product product = product_repo.findById(productId).orElse(null);

        if (product != null) {
            // Create a new CartItem and save it to the CartRepository
            Order order = new Order();
            order.setProductId(productId);
            order.setImage(product.getImage());
            order.setProductName(product.getProductName());
            order.setPrice(product.getPrice());
            this.order_repo.save(order);
        }
            return "successorder";
       
    }  
    @RequestMapping("/yourordes")
    public String yourOrders(Model model){ 
    	List<Order> orderedItmes = order_repo.findAll();
    	model.addAttribute("orderedItems",orderedItmes );
        return "yourorders";
    }
    
}  
//  beauty kitchen  kids  men women
