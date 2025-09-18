package com.p019vk.push.core.network.model;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m22267d2 = {"Lcom/vk/push/core/network/model/ErrorStatus;", "", "UNSPECIFIED_ERROR", "INVALID_ARGUMENT", "UNREGISTERED", "SENDER_ID_MISMATCH", "QUOTA_EXCEEDED", "UNAVAILABLE", "INTERNAL", "THIRD_PARTY_AUTH_ERROR", "PERMISSION_DENIED", "NOT_FOUND", "core-network_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class ErrorStatus {
    public static final ErrorStatus INTERNAL;
    public static final ErrorStatus INVALID_ARGUMENT;
    public static final ErrorStatus NOT_FOUND;
    public static final ErrorStatus PERMISSION_DENIED;
    public static final ErrorStatus QUOTA_EXCEEDED;
    public static final ErrorStatus SENDER_ID_MISMATCH;
    public static final ErrorStatus THIRD_PARTY_AUTH_ERROR;
    public static final ErrorStatus UNAVAILABLE;
    public static final ErrorStatus UNREGISTERED;
    public static final ErrorStatus UNSPECIFIED_ERROR;

    /* renamed from: a */
    public static final /* synthetic */ ErrorStatus[] f20476a;

    static {
        ErrorStatus errorStatus = new ErrorStatus("UNSPECIFIED_ERROR", 0);
        UNSPECIFIED_ERROR = errorStatus;
        ErrorStatus errorStatus2 = new ErrorStatus("INVALID_ARGUMENT", 1);
        INVALID_ARGUMENT = errorStatus2;
        ErrorStatus errorStatus3 = new ErrorStatus("UNREGISTERED", 2);
        UNREGISTERED = errorStatus3;
        ErrorStatus errorStatus4 = new ErrorStatus("SENDER_ID_MISMATCH", 3);
        SENDER_ID_MISMATCH = errorStatus4;
        ErrorStatus errorStatus5 = new ErrorStatus("QUOTA_EXCEEDED", 4);
        QUOTA_EXCEEDED = errorStatus5;
        ErrorStatus errorStatus6 = new ErrorStatus("UNAVAILABLE", 5);
        UNAVAILABLE = errorStatus6;
        ErrorStatus errorStatus7 = new ErrorStatus("INTERNAL", 6);
        INTERNAL = errorStatus7;
        ErrorStatus errorStatus8 = new ErrorStatus("THIRD_PARTY_AUTH_ERROR", 7);
        THIRD_PARTY_AUTH_ERROR = errorStatus8;
        ErrorStatus errorStatus9 = new ErrorStatus("PERMISSION_DENIED", 8);
        PERMISSION_DENIED = errorStatus9;
        ErrorStatus errorStatus10 = new ErrorStatus("NOT_FOUND", 9);
        NOT_FOUND = errorStatus10;
        f20476a = new ErrorStatus[]{errorStatus, errorStatus2, errorStatus3, errorStatus4, errorStatus5, errorStatus6, errorStatus7, errorStatus8, errorStatus9, errorStatus10};
    }

    public static ErrorStatus valueOf(String str) {
        return (ErrorStatus) Enum.valueOf(ErrorStatus.class, str);
    }

    public static ErrorStatus[] values() {
        return (ErrorStatus[]) f20476a.clone();
    }
}
