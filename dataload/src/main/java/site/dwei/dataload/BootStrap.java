package site.dwei.dataload;

import site.dwei.dataload.bean.FileDataLoad;
import site.dwei.dataload.factory.DataLoadFactory;

/**
 * @author weitu
 * @date 2020-04-16
 * @description
 */
public class BootStrap {

    private static String  MOVIE_DATA_PATH="E:\\JavaWork\\Java_Spark\\dataload\\src\\main\\resources\\movies.csv";
    private static String  RATING_DATA_PATH="E:\\JavaWork\\Java_Spark\\dataload\\src\\main\\resources\\ratings.csv";
    private static String  TAG_DATA_PATH="E:\\JavaWork\\Java_Spark\\dataload\\src\\main\\resources\\tags.csv";

    public static void main(String[] args) {
        FileDataLoad movieDataLoad = DataLoadFactory.getMovieDataLoad(MOVIE_DATA_PATH);
        movieDataLoad.storeData();
        FileDataLoad ratingDataLoad = DataLoadFactory.getRatingDataLoad(RATING_DATA_PATH);
        ratingDataLoad.storeData();
        FileDataLoad tagDataLoad = DataLoadFactory.getTagDataLoad(TAG_DATA_PATH);
        tagDataLoad.storeData();
    }
}
