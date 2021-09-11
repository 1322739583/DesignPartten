package facade;

public class Client {
    public static void main(String[] args) {
        TheaterFacade facade=new TheaterFacade();
        facade.ready();
    }
}
