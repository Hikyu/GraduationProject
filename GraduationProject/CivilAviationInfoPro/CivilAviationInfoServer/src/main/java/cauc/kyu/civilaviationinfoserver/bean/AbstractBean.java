package cauc.kyu.civilaviationinfoserver.bean;

/**
 * Created by Administrator on 2016/5/6.
 */
public abstract class AbstractBean {
    protected int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract String toString();
}
