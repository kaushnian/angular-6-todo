package todo.models;

public class Item {

    private final long id;
    private final String content;
    private final Boolean isDone;
    private final Boolean isStarred;

    public Item(long id, String content, Boolean isDone, Boolean isStarred) {
        this.id = id;
        this.content = content;
        this.isDone = isDone;
        this.isStarred = isStarred;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Boolean getDone() {
        return isDone;
    }

    public Boolean getStarred() {
        return isStarred;
    }
}
