package com.kangxw.study.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;

/**
 * {@code FileUploadController} .
 *
 * @author KangXW
 * @version v1.0
 * @date 2020-07-24 12:29
 */
@Controller
public class FileUploadController {

    @RequestMapping("/upload")
    public String fileupload(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest req) throws IOException {
        // 获取文件名
        // file.getOriginalFilename();
        // 获取上传文件路径
        String path = req.getRealPath("/fileupload");
        InputStream is = file.getInputStream();
        OutputStream os = new FileOutputStream(new File(path, file.getOriginalFilename()));

        int length = 0;
        byte[] buffer = new byte[400];
        while ((length = is.read(buffer)) != -1) {
            os.write(buffer, 0 , length);
        }
        os.close();
        is.close();
        return "/index.jsp";
    }

    @RequestMapping("/batch")
    public String batch(@RequestParam("file") CommonsMultipartFile files[], HttpServletRequest req) throws IOException {
        // 获取文件名
        // file.getOriginalFilename();
        // 获取上传文件路径
        String path = req.getRealPath("/fileupload");

        for (CommonsMultipartFile file : files) {
            InputStream is = file.getInputStream();
            OutputStream os = new FileOutputStream(new File(path, file.getOriginalFilename()));

            int length = 0;
            byte[] buffer = new byte[400];
            while ((length = is.read(buffer)) != -1) {
                os.write(buffer, 0 , length);
            }
            os.close();
            is.close();
        }
        return "/index.jsp";
    }
}
