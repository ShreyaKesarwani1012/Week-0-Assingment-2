class Room{
    int height=10;
    int width=1;
    int breadth=2;
     
     void volume(){
        int Area;
        Area=height*width*breadth;
        System.out.println("the area of vol"+Area);
     }

    public static void main(String[] args){
        Room Room=new Room();

       Room.volume();
    }
}