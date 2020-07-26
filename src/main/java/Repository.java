import java.util.ArrayList;

public class Repository {

    String name;
    String description;
    RepositoryType repositoryType;
    ArrayList<Commit> commits;

    public Repository(String name, String description, RepositoryType repositoryType){
        this.name = name;
        this.description = description;
        this.repositoryType = repositoryType;
        this.commits = new ArrayList<Commit>();
    }

    public String getName(){
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public RepositoryType getRepositoryType() {
        return this.repositoryType;
    }

    public int getCommitsCount(){
        return this.commits.size();
    }

    public ArrayList<Commit> getCommits() {
        return this.commits;
    }

    public void addCommit(Commit commit){
        this.commits.add(commit);
    }

    public Commit getCommitByUniqueId(int uniqueId){
        for(Commit commit : this.commits){
            if(uniqueId == commit.getUniqueId()){
                return commit;
            }
        } return null;
    }

    public void changeRepositoryType(){
        if(this.repositoryType == RepositoryType.PUBLIC){
            this.repositoryType = RepositoryType.PRIVATE;
        } else if (this.repositoryType == RepositoryType.PRIVATE){
            this.repositoryType = RepositoryType.PUBLIC;
        }
    }

//    public void changeRepositoryType(){
//        switch (this.repositoryType){
//            case PRIVATE:
//                this.repositoryType = RepositoryType.PUBLIC;
//            case PUBLIC:
//                this.repositoryType = RepositoryType.PRIVATE;
//        }
//
//    }

//    public void changeRepositoryType(){
//        this.repositoryType = this.repositoryType == RepositoryType.PUBLIC ?
//               RepositoryType.PRIVATE :
//                this.repositoryType == RepositoryType.PRIVATE ?
//                        RepositoryType.PUBLIC : null;
//    }
}

