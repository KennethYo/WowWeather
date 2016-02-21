package cn.kenneth.wowweather.model;

/**
 * 生活指数，仅限国内城市，国际城市无此字段
 * Created by Kenneth on 2016/2/21.
 */
public class Suggestion {
    /**
     * brf : 极不舒适
     * txt : 白天天气虽然晴好，但气温低，您会感觉十分寒冷，极不舒适，请注意保暖，并避免出门，以防冻伤。
     */

    private Comf comf;
    /**
     * brf : 较适宜
     * txt : 较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。
     */

    private Cw cw;
    /**
     * brf : 寒冷
     * txt : 天气寒冷，建议着厚羽绒服、毛皮大衣加厚毛衣等隆冬服装。年老体弱者尤其要注意保暖防冻。
     */

    private Drsg drsg;
    /**
     * brf : 极易发
     * txt : 天气寒冷，且昼夜温差很大，极易发生感冒。请特别注意增加衣服保暖防寒。
     */

    private Flu flu;
    /**
     * brf : 较不宜
     * txt : 天气较好，但考虑天气寒冷，风力较强，推荐您进行室内运动，若户外运动请注意保暖并做好准备活动。
     */

    private Sport sport;
    /**
     * brf : 较不宜
     * txt : 天气较好，但温度很低，且风稍大，可有选择进行出游，比如说选择雪上项目，这也不错哦。
     */

    private Trav trav;
    /**
     * brf : 最弱
     * txt : 属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。
     */

    private Uv uv;

    public void setComf(Comf comf) {
        this.comf = comf;
    }

    public void setCw(Cw cw) {
        this.cw = cw;
    }

    public void setDrsg(Drsg drsg) {
        this.drsg = drsg;
    }

    public void setFlu(Flu flu) {
        this.flu = flu;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public void setTrav(Trav trav) {
        this.trav = trav;
    }

    public void setUv(Uv uv) {
        this.uv = uv;
    }

    public Comf getComf() {
        return comf;
    }

    public Cw getCw() {
        return cw;
    }

    public Drsg getDrsg() {
        return drsg;
    }

    public Flu getFlu() {
        return flu;
    }

    public Sport getSport() {
        return sport;
    }

    public Trav getTrav() {
        return trav;
    }

    public Uv getUv() {
        return uv;
    }

    /**
     * 舒适度指数
     */
    public static class Comf {
        private String brf;
        private String txt;

        public void setBrf(String brf) {
            this.brf = brf;
        }

        public void setTxt(String txt) {
            this.txt = txt;
        }

        public String getBrf() {
            return brf;
        }

        public String getTxt() {
            return txt;
        }
    }

    /**
     * 洗车指数
     */
    public static class Cw {
        private String brf;
        private String txt;

        public void setBrf(String brf) {
            this.brf = brf;
        }

        public void setTxt(String txt) {
            this.txt = txt;
        }

        public String getBrf() {
            return brf;
        }

        public String getTxt() {
            return txt;
        }
    }

    /**
     * 穿衣指数
     */
    public static class Drsg {
        private String brf;
        private String txt;

        public void setBrf(String brf) {
            this.brf = brf;
        }

        public void setTxt(String txt) {
            this.txt = txt;
        }

        public String getBrf() {
            return brf;
        }

        public String getTxt() {
            return txt;
        }
    }

    /**
     * 感冒指数
     */
    public static class Flu {
        private String brf;
        private String txt;

        public void setBrf(String brf) {
            this.brf = brf;
        }

        public void setTxt(String txt) {
            this.txt = txt;
        }

        public String getBrf() {
            return brf;
        }

        public String getTxt() {
            return txt;
        }
    }

    /**
     * /运动指数
     */
    public static class Sport {
        private String brf;
        private String txt;

        public void setBrf(String brf) {
            this.brf = brf;
        }

        public void setTxt(String txt) {
            this.txt = txt;
        }

        public String getBrf() {
            return brf;
        }

        public String getTxt() {
            return txt;
        }
    }

    /**
     * 旅游指数
     */
    public static class Trav {
        private String brf;
        private String txt;

        public void setBrf(String brf) {
            this.brf = brf;
        }

        public void setTxt(String txt) {
            this.txt = txt;
        }

        public String getBrf() {
            return brf;
        }

        public String getTxt() {
            return txt;
        }
    }

    /**
     * 紫外线指数
     */
    public static class Uv {
        private String brf;
        private String txt;

        public void setBrf(String brf) {
            this.brf = brf;
        }

        public void setTxt(String txt) {
            this.txt = txt;
        }

        public String getBrf() {
            return brf;
        }

        public String getTxt() {
            return txt;
        }
    }
}
