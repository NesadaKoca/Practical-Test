
package nesada.c4q.nyc.practicaltest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Loops {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("velocity")
    @Expose
    private Double velocity;
    @SerializedName("onFire")
    @Expose
    private Integer onFire;

    /**
     * 
     * @return
     *     The count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 
     * @return
     *     The velocity
     */
    public Double getVelocity() {
        return velocity;
    }

    /**
     * 
     * @param velocity
     *     The velocity
     */
    public void setVelocity(Double velocity) {
        this.velocity = velocity;
    }

    /**
     * 
     * @return
     *     The onFire
     */
    public Integer getOnFire() {
        return onFire;
    }

    /**
     * 
     * @param onFire
     *     The onFire
     */
    public void setOnFire(Integer onFire) {
        this.onFire = onFire;
    }

}
