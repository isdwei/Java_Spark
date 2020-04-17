package site.dwei.dataload.service;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import site.dwei.common.bean.DataLoad;
import site.dwei.common.domain.Movie;

import java.util.Properties;

/**
 * @author weitu
 * @date 2020-04-16
 * @description
 */
@Service("movieDataLoad")
public class MovieDataLoad extends FileDataLoad {

    @Autowired
    private JavaSparkContext sc;

    @Autowired
    private SparkSession spark;

    @Value("E:\\JavaWork\\Java_Spark\\dataload\\src\\main\\resources\\movies.csv")
    private String path;


    /**
     * 从文件中读取数据，保存为RDD
     * 对每一行数据，切分，再转化为DataFrame
     * @param path
     */
    @Override
    public void loadFile(String path) {
        JavaRDD<String> content = sc.textFile(path);
        JavaRDD<Movie> movieRDD = content.map(
                item -> {
                    String[] split = item.split("\\^");
                    return new Movie(Integer.parseInt(split[0]), split[1].trim(), split[2].trim()
                            , split[3].trim(), split[4].trim(), split[5].trim(), split[6].trim()
                            , split[7].trim(), split[8].trim(), split[9].trim());
                }
        );
        dataDF = spark.createDataFrame(movieRDD,Movie.class);
//        dataDF = spark.createDataFrame(movieRDD, Movie.class);
    }

    /**
     * 利用DATaFrame的write()方法，将数据直接写入MySQL
     * 这里的表不能提前建好，否则会报错
     */
    @Override
    public void storeData() {
        this.loadFile(path);
        dataDF.write()
                .jdbc("jdbc:mysql://localhost:3306/mr","movie",properties);
    }




}
