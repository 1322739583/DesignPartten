package builder.examples.computer;



/**
 *
 */
public class Computer {
    private String cpu;//cpu 必需
    private String memery;//内存 必需
    private String power;//电源  必需
    private String board;//主板  必需
    private String display;//显示器 可选
    private String box;//机箱 可选

    public Computer(){
        //可以不写，因为build()的时候还是会调用有参数的构造器
        //this(new Builder());
    }


    public Computer(Builder builder) {
        //cpu 必需
        this.cpu = builder.cpu;
        this.memery = builder.memery;
        this.power = builder.power;
        this.board = builder.board;
        this.display = builder.display;
        this.box = builder.box;
    }

    public Builder newBuilder(String cpu,String memery,String power,String board){
        return new Builder(cpu,memery,power,board);
    }


    public String getCpu() {
        return cpu;
    }

    public String getMemery() {
        return memery;
    }

    public String getPower() {
        return power;
    }

    public String getBoard() {
        return board;
    }

    public String getDisplay() {
        return display;
    }

    public String getBox() {
        return box;
    }

    public static final class Builder{
          //一般在外包用，所以不用加private，内包是可以直接访问到变量的
          String cpu;//cpu 必需
          String memery;//内存 必需
          String power;//电源  必需
          String board;//主板  必需
          String display;//显示器 可选
          String box;//机箱 可选


        /**
         * 用户必需填写这几个，不提供别的构造器，根据需求调整
         * @param cpu cpu
         * @param memery 内存
         * @param power 电源
         * @param board 主板
         */
        public Builder(String cpu, String memery, String power, String board) {
            this.cpu = cpu;
            this.memery = memery;
            this.power = power;
            this.board = board;
        }

        public Builder(){

        }

        public Builder display(String display){
            this.display=display;
            return this;
        }

        public Builder box(String box){
            this.box=box;
            return this;
        }


        public Computer build(){
            return new Computer(this);
        }


    }


}
