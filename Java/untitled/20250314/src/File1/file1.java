package File1;

import java.io.File;

public class file1 {
    public static void main(String[] args) {
        // 1. 创建 File 对象指向目标目录
        File directory = new File("D:\\Java113\\IDEA");

        // 2. 检查路径是否为有效目录
        if (directory.exists() && directory.isDirectory()) {
            // 3. 调用 listFiles() 获取所有文件和子目录
            File[] files = directory.listFiles();

            // 4. 遍历输出
            if (files != null) {
                for (File file : files) {
                    System.out.println(file.getName());//对每个对象getName()
                }
            } else {
                System.out.println("目录为空或无法访问");
            }
        } else {
            System.out.println("路径不存在或不是目录");
        }
    }
}
