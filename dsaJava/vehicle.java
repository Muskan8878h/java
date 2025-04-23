class vehicle{
    //     public String make;
    //     public String model;
    //     public int year;
    //     public vehicle(String make,String model,int year){
    //         this.model=model;
    //         this.make=make;
    //         this.year=year;
    //     }
    //     public String getmake(){
    //         return make;
    //     }
    //     public String getmodel(){
    //         return model;
    //     }
    //     public int getyear(){
    //         return year;
    //     }
    //     public void display(){
    //         System.out.println(getmake());
    //         System.out.println(getmodel());
    //         System.out.println(getyear());
    //     }
    // }
    // class Car extends vehicle{
    //     private int nod;
    //     public Car(String make,String model,int year,int nod){
    //         super(make,model,year);
    //         this.nod=(nod<1)?4:nod;
    //     }
    //     public int nod(){
    //         return nod;
    //     }
    //     public int getage(){
    //         int age=2025-year;
    //         return age;
    //     }
    //     public void display(){
    //         super.display();
    //         System.out.println(nod);
    //     }
    // }
    // public class Classes{
    //     public static void main(String args[]){
    //         Car c=new Car("latest","new",2010,-1);
    //         c.display();
            
    //     }
    // }
    
    
    
    class Animal{
        public void makesound(){
            System.out.println("Some generic animal sound");
        }
    
    }
    class Dog extends Animal{
        @Override
        public void makesound(){
            System.out.println("bark");
        }
    }
    class Cat extends Animal{
        @Override
        public void makesound(){
            System.out.println("meow");
        }
    }
    public class Classes{
        public static void main(String[] args) {
            Animal a=new Dog();
            a.makesound();
            Animal b=new Cat();
            b.makesound();
        }
    }
    
    
    // class vehicle{
    //     private String make;
    //     private String model;
    //     public int year;
    //     public vehicle(String make,String model,int year){
    //         this.make=make;
    //         this.model=model;
    //         this.year=year;
    //     }
    //     public void display(){
    //         System.out.println("make:"+make);
    //         System.out.println("model:"+model);
    //         System.out.println("year:"+year);
    //     }
    // }
    // class car extends vehicle{
    //     private int nod;
    //     public car(String make,String model,int year,int nod){
    //         super(make,model,year);
    //         this.nod=(nod<1)?4:nod;
    //     }
    //     public int getage(int current){
    //         int age=current-year;
    //         return age;
    //     }
    //     public void display(){
    //         super.display();
    //         System.out.println("nod:"+nod);
    //     }
    // }
    // public class Classes{
    //     public static void main(String[] args) {
    //         car c=new car("now","latest",1990,-1);
    //         c.display();
    //         System.out.println(c.getage(2000));
    //     }
    // }
    
    
    
    // class Animal{
    //     public void makesound(){
    //         System.out.println("Some generic animal sound");
    //     }
    // }
    // class Dog extends Animal{
    //     public void makesound(){
    //         System.out.println("Bark");
    //     }
    // }
    // class Cat extends Animal{
    //     public void makesound(){
    //         System.out.println("Meow");
    //     }
    // }
    // public class Classes{
    //     public static void main(String[] args) {
    //         Animal d=new Dog();
    //         Animal c=new Cat();
    //         d.makesound();
    //         c.makesound();
    //     }
    // }
    
    
    
    // class Person{
    //     String name;
    //     int age;
    //     static int total=0;
    //     public Person(){
    //         this.name="unkown";
    //         this.age=0;
    //         total++;
    //     }
    //     public Person(String name){
    //         this.name=name;
    //         this.age=0;
    //         total++;
    //     }
    //     public Person(String name,int age){
    //         this.name=name;
    //         this.age=age;
    //         total++;
    //     }
    //     static public int totalperson(){
    //         return total;
    //     }
    // }
    // public class Classes{
    //     public static void main(String[] args) {
    //         Person p=new Person();
    //         Person p1=new Person("neha");
    //         Person p2=new Person("neha",18);
    //         System.out.println(p2.totalperson());
    //     }
    // }
    
    
    
    
    
    
    
    // class Calculator{
    //     public void add(int a,int b){
    //         System.out.println(a+b);
    //     }
    //     public void add(double a,double b){
    //         System.out.println(a+b);
    //     }
    //     public void add(int a,int b,int c){
    //         System.out.println(a+b+c);
    //     }
    //     public void add(String a,String b){
    //         if(a==null || b==null){
    //            System.out.println("invalid");
    //         }
    //         else{
    //             System.out.println(a+b);
    //         }
    //     }
    // }
    // public class Classes{
    //     public static void main(String[] args) {
    //         Calculator c=new Calculator();
    //         c.add(1,2);
    //         c.add(1,2,3);
    //         c.add(1.1,1.2);
    //         c.add(null,"neha");
    //     }
    // }
    
    
    // abstract class shape{
    //     abstract double area();
    // }
    // class rectangle extends shape{
    //     private double length;
    //     private double breath;
    //     rectangle(double length,double breath){
    //         this.length=(length<0)?0:length;
    //         this.breath=(breath<0)?0:breath;
    //     }
    //     public double area(){
    //         return length*breath;
    //     }
    // }
    // class circle extends shape{
    //     private double radius;
    //     circle(double radius){
    //         this.radius=(radius<0)?0:radius;
    //     }
    //     public double area(){
    //         return 3.14*radius*radius;
    //     }
    // }
    // public class Classes{
    //     public static void main(String[] args) {
    //         circle c=new circle(1.1);
    //         rectangle r=new rectangle(1.1, 2.1);
    //         System.out.printf("%.2f",c.area());
    //         System.out.println();
    //         System.out.printf("%.2f",r.area());
    //     }
    }