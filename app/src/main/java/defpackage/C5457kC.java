package defpackage;

/* renamed from: kC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5457kC {
    public final String a;
    public final C1475Sr0 b;

    public C5457kC(String str, C1475Sr0 c1475Sr0) {
        this.a = str;
        this.b = c1475Sr0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5457kC.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        O90.d(obj, "null cannot be cast to non-null type ru.rustore.sdk.metrics.internal.domain.model.PersistentMetricsEvent");
        C5457kC c5457kC = (C5457kC) obj;
        return O90.a(this.a, c5457kC.a) && O90.a(this.b, c5457kC.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
