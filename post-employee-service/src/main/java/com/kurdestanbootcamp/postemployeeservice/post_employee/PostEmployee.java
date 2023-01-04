package com.kurdestanbootcamp.postemployeeservice.post_employee;


import com.kurdestanbootcamp.postemployeeservice.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;
import org.hibernate.envers.Audited;


@Entity
@Table(name = "tbl_post_employee",uniqueConstraints = {@UniqueConstraint(columnNames = {"employee_id","post_id"})})
@Data
@Audited
public class PostEmployee extends BaseEntity {


    @Column(name = "post_id")
    private Long postId;

     @Column(name = "employee_id")
    private Long employeeId;


}
