package com.ashwani.family.infra.model.request;

import com.ashwani.family.infra.entity.FamilyMember;
import com.ashwani.family.infra.model.GenericRequest;
import com.ashwani.family.util.constants.JsonConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Data
public class AddPolicyRequest extends BaseRequest implements GenericRequest {

    @NonNull
    @JsonProperty(JsonConstants.PARTICULAR)
    private String particular;

    @NonNull
    @JsonProperty(JsonConstants.HOLDER)
    private String holder;

    @NonNull
    @JsonProperty(JsonConstants.POLICY_NUMBER)
    private String policyNumber;

    @NonNull
    @JsonProperty(JsonConstants.PREMIUM_DATE)
    private Date premiumDate;

    @NonNull
    @JsonProperty(JsonConstants.PREMIUM_AMOUNT)
    private Integer premiumAmount;

    @NonNull
    @JsonProperty(JsonConstants.MATURITY_DATE)
    private Date maturityDate;

    @NonNull
    @JsonProperty(JsonConstants.MATURITY_AMOUNT)
    private String maturityAmount;

    @NonNull
    @JsonProperty(JsonConstants.LAST_YEAR_OF_PAYMENT)
    private String lastYearOfPayment;
}
