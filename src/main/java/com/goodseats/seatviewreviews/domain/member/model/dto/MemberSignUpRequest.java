package com.goodseats.seatviewreviews.domain.member.model.dto;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

public record MemberSignUpRequest(
		@NotBlank @Length(min = 3, max = 20) String loginEmail,
		@NotBlank @Length(min = 8, max = 20) String password,
		@NotBlank @Length(max = 10) String nickname
) {
}
