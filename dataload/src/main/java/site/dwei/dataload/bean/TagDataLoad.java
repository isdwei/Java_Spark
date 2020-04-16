package site.dwei.dataload.bean;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import site.dwei.common.domain.Tag;

/**
 * @author weitu
 * @date 2020-04-16
 * @description
 */
public class TagDataLoad extends FileDataLoad {

    public TagDataLoad(String path) {
        super(path);
    }

    @Override
    public void loadFile(String path) {
        JavaRDD<String> content = sc.textFile(path);
        JavaRDD<Tag> tagRDD = content.map(
                item -> {
                    String[] split = item.split(",");
                    return new Tag(Integer.parseInt(split[0]), Integer.parseInt(split[1]), split[2].trim() ,Integer.parseInt(split[3]));
                }
        );
        dataDF = spark.createDataFrame(tagRDD, Tag.class);
    }

    @Override
    public void storeData() {
        this.loadFile(path);
        dataDF.write()
                .jdbc("jdbc:mysql://localhost:3306/mr","tag",properties);
    }
}
