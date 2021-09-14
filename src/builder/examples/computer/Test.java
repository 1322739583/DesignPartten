package builder.examples.computer;


import okhttp3.OkHttpClient;

public class Test {
    public static void main(String[] args) {
       Computer computer=new Computer()
               .newBuilder("i5","8g","100w","ASUS")
               .box("qicai")
               .display("tcl")
               .build();

        System.out.println(computer.getCpu());
        OkHttpClient client=new OkHttpClient().newBuilder().build();
       // client.authenticator()
    }
}
