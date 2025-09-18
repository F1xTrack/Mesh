package p000;

import android.util.CloseGuard;

/* renamed from: ut */
/* loaded from: classes.dex */
public final class C6977ut implements InterfaceC7040vt {

    /* renamed from: a */
    public final CloseGuard f44002a = new CloseGuard();

    @Override // p000.InterfaceC7040vt
    /* renamed from: a */
    public final void mo2826a() {
        this.f44002a.warnIfOpen();
    }

    @Override // p000.InterfaceC7040vt
    public final void close() {
        this.f44002a.close();
    }

    @Override // p000.InterfaceC7040vt
    /* renamed from: m */
    public final void mo2832m(String str) {
        this.f44002a.open(str);
    }
}
