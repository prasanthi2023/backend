class  Animal2  {
    public  void  eat()  {
        System.out.println("This animal eats insects.");
    }
}
class  Bird2  extends Animal2 {
    public  void  eat()  {
        System.out.println("This bird eats seeds.");
    }
}
class  TestBirdDynamic  {
    public  static  void  main(String[] args)  {

        Bird2 myBird =  new Bird2();
        myBird.eat();
    }
}


