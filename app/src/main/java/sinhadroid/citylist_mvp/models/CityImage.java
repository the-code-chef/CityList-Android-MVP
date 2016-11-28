package sinhadroid.citylist_mvp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by deepanshu on 17/11/16.
 */
public class CityImage {

    @SerializedName("m")
    @Expose
    private String m;

    /**
     *
     * @return
     * The m
     */
    public String getM() {
        return m;
    }

    /**
     *
     * @param m
     * The m
     */
    public void setM(String m) {
        this.m = m;
    }
}
