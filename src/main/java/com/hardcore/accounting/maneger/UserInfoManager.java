package com.hardcore.accounting.maneger;

import com.hardcore.accounting.model.common.UserInfo;

import org.springframework.stereotype.Component;

public interface UserInfoManager {
    /**
     * Get user information by user id.
     * @param userId the specific user id.
     */
    UserInfo getUserInfoByUserId(Long userId);
}
