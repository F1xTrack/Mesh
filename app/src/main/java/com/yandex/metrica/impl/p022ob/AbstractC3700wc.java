package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.os.Looper;

/* renamed from: com.yandex.metrica.impl.ob.wc */
/* loaded from: classes2.dex */
public abstract class AbstractC3700wc {

    /* renamed from: a */
    protected final C2676I9 f25170a;

    /* renamed from: b */
    protected final C3389kd f25171b;

    /* renamed from: c */
    protected final C3118a2 f25172c;

    /* renamed from: d */
    private final InterfaceC2829Oc f25173d;

    /* renamed from: e */
    private final C3622tc f25174e;

    /* renamed from: f */
    private final C3648uc f25175f;

    public AbstractC3700wc(C3389kd c3389kd, C2676I9 c2676i9, C3118a2 c3118a2) {
        this.f25171b = c3389kd;
        this.f25170a = c2676i9;
        this.f25172c = c3118a2;
        InterfaceC2829Oc interfaceC2829OcMo14619a = mo14619a();
        this.f25173d = interfaceC2829OcMo14619a;
        this.f25174e = new C3622tc(interfaceC2829OcMo14619a, mo14622c());
        this.f25175f = new C3648uc(c3389kd.f23918a.f25416b);
    }

    /* renamed from: a */
    public abstract InterfaceC2829Oc mo14619a();

    /* renamed from: a */
    public abstract InterfaceC3286ge mo14620a(C3260fe c3260fe);

    /* renamed from: a */
    public C3441md<C2579Ec> m17127a(C3727xd c3727xd, C2579Ec c2579Ec) {
        C3778zc c3778zc = this.f25171b.f23918a;
        Context context = c3778zc.f25415a;
        Looper looperM16706b = c3778zc.f25416b.m16706b();
        C3389kd c3389kd = this.f25171b;
        return new C3441md<>(new C2505Bd(context, looperM16706b, c3389kd.f23919b, mo14620a(c3389kd.f23918a.f25417c), mo14621b(), new C3311hd(c3727xd)), this.f25174e, new C3674vc(this.f25173d, new C2814Nm()), this.f25175f, c2579Ec);
    }

    /* renamed from: b */
    public abstract String mo14621b();

    /* renamed from: c */
    public abstract String mo14622c();
}
