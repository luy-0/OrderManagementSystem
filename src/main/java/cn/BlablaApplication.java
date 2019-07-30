package cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.MultipartConfigElement;

@SpringBootApplication
public class BlablaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlablaApplication.class, args);
    }

//    public CommonsMultipartResolver multipartResolver(){
//    }
//    @Bean
//    public MultipartConfigElement multipartConfigElement() {
//
//        MultipartConfigFactory factory =new MultipartConfigFactory();
//// 设置文件大小限制 ,超了，页面会抛出异常信息，这时候就需要进行异常信息的处理了;
//        factory.setMaxFileSize("128KB");
////KB,MB
//
//// 设置总上传数据总大小
//
//        factory.setMaxRequestSize("256KB");
//
////Sets the directory location wherefiles will be stored.
//
////factory.setLocation("路径地址");
//        return factory.createMultipartConfig();
//    }
}
