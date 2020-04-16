package site.dwei.common.domain;

/**
 * @author weitu
 * @date 2020-04-16
 * @description
 *      Tag: 用户ID，电影ID， 标签， 标签时间
 */
public class Tag {
     private int uid;
     private int mid;
     private String tag;
     private int timestamp;

    public Tag(int uid, int mid, String tag, int timestamp) {
        this.uid = uid;
        this.mid = mid;
        this.tag = tag;
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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }
}
