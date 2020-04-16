package site.dwei.common.domain;

/**
 * @author weitu
 * @date 2020-04-16
 * @description
 *      Rating:用户ID，电影ID，评分，评分时间
 */
public class Rating {
    private int uid;
    private int mid;
    private double score;
    private int  timestamp;

    public Rating(int uid, int mid, double score, int timestamp) {
        this.uid = uid;
        this.mid = mid;
        this.score = score;
        this.timestamp = timestamp;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }
}
