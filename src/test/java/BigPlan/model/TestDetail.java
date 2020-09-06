package BigPlan.model;

import org.junit.Assert;
import org.junit.Test;

public class TestDetail {
    
    @Test
    public void allReqConstructorTest() {
        Detail d = new Detail("Paweł", "Nowak", 537454458L);

        Assert.assertEquals("Paweł", d.getFirstName());
        Assert.assertEquals("Nowak", d.getLastName());
        Assert.assertEquals(Long.valueOf(537454458L), d.getPhone());
    }

    @Test
    public void setNameTest() {
        Detail d = new Detail();

        Assert.assertNull(d.getFirstName());
        d.setFirstName("Paweł");
        Assert.assertEquals("Paweł", d.getFirstName());
    }

    @Test
    public void setLastNameTest() {
        Detail d = new Detail();

        Assert.assertNull(d.getLastName());
        d.setLastName("Nowak");
        Assert.assertEquals("Nowak", d.getLastName());
    }

    @Test
    public void setPhoneTest() {
        Detail d = new Detail();

        Assert.assertNull(d.getPhone());
        d.setPhone(55252L);
        Assert.assertEquals(Long.valueOf(55252L), d.getPhone());
    }
}
