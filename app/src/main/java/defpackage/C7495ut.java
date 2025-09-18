package defpackage;

import android.util.CloseGuard;

/* renamed from: ut, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7495ut implements InterfaceC7686vt {
    public final CloseGuard a = new CloseGuard();

    @Override // defpackage.InterfaceC7686vt
    public final void a() {
        this.a.warnIfOpen();
    }

    @Override // defpackage.InterfaceC7686vt
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.InterfaceC7686vt
    public final void m(String str) {
        this.a.open(str);
    }
}
