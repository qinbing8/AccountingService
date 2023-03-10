package com.hardcore.accounting.model.service;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserInfo {
    private long id;
    private String username;
    private String password;
}
