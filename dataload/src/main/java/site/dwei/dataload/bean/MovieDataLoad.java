package site.dwei.dataload.bean;

import org.apache.spark.api.java.JavaRDD;
import site.dwei.common.domain.Movie;

/**
 * @author weitu
 * @date 2020-04-16
 * @description
 */
public class MovieDataLoad extends FileDataLoad {


    public MovieDataLoad(String path) {
        super(path);
    }

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
        dataDF = spark.createDataFrame(movieRDD, Movie.class);
    }

    @Override
    public void storeData() {
        this.loadFile(path);
        dataDF.write()
                .jdbc("jdbc:mysql://localhost:3306/mr","movie",properties);
    }




}
