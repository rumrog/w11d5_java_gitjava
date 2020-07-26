import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    Repository repository;

    Commit commit1;
    Commit commit2;

    @Before
    public void setUp(){
//        ArrayList<Commit> commits = new ArrayList<Commit>();
        repository = new Repository("GitJava", "GitHub Clone in Java", RepositoryType.PRIVATE);

        commit1 = new Commit("Initial commit", 001);
        commit2 = new Commit("Final commit", 002);


    }

    @Test
    public void hasName(){
        assertEquals("GitJava", repository.getName());
    }

    @Test
    public void hasDescription(){
        assertEquals("GitHub Clone in Java", repository.getDescription());
    }

    @Test
    public void hasRepositoryType(){
        assertEquals(RepositoryType.PUBLIC, repository.getRepositoryType());
    }

    @Test
    public void canCountCommits(){
        repository.addCommit(commit1);
        repository.addCommit(commit2);
        assertEquals(2, repository.getCommitsCount());
    }

    @Test
    public void canGetCommitByUniqueId(){
        repository.addCommit(commit1);
        Commit foundCommit = repository.getCommitByUniqueId(commit1.getUniqueId());
        assertEquals("Initial commit", foundCommit.getDescription());
    }

    @Test
    public void canChangeRepositoryType(){
        repository.changeRepositoryType();
        assertEquals(RepositoryType.PUBLIC, repository.getRepositoryType());
    }
}
