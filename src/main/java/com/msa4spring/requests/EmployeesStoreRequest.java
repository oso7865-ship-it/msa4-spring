package com.msa4spring.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record EmployeesStoreRequest(
        @NotBlank(message = "이름 필수")
        @Pattern(regexp = "^[가-힣|a-z|A-Z| ]{2,50}$", message = "이름 똑바로 적어라")
        String name,

        @NotBlank(message = "생일 필수")
        String birth,

        @Pattern(regexp = "[M|F]", message = "성별 똑바로 적어라")
        @NotBlank(message = "성별 필수")
        String gender
) {
}
