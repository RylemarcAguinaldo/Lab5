package projects;

public class Staff extends Person {
    protected String position;

    public Staff(){
        super();
        // Some other stuff
    }   

    public Staff(String p, String n, int id, String ph, String e){
        super(n, id, ph, e);
        // Some other stuff
    }

    public String getPosition(){
        return position;
    }

}
