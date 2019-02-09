package com.forum.units;

import java.util.Date;

import com.forum.util.Utility;

public abstract class AbstractEntity {

	private Date created;
	private long id;


	public Long getId(){

		return this.id;
	}

	public void setId(Long id){

		this.id=id;

	}



	abstract void autoGenerateId();

	public Date getCreated() {
		return created;
	}

	public void setCreated() {
		this.created = Utility.getCurrentDate();
	}
}
