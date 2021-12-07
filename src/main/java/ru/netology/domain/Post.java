package ru.netology.domain;

public class Post {
    private String id;
    private LikesInfo like;
    private boolean canEdit;
    private boolean canDelete;
    private boolean canRepost;
    private ViewsInfo viewsInfo;
    private CommentsInfo commentsInfo;
    private RepostsInfo repostsInfo;
    private int dateOfCreation;
    private String externalLink;
}
