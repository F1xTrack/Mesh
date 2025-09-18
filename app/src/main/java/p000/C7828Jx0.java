package p000;

import androidx.activity.C1690a;

/* renamed from: Jx0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7828Jx0 implements InterfaceC0430Gp {

    /* renamed from: a */
    public final C0767MB f5813a;

    /* renamed from: b */
    public final /* synthetic */ C1690a f5814b;

    public C7828Jx0(C1690a c1690a, C0767MB c0767mb) {
        O90.m5968f(c0767mb, "onBackPressedCallback");
        this.f5814b = c1690a;
        this.f5813a = c0767mb;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [FZ, mZ] */
    @Override // p000.InterfaceC0430Gp
    public final void cancel() {
        C1690a c1690a = this.f5814b;
        C6470n8 c6470n8 = c1690a.f15743b;
        C0767MB c0767mb = this.f5813a;
        c6470n8.remove(c0767mb);
        if (O90.m5963a(c1690a.f15744c, c0767mb)) {
            c0767mb.getClass();
            c1690a.f15744c = null;
        }
        c0767mb.f7027b.remove(this);
        ?? r0 = c0767mb.f7028c;
        if (r0 != 0) {
            r0.invoke();
        }
        c0767mb.f7028c = null;
    }
}
