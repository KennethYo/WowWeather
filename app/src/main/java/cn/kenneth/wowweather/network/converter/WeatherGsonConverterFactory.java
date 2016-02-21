package cn.kenneth.wowweather.network.converter;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/**
 * Created by Kenneth on 2016/2/21.
 */
public final class WeatherGsonConverterFactory extends Converter.Factory{
    public static WeatherGsonConverterFactory create() {
        return create(new Gson());
    }

    public static WeatherGsonConverterFactory create(Gson gson) {
        return new WeatherGsonConverterFactory(gson);
    }

    private final Gson gson;

    private WeatherGsonConverterFactory(Gson gson) {
        if (gson == null) throw new NullPointerException("gson == null");
        this.gson = gson;
    }

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations,
                                                            Retrofit retrofit) {
        TypeAdapter<?> adapter = gson.getAdapter(TypeToken.get(type));
        return new WeatherGsonResponseBodyConverter<>(adapter);
    }

    @Override
    public Converter<?, RequestBody> requestBodyConverter(Type type,
                                                          Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        TypeAdapter<?> adapter = gson.getAdapter(TypeToken.get(type));
        return new WeatherGsonRequestBodyConverter<>(gson, adapter);
    }
}
