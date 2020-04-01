package org.adt.domain;

import lombok.Data;

@Data
public class Criteria {
	
	private int pageNum;
	private int amount;

	private String type;
	private String keyword;
	
	
	//생성자에서 초기값 할당
	public Criteria() {
		this(1,10);
	}
	
	public Criteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}
	
	public String[] getTypeArr() {
		return type == null? new String[] {}: type.split("");
	}
}
