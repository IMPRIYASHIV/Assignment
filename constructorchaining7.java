
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
public static void main(String args[]) {
Mobile m = new Mobile("Samsungs23",50000);
System.out.println("Brand: "+m.brand);
System.out.println("Cost: "+m.cost);
}
}
