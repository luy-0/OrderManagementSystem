package cn.blabla.controller;

import org.apache.ibatis.type.StringTypeHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.List;

@Controller
public class MyController {

    @RequestMapping("/file")
    public String file() {
        return  "/file";
    }

    @ResponseBody
    @RequestMapping("/upload")
    public String handlerFileUp(@RequestParam("file") MultipartFile file, HttpSession session) {
        //获取服务器上传的文件路径
        //String path = session.getServletContext().getRealPath("/upload");
        String path = "G:\\fileupload";
        //获取文件名称
        String filename = file.getOriginalFilename();
        if (!file.isEmpty()) {
            try {
                File file01 = new File(path);
                //完成文件上传
                file.transferTo(file01);
              /*  BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream (new File(file.getOriginalFilename())));
                out.write(file.getBytes());
                out.flush();
                out.close();*/
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return "上传失败," + e.getMessage();
            } catch (IOException e) {
                e.printStackTrace();
                return "上传失败," + e.getMessage();
            }

            return "上传成功";
        } else {

            return "上传失败，因为文件是空的.";
        }
    }
    @RequestMapping(value = "/batch/upload", method = RequestMethod.POST)
    @ResponseBody
    public String handleFileUpload(HttpServletRequest request ) {
        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
        MultipartFile file = null;
        BufferedOutputStream stream = null;
        String path = "G:\\fileupload";
        for (int i = 0; i < files.size(); ++i) {
            file = files.get(i);
            if (!file.isEmpty()) {
                try {
                    byte[] bytes = file.getBytes();
                    stream = new BufferedOutputStream(new FileOutputStream(new File(file.getOriginalFilename())));
                    stream.write(bytes);
                    stream.close();
                } catch (Exception e) {
                    stream = null;
                    return "You failed to upload " + i + " =>" + e.getMessage();
                }
            } else {
                return "You failed to upload " + i + " becausethe file was empty.";
            }
        }
        return "upload successful";
    }
}
