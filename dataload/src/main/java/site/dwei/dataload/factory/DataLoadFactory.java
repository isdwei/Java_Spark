package site.dwei.dataload.factory;

import site.dwei.dataload.bean.FileDataLoad;
import site.dwei.dataload.bean.MovieDataLoad;
import site.dwei.dataload.bean.RatingDataLoad;
import site.dwei.dataload.bean.TagDataLoad;

/**
 * @author weitu
 * @date 2020-04-16
 * @description 加载数据进入MySQL的静态工厂
 */
public class DataLoadFactory {
    public static FileDataLoad getMovieDataLoad(String path){
        return new MovieDataLoad(path);
    }

    public static FileDataLoad getRatingDataLoad(String path){
        return new RatingDataLoad(path);
    }

    public static FileDataLoad getTagDataLoad(String path){
        return new TagDataLoad(path);
    }
}
