import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class AccountTest {

    Account account1;
    Account account2;
    Repository repository1;
    Repository repository2;
    Commit commit1;
    Commit commit2;

    @Before
    public void setUp(){
        account1 = new Account("rumrog", AccountType.FREE);
        account2 = new Account("codeclan", AccountType.PRO);

        repository1 = new Repository("GitJava", "GitHub Clone in Java", RepositoryType.PUBLIC);
        repository2 = new Repository("JavaProject", "Java Project", RepositoryType.PRIVATE);

        commit1 = new Commit("Initial commit", 001);
        commit2 = new Commit("Final commit", 002);
    }

    @Test
    public void hasUsername(){
        assertEquals("rumrog", account1.getUsername());
    }

    @Test
    public void hasAccountType(){
        assertEquals(AccountType.FREE, account1.getAccountType());
    }

    @Test
    public void canUpgradeAccount(){
        account1.upgradeAccount();
        assertEquals(AccountType.PRO, account1.getAccountType());
    }

    @Test
    public void canDowngradeAccount(){
        account2.downgradeAccount();
        assertEquals(AccountType.FREE, account2.getAccountType());
    }

    @Test
    public void canAddRepository(){
        account1.addRepository(repository1);
        account1.addRepository(repository2);
        assertEquals(2, account1.getRepositoriesCount());
    }

    @Test
    public void canGetRepositoryByName(){
        account1.addRepository(repository1);
        assertEquals("GitJava", account1.getRepositoryByName("GitJava").getName());
    }
}
