package example.model;

public class Car {
String color;
String body;

//public   Car() {
//	String color =" blue";
//String 	body = "wagan";
//}
  public Car() {

  color =" blue";
 	 body = "wagon";
} 
public Car(String co, String CarName ) {
	this.color = "co";
	this.body = "CarName";
}

public void playRadiio() {
	System.out.println("radio is played");
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getBody() {
	return body;
}
public void setBody(String body) {
	this.body = body;
}


}
