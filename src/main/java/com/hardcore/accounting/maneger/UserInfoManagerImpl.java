package com.hardcore.accounting.maneger;

import com.hardcore.accounting.converter.p2c.UserInfoP2CConverter;
import com.hardcore.accounting.dao.UserInfoDao;
import com.hardcore.accounting.model.common.UserInfo;

import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserInfoManagerImpl implements UserInfoManager {

    private final UserInfoDao userInfoDao;
    private final UserInfoP2CConverter userInfoConverter;

    @Autowired
    public UserInfoManagerImpl(UserInfoDao userInfoDao,
                               UserInfoP2CConverter userInfoConverter) {
        this.userInfoDao = userInfoDao;
        this.userInfoConverter = userInfoConverter;
    }

    @Override
    public UserInfo getUserInfoByUserId(Long userId) {
        val userInfo = userInfoDao.getUserInfoById(userId);
        return userInfoConverter.convert(userInfo);
    }
}
