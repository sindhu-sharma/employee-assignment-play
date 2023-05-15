package services;

import com.google.inject.Inject;
import model.Employee;
import model.EmployeeDTO;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeService {

    @Inject
    private EmployeeDao employeeDao;

    public List<EmployeeDTO> getAll(){
        List<Employee> employeeList = employeeDao.find();
        return employeeList.stream().map(domain -> EmployeeMapper.toTransfer(domain)).collect(Collectors.toList());
    }

    public Optional<EmployeeDTO> getById(int id){
        Employee employee = employeeDao.find(id);
        if (employee == null) {
            return Optional.empty();
        }

        return Optional.of(EmployeeMapper.toTransfer(employee));
    }

    public EmployeeDTO create(EmployeeDTO employeeDTO) {
        Employee employee = EmployeeMapper.fromTransfer(employeeDTO);
        employee = employeeDao.create(employee);
        return EmployeeMapper.toTransfer(employee);
    }

    public Optional<EmployeeDTO> update(EmployeeDTO employeeDTO, int id) {
        Employee fromDb = employeeDao.find(id);
        if (fromDb == null) {
            return Optional.empty();
        }

        fromDb.setName(employeeDTO.getName());
        fromDb.setYear(employeeDTO.getYear());
        fromDb.setDepartment(employeeDTO.getDepartment());
        fromDb.setId(employeeDTO.getId());
        fromDb = employeeDao.update(fromDb);

        return Optional.of(EmployeeMapper.toTransfer(fromDb));
    }

    public void delete(int id) {
        employeeDao.delete(id);
    }



}
