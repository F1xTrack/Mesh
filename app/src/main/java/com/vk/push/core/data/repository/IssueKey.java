package com.vk.push.core.data.repository;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/vk/push/core/data/repository/IssueKey;", "", "PLAIN_TOKEN", "TOKEN_INVALIDATED", "MESSAGE_RECEIVED", "DEVICE_ID_ERROR", "OMICRON_EARLY_FEATURE_ACCESS", "OMICRON_PARSE_ERROR", "EXPIRED_TIME_FIELD_NULL", "FAILED_TO_DELIVER_PUSH", "FILE_DATA_STORE_READ_ERROR", "FILE_DATA_STORE_WRITE_ERROR", "FILE_DATA_STORE_MIGRATION_ERROR", "FILE_DATA_STORE_PARSE_ERROR", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class IssueKey {
    public static final IssueKey DEVICE_ID_ERROR;
    public static final IssueKey EXPIRED_TIME_FIELD_NULL;
    public static final IssueKey FAILED_TO_DELIVER_PUSH;
    public static final IssueKey FILE_DATA_STORE_MIGRATION_ERROR;
    public static final IssueKey FILE_DATA_STORE_PARSE_ERROR;
    public static final IssueKey FILE_DATA_STORE_READ_ERROR;
    public static final IssueKey FILE_DATA_STORE_WRITE_ERROR;
    public static final IssueKey MESSAGE_RECEIVED;
    public static final IssueKey OMICRON_EARLY_FEATURE_ACCESS;
    public static final IssueKey OMICRON_PARSE_ERROR;
    public static final IssueKey PLAIN_TOKEN;
    public static final IssueKey TOKEN_INVALIDATED;
    public static final /* synthetic */ IssueKey[] a;

    static {
        IssueKey issueKey = new IssueKey("PLAIN_TOKEN", 0);
        PLAIN_TOKEN = issueKey;
        IssueKey issueKey2 = new IssueKey("TOKEN_INVALIDATED", 1);
        TOKEN_INVALIDATED = issueKey2;
        IssueKey issueKey3 = new IssueKey("MESSAGE_RECEIVED", 2);
        MESSAGE_RECEIVED = issueKey3;
        IssueKey issueKey4 = new IssueKey("DEVICE_ID_ERROR", 3);
        DEVICE_ID_ERROR = issueKey4;
        IssueKey issueKey5 = new IssueKey("OMICRON_EARLY_FEATURE_ACCESS", 4);
        OMICRON_EARLY_FEATURE_ACCESS = issueKey5;
        IssueKey issueKey6 = new IssueKey("OMICRON_PARSE_ERROR", 5);
        OMICRON_PARSE_ERROR = issueKey6;
        IssueKey issueKey7 = new IssueKey("EXPIRED_TIME_FIELD_NULL", 6);
        EXPIRED_TIME_FIELD_NULL = issueKey7;
        IssueKey issueKey8 = new IssueKey("FAILED_TO_DELIVER_PUSH", 7);
        FAILED_TO_DELIVER_PUSH = issueKey8;
        IssueKey issueKey9 = new IssueKey("FILE_DATA_STORE_READ_ERROR", 8);
        FILE_DATA_STORE_READ_ERROR = issueKey9;
        IssueKey issueKey10 = new IssueKey("FILE_DATA_STORE_WRITE_ERROR", 9);
        FILE_DATA_STORE_WRITE_ERROR = issueKey10;
        IssueKey issueKey11 = new IssueKey("FILE_DATA_STORE_MIGRATION_ERROR", 10);
        FILE_DATA_STORE_MIGRATION_ERROR = issueKey11;
        IssueKey issueKey12 = new IssueKey("FILE_DATA_STORE_PARSE_ERROR", 11);
        FILE_DATA_STORE_PARSE_ERROR = issueKey12;
        a = new IssueKey[]{issueKey, issueKey2, issueKey3, issueKey4, issueKey5, issueKey6, issueKey7, issueKey8, issueKey9, issueKey10, issueKey11, issueKey12};
    }

    public static IssueKey valueOf(String str) {
        return (IssueKey) Enum.valueOf(IssueKey.class, str);
    }

    public static IssueKey[] values() {
        return (IssueKey[]) a.clone();
    }
}
