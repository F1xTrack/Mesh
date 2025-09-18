package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import p000.AbstractC1374Vq;

/* renamed from: com.yandex.metrica.impl.ob.bb */
/* loaded from: classes2.dex */
public class C3153bb {

    /* renamed from: a */
    private final Context f23123a;

    /* renamed from: b */
    private final String f23124b;

    /* renamed from: c */
    private final InterfaceC3179cb f23125c;

    /* renamed from: d */
    private final InterfaceC3117a1 f23126d;

    /* renamed from: e */
    private final InterfaceC2839Om f23127e;

    /* renamed from: f */
    private final C2893R2 f23128f;

    public C3153bb(Context context, String str, InterfaceC3179cb interfaceC3179cb, InterfaceC3117a1 interfaceC3117a1) {
        this(context, str, interfaceC3179cb, interfaceC3117a1, new C2814Nm(), new C2893R2());
    }

    /* renamed from: a */
    public boolean m15681a(C3026Wa c3026Wa) {
        long jMo14675b = this.f23127e.mo14675b();
        if (c3026Wa == null) {
            return false;
        }
        boolean z = true;
        boolean z2 = jMo14675b <= c3026Wa.f22681a;
        if (!z2) {
            z = z2;
        } else if (this.f23126d.mo14352a() + jMo14675b > c3026Wa.f22681a) {
            z = false;
        }
        if (z) {
            return this.f23128f.m14970b(this.f23125c.mo15270a(new C2551D9(C2877Qa.m14815a(this.f23123a).m14831g())), c3026Wa.f22682b, AbstractC1374Vq.m8593l(new StringBuilder(), this.f23124b, " diagnostics event"));
        }
        return false;
    }

    public C3153bb(Context context, String str, InterfaceC3179cb interfaceC3179cb, InterfaceC3117a1 interfaceC3117a1, InterfaceC2839Om interfaceC2839Om, C2893R2 c2893r2) {
        this.f23123a = context;
        this.f23124b = str;
        this.f23125c = interfaceC3179cb;
        this.f23126d = interfaceC3117a1;
        this.f23127e = interfaceC2839Om;
        this.f23128f = c2893r2;
    }
}
