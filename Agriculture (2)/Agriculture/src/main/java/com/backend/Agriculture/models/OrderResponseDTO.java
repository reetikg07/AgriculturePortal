package com.backend.Agriculture.models;

import java.util.List;

import com.backend.Agriculture.entities.Orders;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderResponseDTO {

	private Orders order;
	
	private List<OrderDetailsDTO> details;

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public List<OrderDetailsDTO> getDetails() {
		return details;
	}

	public void setDetails(List<OrderDetailsDTO> details) {
		this.details = details;
	}
	
	
}