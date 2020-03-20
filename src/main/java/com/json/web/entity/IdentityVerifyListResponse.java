package com.json.web.entity;

import java.util.List;

/**
 * 列出身份识别信息响应
 * @author Dell
 *
 */
public class IdentityVerifyListResponse {

	private String next_marker;
	private List<IdentityVerifyInfo>  identity_verify_infos;
	public String getNext_marker() {
		return next_marker;
	}
	public void setNext_marker(String next_marker) {
		this.next_marker = next_marker;
	}
	public List<IdentityVerifyInfo> getIdentity_verify_infos() {
		return identity_verify_infos;
	}
	public void setIdentity_verify_infos(List<IdentityVerifyInfo> identity_verify_infos) {
		this.identity_verify_infos = identity_verify_infos;
	}
	
	
	
	
	
	
}
