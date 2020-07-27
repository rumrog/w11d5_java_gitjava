import com.sun.org.apache.regexp.internal.RE;

import java.util.HashMap;

public class Account {

    String username;
    HashMap<String, Repository> repositories;
    AccountType accountType;

    public Account(String username, AccountType accountType) {
        this.username = username;
        this.repositories = new HashMap<String, Repository>();
        this.accountType = AccountType.FREE;
    }

    public String getUsername(){
        return this.username;
    }

    public AccountType getAccountType(){
        return this.accountType;
    }

//    public void changeAccountType(){
//        if(this.accountType == AccountType.FREE){
//            this.accountType = AccountType.PRO;
//        } else if (this.accountType == AccountType.PRO){
//            this.accountType = AccountType.FREE;
//        }
//    }

    public void upgradeAccount(){
        if(this.accountType == AccountType.FREE){
            this.accountType = AccountType.PRO;
        }
    }
    public void downgradeAccount(){
        if(this.accountType == AccountType.PRO){
            this.accountType = AccountType.FREE;
        }
    }

    public int getRepositoriesCount(){
        return this.repositories.size();
    }

    public void addRepository(Repository repository){
       this.repositories.put(repository.getName(), repository);
    }

    public Repository getRepositoryByName(String name){
       return this.repositories.get(name);
    }

}

