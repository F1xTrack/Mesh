package p000;

import android.app.Application;
import android.content.Context;

/* renamed from: zV */
/* loaded from: classes.dex */
public final class C7268zV {

    /* renamed from: a */
    public final C0786MU f46850a;

    /* renamed from: b */
    public final C10537oZ0 f46851b;

    public C7268zV(C0786MU c0786mu, C10537oZ0 c10537oZ0, InterfaceC0125Bz interfaceC0125Bz, InterfaceC8868bZ0 interfaceC8868bZ0) {
        this.f46850a = c0786mu;
        this.f46851b = c10537oZ0;
        c0786mu.m5379a();
        Context applicationContext = c0786mu.f7174a.getApplicationContext();
        if (!(applicationContext instanceof Application)) {
            applicationContext.getClass().toString();
        } else {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(C10153lZ0.f37152a);
            AbstractC9366fP1.m18230b(AbstractC11432vY1.m25444a(interfaceC0125Bz), null, new C7205yV(this, interfaceC0125Bz, interfaceC8868bZ0, null), 3);
        }
    }
}
