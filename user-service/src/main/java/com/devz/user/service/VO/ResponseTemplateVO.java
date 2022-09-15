package com.devz.user.service.VO;

import com.devz.user.service.entity.SUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private SUser sUser;
    private Department department;
}
