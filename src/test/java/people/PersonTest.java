package people;

import org.people.Man;
import org.people.Woman;

abstract public class PersonTest {
    VariablesMan variablesMan = new VariablesMan();VariablesWoman variablesWoman = new VariablesWoman();
    Man man = new Man(variablesMan.firstNameMan, variablesMan.lastNameMan, variablesMan.ageMan);
Woman woman = new Woman(variablesWoman.firstNameWoman, variablesWoman.lastNameWoman, variablesWoman.ageWoman);
    public abstract void creatingPeople();

    public abstract void testPeopleHaveRetired();

    public abstract void testRegisterPartnership();

    public abstract void testDeregisterPartnership();





}



