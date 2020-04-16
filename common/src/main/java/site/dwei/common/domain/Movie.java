package site.dwei.common.domain;

/**
 * @author weitu
 * @date 2020-04-16
 * @description
 *  Movie: 电影ID，电影名称，详情描述，时长，发行时间，拍摄语言，类型，演员表，导演
 *            int                         String
 */
public class Movie {
    private int id;
    private String name;
    private String description;
    private String time;
    private String issue;
    private String shoot;
    private String language;
    private String genres;
    private String actors;

    private String directors;

    public Movie(int id, String name, String description, String time,
                 String issue, String shoot, String language, String genres, String actors, String directors) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.time = time;
        this.issue = issue;
        this.shoot = shoot;
        this.language = language;
        this.genres = genres;
        this.actors = actors;
        this.directors = directors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getShoot() {
        return shoot;
    }

    public void setShoot(String shoot) {
        this.shoot = shoot;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }


}
