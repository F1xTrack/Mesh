package defpackage;

/* renamed from: Gl */
/* loaded from: classes.dex */
public final class C0521Gl extends AbstractC2243b1 {
    public final /* synthetic */ C0599Hl h;

    public C0521Gl(C0599Hl c0599Hl) {
        this.h = c0599Hl;
    }

    @Override // defpackage.AbstractC2243b1
    public final String h() {
        C0365El c0365El = (C0365El) this.h.a.get();
        if (c0365El == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + c0365El.a + "]";
    }
}
