public class student {     private String name;
    private double currentScholarship;     private double newScholarship;
    public student(String name,double currentScholarship,double newScholarship){
        this.name=name;        this.currentScholarship=currentScholarship;
        this.newScholarship=newScholarship;    }
    public void setName(String name) {
        this.name = name;    }
    public String getName() {
        return name;    }
    public void setCurrentScholarship(double currentScholarship) {
        this.currentScholarship = currentScholarship;    }
    public double getCurrtntScholarship() {
        return currentScholarship;    }
    public double getNewScholarship() {
        return newScholarship;    }
    public void setNewScholarship(double newScholarship) {
        this.newScholarship = newScholarship;    }
}
