package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.yandex.metrica.EnumC2458c;
import com.yandex.metrica.impl.p022ob.C2982Ug;
import com.yandex.metrica.impl.p022ob.C3044X3;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.o4 */
/* loaded from: classes2.dex */
public class C3484o4 extends C3250f4 implements InterfaceC2733Kg, InterfaceC2708Jg {

    /* renamed from: A */
    private final C3007Vg f24360A;

    /* renamed from: B */
    private final C2769M2 f24361B;

    /* renamed from: C */
    private final InterfaceC2774M7<File> f24362C;

    /* renamed from: D */
    private final C3743y3 f24363D;

    /* renamed from: z */
    private final C2982Ug f24364z;

    /* renamed from: com.yandex.metrica.impl.ob.o4$a */
    public class a implements InterfaceC2988Um<File> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2988Um
        /* renamed from: b */
        public void mo13904b(File file) {
            C3484o4.m16532a(C3484o4.this, file);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o4$b */
    public class b implements C2982Ug.a {
        public b() {
        }

        @Override // com.yandex.metrica.impl.p022ob.C2982Ug.a
        /* renamed from: a */
        public void mo15281a(C2608Fg c2608Fg) {
            if (c2608Fg == null) {
                return;
            }
            C3484o4.this.mo15171a(new C3376k0().mo15099a(c2608Fg.m14134a()).m16221a(EnumC3377k1.EVENT_TYPE_SEND_REFERRER.m16250b()));
        }
    }

    public C3484o4(Context context, C2885Qi c2885Qi, C3172c4 c3172c4, C3044X3.a aVar, C2982Ug c2982Ug, C2769M2 c2769m2, AbstractC3034Wi abstractC3034Wi) {
        this(context, c3172c4, c2885Qi, aVar, new C2994V3(), new C2893R2(), new C2742L0(), new C3510p4(context, c3172c4, aVar, abstractC3034Wi, c2885Qi, new C3458n4(c2769m2), C2842P0.m14728i().m14748s().m17353e(), C2968U2.m15248b(context, c3172c4.m15701b()), C2842P0.m14728i().m14748s(), C2842P0.m14728i().m14739j()), c2982Ug, c2769m2);
    }

    /* renamed from: a */
    private void m16531a(Context context, C2742L0 c2742l0) {
        File fileM14500a = c2742l0.m14500a(context, "YandexMetricaNativeCrashes");
        if (fileM14500a != null) {
            new C2624G7(fileM14500a, new a()).m14161a();
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.C3250f4
    /* renamed from: F */
    public void mo15899F() {
        this.f24364z.m15279a(this.f24360A);
    }

    @Override // com.yandex.metrica.impl.p022ob.C3250f4
    /* renamed from: s */
    public EnumC2458c mo15382s() {
        return EnumC2458c.MAIN;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2708Jg
    /* renamed from: a */
    public void mo14443a() {
        m15923w().m14291c(true);
    }

    @Override // com.yandex.metrica.impl.p022ob.C3250f4, com.yandex.metrica.impl.p022ob.InterfaceC3432m4
    /* renamed from: a */
    public synchronized void mo15170a(C3044X3.a aVar) {
        super.mo15170a(aVar);
        this.f24361B.m14593a(aVar.f22762l);
    }

    @Override // com.yandex.metrica.impl.p022ob.C3250f4, com.yandex.metrica.impl.p022ob.InterfaceC2760Li
    /* renamed from: a */
    public void mo14544a(C2885Qi c2885Qi) {
        super.mo14544a(c2885Qi);
        this.f24363D.m17213a(c2885Qi);
    }

    public C3484o4(Context context, C3172c4 c3172c4, C2885Qi c2885Qi, C3044X3.a aVar, C2994V3 c2994v3, C2893R2 c2893r2, C2742L0 c2742l0, C3510p4 c3510p4, C2982Ug c2982Ug, C2769M2 c2769m2) {
        super(context, c3172c4, c2994v3, c2893r2, c3510p4);
        this.f24364z = c2982Ug;
        C3199d5 c3199d5M15912k = m15912k();
        c3199d5M15912k.m15741a(EnumC3377k1.EVENT_TYPE_REGULAR, new C3021W5(c3199d5M15912k.m15742b()));
        this.f24360A = c3510p4.m16557c(this);
        this.f24361B = c2769m2;
        C2998V7 c2998v7M16554a = c3510p4.m16554a(c3510p4.m16558e(), c3510p4.m16556b(this), m15907f());
        this.f24362C = c2998v7M16554a;
        c2998v7M16554a.mo14604a();
        m16531a(context, c2742l0);
        C3743y3 c3743y3M16555a = c3510p4.m16555a(this);
        this.f24363D = c3743y3M16555a;
        c3743y3M16555a.m17214a(c2885Qi, aVar.f22767q);
    }

    /* renamed from: a */
    public static void m16532a(C3484o4 c3484o4, File file) {
        c3484o4.f24362C.mo14605a(file);
    }
}
