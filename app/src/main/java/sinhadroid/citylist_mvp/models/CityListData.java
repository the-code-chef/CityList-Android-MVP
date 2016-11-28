package sinhadroid.citylist_mvp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

/**
 * Created by deepanshu on 25/10/16.
 */

@Generated("org.jsonschema2pojo")
public class CityListData {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("media")
    @Expose
    private CityImage media;
    @SerializedName("date_taken")
    @Expose
    private String dateTaken;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("published")
    @Expose
    private String published;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("author_id")
    @Expose
    private String authorId;
    @SerializedName("tags")
    @Expose
    private String tags;

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The link
     */
    public String getLink() {
        return link;
    }

    /**
     *
     * @param link
     * The link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     *
     * @return
     * The media
     */
    public CityImage getMedia() {
        return media;
    }

    /**
     *
     * @param media
     * The media
     */
    public void setMedia(CityImage media) {
        this.media = media;
    }

    /**
     *
     * @return
     * The dateTaken
     */
    public String getDateTaken() {
        return dateTaken;
    }

    /**
     *
     * @param dateTaken
     * The date_taken
     */
    public void setDateTaken(String dateTaken) {
        this.dateTaken = dateTaken;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The published
     */
    public String getPublished() {
        return published;
    }

    /**
     *
     * @param published
     * The published
     */
    public void setPublished(String published) {
        this.published = published;
    }

    /**
     *
     * @return
     * The author
     */
    public String getAuthor() {
        return author;
    }

    /**
     *
     * @param author
     * The author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     *
     * @return
     * The authorId
     */
    public String getAuthorId() {
        return authorId;
    }

    /**
     *
     * @param authorId
     * The author_id
     */
    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    /**
     *
     * @return
     * The tags
     */
    public String getTags() {
        return tags;
    }

    /**
     *
     * @param tags
     * The tags
     */
    public void setTags(String tags) {
        this.tags = tags;
    }
}
