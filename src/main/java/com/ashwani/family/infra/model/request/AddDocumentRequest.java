package com.ashwani.family.infra.model.request;

import com.ashwani.family.infra.entity.DocumentType;
import com.ashwani.family.infra.model.GenericRequest;
import com.ashwani.family.util.constants.JsonConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Data
public class AddDocumentRequest extends BaseRequest implements GenericRequest {

    @NonNull
    @JsonProperty(JsonConstants.PARTICULAR)
    private String particular;

    @NonNull
    @JsonProperty(JsonConstants.HOLDER)
    private String holder;

    @NonNull
    @JsonProperty(JsonConstants.ISSUER_NUMBER)
    private String issuerNumber;

    @NonNull
    @JsonProperty(JsonConstants.ISSUER_DATE)
    private Date issuerDate;

    @JsonProperty(JsonConstants.PREMIUM_DATE)
    private Date premiumDate;


    @JsonProperty(JsonConstants.PREMIUM_AMOUNT)
    private Integer premiumAmount;


    @JsonProperty(JsonConstants.MATURITY_DATE)
    private Date maturityDate;


    @JsonProperty(JsonConstants.MATURITY_AMOUNT)
    private String maturityAmount;


    @JsonProperty(JsonConstants.LAST_YEAR_OF_PAYMENT)
    private String lastYearOfPayment;
}
