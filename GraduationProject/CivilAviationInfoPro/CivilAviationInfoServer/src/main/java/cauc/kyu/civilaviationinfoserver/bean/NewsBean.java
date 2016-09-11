package cauc.kyu.civilaviationinfoserver.bean;

/**
 * 新闻实体类
 * Created by Administrator on 2016/5/6.
 */
public class NewsBean extends AbstractBean{
    private String title;
    private String content;
    private String date;
    private String source;
    private String titleimg;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public String getTitleimg() {
        return titleimg;
    }

    public void setTitleimg(String titleimg) {
        this.titleimg = titleimg;
    }

    @Override
    public String toString() {
        return "NewsBean{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", date='" + date + '\'' +
                ", source='" + source + '\'' +
                ", titleimg='" + titleimg + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
