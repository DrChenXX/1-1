package com.example.test.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

// 定义接口路径
@RestController
@RequestMapping("/file")
public class FileController {

    // 需要设计一个数据库存储对应文件
    //https://blog.csdn.net/jy0504/article/details/123934860?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522167588647216800192292598%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=167588647216800192292598&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~baidu_landing_v2~default-3-123934860-null-null.142^v73^pc_new_rank,201^v4^add_ask,239^v1^control&utm_term=%E6%96%87%E4%BB%B6%E4%B8%8A%E4%BC%A0%E6%95%B0%E6%8D%AE%E5%BA%93&spm=1018.2226.3001.4187
    private static final String DIR = " ";

    // 定义接口类型和二级路径，完整的接口url是：/file/upload
    @PostMapping("/upload")
    public void upload(@RequestParam MultipartFile file) {
        // 获取文件的名称
        String fileName = file.getOriginalFilename();
        try {
            // 新建一个文件路径
            File uploadFile = new File(DIR + fileName);
            // 当父级目录不存在时，自动创建
            if (!uploadFile.getParentFile().exists()) {
                uploadFile.getParentFile().mkdirs();
            }
            // 存储文件到电脑磁盘
            file.transferTo(uploadFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public class FileDownload {
        @RequestMapping("/download")
        public void download(String fileName, HttpServletResponse response, boolean isOnLine) throws IOException {
            // 路径可以指定当前项目相对路径
            File file = new File("C:\\Users\\Administrator\\Pictures\\小程序\\" + fileName);
            if (file.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                ServletOutputStream outputStream = response.getOutputStream();
                if(!isOnLine){
                    response.setContentType("application/octet-stream");
                    // 如果文件名为中文需要设置编码
                    response.setHeader("Content-Disposition", "attachment;fileName=" + URLEncoder.encode("test.jpg", "utf8"));
                    // 返回前端文件名需要添加
                    response.setHeader("Access-Control-Expose-Headers", "Content-Disposition");
                }
                byte[] bytes = new byte[1024];
                int len;
                while ((len = fileInputStream.read(bytes)) != -1) {
                    outputStream.write(bytes, 0, len);
                }
            }
        }
    }

}
