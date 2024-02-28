class Vehicle{
 
 int price;
String color;
String model;

Vehicle(int p , String c, String m){
price =p;
color= c;
model=m;


}
void Display(){
System.out.println("The price is "+price);
System.out.println("The color is "+color);
System.out.println("The modle is "+model);

}

public static void main(String [] args){

  Vehicle obj =new Vehicle(20,"red","safari");

obj.Display();

}

}