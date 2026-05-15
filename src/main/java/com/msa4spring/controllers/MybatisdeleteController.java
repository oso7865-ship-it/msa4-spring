package com.msa4spring.controllers;

import com.msa4spring.entities.Employee;
import com.msa4spring.requests.EmployeeDeleteRequest;
import com.msa4spring.responses.ResponseDTO;
import com.msa4spring.services.MybatisDeleteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")

public class MybatisdeleteController {
    private final MybatisDeleteService mybatisDeleteService;


    @DeleteMapping("/delete")
    public ResponseEntity<ResponseDTO<Employee>> indexDelete(
        @ModelAttribute EmployeeDeleteRequest employeeDeleteRequest
        ) {

        Employee result = mybatisDeleteService.SqlDelete(employeeDeleteRequest);

        ResponseDTO<Employee> responseDTO = ResponseDTO.<Employee>builder()
                                                .code("00")
                                                .msg("정상 처리")
                                                .data(result)
                                                .build();

        return ResponseEntity.status(200).body(responseDTO);
    }
}