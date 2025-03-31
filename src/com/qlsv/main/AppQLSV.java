package com.qlsv.main;

import java.io.PrintWriter;
import java.util.Scanner;

import com.qlsv.control.SVControlAdd;
import com.qlsv.database.SVAddDAO;
import com.qlsv.ui.SVInAdd;
import com.qlsv.ui.SVMenu;
import com.qlsv.ui.SVOutAdd;

public class AppQLSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//bước 1
		PrintWriter out;
		Scanner in;
		String prompt = "->";
		SVControlAdd svControlAdd;
		SVInAdd svInAdd;
		SVAddDAO svAddDAO;
		SVOutAdd svOutAdd;
		
		//bước 3    //bước 2
		out =       new PrintWriter(System.out);
		in = new Scanner(System.in);
		svInAdd = new SVInAdd(in, out);
		svAddDAO = new SVAddDAO();
		svOutAdd = new SVOutAdd(out);
		svControlAdd = new SVControlAdd(svAddDAO, svInAdd, svOutAdd);
		
		//gửi thông điệp
		out.println("~~~~~Chương trình Quản lý sinh viên ~~~");
		out.flush();
		
		//bước 1
		SVMenu menu;
		//bước 3    //bước 2
		//menu =     new SVMenu(out, in, prompt);
		menu = new SVMenu(out, in, prompt, svControlAdd);
		
		//gửi thông điệp
		menu.controlLoop();
		

	}

}
