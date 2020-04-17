package site.dwei.common.bean;

import com.sun.rowset.internal.Row;

import java.util.Properties;

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
