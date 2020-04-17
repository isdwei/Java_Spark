package site.dwei.dataload;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import site.dwei.common.bean.DataLoad;
import site.dwei.dataload.service.FileDataLoad;
import site.dwei.dataload.service.MovieDataLoad;

/**
 * @author weitu
 * @date 2020-04-16
 * @description
 */
public class BootStrap {

    /**
     * 运行时，每个数据文件被切分为两块是为什么？
     * @param args
     */
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        DataLoad movieDataLoad = ac.getBean("movieDataLoad", DataLoad.class);
        movieDataLoad.storeData();
        DataLoad ratingDataLoad = ac.getBean("ratingDataLoad", DataLoad.class);
        ratingDataLoad.storeData();
        DataLoad tagDataLoad = ac.getBean("tagDataLoad", DataLoad.class);
        tagDataLoad.storeData();
    }
}
