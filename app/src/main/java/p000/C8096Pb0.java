package p000;

import java.util.concurrent.CancellationException;

/* renamed from: Pb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8096Pb0 extends CancellationException {

    /* renamed from: a */
    public final transient C9002cc0 f9161a;

    public C8096Pb0(String str, Throwable th, C9002cc0 c9002cc0) {
        super(str);
        this.f9161a = c9002cc0;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C8096Pb0) {
                C8096Pb0 c8096Pb0 = (C8096Pb0) obj;
                if (!O90.m5963a(c8096Pb0.getMessage(), getMessage()) || !O90.m5963a(c8096Pb0.f9161a, this.f9161a) || !O90.m5963a(c8096Pb0.getCause(), getCause())) {
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
        O90.m5965c(message);
        int iHashCode = (this.f9161a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f9161a;
    }
}
