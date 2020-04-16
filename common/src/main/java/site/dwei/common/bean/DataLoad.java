package site.dwei.common.bean;

/**
 * @author weitu
 * @date 2020-04-16
 * @description
 */
public interface DataLoad {

    /**
     * 加载数据到MySQL
     * @param path
     */
    void loadFile(String path);
    void storeData();
}
