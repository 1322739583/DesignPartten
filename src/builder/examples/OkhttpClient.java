package builder.examples;

import okhttp3.Interceptor;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

public class OkhttpClient {

     List<Interceptor> interceptors;
     int readTimeout;
     int writeTimeout;
//
//    public OkhttpClient(OkhttpClient okhttpClient) {
//        this(new Builder());
//    }
//
//    public OkhttpClient(Builder builder){
//        interceptors=builder.interceptors;
//        readTimeout=builder.readTimeout;
//        writeTimeout=builder.readTimeout;
//    }

    public Builder newBuilder(){
        return new Builder(this);
    }

    public OkhttpClient build(){
        //return new Builder(this);
        return null;
    }

    public OkhttpClient (){
        //return new OkhttpClient(this);

    }

    public OkhttpClient (Builder builder){
        //return new OkhttpClient(this);

    }

    public static final class Builder{
        List<Interceptor> interceptors;
        int readTimeout;
        int writeTimeout;

        public OkhttpClient build(){
            return new OkhttpClient(this);
        }



        Builder(){
            interceptors=new ArrayList<>();
            readTimeout=10000;
            writeTimeout=10000;
        }

        Builder(OkhttpClient okhttpClient) {
            interceptors=new ArrayList<>();
            readTimeout=10000;
            writeTimeout=10000;

        }

        public Builder addInterceptor(Interceptor interceptor){
            interceptors.add(interceptor);
            return this;
        }

        public Builder readTimeout(int readTimeout){
            this.readTimeout=readTimeout;
            return this;
        }

        public Builder writeTimeout(int writeTimeout){
            this.writeTimeout=writeTimeout;
            return this;
        }


    }

}
