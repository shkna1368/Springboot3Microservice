package com.kurdestanbootcamp.postservice.post;

import com.kurdestanbootcamp.postservice.common.BaseDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class PostDTO extends BaseDTO {



    @Schema(hidden = false)
    private String title;






}
