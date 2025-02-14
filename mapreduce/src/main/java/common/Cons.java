package common;/*
 * common.Cons.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

/**
 * @author gusu
 * @date 2021/6/26
 */
public class Cons {
    public static final Integer MASTER_HOST = 9090;

    public static final Integer TASK_TYPE_NONE = 0;
    public static final Integer TASK_TYPE_MAP = 1;
    public static final Integer TASK_TYPE_REDUCE = 2;
    public static final Integer TASK_TYPE_ALL_DONE = 3;

    public static final Integer TASK_STATUS_TODO = 0;
    public static final Integer TASK_STATUS_DOING = 1;
    public static final Integer TASK_STATUS_DONE = 2;
}
