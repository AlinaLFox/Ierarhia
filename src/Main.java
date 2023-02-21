public class Main {
    public static void main(String[] args) {

        Person person = new Person("Basil", "Dacia 5");

        Student student = new Student("Erica", "Sciusev 13", "InteliJIdea", 2023, 3.5);

        Staff staff = new Staff("Nicole", "Renasterii 48", "Mihai Eminescu", 3500);

        System.out.println(person);
        System.out.println(student);
        System.out.println(staff);

    }
}