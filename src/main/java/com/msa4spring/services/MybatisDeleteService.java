package com.msa4spring.services;

import com.msa4spring.entities.Employee;
import com.msa4spring.mappers.EmployeeMapper;
import com.msa4spring.requests.EmployeeDeleteRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MybatisDeleteService {
    private final EmployeeMapper employeeMapper;

    public Employee SqlDelete(EmployeeDeleteRequest employeeDeleteRequest) {
        Employee employee = new Employee();
        employee.setEmpId(employeeDeleteRequest.getEmpId());

        employeeMapper.SqlDelete(employee);
        return employee;
    }
}
