/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flashcard;

import model.Library;
import view.view2;
import controller.controller;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import org.json.*;
import view.view1;
/**
 *
 * @author Welcome
 */
public class Flashcard {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Load list libs
        
        // doan nay t load ra cai list rồi, h tạo cái view để hiện cái list này lên, mỗi  thằng click vào thì load
        
//        
        
//        try{
//            ServerSocket ss = new ServerSocket(2222);
//        } catch (IOException e){
//            System.out.println("error server");
//        }
//        File file = new File("1.csv");
//        Library library1 = new Library("lib1", file);
//        //library1.loadLibrary("8AyqBmQpncbKnjIYNRWD");
//        view2 view = new view2();
//        controller con = new controller(view, library1);
//        view.setVisible(true);
//        while (true){
//            
//        }
//        ArrayList<Library> libs = new ArrayList();
//        for (int i = 0; i <= 10; i++){
//            libs.add(new Library(String.valueOf(i), String.valueOf(i) + " libs"));
//        }
        
        view.view1 view11 = view1.getIns();
        view11.addListLibs();
        view11.setVisible(true);
    }
}


