package services;

import com.google.inject.Inject;
import model.Employee;
import play.db.jpa.JPAApi;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class EmployeeDao {

    private static final String ENTITY_MANAGER_NAME = "default";

    @Inject
    protected JPAApi jpaApi;

    public Employee create(Employee employee) {
        jpaApi.withTransaction(entityManager -> {
            entityManager.persist(employee); }
        );
        jpaApi.em(ENTITY_MANAGER_NAME).persist(employee);
        return employee;
    }

    public Employee find(Integer id) {
        return jpaApi.em(ENTITY_MANAGER_NAME).find(Employee.class, id);
    }

    public List<Employee> find() {
        EntityManager entityManager = jpaApi.em(ENTITY_MANAGER_NAME);

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Employee> criteriaQuery = criteriaBuilder.createQuery(Employee.class);
        Root<Employee> root = criteriaQuery.from(Employee.class);
        criteriaQuery.select(root);
        return entityManager.createQuery(criteriaQuery).getResultList();
    }

    public void delete(int id) {
        jpaApi.withTransaction(entityManager -> {
            Employee employee = entityManager.find(Employee.class, id);
            if (employee != null) {
                entityManager.remove(employee);
            }
        });
    }

    public Employee update(Employee employee) {
        jpaApi.withTransaction(entityManager -> {entityManager.merge(employee);});
        return employee;
    }
}
