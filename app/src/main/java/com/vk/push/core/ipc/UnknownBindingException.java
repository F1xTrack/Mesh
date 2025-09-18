package com.vk.push.core.ipc;

import defpackage.O90;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/vk/push/core/ipc/UnknownBindingException;", "Lcom/vk/push/core/ipc/NoHostsToBindException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "<init>", "(Ljava/lang/Exception;)V", "a", "Ljava/lang/Exception;", "getCause", "()Ljava/lang/Exception;", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class UnknownBindingException extends NoHostsToBindException {

    /* renamed from: a, reason: from kotlin metadata */
    public final Exception cause;

    public UnknownBindingException(Exception exc) {
        O90.f(exc, "cause");
        this.cause = exc;
    }

    @Override // java.lang.Throwable
    public Exception getCause() {
        return this.cause;
    }
}
