package com.p019vk.push.core.network.exception;

import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m22267d2 = {"Lcom/vk/push/core/network/exception/VkpnsRequestWithErrorBodyException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "error", "", "code", "<init>", "(Ljava/lang/String;I)V", "a", "I", "getCode", "()I", "core-network_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class VkpnsRequestWithErrorBodyException extends Exception {

    /* renamed from: a, reason: from kotlin metadata */
    public final int code;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VkpnsRequestWithErrorBodyException(String str, int i) {
        super("Request ended with: ".concat(str));
        O90.m5968f(str, "error");
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }
}
