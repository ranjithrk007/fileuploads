package controller;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class display {
//    public static void main(String[] args) throws Exception {
//        toJson("C:\\Users\\Admin\\Downloads\\files\\sample1.txt");
//    }

    public static String returnWord(String value , String path) throws IOException {

        String temp = "";
        String fileName = path;
        File file = new File(fileName);
        String s = "";

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        while ((s = br.readLine()) != null) {


            Pattern p = Pattern.compile(value);
            Matcher m = p.matcher(s);
            if (m.find()) {
                return s;
            }


        }
        return temp;
    }
    public static String shorter(String str)
    {
        String s[]=str.split(Pattern.quote(":"));
        System.out.println(Arrays.deepToString(s));
        return s[1];
    }


    public String[] toJson(String path) throws Exception
    {


        String a[]=new String[6];
//        System.out.println("the given path is "+path);
        String Name=shorter(returnWord("Name:",path));

        String Phone=shorter(returnWord("Phone:",path));
        String StreetName=shorter(returnWord("Street Name:",path));
        String PostalCode=shorter(returnWord("Postal Code:",path));
        String City=shorter(returnWord("City:",path));
        String Email="";
        if(returnWord("Mail:",path)=="")
        {
            Email=shorter(returnWord("Email Address:",path));
        }else
        {
            Email=shorter(returnWord("Mail:",path));
        }
//        List list = new LinkedList();

        a[0]=Name;
        a[1]=Phone;
        a[2]=Email;
        a[3]=StreetName;
        a[4]=City;
        a[5]=PostalCode;
//        System.out.println("Name            :"+Name);
//        System.out.println("Phone           :"+Phone);
//        System.out.println("Email           :"+Email);
//        System.out.println("StreetName      :"+StreetName);
//        System.out.println("City            :"+City);
//        System.out.println("PostalCode      :"+PostalCode);

        //System.out.println(Name);
return a;
    }
}
