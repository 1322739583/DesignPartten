package builder.examples.simple;

public class Test {
    public static void main(String[] args) {
        Student student;
        student = new Student()
                .newBuilder()
                .setId(1)
                .setName("xiao")
                .build();

        System.out.println(student.getName());

    }


}
