package ru.netology.domain;

import java.util.Date;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int signerId;
    private int postponedId;
    private Date date;
    private String postType;

    private String text;

    private int replyOwnerId;
    private int replyPostId;

    private boolean friendsOnly;

    private CommentsInfo commentsInfo;
    private LikeInfo likeInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private PostSource postSource;
    private Location location;

    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
}
