package com.shenghsiang.api.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoveCodeResponse extends APIResponse {
	@JsonProperty("details")
	private List<SocialWelfare> socialWelfareList;

	public List<SocialWelfare> getSocialWelfareList() {
		return socialWelfareList;
	}

	public void setSocialWelfareList(List<SocialWelfare> socialWelfareList) {
		this.socialWelfareList = socialWelfareList;
	}
}
