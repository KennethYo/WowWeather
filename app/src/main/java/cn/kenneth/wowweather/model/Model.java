package cn.kenneth.wowweather.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kenneth on 2016/2/21.
 */
public class Model {
    private List<CityWeather> list = new ArrayList<>();

    public CityWeather getCityWeather() {
        return list.size() == 0 ? null : list.get(0);
    }

}
