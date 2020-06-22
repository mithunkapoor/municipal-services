package org.egov.bpa.web.model.landInfo;

import java.util.List;

import org.egov.common.contract.response.ResponseInfo;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Validated
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LandInfoResponse {
	 @JsonProperty("ResponseInfo")
	  private ResponseInfo responseInfo;

	  @JsonProperty("LandInfo")
	  private List<LandInfo> landInfo;
}
