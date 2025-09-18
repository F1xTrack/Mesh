package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: Pb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1193Pb0 extends CancellationException {
    public final transient C2548cc0 a;

    public C1193Pb0(String str, Throwable th, C2548cc0 c2548cc0) {
        super(str);
        this.a = c2548cc0;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C1193Pb0) {
                C1193Pb0 c1193Pb0 = (C1193Pb0) obj;
                if (!O90.a(c1193Pb0.getMessage(), getMessage()) || !O90.a(c1193Pb0.a, this.a) || !O90.a(c1193Pb0.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        O90.c(message);
        int iHashCode = (this.a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.a;
    }
}
