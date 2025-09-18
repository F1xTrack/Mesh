package defpackage;

import android.app.Application;
import android.content.Context;

/* renamed from: zV */
/* loaded from: classes.dex */
public final class C8374zV {
    public final MU a;
    public final C6291oZ0 b;

    public C8374zV(MU mu, C6291oZ0 c6291oZ0, InterfaceC0173Bz interfaceC0173Bz, InterfaceC2349bZ0 interfaceC2349bZ0) {
        this.a = mu;
        this.b = c6291oZ0;
        mu.a();
        Context applicationContext = mu.a.getApplicationContext();
        if (!(applicationContext instanceof Application)) {
            applicationContext.getClass().toString();
        } else {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(C5718lZ0.a);
            AbstractC3767fP1.b(AbstractC7625vY1.a(interfaceC0173Bz), null, new C8184yV(this, interfaceC0173Bz, interfaceC2349bZ0, null), 3);
        }
    }
}
