package com.summer.design.patterns.created.factorymode.simplefactory;

public class VideoFactory {

    //简单工厂
    public Video getVideo(String type) {
        if("java".equals(type)){
            return new JavaVideo();
        }else if ("python".equals(type)){
            return new PythonVideo();
        }
        return null;
    }

    //使用反射弥补简单工厂的扩展性
    public Video getVideoByReflection(Class c) {
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
