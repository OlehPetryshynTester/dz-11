package people;
import org.people.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestWoman extends  PersonTest{
    VariablesWoman variablesWoman = new VariablesWoman();
    VariablesMan variablesMan = new VariablesMan();
    @Override
    @BeforeTest
    public void creatingPeople() {
        Woman woman = new Woman(variablesWoman.firstNameWoman, variablesWoman.lastNameWoman, variablesWoman.ageWoman);
    }
@Test
    @Override
    public void testPeopleHaveRetired() {
    Assert.assertEquals(variablesWoman.ageWoman, 60,"This man have retired");

    }
@Test
    @Override
    public void testRegisterPartnership() {
        Assert.assertEquals(variablesWoman.partner,variablesMan.lastNameMan,"This woman has partner");

    }
@Test
    @Override
    public void testDeregisterPartnership() {
        Assert.assertEquals(woman,woman,"Woman deregister partnership");
    }
}
