public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Tunuk", 20,"IT",244.0,"Samsung s22");
        Person person2 = new Person("Zalkar",30,"OIu",678.98,"Samsung s22 ultra ");
        Person person3 = new Person("Erkin ",45, "yt", 456.87,"Samsung s22");
        Person person4 = new Person("Kandybek", 56,"oiuyg",567,"Samsung s");
        Person person5 = new Person("Alina",45,"hgjfd",687.7,"Iphone 14 pro max" );
        Person[] personsArray = {person1, person2, person3, person4, person5};

        for (Person person : personsArray) {
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println("Work: " + person.getWork());
            System.out.println("Salary: " + person.getSalary());
            System.out.println("Phone: " + person.getPhone());
            System.out.println();
        }

        Person personWithLowestSalary = personsArray[0];
        for (int i = 1; i < personsArray.length; i++) {
            if (personsArray[i].getSalary() < personWithLowestSalary.getSalary()) {
                personWithLowestSalary = personsArray[i];
            }
        }
        System.out.println("-----------------------------------------------");
        System.out.println("Person with the lowest salary:");
        System.out.println("Name: " + personWithLowestSalary.getName());
        System.out.println("Salary: " + personWithLowestSalary.getSalary());
        System.out.println("-----------------------------------------------");

        Person personWithMostExpensiveSalary = personsArray[0];
        for (int i = 0; i < personsArray.length; i++) {
            if (personsArray[i].getPhone().compareTo(personWithMostExpensiveSalary.getPhone()) > 0) {
                personWithMostExpensiveSalary = personsArray[i];
            }
        }
        System.out.println("Person with the most expensive salary:");
        System.out.println("Name: " + personWithMostExpensiveSalary.getName());
        System.out.println("Salary: " + personWithMostExpensiveSalary.getSalary());
        System.out.println("-----------------------------------------------");


        Person personWithMostExpensivePhone = personsArray[0];
        for (int i = 0; i < personsArray.length; i++) {
            if (personsArray[i].getPhone().compareTo(personWithMostExpensivePhone.getPhone()) > 0) {
                personWithMostExpensivePhone = personsArray[i];
            }
        }
        System.out.println("Person with the most expensive phone:");
        System.out.println("Name: " + personWithMostExpensivePhone.getName());
        System.out.println("Salary: " + personWithMostExpensivePhone.getSalary());
        System.out.println("-----------------------------------------------");
    }

}
