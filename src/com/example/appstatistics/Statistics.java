package com.example.appstatistics;

import java.util.ArrayList;
import java.util.List;

public class Statistics {
	
	
	private String appName;
	private int useCount;
	private String useTime;
	
	
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public int getUseCount() {
		return useCount;
	}
	public void setUseCount(int useCount) {
		this.useCount = useCount;
	}
	public String getUseTime() {
		return useTime;
	}
	public void setUseTime(String useTime) {
		this.useTime = useTime;
	}
	
	
	//ͳ��app��ʹ�ô�������ʹ��ʱ�䡢ʹ��ʱ��
	public List<Statistics> getData(){
		
		List <Statistics> runingApp=new ArrayList<Statistics>();
		
		
		
		
		return runingApp;
	}

}
