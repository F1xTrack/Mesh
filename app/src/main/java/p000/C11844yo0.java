package p000;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;

/* renamed from: yo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11844yo0 {

    /* renamed from: a */
    public final MeasurementManager f46485a;

    public C11844yo0(Context context) {
        O90.m5968f(context, "context");
        Object systemService = context.getSystemService((Class<Object>) AbstractC6925u3.m25087f());
        O90.m5967e(systemService, "context.getSystemService…:class.java\n            )");
        this.f46485a = AbstractC6925u3.m25082a(systemService);
    }

    /* renamed from: a */
    public Object m26256a(AbstractC0836NH abstractC0836NH, InterfaceC1382Vy interfaceC1382Vy) {
        new C0619Jp(1, AbstractC10599p22.m23595b(interfaceC1382Vy)).m4439s();
        AbstractC6925u3.m25088g();
        throw null;
    }

    /* renamed from: b */
    public Object m26257b(InterfaceC1382Vy interfaceC1382Vy) {
        C0619Jp c0619Jp = new C0619Jp(1, AbstractC10599p22.m23595b(interfaceC1382Vy));
        c0619Jp.m4439s();
        this.f46485a.getMeasurementApiStatus(new ExecutorC4160h8(2), new C1756az(c0619Jp));
        Object objM4438r = c0619Jp.m4438r();
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        return objM4438r;
    }

    /* renamed from: c */
    public Object m26258c(Uri uri, InputEvent inputEvent, InterfaceC1382Vy interfaceC1382Vy) {
        C0619Jp c0619Jp = new C0619Jp(1, AbstractC10599p22.m23595b(interfaceC1382Vy));
        c0619Jp.m4439s();
        this.f46485a.registerSource(uri, inputEvent, new ExecutorC4160h8(2), new C1756az(c0619Jp));
        Object objM4438r = c0619Jp.m4438r();
        return objM4438r == EnumC0817Mz.f7418a ? objM4438r : C8313Tf1.f11463a;
    }

    /* renamed from: d */
    public Object m26259d(Uri uri, InterfaceC1382Vy interfaceC1382Vy) {
        C0619Jp c0619Jp = new C0619Jp(1, AbstractC10599p22.m23595b(interfaceC1382Vy));
        c0619Jp.m4439s();
        this.f46485a.registerTrigger(uri, new ExecutorC4160h8(2), new C1756az(c0619Jp));
        Object objM4438r = c0619Jp.m4438r();
        return objM4438r == EnumC0817Mz.f7418a ? objM4438r : C8313Tf1.f11463a;
    }

    /* renamed from: e */
    public Object m26260e(AbstractC7755Im1 abstractC7755Im1, InterfaceC1382Vy interfaceC1382Vy) {
        new C0619Jp(1, AbstractC10599p22.m23595b(interfaceC1382Vy)).m4439s();
        AbstractC6925u3.m25094m();
        throw null;
    }

    /* renamed from: f */
    public Object m26261f(AbstractC7807Jm1 abstractC7807Jm1, InterfaceC1382Vy interfaceC1382Vy) {
        new C0619Jp(1, AbstractC10599p22.m23595b(interfaceC1382Vy)).m4439s();
        AbstractC6925u3.m25095n();
        throw null;
    }
}
