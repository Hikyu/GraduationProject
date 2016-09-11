package cauc.kyu.civilaviationinfoserver.bean;

/**
 * Created by Administrator on 2016/5/7.
 */
public class ArticleBean extends AbstractBean {

    private String title;
    private String date;
    private String content;
    private String source;
    private String author;
    private String classification;
    private String titleimg;
    private String authorHeader;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getTitleimg() {
        return titleimg;
    }

    public void setTitleimg(String titleimg) {
        this.titleimg = titleimg;
    }

    public String getAuthorHeader() {
        return authorHeader;
    }

    public void setAuthorHeader(String authorHeader) {
        this.authorHeader = authorHeader;
    }

    @Override
    public String toString() {
        return "ArticleBean{" +
                "title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", content='" + content + '\'' +
                ", source='" + source + '\'' +
                ", author='" + author + '\'' +
                ", classification='" + classification + '\'' +
                ", titleimg='" + titleimg + '\'' +
                ", authorHeader='" + authorHeader + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
