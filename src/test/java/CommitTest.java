import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommitTest {

    Commit commit;

    @Before
    public void setUp(){
        commit = new Commit("Initial commit", 001);
    }

    @Test
    public void hasDescription(){
        assertEquals("Initial commit", commit.getDescription());
    }

    @Test
    public void hasUniqueId(){
        assertEquals(001, commit.getUniqueId());
    }
}
