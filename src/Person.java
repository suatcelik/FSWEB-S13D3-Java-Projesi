public class Person {
    String firstName;
    String lastName;
    int age;
    String gender;
    String nationality;
    String[] hobbies;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    public Person(String firstName, String lastName, int age, String gender, String nationality, String[] hobbies) {
        this(firstName, lastName, age);
        this.gender = gender;
        this.nationality = nationality;
        this.hobbies = hobbies;
    }


    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isTeen() {
        return this.age >= 13 && this.age <= 19;
    }

}
