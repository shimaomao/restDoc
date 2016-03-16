package com.split.vo;

import java.io.Serializable;

public class BaseResultVo implements Serializable {

	private static final long serialVersionUID = -7978635757653362784L;

	// 返回码，0表示成功，非0表示失败
	private int resultCode;

	// 返回消息，成功为“success”，失败为具体失败信息
	private String resultMessage;

	// 返回数据
	private Object resultData;

	public BaseResultVo() {

	}

	public BaseResultVo(String resultMessage, Object resultData) {
		this.resultMessage = resultMessage;
		this.resultData = resultData;
	}

	public BaseResultVo(int resultCode, String resultMessage) {
		this.resultCode = resultCode;
		this.resultMessage = resultMessage;
	}

	public int getResultCode() {
		return resultCode;
	}

	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Object getResultData() {
		return resultData;
	}

	public void setResultData(Object resultData) {
		this.resultData = resultData;
	}

	@Override
	public String toString() {
		return "BaseResultVo [resultCode=" + resultCode + ", resultMessage=" + resultMessage + ", resultData="
				+ resultData + "]";
	}
}