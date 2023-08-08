public class passengers {
    String firstname;
    String lastname;
    int expenses;
    String firstname1;
    String lastname1;
    int expenses1;
    String firstname2;
    String lastname2;
    int expenses2;

    public passengers() {
        firstname = "k";
        lastname = "l";
        expenses = 0;
        firstname1 = "n";
        lastname1 = "m";
        expenses1 = 0;
        firstname2 = "o";
        lastname2 = "p";
        expenses2 = 0;
    }

    public void setName(String aName) {
        System.out.println("add name class method ");
        firstname = aName;
    }
    public String getName(String roomName) {
        return firstname;
    }
}
