package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class DQ0 implements InterfaceC6646qQ0 {
    public static GQ0 b;
    public final Handler a = new Handler(Looper.getMainLooper());

    @Override // defpackage.InterfaceC6646qQ0
    public final void a(C7600vQ0 c7600vQ0) {
        this.a.post(new RunnableC1577Tz0(16, c7600vQ0));
    }

    @Override // defpackage.InterfaceC6646qQ0
    public final void b() {
        this.a.post(new A3(8));
    }

    @Override // defpackage.InterfaceC6646qQ0
    public final void c() {
        this.a.post(new A3(10));
    }

    @Override // defpackage.InterfaceC6646qQ0
    public final void d() {
        this.a.post(new A3(9));
    }
}
