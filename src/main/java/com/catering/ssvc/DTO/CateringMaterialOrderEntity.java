package com.catering.ssvc.DTO;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Catering_Material_Order")
public class CateringMaterialOrderEntity {

	@Id
	@Column(name = "ID")
	private long id;

	@Column(name = "customer_Name")
	private String customerName;

	@Column(name = "customer_Mobile")
	private String customerMobile;

	@Column(name = "customer_Address")
	private String customerAddress;

	@Column(name = "event_Address")
	private String eventAddress;

	@Column(name = "event_Date")
	private Timestamp eventDate;

	@Column(name = "order_Delivery_Date")
	private String orderDeliveryDate;

	@Column(name = "date")
	private Timestamp date;

	@Column(name = "customer_Reffered_By")
	private String customerRefferedBy;

	@Column(name = "catering_Service_Order_No")
	private String cateringServiceOrderNo;

	@Column(name = "item_category")
	private String itemCategory;

	@Column(name = "item_list")
	private String itemList;

	public String getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	public String getItemList() {
		return itemList;
	}

	public void setItemList(String itemList) {
		this.itemList = itemList;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerMobile() {
		return customerMobile;
	}

	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getEventAddress() {
		return eventAddress;
	}

	public void setEventAddress(String eventAddress) {
		this.eventAddress = eventAddress;
	}

	public Timestamp getEventDate() {
		return eventDate;
	}

	public void setEventDate(Timestamp eventDate) {
		this.eventDate = eventDate;
	}

	public String getOrderDeliveryDate() {
		return orderDeliveryDate;
	}

	public void setOrderDeliveryDate(String orderDeliveryDate) {
		this.orderDeliveryDate = orderDeliveryDate;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public String getCustomerRefferedBy() {
		return customerRefferedBy;
	}

	public void setCustomerRefferedBy(String customerRefferedBy) {
		this.customerRefferedBy = customerRefferedBy;
	}

	@Override
	public String toString() {
		return "CateringMaterialOrderEntity [id=" + id + ", customerName=" + customerName + ", customerMobile="
				+ customerMobile + ", customerAddress=" + customerAddress + ", eventAddress=" + eventAddress
				+ ", eventDate=" + eventDate + ", orderDeliveryDate=" + orderDeliveryDate + ", date=" + date
				+ ", customerRefferedBy=" + customerRefferedBy + ", cateringServiceOrderNo=" + cateringServiceOrderNo
				+ ", itemCategory=" + itemCategory + ", itemList=" + itemList + "]";
	}

	public String getCateringServiceOrderNo() {
		return cateringServiceOrderNo;
	}

}
