package com.msa4spring.requests;

import jakarta.validation.constraints.*;

public record ValidationRequest(
    @NotBlank(message = "이메일 입력 필수")
    @Email(message = "올바른 이메일 적어라")
    String email,
    @NotBlank(message = "비밀번호 입력 필수")
    @Size(min = 5,max = 20,message = "비밀번호 5~20글자 허용")
    String password,
    @NotNull(message = "나이 입력 필수")
    @Min(0)
    @Max(200)
    Integer age,
    @NotBlank(message = "이름 입력 필수")
    @Pattern(regexp = "^[가-힣]{2,50}$", message = "똑바로 적어라")
    String name
) {
}
