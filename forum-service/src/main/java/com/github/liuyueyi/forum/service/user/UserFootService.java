package com.github.liuyueyi.forum.service.user;

import com.github.liuyueyi.forum.service.common.enums.CollectionStatEnum;
import com.github.liuyueyi.forum.service.common.enums.CommentStatEnum;
import com.github.liuyueyi.forum.service.common.enums.PraiseStatEnum;

/**
 * 用户足迹Service接口
 *
 * @author louzai
 * @date 2022-07-20
 */
public interface UserFootService {

    /**
     * 文章收藏数
     * @param documentId
     * @return
     */
    Long queryCollentionCount(Long documentId);

    /**
     * 文章阅读数
     * @param documentId
     * @return
     */
    Long queryReadCount(Long documentId);

    /**
     * 文章评论数
     * @param documentId
     * @return
     */
    Long queryCommentCount(Long documentId);

    /**
     * 文章点赞数
     * @param documentId
     * @return
     */
    Long queryPraiseCount(Long documentId);

    /**
     * 收藏/取消收藏足迹
     * @param documentId
     * @param userId
     * @return
     */
    Integer operateCollectionFoot(Long documentId, Long userId, CollectionStatEnum statEnum);

    /**
     * 评论/删除评论足迹
     * @param documentId
     * @param userId
     * @return
     */
    Integer operateCommentFoot(Long documentId, Long userId, CommentStatEnum statEnum);

    /**
     * 点赞/取消点赞足迹
     * @param documentId
     * @param userId
     * @return
     */
    Integer operatePraiseFoot(Long documentId, Long userId, PraiseStatEnum statEnum);
}