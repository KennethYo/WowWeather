package cn.kenneth.wowweather.model;

/**
 * 每三小时天气预报，全能版为每小时预报
 * Created by Kenneth on 2016/2/21.
 */
public class HourlyForecast {
    private String date;
    private String hum;
    private String pop;
    private String pres;
    private String tmp;
    /**
     * deg : 235
     * dir : 西南风
     * sc : 微风
     * spd : 4
     */

    private Wind wind;

    public void setDate(String date) {
        this.date = date;
    }

    public void setHum(String hum) {
        this.hum = hum;
    }

    public void setPop(String pop) {
        this.pop = pop;
    }

    public void setPres(String pres) {
        this.pres = pres;
    }

    public void setTmp(String tmp) {
        this.tmp = tmp;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public String getDate() {
        return date;
    }

    public String getHum() {
        return hum;
    }

    public String getPop() {
        return pop;
    }

    public String getPres() {
        return pres;
    }

    public String getTmp() {
        return tmp;
    }

    public Wind getWind() {
        return wind;
    }

    /**
     * 风力风向
     */
    public static class Wind {
        private String deg;
        private String dir;
        private String sc;
        private String spd;

        public void setDeg(String deg) {
            this.deg = deg;
        }

        public void setDir(String dir) {
            this.dir = dir;
        }

        public void setSc(String sc) {
            this.sc = sc;
        }

        public void setSpd(String spd) {
            this.spd = spd;
        }

        public String getDeg() {
            return deg;
        }

        public String getDir() {
            return dir;
        }

        public String getSc() {
            return sc;
        }

        public String getSpd() {
            return spd;
        }
    }
}
