package com.tecnotree.revenue.config;


public class SwaggerJson {

    private String json;

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SwaggerJson [json=");
		builder.append(json);
		builder.append("]");
		return builder.toString();
	}
   
}
