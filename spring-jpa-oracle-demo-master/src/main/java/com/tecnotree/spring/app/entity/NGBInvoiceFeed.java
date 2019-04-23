package com.tecnotree.spring.app.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.ColumnTransformer;


@Entity(name="invoice_feed_from_ngb")
public class NGBInvoiceFeed {

	@Id
	@Column(name = "TRANS_NUM_N")
	private Long  transNum;

	@Column(name = "TOPIC_NAME_V")
	private String tipicName;

	@Column(name = "TRANS_DATE_D")
	private Date transDate;

	@Column(name = "STATUS_V")
	private String status;

	@Lob
	@ColumnTransformer(read = "NVL2(REQ_XML_X, (REQ_XML_X).getClobVal(), NULL)", write = "XMLType.createxml(?)")
	private String reqXml;

	@Column(name = "INSTANCE_ID_N")
	private Long instanceId;

	@Column(name = "BILL_TYPE_V")
	private String billType;

	public Long  getTransNum() {
		return transNum;
	}

	public void setTransNum(Long  transNum) {
		this.transNum = transNum;
	}

	public String getTipicName() {
		return tipicName;
	}

	public void setTipicName(String tipicName) {
		this.tipicName = tipicName;
	}

	public Date getTransDate() {
		return transDate;
	}

	public void setTransDate(Date date) {
		this.transDate = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReqXml() {
		return reqXml;
	}

	public void setReqXml(String reqXml) {
		this.reqXml = reqXml;
	}

	public Long getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(Long long1) {
		this.instanceId = long1;
	}

	public String getBillType() {
		return billType;
	}

	public void setBillType(String billType) {
		this.billType = billType;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NGBInvoiceFeed [transNum=");
		builder.append(transNum);
		builder.append(", tipicName=");
		builder.append(tipicName);
		builder.append(", transDate=");
		builder.append(transDate);
		builder.append(", status=");
		builder.append(status);
		builder.append(", reqXml=");
		builder.append(reqXml);
		builder.append(", instanceId=");
		builder.append(instanceId);
		builder.append(", billType=");
		builder.append(billType);
		builder.append("]");
		return builder.toString();
	}


}