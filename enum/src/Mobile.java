
 enum Mobile {
	Samsum(1000) ,Lenovo(12000),iphone(150000);
int price;
	 Mobile(int price){
		 this.price=price;
	 }
	 int priceOfMobile() {
		 return price;
	 }
	 public static void main(String[] args) {
	
	  	 Mobile mobile1 = Mobile.iphone;
     System.out.println("Iphone moble price "+mobile1.priceOfMobile());
     for(Mobile mob : Mobile.values())
     System.out.println(mob +" "+ mob.priceOfMobile()+""+mob.priceOfMobile());
  
	
	  	 
	  	 
	 }
	
}
