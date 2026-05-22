package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Xin chào các bạn sinh viên XTH - N03");
        list.add("Lớp: Git/Github - JavaBasic");
        list.add("Giảng viên: Thầy Bùi Quốc Đạt");
        list.add("Task01: New Function Print");
        printMessage(list);
        System.out.println("Nhánh này được checkout từ task01");
    }

    public static void printMessage(List<String> list){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
            System.out.println("-----------------");
        }
    }
}