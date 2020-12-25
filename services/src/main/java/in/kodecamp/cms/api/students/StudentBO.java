package in.kodecamp.cms.api.students;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

import in.kodecamp.models.StudentEntity;

/**
 * StudentBO
 */
@Stateless
public class StudentBO {

  @PersistenceContext
  private EntityManager em;

  public StudentBO() {
    System.out.println("StudentBO : Constructor");
  }

  @PostConstruct
  public void init() {
    System.out.println("Hello");
    System.out.println("StudentBO : PostConstruct -> em : " + em);
  }

  public List<StudentEntity> getAll() {
    return em.createQuery("from StudentEntity se", StudentEntity.class)
        .getResultList();
  }

  public List<StudentEntity> getAllActive() {
    return em.createQuery("from StudentEntity se", StudentEntity.class)
        .getResultList();
  }

  public StudentEntity getBy(final long id) {
    return em.find(StudentEntity.class, id);
  }

  public StudentEntity createNew(final StudentEntity newStudent) {
    em.persist(newStudent);
    return newStudent;
  }

  public StudentEntity update(final StudentEntity newStudent) {
    StudentEntity updatedEntity = em.merge(newStudent);
    return updatedEntity;
  }

  public StudentEntity delete(final StudentEntity newStudent) {
    newStudent.setActive(false);
    StudentEntity inActivedEntity = em.merge(newStudent);
    return inActivedEntity;
  }
}
