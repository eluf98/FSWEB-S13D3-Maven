package org.example;

public class Main {
    public static void main(String[] args) {
        Person person1= new Person("John", "Doe", 20);
        Person person2= new Person("Jane", "Doe", 17);
        Person person3= new Person("Alice","Alex",25, "alice@example.com","123-456-7890","123 Main St");

        Wall wall = new Wall(5,4);

        System.out.println("Firstname: " + person1.getFirstName());

        System.out.println("LastName: " + person2.getLastName());

        System.out.println("Age: " + person3.getAge());

        //İlk alan hesaplaması
        System.out.println("area= " + wall.getArea());
        //yüksekliği negatif değerle güncelleme
        wall.setHeight(-1.5);
        //genişlik be yükseklik değeri yazdırma
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        //Alan hesapmalası
        System.out.println("area= " + wall.getArea());



    }
}
