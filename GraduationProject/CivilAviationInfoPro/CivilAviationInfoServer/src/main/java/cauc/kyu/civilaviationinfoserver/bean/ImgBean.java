package cauc.kyu.civilaviationinfoserver.bean;

/**
 * Created by Administrator on 2016/5/13.
 */
public class ImgBean extends AbstractBean {
    private String title;
    private String date;
    private String source;
    private String author;
    private String img;
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }

    @Override
    public String toString() {
        return "ImgBean{" +
                "title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", source='" + source + '\'' +
                ", author='" + author + '\'' +
                ", img='" + img + '\'' +
                ", desc='" + description + '\'' +
                '}';
    }
}
