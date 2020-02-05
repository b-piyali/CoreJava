package generics.pluralsight._5_wildcards.bounded;

import generics.pluralsight._2_collections.Person;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class PersonStorageTest {

    private File file;
    private PersonSaver saver;
    private PersonLoader loader;

    private Partner tamal = new Partner("Tamal Das", 45);
    private Partner abhijit = new Partner("Abhijit", 44);
    private Employee piyali = new Employee("Piyali", 40);

    @Test
    public void saveAndLoadPerson() throws Exception {
        Person uma = new Person("uma", 50);
        saver.save(uma);
        assertEquals(uma, loader.load());
    }

    @Before
    public void setUp() throws Exception {
        file = File.createTempFile("tmp", "people");
        saver = new PersonSaver(file);
        loader = new PersonLoader(file);
    }

    @After
    public void tearDown() {
        if (file.exists()) {
            file.delete();
        }
    }

}
