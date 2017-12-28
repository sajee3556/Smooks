package main.java.example.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 212607215 on 12/18/2017.
 */
public class Constants {

    public static Map<String, ArrayList<String>> RECORD_TYPES = new HashMap<String, ArrayList<String>>();

    public static ArrayList<String> DETAIL_RECORD_TYPES = new ArrayList<String>(Arrays.asList("1", "A","M"));
    public static ArrayList<String> SUMMARY_RECORD_TYPE = new ArrayList<String>(Arrays.asList("2", "B", "N", "9", "Y", "Z"));


}
