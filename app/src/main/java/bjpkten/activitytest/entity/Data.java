package bjpkten.activitytest.entity;

import org.litepal.crud.LitePalSupport;

import java.util.Date;

/**
 * Created by Kodulf on 2018/10/30.
 */
public class Data extends LitePalSupport {
    int id;
    String data;
    Date date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
