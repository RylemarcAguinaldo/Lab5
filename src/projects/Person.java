package projects;

public class Person {
    protected String name;
    private int id;
    public Contact contact;

    public Person(){

    }

    public Person(String n, int i, String phone, String e){
        this.name = n;
        this.id = i;
        this.contact = new Contact(phone, e);
    }
}
