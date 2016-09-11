package cauc.kyu.civilaviationinfoserver.bean;

/**
 * Created by Administrator on 2016/5/23.
 */
public class UserBean {
    int id;
    int collect_list;
    String name;
    String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCollect_list() {
        return collect_list;
    }

    public void setCollect_list(int collect_list) {
        this.collect_list = collect_list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + id +
                ", collect_list=" + collect_list +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
