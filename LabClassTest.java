

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class LabClassTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LabClassTest
{
    /**
     * Default constructor for test class LabClassTest
     */
    public LabClassTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void CheckWhenStudentIsEnroled()
    {
        Student Dan = new Student("Dan", "111");
        LabClass TAS = new LabClass(2);
        TAS.enrollStudent(Dan);
        Student Otto = new Student("Otto", "112");
        TAS.enrollStudent(Otto);
        Student Iulian = new Student("Iulian", "113");
        TAS.enrollStudent(Iulian);
        TAS.printList();
        assertEquals(3, TAS.numberOfStudents());
    }
}
