package p000;

/* renamed from: iC */
/* loaded from: classes.dex */
public final class C4227iC {

    /* renamed from: a */
    public final C11011sG0 f28889a;

    /* renamed from: b */
    public final boolean f28890b;

    public C4227iC(C11011sG0 c11011sG0, boolean z) {
        this.f28889a = c11011sG0;
        this.f28890b = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4227iC)) {
            return false;
        }
        C4227iC c4227iC = (C4227iC) obj;
        return c4227iC.f28889a.equals(this.f28889a) && c4227iC.f28890b == this.f28890b;
    }

    public final int hashCode() {
        return ((this.f28889a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f28890b).hashCode();
    }
}
