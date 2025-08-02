package udemy.university.section12;

public class PersonEncapsulation {
    private String personName;
    private String personLastName;
    private int personAge;

    public PersonEncapsulation(String personName, String personLastName, int personAge) {
        this.personName = personName;
        this.personLastName = personLastName;
        this.personAge = personAge;
    }
    public PersonEncapsulation() {

    }

    public String getPersonName() {
        return this.personName;
    }

    public String getPersonLastName() {
        return this.personLastName;
    }

    public int getPersonAge() {
        return this.personAge;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }
}

class TestPerson {
    public static void main(String[] args) {
        PersonEncapsulation personEncapsulation = new PersonEncapsulation();
        personEncapsulation.setPersonName("pepe");
        personEncapsulation.setPersonLastName("Rod");
        personEncapsulation.setPersonAge(8);

        System.out.println("""
                Person name: %s
                Person lastname: %s
                Person age: %d
                """.formatted(personEncapsulation.getPersonName(), personEncapsulation.getPersonLastName(), personEncapsulation.getPersonAge()));
    }


}
