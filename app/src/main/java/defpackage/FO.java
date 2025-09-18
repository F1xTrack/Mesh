package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class FO {
    public final J11 a;
    public final Executor b;

    public FO(J11 j11, Executor executor) {
        this.a = j11;
        this.b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FO) {
            return this.a.equals(((FO) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
