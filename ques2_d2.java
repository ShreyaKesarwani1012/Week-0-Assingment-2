class Student{
    String name;
    int m_sub1;
    int m_sub2;
    int m_sub3;


    void value( int m1, int m2, int m3)
    {
        m_sub1=m1;
        m_sub2=m2;
        m_sub3=m3;
    }
void avg(){
    int avg;
    avg= (m_sub1+m_sub2+m_sub3)/3;
    System.out.println("the avg is "+avg);

}
void display_name(){
    System.out.println("the name is "+name);
}
void display_marks(){
    System.out.println("the marks is "+m_sub1);
    System.out.println("the marks is "+m_sub2);
    System.out.println("the marks is "+m_sub3);
}

public static void main(String[] args){
Student obj = new Student();
obj.name="shreya";
obj.value(1,2,3);

obj.display_name();
obj.display_marks();

 
}
}