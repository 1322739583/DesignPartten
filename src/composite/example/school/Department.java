package composite.example.school;

public class Department extends OrgComponent{
    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public void print() {
        System.out.println("name:"+getName()+" des:"+getDes());
    }
}
