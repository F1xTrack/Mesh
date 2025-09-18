package com.p019vk.push.core.network.exception;

import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m22267d2 = {"Lcom/vk/push/core/network/exception/VkpnsRequestException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", "", "httpStatusCode", "<init>", "(Ljava/lang/String;I)V", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "b", "I", "getHttpStatusCode", "()I", "core-network_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class VkpnsRequestException extends Exception {

    /* renamed from: a, reason: from kotlin metadata */
    public final String message;

    /* renamed from: b, reason: from kotlin metadata */
    public final int httpStatusCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VkpnsRequestException(String str, int i) {
        super(str);
        O90.m5968f(str, "message");
        this.message = str;
        this.httpStatusCode = i;
    }

    public final int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
