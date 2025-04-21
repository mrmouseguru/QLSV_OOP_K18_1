package com.qlsv.database;

import java.util.ArrayList;

import com.qlsv.entity.SinhVien;

public class MemorySVPrintDAO extends SVPrintDAO{
	
	
	@Override
	public ArrayList<SinhVien> getDSSV(){
		return MemorySVDB.getDSSV();
	}

}
