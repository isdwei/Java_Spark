package site.dwei.common.config;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.SparkSession;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author weitu
 * @date 2020-04-17
 * @description
 */
@Configuration
public class ApplicationConfig {

    @Value("dataload")
    private String name;
    @Value("local[*]")
    private String master;


    @Bean(name = "sparkConf")
    public SparkConf sparkConf() {
        return new SparkConf().setAppName(name).setMaster(master);
    }

    @Bean(name = "sparkContext")
    public JavaSparkContext sparkContext() {
        return new JavaSparkContext(sparkConf());
    }

    @Bean(name = "sparkSession")
    public SparkSession sparkSession() {
        return SparkSession.builder().config(sparkConf()).getOrCreate();
    }
}
