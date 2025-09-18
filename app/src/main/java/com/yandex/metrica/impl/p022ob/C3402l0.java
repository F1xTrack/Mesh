package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.yandex.metrica.C3806y;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.EnumC2458c;
import p000.InterfaceC11601wt1;

/* renamed from: com.yandex.metrica.impl.ob.l0 */
/* loaded from: classes2.dex */
public class C3402l0 extends AbstractC2691J {

    /* renamed from: p */
    private final C2997V6 f24149p;

    /* renamed from: q */
    private final C3201d7 f24150q;

    public C3402l0(Context context, C2969U3 c2969u3, C3806y c3806y, C3456n2 c3456n2) {
        this(context, c2969u3, c3806y, c3456n2, new C2717K0(context));
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2691J, com.yandex.metrica.impl.p022ob.InterfaceC3143b1
    /* renamed from: a */
    public void mo14377a(C3513p7 c3513p7) {
        this.f24149p.m15301a(this.f24150q.m15743a(c3513p7, this.f21461b));
        m14382b(c3513p7);
    }

    private C3402l0(Context context, C2969U3 c2969u3, C3806y c3806y, C3456n2 c3456n2, C2717K0 c2717k0) {
        this(context, c3456n2, new C3378k2(c2969u3, new CounterConfiguration(c3806y, EnumC2458c.CRASH), c3806y.userProfileID), c2717k0, new C2997V6(context), new C3201d7(), C3065Y.m15442g().m15451j(), new C3601sh(), new C3705wh(null, null), new C2599F7(), new C2474A7(), new C3643u7(), new C3591s7(), new C3123a7(c2717k0));
    }

    public C3402l0(Context context, C3456n2 c3456n2, C3378k2 c3378k2, C2717K0 c2717k0, C2997V6 c2997v6, C3201d7 c3201d7, InterfaceC2664Hm interfaceC2664Hm, InterfaceC11601wt1 interfaceC11601wt1, C3705wh c3705wh, C2599F7 c2599f7, C2474A7 c2474a7, C3643u7 c3643u7, C3591s7 c3591s7, C3123a7 c3123a7) {
        super(context, c3456n2, c3378k2, c2717k0, interfaceC2664Hm, interfaceC11601wt1, c3705wh, c2599f7, c2474a7, c3643u7, c3591s7, c3123a7);
        this.f24149p = c2997v6;
        this.f24150q = c3201d7;
    }
}
