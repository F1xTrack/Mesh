package com.p019vk.push.core.filedatastore;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m22267d2 = {"Lcom/vk/push/core/filedatastore/NoValueException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "", "message", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class NoValueException extends IllegalStateException {

    /* renamed from: a, reason: from kotlin metadata */
    public final String message;

    public NoValueException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoValueException(String str) {
        super(str);
        O90.m5968f(str, "message");
        this.message = str;
    }

    public /* synthetic */ NoValueException(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "No value found" : str);
    }
}
