package p000;

import android.graphics.Matrix;

/* renamed from: wn */
/* loaded from: classes.dex */
public final class C7097wn implements K60 {

    /* renamed from: a */
    public final InterfaceC7034vn f45097a;

    public C7097wn(InterfaceC7034vn interfaceC7034vn) {
        this.f45097a = interfaceC7034vn;
    }

    @Override // p000.K60
    /* renamed from: a */
    public final void mo4563a(C6551oQ c6551oQ) {
        this.f45097a.mo384a(c6551oQ);
    }

    @Override // p000.K60
    /* renamed from: b */
    public final C10996s81 mo4564b() {
        return this.f45097a.mo385b();
    }

    @Override // p000.K60
    /* renamed from: c */
    public final int mo4565c() {
        return 0;
    }

    @Override // p000.K60
    /* renamed from: d */
    public final Matrix mo4566d() {
        return new Matrix();
    }

    @Override // p000.K60
    public final long getTimestamp() {
        return this.f45097a.getTimestamp();
    }
}
