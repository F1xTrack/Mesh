package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;
import defpackage.InterfaceC7878wt1;

/* renamed from: com.yandex.metrica.impl.ob.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2889l0 extends J {
    private final V6 p;
    private final C2697d7 q;

    public C2889l0(Context context, U3 u3, com.yandex.metrica.y yVar, C2941n2 c2941n2) {
        this(context, u3, yVar, c2941n2, new K0(context));
    }

    @Override // com.yandex.metrica.impl.ob.J, com.yandex.metrica.impl.ob.InterfaceC2641b1
    public void a(C2996p7 c2996p7) {
        this.p.a(this.q.a(c2996p7, this.b));
        b(c2996p7);
    }

    private C2889l0(Context context, U3 u3, com.yandex.metrica.y yVar, C2941n2 c2941n2, K0 k0) {
        this(context, c2941n2, new C2866k2(u3, new CounterConfiguration(yVar, com.yandex.metrica.c.CRASH), yVar.userProfileID), k0, new V6(context), new C2697d7(), Y.g().j(), new C3080sh(), new C3185wh(null, null), new F7(), new A7(), new C3120u7(), new C3070s7(), new C2622a7(k0));
    }

    public C2889l0(Context context, C2941n2 c2941n2, C2866k2 c2866k2, K0 k0, V6 v6, C2697d7 c2697d7, Hm hm, InterfaceC7878wt1 interfaceC7878wt1, C3185wh c3185wh, F7 f7, A7 a7, C3120u7 c3120u7, C3070s7 c3070s7, C2622a7 c2622a7) {
        super(context, c2941n2, c2866k2, k0, hm, interfaceC7878wt1, c3185wh, f7, a7, c3120u7, c3070s7, c2622a7);
        this.p = v6;
        this.q = c2697d7;
    }
}
