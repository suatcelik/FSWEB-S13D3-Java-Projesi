public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe", 20);

        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("LastName: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Is teen? " + person1.isTeen());

        Wall wall = new Wall(13.2, 22.2);
        System.out.println(wall.getWidth());
        System.out.println(wall.getHeight());
        System.out.println("area = " + wall.getArea());
        System.out.println(wall.getHeight());
        System.out.println(wall.getArea());
    }






}