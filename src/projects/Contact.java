package projects;

public class Contact {
    private String phone;
    private String email;

    public Contact(String p, String e){
        this.phone = p;
        this.email = e;
    }

    public String getPhone(){
        return this.phone;
    }


    public String getEmail(){
        return this.email;
    }

    public boolean isEmailValid(){
        return true;
    }
}
