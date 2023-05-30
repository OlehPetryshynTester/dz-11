package people;


import org.people.Man;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public  class TestMan extends PersonTest {
    VariablesMan variablesMan = new VariablesMan();
    @Override
    @BeforeTest
    public void creatingPeople() {
        Man man = new Man(variablesMan.firstNameMan, variablesMan.lastNameMan, variablesMan.ageMan);
    }

    @Override
    @Test
    public void testPeopleHaveRetired() {
            Assert.assertEquals(variablesMan.ageMan, 65,"This man have retired");
    }

    @Override
    public void testRegisterPartnership() {
    }
   @Test
    @Override
    public void testDeregisterPartnership() {
        Assert.assertEquals(man, man ,"Woman deregister partnership");
    }
}
