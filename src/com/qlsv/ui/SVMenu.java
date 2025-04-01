package com.qlsv.ui;

import java.io.PrintWriter;
import java.util.Scanner;

import com.qlsv.control.SVControlAdd;
import com.qlsv.control.SVControlPrint;

public class SVMenu {
	private PrintWriter out;
	private Scanner in;
	private String prompt;
	private SVControlAdd svControlAdd;
	private SVControlPrint svControlPrint;
	
	public void setSVControlPrint(SVControlPrint svControlPrint) {
		this.svControlPrint = svControlPrint;
	}
	
	public SVMenu(){
		
	}
	
	public SVMenu(PrintWriter _out,
	Scanner _in, String _promtp){
		out = _out;
		in = _in;
		prompt = _promtp;
	}
	
	
	
	public SVMenu(PrintWriter out, Scanner in, 
			String prompt, SVControlAdd svControlAdd) {
//		this.out = out;
//		this.in = in;
//		this.prompt = prompt;
		this(out, in, prompt);
		this.svControlAdd = svControlAdd;
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
			
			if("add".equalsIgnoreCase(command)){
				add();
				continue;
			}
			
			if("pAll".equalsIgnoreCase(command)) {
				printAllSV();
				continue;
			}
		}
	}

	
	
	private void printAllSV() {
		// TODO Auto-generated method stub
		//gửi thông điệp đến objec SVControlPrint
		svControlPrint.printAllSV();
	}

	private void help() {
		out.println("~~~~~~~~User Help Menu~~~~~~~~");
		out.flush();
		out.println("[HELP] huong dan su dung phan mem");
		out.flush();
		out.println("[ABOUT] thong tin ve PM quan lý chuyến xe");
		out.flush();
		out.println("[ADD] them mới một Sinh Viên");
		out.flush();
		out.println("[PRINT] in tất cả chuyến xe");
		out.flush();
		out.println("[EXIT] thoát khỏi phần mềm");
		out.flush();
		out.println("~~~~~~~~User Help Menu~~~~~~~~");
		out.flush();
	}
	
	private void add() {
		//gửi thông điệp
		svControlAdd.add();
		
	}

}
