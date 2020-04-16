package site.dwei.dataload.bean;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import site.dwei.common.bean.DataLoad;

import java.util.Properties;

/**
 * @author weitu
 * @date 2020-04-16
 * @description
 */
public abstract class FileDataLoad implements DataLoad {

    protected static SparkConf conf = new SparkConf().setAppName("dataload").setMaster("local[*]");
    protected static JavaSparkContext sc = new JavaSparkContext(conf);
    protected static SparkSession spark = SparkSession.builder().config(conf).getOrCreate();

    protected static Properties properties = new Properties();
    static {
        properties.put("user","root");
        properties.put("password","root");
    }

    protected String path;

    public FileDataLoad(String path) {
        this.path = path;
    }

    protected Dataset<Row> dataDF;




}
