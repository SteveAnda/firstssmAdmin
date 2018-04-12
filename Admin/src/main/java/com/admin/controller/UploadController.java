package com.admin.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@Controller
@RequestMapping("/upload")
public class UploadController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "/WEB-INF/jsp/upload.jsp";
    }
    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public @ResponseBody Object index(@RequestBody MultipartFile file) throws IOException {



        InputStream inputStream = file.getInputStream();
//        InputStreamReader is = new InputStreamReader(inputStream);
//        BufferedReader br = new BufferedReader(is);
//        StringBuilder sb = new StringBuilder();
//        String content = "";
//
//        while ((content = br.readLine()) != null) {
//            sb.append(content);
//            System.out.println(sb.toString());

            //转成流文件后，就可以自己处理了
//        }
//        ObjectMapper mapper = new ObjectMapper();
//        String jsonStr = mapper.writeValueAsString(file);
//        // 截取文件的扩展名
//        String oriName = file.getOriginalFilename();
//        String extName = oriName.substring(oriName.lastIndexOf("."));
//        // 保存文件
//        try {
//            file.transferTo(new File("/tmp/document/" + System.currentTimeMillis() + extName));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        ObjectMapper objectMapper = new ObjectMapper();
//        JsonNode jsonNode = objectMapper.readTree(inputStream);
        Object Object =  objectMapper.readValue(inputStream,  Object.class);
//        System.out.println(jsonNode.toString());

        return Object;
    }

}

