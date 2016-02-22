package cn.kenneth.wowweather.network;

import java.io.IOException;

import cn.kenneth.wowweather.network.converter.WeatherGsonConverterFactory;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;

/**
 * 网络工具
 * Created by Kenneth on 2016/2/21.
 */
public class NetWork {
    private static final String BASE_URL = "http://apis.baidu.com/";
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
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(HttpLoggingInterceptor.Logger.DEFAULT);
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        Interceptor headerInterceptor = new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request originRequest = chain.request();
                Request.Builder builder = originRequest.newBuilder();
                builder.method(originRequest.method(),originRequest.body());
                builder.headers(originRequest.headers());
                builder.header("apikey", API_KEY);

                return chain.proceed(builder.build());
            }
        };
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .addInterceptor(headerInterceptor)
                .build();



        mRetrofit = new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(WeatherGsonConverterFactory.create())
                .build();

    }

    public <T> T create(Class<T> service) {
        return mRetrofit.create(service);
    }

}
