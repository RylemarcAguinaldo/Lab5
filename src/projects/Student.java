package projects;

public class Student extends Person {
    private String program;
    private Staff advisor;
    private Project project;


    public Student(String n, int id, String ph, String e){
        super(n, id, ph, e);
        // some other stuff
    }

    public void setProgram(String p){
        this.program = p;
    }

    public String getProgram(){
        return this.program;
    }

    public void SetAdvisor(Staff adv){
        this.advisor = adv;
    }

    public String getProjectTitle(){
        return this.project.getTitle();
    }

    public String getProjectArea(){
        return this.project.getArea();
    }

    public String getAdvisorName(){
        return this.advisor.name;
    }

    public String getAdvisorPosition(){
        return this.advisor.getPosition();
    }
}
