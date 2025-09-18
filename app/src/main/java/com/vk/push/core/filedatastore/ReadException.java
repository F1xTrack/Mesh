package com.vk.push.core.filedatastore;

import defpackage.O90;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/vk/push/core/filedatastore/ReadException;", "Ljava/io/IOException;", "", "cause", "", "message", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "a", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "b", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ReadException extends IOException {

    /* renamed from: a, reason: from kotlin metadata */
    public final Throwable cause;

    /* renamed from: b, reason: from kotlin metadata */
    public final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadException(Throwable th, String str) {
        super(str, th);
        O90.f(str, "message");
        this.cause = th;
        this.message = str;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public /* synthetic */ ReadException(Throwable th, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i & 2) != 0 ? "Read failed" : str);
    }
}
