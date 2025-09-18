package p000;

/* renamed from: kC */
/* loaded from: classes2.dex */
public final class C6285kC {

    /* renamed from: a */
    public final String f36350a;

    /* renamed from: b */
    public final C8284Sr0 f36351b;

    public C6285kC(String str, C8284Sr0 c8284Sr0) {
        this.f36350a = str;
        this.f36351b = c8284Sr0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C6285kC.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        O90.m5966d(obj, "null cannot be cast to non-null type ru.rustore.sdk.metrics.internal.domain.model.PersistentMetricsEvent");
        C6285kC c6285kC = (C6285kC) obj;
        return O90.m5963a(this.f36350a, c6285kC.f36350a) && O90.m5963a(this.f36351b, c6285kC.f36351b);
    }

    public final int hashCode() {
        return this.f36351b.hashCode() + (this.f36350a.hashCode() * 31);
    }
}
