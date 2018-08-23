package com.demo.config;

import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @ClassName MyTypeFilter
 * @Description TODO
 * @Author lyk
 * @Date 2018/8/16 16:37
 * @Version 1.0
 **/
public class MyTypeFilter implements TypeFilter {

    /**
     * metadataReader：读取到的当前正在扫描的类的信息
     * metadataReaderFactory:可以获取到其他任何类信息的
     */
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {

        //获取当前类注解信息
        AnnotatedTypeMetadata annotatedTypeMetadata = metadataReader.getAnnotationMetadata();
        //获取当前正在扫描的类的信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        //获取当前资源信息（类的路径）
   //     Resource resource = (Resource) metadataReader.getResource();

        String className = classMetadata.getClassName();
        System.out.println(annotatedTypeMetadata);
        System.out.println(className);
       // System.out.println(resource);

        if(className.contains("er")){
            return true;
        }
        return false;
    }
}
