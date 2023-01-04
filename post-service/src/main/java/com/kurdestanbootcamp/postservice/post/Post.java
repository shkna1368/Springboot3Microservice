package com.kurdestanbootcamp.postservice.post;

import com.kurdestanbootcamp.postservice.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.envers.Audited;


@Entity
@Table(name = "tbl_posts")
@Data
@Audited
public class Post  extends BaseEntity {



    @NotNull
    @Column(name = "title")
    private String title;



}
