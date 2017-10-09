package com.restservices;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="restOutputData")
public class RestOutputData {

	String timestamp = null;
	Integer calls= null;
	
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public Integer getCalls() {
		return calls;
	}
	public void setCalls(Integer calls) {
		this.calls = calls;
	}
}
