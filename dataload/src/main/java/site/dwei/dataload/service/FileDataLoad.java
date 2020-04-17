package site.dwei.dataload.service;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.springframework.beans.factory.annotation.Autowired;
import site.dwei.common.bean.DataLoad;

import java.util.Properties;

/**
 * @author weitu
 * @date 2020-04-16
 * @description
 */
public abstract class FileDataLoad implements DataLoad {

    /**
     * 每个JVM只能运行一个SparkSession, 用完一定要关！！！！！！！！
     * SparkSession与SparkContext区别？
     *      SparkSession作为DataSet和DataFrame API的切入点，SparkSession封装了SparkConf、SparkContext和SQLContext
     *      SparkSession内部封装了sparkContext，所以计算实际上是由sparkContext完成的。
     */

    protected static Properties properties = new Properties();
    static {
        properties.put("user","root");
        properties.put("password","root");
    }

    protected String path;
    protected Dataset<Row> dataDF;
}
