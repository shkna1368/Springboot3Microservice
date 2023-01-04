package com.kurdestanbootcamp.fileattachmentservice.file_attachment;


import com.kurdestanbootcamp.fileattachmentservice.common.BaseDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;


@Data
public class FileAttachmentDTO extends BaseDTO {



    @Schema(hidden = false)
    private String personalImage;


    @Schema(hidden = false)
    private String lastLicenseImage;


    @Schema(hidden = false)
    private Long employeeId;



}
