package defpackage;

import android.graphics.Matrix;

/* renamed from: wn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7858wn implements K60 {
    public final InterfaceC7668vn a;

    public C7858wn(InterfaceC7668vn interfaceC7668vn) {
        this.a = interfaceC7668vn;
    }

    @Override // defpackage.K60
    public final void a(C6263oQ c6263oQ) {
        this.a.a(c6263oQ);
    }

    @Override // defpackage.K60
    public final C6974s81 b() {
        return this.a.b();
    }

    @Override // defpackage.K60
    public final int c() {
        return 0;
    }

    @Override // defpackage.K60
    public final Matrix d() {
        return new Matrix();
    }

    @Override // defpackage.K60
    public final long getTimestamp() {
        return this.a.getTimestamp();
    }
}
