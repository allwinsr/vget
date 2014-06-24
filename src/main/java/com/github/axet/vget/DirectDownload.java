package com.github.axet.vget;


import java.io.File;
import java.net.URL;
import java.util.Scanner;

public class DirectDownload {

    public static void main(String[] args) {
        try {
            // ex: http://www.youtube.com/watch?v=Nj6PFaDmp6c
        	String url = "", path = "";
            //String url = args[0];
            // ex: "/Users/axet/Downloads"
            //String path = args[1];
            
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the URL : ");
            url = in.nextLine();
            System.out.println("Enter the Path (to save) :");
            path = in.nextLine();
            VGet v = new VGet(new URL(url), new File(path));
            v.download();
            System.out.println("Done");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
