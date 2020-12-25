package in.kodecamp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * StudentEntity
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "StudentEntity.findAll", query = "SELECT se FROM StudentEntity se"),
    @NamedQuery(name = "StudentEntity.findAllActive", query = "SELECT se FROM StudentEntity se WHERE se.active = true"),
    @NamedQuery(name = "StudentEntity.findById", query = "SELECT se FROM StudentEntity se WHERE se.id = :id and active = true"),
    @NamedQuery(name = "StudentEntity.findByName", query = "SELECT se FROM StudentEntity se WHERE se.name =:name and active = true"),
    @NamedQuery(name = "StudentEntity.findByNameLike", query = "SELECT se FROM StudentEntity se WHERE se.name like concat('%',:name,'%') and active = true"),
    @NamedQuery(name = "StudentEntity.findByAddressLike", query = "SELECT se FROM StudentEntity se WHERE se.address like concat('%',:address,'%') and active = true") })
@Table(name = "STUDENTS")
@Data
@NoArgsConstructor
// no field of this class is marked for equals and hascode so the super class
// version
// will be called
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class StudentEntity extends BaseEntity {

  @Column(name = "NAME")
  private String name;

  @Column(name = "ADDRESS")
  private String address;

  // this will be used by the api to create new students
  public StudentEntity(final String name, final String address) {
    this.name = name;
    this.address = address;
  }

}
