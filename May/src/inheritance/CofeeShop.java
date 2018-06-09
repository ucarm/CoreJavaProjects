package inheritance;

abstract class Drink {
  String customer = "";

  int getPrice() {
    return 5;
  }

  abstract void prepare();
}

abstract class ColdDrink extends Drink {
  void addIce() {
    System.out.println("adding ice");
  }
}

abstract class HotDrink extends Drink {
  abstract void warmUp();
  
  void prepare() {
    warmUp();
  }
}

class Coffee extends HotDrink {
  Coffee(String customer) {
    this.customer = customer;
  }
  
  void warmUp() {
    System.out.println("heating it..");
  }
}

class Water extends ColdDrink {
  Water(String customer) {
    this.customer = customer;
  }
  
  void prepare() {
    System.out.println("all good");
  }
}

class IcedTea extends ColdDrink {
  IcedTea(String customer) {
    this.customer = customer;
  }
  
  void prepare() {
    addIce();
    System.out.println("sweet and chilled");
  }
}

public class CofeeShop {
  public static void main(String[] args) {
    Water w1 = new Water("Kuzzat");
    IcedTea it1 = new IcedTea("Akbar");
    Coffee c1 = new Coffee("Murodil");
    
    w1.addIce();
    it1.addIce();
    
    c1.warmUp();
    
    w1.prepare();
    it1.prepare();
    c1.prepare();
    
    w1.getPrice();
    c1.getPrice();
    
  }
}


