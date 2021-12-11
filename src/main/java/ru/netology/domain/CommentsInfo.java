package ru.netology.domain;

public class CommentsInfo {
    private int count;
    private boolean usersComments;
    private boolean groupsComments;

    public int getCount() {
        return count;
    }

    public void setUsersComments(boolean usersComments) {
        this.usersComments = usersComments;
    }

    public void setgroupsComments(boolean groupsComments) {
        this.groupsComments = groupsComments;
    }
}
