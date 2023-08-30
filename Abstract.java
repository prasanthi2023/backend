abstract  class  Animal  {
    // abstract methods
    abstract  void  move();
    abstract  void  eat();
    // concrete method
    void  label()  {
        System.out.println("Animal's data:");
    }
}

class  Bird extends Animal {
    void  move()  {
        System.out.println("Moves by flying.");
    }
    void  eat()  {
        System.out.println("Eats birdfood.");
    }
}

class  TestBird  {
    public  static  void  main(String[] args)  {
        Animal a =  new Bird();
        a.label();
        a.move();
        a.eat();
    }
}

