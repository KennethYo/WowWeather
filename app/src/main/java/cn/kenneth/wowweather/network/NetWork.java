package cn.kenneth.wowweather.network;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 网络工具
 * Created by Kenneth on 2016/2/21.
 */
public class NetWork {
    private static final String BASE_URL = "http://apis.baidu.com/heweather/weather/free";
    private static final String API_KEY = "20b6ea3c3b9c73f364b1dbc63dcbc563";

    private static NetWork ourInstance = new NetWork();
    private Retrofit mRetrofit;

    public static NetWork getInstance() {
        return ourInstance;
    }

    private NetWork() {
        init();
    }

    private void init() {
        OkHttpClient okHttpClient = new OkHttpClient();

        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(HttpLoggingInterceptor.Logger.DEFAULT);
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        okHttpClient.interceptors().add(httpLoggingInterceptor);

        Interceptor headerInterceptor = new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request originRequest = chain.request();
                Request.Builder builder = originRequest.newBuilder();
                builder.header("apikey", API_KEY);

                return chain.proceed(builder.build());
            }
        };
        okHttpClient.interceptors().add(headerInterceptor);


        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }

    public Retrofit getRetrofit() {
        return mRetrofit;
    }
}
