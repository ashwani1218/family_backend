package com.ashwani.family;

import com.ashwani.family.infra.entity.FamilyMember;
import com.ashwani.family.infra.model.response.BaseResponse;
import com.ashwani.family.util.constants.ResponseConstants;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.AutoConfigureWebClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebClient
class FamilyApplicationTests {


	@Autowired
	private WebTestClient webTestClient;

	@Test
	void addMember(){
		new FamilyMember();
		var member  = FamilyMember
				.builder()
				.firstName("Ashwani")
				.lastName("Pandey")
				.build();

		webTestClient
				.post()
				.uri("/addMember")
				.bodyValue(member)
				.exchange()
				.expectBody(BaseResponse.class)
				.value(resp -> {
					assertThat(resp.getResponseCode().equals(ResponseConstants.SUCCESS_CODE));
					assertThat(resp.getResponseDescription().equals(ResponseConstants.ADD_MEMBER_SUCCESS));
					assertThat(resp.getStatus().equals(ResponseConstants.SUCCESS_STATUS));
				});
	}

}
