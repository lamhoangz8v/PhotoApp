package thanhdnh.ueh.edu.article_app;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {
  @SerializedName(value = "id", alternate = {"user_id", "article_id"})
  @Expose
  private int id;

  @SerializedName(value = "username", alternate = {"user_name", "article_title", "title"})
  @Expose
  private String username;

  @SerializedName(value = "password", alternate = {"pass"})
  @Expose
  private String password;

  @SerializedName(value = "ui-profile", alternate = {"ui_profile", "profile", "avatar", "article_image", "user_image"})
  @Expose
  private String ui_profile;

  @SerializedName(value = "short-bio", alternate = {"short_bio", "bio", "article_description", "description"})
  @Expose
  private String short_bio;

  public User(int id, String username, String password, String ui_profile, String short_bio) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.ui_profile = ui_profile;
    this.short_bio = short_bio;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getUi_profile() {
    return ui_profile;
  }

  public void setUi_profile(String ui_profile) {
    this.ui_profile = ui_profile;
  }

  public String getShort_bio() {
    return short_bio;
  }

  public void setShort_bio(String short_bio) {
    this.short_bio = short_bio;
  }
}
