package cn.kenneth.wowweather.model;

/**
 * 7天天气预报
 * Created by Kenneth on 2016/2/21.
 */
public class DailyForecast {
    /**
     * sr : 06:53
     * ss : 17:22
     */

    private Astro astro;
    /**
     * code_d : 500
     * code_n : 100
     * txt_d : 薄雾
     * txt_n : 晴
     */

    private Cond cond;
    private String date;
    private String hum;
    private String pcpn;
    private String pop;
    private String pres;
    /**
     * max : -20
     * min : -32
     */

    private Tmp tmp;
    private String vis;
    /**
     * deg : 250
     * dir : 西北风
     * sc : 3-4
     * spd : 12
     */

    private Wind wind;

    public void setAstro(Astro astro) {
        this.astro = astro;
    }

    public void setCond(Cond cond) {
        this.cond = cond;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setHum(String hum) {
        this.hum = hum;
    }

    public void setPcpn(String pcpn) {
        this.pcpn = pcpn;
    }

    public void setPop(String pop) {
        this.pop = pop;
    }

    public void setPres(String pres) {
        this.pres = pres;
    }

    public void setTmp(Tmp tmp) {
        this.tmp = tmp;
    }

    public void setVis(String vis) {
        this.vis = vis;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Astro getAstro() {
        return astro;
    }

    public Cond getCond() {
        return cond;
    }

    public String getDate() {
        return date;
    }

    public String getHum() {
        return hum;
    }

    public String getPcpn() {
        return pcpn;
    }

    public String getPop() {
        return pop;
    }

    public String getPres() {
        return pres;
    }

    public Tmp getTmp() {
        return tmp;
    }

    public String getVis() {
        return vis;
    }

    public Wind getWind() {
        return wind;
    }

    /**
     * 天文数值
     */
    public static class Astro {
        private String sr;
        private String ss;

        public void setSr(String sr) {
            this.sr = sr;
        }

        public void setSs(String ss) {
            this.ss = ss;
        }

        public String getSr() {
            return sr;
        }

        public String getSs() {
            return ss;
        }
    }

    /**
     * 天气状况
     */
    public static class Cond {
        private String code_d;
        private String code_n;
        private String txt_d;
        private String txt_n;

        public void setCode_d(String code_d) {
            this.code_d = code_d;
        }

        public void setCode_n(String code_n) {
            this.code_n = code_n;
        }

        public void setTxt_d(String txt_d) {
            this.txt_d = txt_d;
        }

        public void setTxt_n(String txt_n) {
            this.txt_n = txt_n;
        }

        public String getCode_d() {
            return code_d;
        }

        public String getCode_n() {
            return code_n;
        }

        public String getTxt_d() {
            return txt_d;
        }

        public String getTxt_n() {
            return txt_n;
        }
    }

    /**
     * 温度
     */
    public static class Tmp {
        private String max;
        private String min;

        public void setMax(String max) {
            this.max = max;
        }

        public void setMin(String min) {
            this.min = min;
        }

        public String getMax() {
            return max;
        }

        public String getMin() {
            return min;
        }
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
