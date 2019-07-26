package com.sevlow.sdk.tim.api.impl;

import com.sevlow.sdk.tim.api.TIMChatService;
import com.sevlow.sdk.tim.api.TIMProfileService;
import com.sevlow.sdk.tim.api.TIMService;
import com.sevlow.sdk.tim.api.test.TestModule;
import com.sevlow.sdk.tim.bean.profile.GenderEnum;
import com.sevlow.sdk.tim.common.error.TIMException;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import javax.inject.Inject;

import static org.testng.Assert.*;

/**
 * @author pengshiqing
 * @Date: 2019/7/26
 * @Description:
 */

@Slf4j
@Guice(modules = {TestModule.class})
public class TIMProfileServiceImplTest {

    @Inject
    private TIMService timService;

    private TIMProfileService profileService;


    @BeforeTest
    public void before() {
        this.profileService = timService.getProfileService();
    }


    @Test
    public void testSetInfoGender() throws TIMException {

        profileService.setInfoGender("test_211", GenderEnum.Female);
    }
}