class constructor_overloading {
    String language;
    constructor_overloading() {
      this.language = "Java";
    }
    constructor_overloading(String language) {
      this.language = language;
    }
    public void getName() {
      System.out.println("Programming Langauage: " + this.language);
    }
    public static void main(String[] args) {
      // non-parameterized constructor
      constructor_overloading obj1 = new constructor_overloading();
      // parameterized constructor
      constructor_overloading obj2 = new constructor_overloading("C++");
      obj1.getName();
      obj2.getName();
    }
  }

// class Main {
//     int a;
//     boolean b;
//     public static void main(String[] args) {
  
//       // A default constructor is called
//       Main obj = new Main();
  
//       System.out.println("Default Value:");
//       System.out.println("a = " + obj.a);
//       System.out.println("b = " + obj.b);
//     }
// }