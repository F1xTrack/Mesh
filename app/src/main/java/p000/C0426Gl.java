package p000;

/* renamed from: Gl */
/* loaded from: classes.dex */
public final class C0426Gl extends AbstractC1759b1 {

    /* renamed from: h */
    public final /* synthetic */ C0489Hl f3872h;

    public C0426Gl(C0489Hl c0489Hl) {
        this.f3872h = c0489Hl;
    }

    @Override // p000.AbstractC1759b1
    /* renamed from: h */
    public final String mo3149h() {
        C0300El c0300El = (C0300El) this.f3872h.f4483a.get();
        if (c0300El == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + c0300El.f2876a + "]";
    }
}
