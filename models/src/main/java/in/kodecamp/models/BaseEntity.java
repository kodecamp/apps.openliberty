package in.kodecamp.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * BaseEntity
 */
@MappedSuperclass
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class BaseEntity implements Serializable {

  // protected default constructor

  @EqualsAndHashCode.Include
  @Column(name = "ID")
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  protected long id;

  @Column(name = "VERSION")
  @Version
  protected long version;

  @Column(name = "ACTIVE")
  protected boolean active;

  @Column(name = "CREATED_ON")
  protected LocalDateTime createdOn;

  @Column(name = "MODIFIED_ON")
  protected LocalDateTime modifiedOn;

  @PrePersist
  public void beforePersist() {
    this.modifiedOn = LocalDateTime.now();
    this.createdOn = LocalDateTime.now();
    this.active = true;
  }

  @PreUpdate
  public void beforeUpdate() {
    this.modifiedOn = LocalDateTime.now();
  }

}
