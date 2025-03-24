package com.qlsv.ui;

import java.io.PrintWriter;
import java.util.Scanner;

public class SVMenu {
	PrintWriter out;
	Scanner in;
	String prompt;
	
	public SVMenu(){
		
	}
	
	public SVMenu(PrintWriter _out,
	Scanner _in, String _promtp){
		out = _out;
		in = _in;
		prompt = _promtp;
	}
	
	public void controlLoop() {
		String command = " ";
		out.println("gõ lệnh \"help\" để được hỗ trợ!");
		out.flush();
		while(true) {
			out.print(prompt);
			out.flush();
			command = in.nextLine();//"help"
			//cắt khoảng trắng
			command = command.trim();
			//kiểm tra
			if("help".equalsIgnoreCase(command)) {
				help();
				continue;//tiếp tục menu
			}
		}
	}

	private void help() {
		// TODO Auto-generated method stub
		
	}

}
