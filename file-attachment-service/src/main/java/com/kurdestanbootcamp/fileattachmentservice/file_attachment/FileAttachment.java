package com.kurdestanbootcamp.fileattachmentservice.file_attachment;


import com.kurdestanbootcamp.fileattachmentservice.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.envers.Audited;




@Entity
@Table(name = "tbl_file_attachments")
@Data
@Audited
public class FileAttachment extends BaseEntity {



    @NotNull
    @Column(name = "personal_image")
    private String personalImage;


    @NotNull
    @Column(name = "last_license_image")
    private String lastLicenseImage;

    @Column(name = "employee_id",unique = true)
    private Long employeeId;



}
