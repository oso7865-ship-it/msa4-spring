package com.msa4spring.mappers;

import com.msa4spring.entities.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    // 여러개를 반환해야 하기에 List<Employee> 를 사용
    List<Employee> getEmployee();

    Employee findByPk(long empId);

    // 한개만 반환해야 하기에 Employee를 바로 적어 반환
    int store(Employee employee);
}
