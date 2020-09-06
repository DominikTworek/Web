package BigPlan.model;

import java.util.Collection;
import java.util.Collections;

import org.junit.Assert;
import org.junit.Test;

public class TestUser {

    @Test
    public void constructorTest() {
        User u = new User("testemail@gmail.com", "strong_password!", Collections.emptyList(), Collections.emptyList());

        Assert.assertEquals("testemail@gmail.com", u.getEmail());
        Assert.assertEquals("strong_password!", u.getPassword());
        Assert.assertNotNull(u.getRoles());
        Assert.assertNotNull(u.getDetail());
    }

    @Test
    public void setEmailTest() {
        User u = new User();
    }
    
}
