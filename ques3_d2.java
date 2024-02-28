class Box {
   int height;
    int width;
    int breadth;


Box(int h,int w,int b){
height=h;
width=w;
breadth=b;


}
void getVolume(){
int vol;
vol=height*breadth*width;
System.out.println("The vol is "+vol);
}

void getArea(){
int area;
area=2*((height*breadth)+(width*breadth)+(width*height));
System.out.println("The area is "+area);
}
public static void main(String[] args){

Box obj1 = new Box(1,3,6);

obj1.getVolume();
obj1.getArea();

Box obj2 = new Box (2,3,4);
obj2.getVolume();
obj2.getArea();


}
}