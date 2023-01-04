package com.kurdestanbootcamp.postemployeeservice.post_employee;


import com.kurdestanbootcamp.postemployeeservice.common.BaseDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class PostEmployeeDTO extends BaseDTO {



    @Schema(hidden = false)
    private Long postId;


    @Schema(hidden = false)
    private Long employeeId;






}
