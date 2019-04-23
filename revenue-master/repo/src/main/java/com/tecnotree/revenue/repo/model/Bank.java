package com.tecnotree.revenue.repo.model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value="banks1")
public class Bank {
	
	@PrimaryKey
	private String code;
	
	private String accessedby;
	private String accesseddate;
	private int isapplicable;
	private Map<String, String> name = new HashMap<>();
	private String opcoid;
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getAccessedby() {
		return accessedby;
	}
	public void setAccessedby(String accessedby) {
		this.accessedby = accessedby;
	}
	public String getAccesseddate() {
		return accesseddate;
	}
	public void setAccesseddate(String accesseddate) {
		this.accesseddate = accesseddate;
	}
	public int getIsapplicable() {
		return isapplicable;
	}
	public void setIsapplicable(int isapplicable) {
		this.isapplicable = isapplicable;
	}
	public Map<String, String> getName() {
		return name;
	}
	public void setName(Map<String, String> name) {
		this.name = name;
	}
	public String getOpcoid() {
		return opcoid;
	}
	public void setOpcoid(String opcoid) {
		this.opcoid = opcoid;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bank [code=");
		builder.append(code);
		builder.append(", accessedby=");
		builder.append(accessedby);
		builder.append(", accesseddate=");
		builder.append(accesseddate);
		builder.append(", isapplicable=");
		builder.append(isapplicable);
		builder.append(", name=");
		builder.append(name);
		builder.append(", opcoid=");
		builder.append(opcoid);
		builder.append("]");
		return builder.toString();
	}

	

}
