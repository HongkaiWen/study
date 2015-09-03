package io;

import java.io.File;

/**
 * Created by vincent on 2015/8/6.
 */
public class Client {
    public static void main(String args[]) throws Exception {
        File temp = new File("g:/temp/temp.txt");
        FileUtil.readString(temp, new FileUtil.LineHandler() {
            @Override
            public void handle(int lineNum, String lineContent) {
                System.out.println(lineNum + " -> " + lineContent);
            }
        });
    }
}
