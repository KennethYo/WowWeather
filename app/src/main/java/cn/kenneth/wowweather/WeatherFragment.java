package cn.kenneth.wowweather;

import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import cn.kenneth.wowweather.model.CityWeather;
import cn.kenneth.wowweather.model.DailyForecast;
import cn.kenneth.wowweather.model.HourlyForecast;
import cn.kenneth.wowweather.network.APIServices;
import cn.kenneth.wowweather.network.NetWork;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * A placeholder fragment containing a simple view.
 */
public class WeatherFragment extends BaseFragment {

    @Bind(R.id.tv_weather)
    TextView mTvWeather;

    public WeatherFragment() {
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_main;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        APIServices apiServices = NetWork.getInstance().create(APIServices.class);
        Observable<CityWeather> weather = apiServices.getWeather("beijing");
        weather.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<CityWeather>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(CityWeather cityWeather) {
                        setWeatherInfo(cityWeather);
                    }
                });
    }

    private void setWeatherInfo(CityWeather cityWeather) {
        StringBuilder sb = new StringBuilder();
        sb.append("基本信息");
        sb.append("\n");
        sb.append("城市名称:");
        sb.append(cityWeather.getBasic().getCity());
        sb.append("\n");
        sb.append("国家:");
        sb.append(cityWeather.getBasic().getCnty());
        sb.append("\n");
        sb.append("城市ID:");
        sb.append(cityWeather.getBasic().getId());
        sb.append("\n");
        sb.append("城市维度:");
        sb.append(cityWeather.getBasic().getLat());
        sb.append("\n");
        sb.append("城市经度:");
        sb.append(cityWeather.getBasic().getLon());
        sb.append("\n");
        sb.append("\n");
        sb.append("更新时间");
        sb.append("\n");
        sb.append("当地时间:");
        sb.append(cityWeather.getBasic().getUpdate().getLoc());
        sb.append("\n");
        sb.append("UTC时间:");
        sb.append(cityWeather.getBasic().getUpdate().getUtc());
        sb.append("\n");
        sb.append("\n");
        sb.append("实况天气");
        sb.append("\n");
        sb.append("天气状况");
        sb.append("\n");
        sb.append("天气状况代码:");
        sb.append(cityWeather.getNow().getCond().getCode());
        sb.append("\n");
        sb.append("天气状况描述:");
        sb.append(cityWeather.getNow().getCond().getCode());
        sb.append("\n");
        sb.append("体感温度:");
        sb.append(cityWeather.getNow().getFl());
        sb.append("\n");
        sb.append("相对湿度（%）:");
        sb.append(cityWeather.getNow().getHum());
        sb.append("\n");
        sb.append("降水量（mm）:");
        sb.append(cityWeather.getNow().getPcpn());
        sb.append("\n");
        sb.append("气压:");
        sb.append(cityWeather.getNow().getPres());
        sb.append("\n");
        sb.append("温度:");
        sb.append(cityWeather.getNow().getTmp());
        sb.append("\n");
        sb.append("能见度（km）:");
        sb.append(cityWeather.getNow().getVis());
        sb.append("\n");
        sb.append("风力风向");
        sb.append("\n");
        sb.append("风向（360度）:");
        sb.append(cityWeather.getNow().getWind().getDeg());
        sb.append("\n");
        sb.append("风向:");
        sb.append(cityWeather.getNow().getWind().getDir());
        sb.append("\n");
        sb.append("风力:");
        sb.append(cityWeather.getNow().getWind().getSc());
        sb.append("\n");
        sb.append("风速（kmph）:");
        sb.append(cityWeather.getNow().getWind().getSpd());
        sb.append("\n");
        sb.append("\n");
        sb.append("空气质量，仅限国内部分城市，国际城市无此字段");
        sb.append("\n");
        sb.append("空气质量指数:");
        sb.append(cityWeather.getAqi().getCity().getAqi());
        sb.append("\n");
        sb.append("一氧化碳1小时平均值(ug/m³):");
        sb.append(cityWeather.getAqi().getCity().getCo());
        sb.append("\n");
        sb.append("二氧化氮1小时平均值(ug/m³):");
        sb.append(cityWeather.getAqi().getCity().getNo2());
        sb.append("\n");
        sb.append("臭氧1小时平均值(ug/m³):");
        sb.append(cityWeather.getAqi().getCity().getO3());
        sb.append("\n");
        sb.append("PM10 1小时平均值(ug/m³):");
        sb.append(cityWeather.getAqi().getCity().getPm10());
        sb.append("\n");
        sb.append("PM2.5 1小时平均值(ug/m³):");
        sb.append(cityWeather.getAqi().getCity().getPm25());
        sb.append("\n");
        sb.append("空气质量类别:");
        sb.append(cityWeather.getAqi().getCity().getQlty());
        sb.append("\n");
        sb.append("二氧化硫1小时平均值(ug/m³):");
        sb.append(cityWeather.getAqi().getCity().getSo2());
        sb.append("\n");
        sb.append("\n");
        sb.append("7天天气预报");
        for (DailyForecast cast : cityWeather.getDaily_forecast()) {
            sb.append("预报日期:");
            sb.append(cast.getDate());
            sb.append("\n");
            sb.append("相对湿度（%）:");
            sb.append(cast.getHum());
            sb.append("\n");
            sb.append("降水量（mm）:");
            sb.append(cast.getPcpn());
            sb.append("\n");
            sb.append("降水概率:");
            sb.append(cast.getPop());
            sb.append("\n");
            sb.append("气压:");
            sb.append(cast.getPres());
            sb.append("\n");
            sb.append("能见度（km）:");
            sb.append(cast.getVis());
            sb.append("\n");
            sb.append("天文数值");
            sb.append("日出时间:");
            sb.append(cast.getAstro().getSr());
            sb.append("\n");
            sb.append("日落时间:");
            sb.append(cast.getAstro().getSs());
            sb.append("\n");
            sb.append("天气状况");
            sb.append("白天天气状况代码:");
            sb.append(cast.getCond().getCode_d());
            sb.append("\n");
            sb.append("夜间天气状况代码:");
            sb.append(cast.getCond().getCode_n());
            sb.append("\n");
            sb.append("白天天气状况描述:");
            sb.append(cast.getCond().getTxt_d());
            sb.append("\n");
            sb.append("夜间天气状况描述:");
            sb.append(cast.getCond().getTxt_d());
            sb.append("\n");
            sb.append("温度");
            sb.append("最高温度:");
            sb.append(cast.getTmp().getMax());
            sb.append("\n");
            sb.append("最低温度:");
            sb.append(cast.getTmp().getMin());
            sb.append("\n");
            sb.append("风力风向");
            sb.append("风向（360度）:");
            sb.append(cast.getWind().getDeg());
            sb.append("\n");
            sb.append("风向:");
            sb.append(cast.getWind().getDir());
            sb.append("\n");
            sb.append("风力:");
            sb.append(cast.getWind().getSc());
            sb.append("\n");
            sb.append("风速（kmph）:");
            sb.append(cast.getWind().getSpd());
            sb.append("\n");
        }
        sb.append("\n");
        sb.append("每三小时天气预报，全能版为每小时预报");
        for (HourlyForecast cast : cityWeather.getHourly_forecast()) {
            sb.append("时间:");
            sb.append(cast.getDate());
            sb.append("\n");
            sb.append("相对湿度（%）:");
            sb.append(cast.getHum());
            sb.append("\n");
            sb.append("降水概率:");
            sb.append(cast.getPop());
            sb.append("\n");
            sb.append("气压:");
            sb.append(cast.getPres());
            sb.append("\n");
            sb.append("温度:");
            sb.append(cast.getTmp());
            sb.append("\n");
            sb.append("风力风向:");
            sb.append("风向（360度）:");
            sb.append(cast.getWind().getDeg());
            sb.append("\n");
            sb.append("风向:");
            sb.append(cast.getWind().getDir());
            sb.append("\n");
            sb.append("风力:");
            sb.append(cast.getWind().getSc());
            sb.append("\n");
            sb.append("风速（kmph）:");
            sb.append(cast.getWind().getSpd());
            sb.append("\n");
        }
        sb.append("\n");
        sb.append("生活指数，仅限国内城市，国际城市无此");
        sb.append("\n");
        sb.append("舒适度指数");
        sb.append("\n");
        sb.append("简介:");
        sb.append(cityWeather.getSuggestion().getComf().getBrf());
        sb.append("\n");
        sb.append("详细描述:");
        sb.append(cityWeather.getSuggestion().getComf().getTxt());
        sb.append("\n");
        sb.append("洗车指数");
        sb.append("\n");
        sb.append("简介:");
        sb.append(cityWeather.getSuggestion().getCw().getBrf());
        sb.append("\n");
        sb.append("详细描述:");
        sb.append(cityWeather.getSuggestion().getCw().getTxt());
        sb.append("\n");
        sb.append("穿衣指数");
        sb.append("\n");
        sb.append("简介:");
        sb.append(cityWeather.getSuggestion().getDrsg().getBrf());
        sb.append("\n");
        sb.append("详细描述:");
        sb.append(cityWeather.getSuggestion().getDrsg().getTxt());
        sb.append("\n");
        sb.append("感冒指数");
        sb.append("\n");
        sb.append("简介:");
        sb.append(cityWeather.getSuggestion().getFlu().getBrf());
        sb.append("\n");
        sb.append("详细描述:");
        sb.append(cityWeather.getSuggestion().getFlu().getTxt());
        sb.append("\n");
        sb.append("运动指数");
        sb.append("\n");
        sb.append("简介:");
        sb.append(cityWeather.getSuggestion().getSport().getBrf());
        sb.append("\n");
        sb.append("详细描述:");
        sb.append(cityWeather.getSuggestion().getSport().getTxt());
        sb.append("\n");
        sb.append("旅游指数");
        sb.append("\n");
        sb.append("简介:");
        sb.append(cityWeather.getSuggestion().getTrav().getBrf());
        sb.append("\n");
        sb.append("详细描述:");
        sb.append(cityWeather.getSuggestion().getTrav().getTxt());
        sb.append("\n");
        sb.append("紫外线指数");
        sb.append("\n");
        sb.append("简介:");
        sb.append(cityWeather.getSuggestion().getUv().getBrf());
        sb.append("\n");
        sb.append("详细描述:");
        sb.append(cityWeather.getSuggestion().getUv().getTxt());
        sb.append("\n");

        mTvWeather.setText(sb.toString());
    }
}
