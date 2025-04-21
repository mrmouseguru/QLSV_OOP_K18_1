package com.qlsv.database;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.qlsv.entity.SinhVien;

public class FileSVAddDAO implements SVAddDAO{

	@Override
	public void insert(SinhVien sv) {
		// TODO Auto-generated method stub
		FileOutputStream fOS;
		ObjectOutputStream oOS;
		ArrayList<SinhVien> dsSV = new ArrayList<SinhVien>();
		
		try {
			//đọc dữ liệu (ds sinh viên) cũ từ file
			dsSV = readSVFromFile();
			//kết nối đến file
			fOS = new FileOutputStream("sv.db");
			//thêm một sinh viên vào file
			oOS = new ObjectOutputStream(fOS);
			//đổ sv vào ArrayList
			dsSV.add(sv);
			oOS.writeObject(dsSV);
			
			fOS.close();
			oOS.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private ArrayList<SinhVien> readSVFromFile() {
		// TODO Auto-generated method stub
		FileInputStream fIS;
		ObjectInputStream oIS;
		SinhVien sv;
		ArrayList<SinhVien> dsSV = new ArrayList<SinhVien>();
		try {
			//1. kêt nối đến file sv.db
			fIS = new FileInputStream("sv.db");
			//2. lấy dư liệu từ file sv.db
			oIS = new ObjectInputStream(fIS);
			dsSV = (ArrayList<SinhVien>)oIS.readObject();
			
			fIS.close();
			oIS.close();
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dsSV;
	}

}
