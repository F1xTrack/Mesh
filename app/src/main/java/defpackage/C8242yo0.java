package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;

/* renamed from: yo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8242yo0 {
    public final MeasurementManager a;

    public C8242yo0(Context context) {
        O90.f(context, "context");
        Object systemService = context.getSystemService((Class<Object>) AbstractC7338u3.f());
        O90.e(systemService, "context.getSystemService…:class.java\n            )");
        this.a = AbstractC7338u3.a(systemService);
    }

    public Object a(NH nh, InterfaceC1729Vy interfaceC1729Vy) {
        new C0767Jp(1, AbstractC6383p22.b(interfaceC1729Vy)).s();
        AbstractC7338u3.g();
        throw null;
    }

    public Object b(InterfaceC1729Vy interfaceC1729Vy) {
        C0767Jp c0767Jp = new C0767Jp(1, AbstractC6383p22.b(interfaceC1729Vy));
        c0767Jp.s();
        this.a.getMeasurementApiStatus(new ExecutorC4096h8(2), new C2235az(c0767Jp));
        Object objR = c0767Jp.r();
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        return objR;
    }

    public Object c(Uri uri, InputEvent inputEvent, InterfaceC1729Vy interfaceC1729Vy) {
        C0767Jp c0767Jp = new C0767Jp(1, AbstractC6383p22.b(interfaceC1729Vy));
        c0767Jp.s();
        this.a.registerSource(uri, inputEvent, new ExecutorC4096h8(2), new C2235az(c0767Jp));
        Object objR = c0767Jp.r();
        return objR == EnumC1030Mz.a ? objR : C1518Tf1.a;
    }

    public Object d(Uri uri, InterfaceC1729Vy interfaceC1729Vy) {
        C0767Jp c0767Jp = new C0767Jp(1, AbstractC6383p22.b(interfaceC1729Vy));
        c0767Jp.s();
        this.a.registerTrigger(uri, new ExecutorC4096h8(2), new C2235az(c0767Jp));
        Object objR = c0767Jp.r();
        return objR == EnumC1030Mz.a ? objR : C1518Tf1.a;
    }

    public Object e(AbstractC0682Im1 abstractC0682Im1, InterfaceC1729Vy interfaceC1729Vy) {
        new C0767Jp(1, AbstractC6383p22.b(interfaceC1729Vy)).s();
        AbstractC7338u3.m();
        throw null;
    }

    public Object f(AbstractC0760Jm1 abstractC0760Jm1, InterfaceC1729Vy interfaceC1729Vy) {
        new C0767Jp(1, AbstractC6383p22.b(interfaceC1729Vy)).s();
        AbstractC7338u3.n();
        throw null;
    }
}
