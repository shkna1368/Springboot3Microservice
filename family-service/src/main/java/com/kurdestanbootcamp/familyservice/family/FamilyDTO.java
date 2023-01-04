package com.kurdestanbootcamp.familyservice.family;


import com.kurdestanbootcamp.familyservice.common.BaseDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class FamilyDTO extends BaseDTO {

    @Schema(hidden = true)
    private Long id;

    @Schema(hidden = false)
    private String fullName;


    @Schema(hidden = false)
    private String nationaCode;


     @Schema(hidden = false)
    private Long employeeId;






}
