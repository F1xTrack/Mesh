package p000;

import java.util.concurrent.Executor;

/* renamed from: FO */
/* loaded from: classes.dex */
public final class C0340FO {

    /* renamed from: a */
    public final J11 f3190a;

    /* renamed from: b */
    public final Executor f3191b;

    public C0340FO(J11 j11, Executor executor) {
        this.f3190a = j11;
        this.f3191b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0340FO) {
            return this.f3190a.equals(((C0340FO) obj).f3190a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3190a.hashCode();
    }
}
