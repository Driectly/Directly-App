package com.directly.luckyboard.core.bean.superdata;

import org.greenrobot.greendao.annotation.Generated;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/7 16:30
 */

public class HistoryData {
    private long date;
    private String data;

    @Generated(hash = 1452354993)
    public HistoryData(long date, String data) {
        this.date = date;
        this.data = data;
    }

    @Generated(hash = 422767273)
    public HistoryData() {
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
