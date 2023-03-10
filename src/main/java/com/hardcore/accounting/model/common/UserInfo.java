package com.hardcore.accounting.model.common;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserInfo {
    private long id;
    private String username;
    private String password;
}
