
class  Bird1 {
    public  void  fly()  {
        System.out.println("The bird is flying.");
    }
    public  void  fly(int height)  {
        System.out.println("The bird is flying "  + height +  " feet high.");
    }
    public  void  fly(String name,  int height)  {
        System.out.println("The "  + name +  " is flying "  + height +  " feet high.");
    }
}
class  TestBirdStatic  {
    public  static  void  main(String[] args)  {
        Bird1 myBird =  new Bird1();
        myBird.fly();
        myBird.fly(10000);
        myBird.fly("eagle", 10000);
    }
}


