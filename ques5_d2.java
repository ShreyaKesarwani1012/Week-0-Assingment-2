class Person {
int age ;
int height;
int weight;
  
Person(int a,int h,int w){
age =a;
height =h;
weight=w;

}
  
void Display(){

System.out.println("the age  is "+age);
System.out.println("the height is "+height);
System.out.println("the weight is "+weight);

}

public static void main(String[] args){

Person obj = new Person(1,2,3);


obj.Display();
     
}
}