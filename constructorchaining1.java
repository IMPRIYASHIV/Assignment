package org;
public class Mobile {
String brand;
int cost;

Mobile(String brand) {
this.brand=brand;
}
Mobile(String brand, int cost) {
this.(brand);
this.cost=cost;
}
public static void main(String arg{D
Mobile m = new Mobile("SamsungsA50",10000);
=======
Mobile m = new Mobile("Apple",10000);
>>>>>>> Java
System.out.println("Brand: "+m.brand);
System.out.println("Cost: "+m.cost);
}
}
