public class Commit {

    String description;
    int uniqueId;

    public Commit(String description, int uniqueId){
        this.description = description;
        this.uniqueId = uniqueId;
    }

    public String getDescription(){
        return description;
    }

    public int getUniqueId(){
        return uniqueId;
    }
}
