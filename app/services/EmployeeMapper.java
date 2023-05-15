package services;

import model.Employee;
import model.EmployeeDTO;

public class EmployeeMapper {
    public static EmployeeDTO toTransfer(Employee employee){
        EmployeeDTO dto = new EmployeeDTO();
        dto.setId(employee.getId());
        dto.setName(employee.getName());
        dto.setYear(employee.getYear());
        dto.setDepartment(employee.getDepartment());

        return dto;
    }



    public static Employee fromTransfer(EmployeeDTO dto) {
        Employee domain = new Employee();
        domain.setId(dto.getId());
        domain.setName(dto.getName());
        domain.setYear(dto.getYear());
        domain.setDepartment(dto.getDepartment());

        return domain;
    }
}
