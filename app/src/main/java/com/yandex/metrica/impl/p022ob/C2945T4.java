package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.yandex.metrica.EnumC2458c;
import com.yandex.metrica.impl.p022ob.C3044X3;
import com.yandex.metrica.impl.p022ob.C3045X4;

/* renamed from: com.yandex.metrica.impl.ob.T4 */
/* loaded from: classes2.dex */
public class C2945T4 implements InterfaceC3354j4, InterfaceC3070Y4, InterfaceC3380k4 {

    /* renamed from: a */
    private final C3172c4 f22367a;

    /* renamed from: b */
    private final C3766z0 f22368b;

    /* renamed from: c */
    private C2970U4 f22369c;

    /* renamed from: d */
    private C3770z4 f22370d;

    /* renamed from: com.yandex.metrica.impl.ob.T4$a */
    public static class a {
        /* renamed from: a */
        public C2970U4 m15173a(Context context, C3172c4 c3172c4, C2885Qi c2885Qi, C3045X4.a aVar) {
            return new C2970U4(new C3045X4.b(context, c3172c4.m15701b()), c2885Qi, aVar);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.T4$b */
    public static class b {

        /* renamed from: a */
        private final C3481o1 f22371a;

        public b() {
            this(C2842P0.m14728i().m14739j());
        }

        /* renamed from: a */
        public C3766z0<C2945T4> m15174a(C2945T4 c2945t4, AbstractC3034Wi abstractC3034Wi, C3095Z4 c3095z4, C2675I8 c2675i8) {
            C3766z0<C2945T4> c3766z0 = new C3766z0<>(c2945t4, abstractC3034Wi.mo15395a(), c3095z4, c2675i8);
            this.f22371a.m16500a(c3766z0);
            return c3766z0;
        }

        public b(C3481o1 c3481o1) {
            this.f22371a = c3481o1;
        }
    }

    public C2945T4(Context context, C3172c4 c3172c4, C3044X3.a aVar, C2885Qi c2885Qi, AbstractC3034Wi abstractC3034Wi, EnumC2458c enumC2458c) {
        this(context, c3172c4, aVar, c2885Qi, abstractC3034Wi, enumC2458c, new C3095Z4(), new b(), new a(), new C3770z4(context, c3172c4), C2842P0.m14728i().m14754y().m14472a(c3172c4.m15700a()));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2760Li
    /* renamed from: a */
    public void mo14543a(EnumC2660Hi enumC2660Hi, C2885Qi c2885Qi) {
    }

    /* renamed from: b */
    public void m15172b() {
        if (this.f22370d.m17323a(this.f22369c.m15942b().m15417E())) {
            this.f22368b.m17313a(C2692J0.m14393a());
            this.f22370d.m17321a();
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3432m4
    /* renamed from: a */
    public void mo15170a(C3044X3.a aVar) {
        this.f22369c.m15941a((C2970U4) aVar);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3432m4
    /* renamed from: a */
    public void mo15171a(C3376k0 c3376k0) {
        this.f22368b.m17313a(c3376k0);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2760Li
    /* renamed from: a */
    public synchronized void mo14544a(C2885Qi c2885Qi) {
        this.f22369c.m15939a(c2885Qi);
        this.f22370d.m17322a(c2885Qi.m14867P());
    }

    public C2945T4(Context context, C3172c4 c3172c4, C3044X3.a aVar, C2885Qi c2885Qi, AbstractC3034Wi abstractC3034Wi, EnumC2458c enumC2458c, C3095Z4 c3095z4, b bVar, a aVar2, C3770z4 c3770z4, C2675I8 c2675i8) {
        this.f22367a = c3172c4;
        this.f22370d = c3770z4;
        this.f22368b = bVar.m15174a(this, abstractC3034Wi, c3095z4, c2675i8);
        synchronized (this) {
            this.f22370d.m17322a(c2885Qi.m14867P());
            this.f22369c = aVar2.m15173a(context, c3172c4, c2885Qi, new C3045X4.a(aVar));
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3070Y4
    /* renamed from: a */
    public C3045X4 mo15169a() {
        return this.f22369c.m15942b();
    }
}
