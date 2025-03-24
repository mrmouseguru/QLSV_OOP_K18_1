package com.qlsv.main;

import java.io.PrintWriter;
import java.util.Scanner;

import com.qlsv.ui.SVMenu;

public class AppQLSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//bước 1
		PrintWriter out;
		Scanner in;
		String prompt = "->";
		
		//bước 3    //bước 2
		out =       new PrintWriter(System.out);
		in = new Scanner(System.in);
		
		//gửi thông điệp
		out.println("~~~~~Chương trình Quản lý sinh viên ~~~");
		out.flush();
		
		//bước 1
		SVMenu menu;
		//bước 3    //bước 2
		menu =     new SVMenu(out, in, prompt);
		
		//gửi thông điệp
		menu.controlLoop();
		

	}

}
