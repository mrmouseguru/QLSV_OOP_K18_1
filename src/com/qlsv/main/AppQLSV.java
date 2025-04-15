package com.qlsv.main;

import java.io.PrintWriter;
import java.util.Scanner;

import com.qlsv.control.SVControlAdd;
import com.qlsv.control.SVControlPrint;
import com.qlsv.database.MemorySVAddDAO;
import com.qlsv.database.SVPrintDAO;
import com.qlsv.ui.SVInAdd;
import com.qlsv.ui.SVMenu;
import com.qlsv.ui.SVOutAdd;
import com.qlsv.ui.SVOutPrint;

public class AppQLSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//bước 1
		PrintWriter out;
		Scanner in;
		String prompt = "->";
		SVControlAdd svControlAdd;
		SVInAdd svInAdd;
		MemorySVAddDAO svAddDAO;
		SVOutAdd svOutAdd;
		SVControlPrint svControlPrint;
		SVPrintDAO svPrintDAO;
		SVOutPrint svOutPrint;
		
		//bước 3    //bước 2
		out =       new PrintWriter(System.out);
		in = new Scanner(System.in);
		svInAdd = new SVInAdd(in, out);
		svAddDAO = new MemorySVAddDAO();
		svOutAdd = new SVOutAdd(out);
		svOutPrint = new SVOutPrint(out);
		svPrintDAO = new SVPrintDAO();
		svControlPrint = new SVControlPrint(svPrintDAO, svOutPrint);
		svControlAdd = new SVControlAdd(svAddDAO, svInAdd, svOutAdd);
		
		//gửi thông điệp
		out.println("~~~~~Chương trình Quản lý sinh viên ~~~");
		out.flush();
		
		//bước 1
		SVMenu menu;
		//bước 3    //bước 2
		//menu =     new SVMenu(out, in, prompt);
		menu = new SVMenu(out, in, prompt, svControlAdd);
		menu.setSVControlPrint(svControlPrint);
		
		//gửi thông điệp
		menu.controlLoop();
		

	}

}
