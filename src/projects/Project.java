package projects;

public class Project {
    private String title;
    private String area;

    public Project(String t, String a){
        this.title = t;
        this.area = a;
    }

    public String getTitle(){
        return this.title;
    }

    public String getArea(){
        return this.area;
    }
    
}
