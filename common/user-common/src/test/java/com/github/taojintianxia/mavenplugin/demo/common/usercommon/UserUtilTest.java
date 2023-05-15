package com.github.taojintianxia.mavenplugin.demo.common.usercommon;

import org.junit.Assert;
import org.junit.Test;

public class UserUtilTest {
    
    @Test
    public void testPrintUserName() {
        new UserUtil().printUserName();
    }
    
    @Test
    public void testGetUserName() {
        Assert.assertNotNull(new UserUtil().getUserName());
    }
}
