package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by vincent on 2015/8/6.
 */
public class FileUtil {
    public static void readString(File targetFile, LineHandler lineHandler) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(targetFile));
        try{
            int lineNum = 1;
            String lineContent = null;
            while((lineContent = reader.readLine()) != null){
                lineHandler.handle(lineNum, lineContent);
                lineNum ++;
            }
        } finally {
            if(reader != null)
                reader.close();
        }
    }
    interface LineHandler{
        void handle(int lineNum, String lineContent);
    }
}
