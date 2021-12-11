package ru.netology.domain;

public class Post {
    private int id;
    private LikesInfo likesInfo;
    private boolean canEdit;
    private boolean canDelete;
    private boolean canRepost;
    private ViewsInfo viewsInfo;
    private CommentsInfo commentsInfo;
    private RepostsInfo repostsInfo;
    private int dateOfCreation;
    private String externalLink;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public boolean getCanEdit() {
        return canEdit;
    }

    public boolean getCanRepost() {
        return canRepost;
    }

    public ViewsInfo getViewsInfo() {
        return viewsInfo;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public RepostsInfo getRepostsInfo() {
        return repostsInfo;
    }

    public int getDateOfCreation() {
        return dateOfCreation;
    }

    public void setExternalLink(String externalLink) {
        this.externalLink = externalLink;
    }
}
