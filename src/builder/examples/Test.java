package builder.examples;

public class Test {
    public static void main(String[] args) {
       OkhttpClient client=new OkhttpClient()
               .newBuilder()
               .readTimeout(10)
               .build();
    }
}
