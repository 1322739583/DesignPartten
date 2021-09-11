package composite.example.school;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        OrgComponent university=new University("清华大学","顶级大学");
        OrgComponent computerCollege=new College("计算机学院","计算机学院");
        OrgComponent techCollege=new College("信息技术学院","信息技术学院");
        computerCollege.add(new Department("软件工程","软件工程"));
        computerCollege.add(new Department("网络工程","网络工程"));
        techCollege.add(new Department("通信工程","通信工程"));
        techCollege.add(new Department("信息工程","信息工程"));
        university.add(computerCollege);
        university.add(techCollege);
        university.print();
       // computerCollege.print();
       // techCollege.print();

    }
}
