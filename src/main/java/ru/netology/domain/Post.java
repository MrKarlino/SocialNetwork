package ru.netology.domain;

import java.util.Date;

public class Post {
    int id;
    int ownerId;
    int fromId;
    int createdBy;
    int signerId;
    int postponedId;
    Date date;
    String postType;

    String text;

    int replyOwnerId;
    int replyPostId;

    boolean friendsOnly;

    CommentsInfo commentsInfo;
    LikeInfo likeInfo;
    RepostsInfo repostsInfo;
    ViewsInfo viewsInfo;
    PostSource postSource;
    Location location;

    boolean canPin;
    boolean canDelete;
    boolean canEdit;
    boolean isPinned;
    boolean markedAsAds;
    boolean isFavorite;
}
