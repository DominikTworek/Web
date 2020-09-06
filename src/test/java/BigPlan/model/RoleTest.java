package BigPlan.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class RoleTest {

    @Test
    public void noArgConstructorTest() {
        Role role = new Role();

        assertNull(role.getName());
        role.setName("Test name");
        assertEquals("Test name", role.getName());

    }

}