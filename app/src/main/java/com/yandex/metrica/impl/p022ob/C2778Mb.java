package com.yandex.metrica.impl.p022ob;

import java.util.concurrent.TimeUnit;
import p000.AbstractC9225eJ0;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.Mb */
/* loaded from: classes2.dex */
public final class C2778Mb {

    /* renamed from: a */
    private AbstractRunnableC2739Km f21724a;

    /* renamed from: b */
    private volatile boolean f21725b;

    /* renamed from: c */
    private final InterfaceExecutorC3607sn f21726c;

    /* renamed from: com.yandex.metrica.impl.ob.Mb$a */
    public static final class a extends AbstractRunnableC2739Km {

        /* renamed from: b */
        final /* synthetic */ b f21728b;

        /* renamed from: c */
        final /* synthetic */ C2902Rb f21729c;

        /* renamed from: d */
        final /* synthetic */ long f21730d;

        public a(b bVar, C2902Rb c2902Rb, long j) {
            this.f21728b = bVar;
            this.f21729c = c2902Rb;
            this.f21730d = j;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractRunnableC2739Km
        /* renamed from: a */
        public void mo14494a() {
            if (C2778Mb.this.f21725b) {
                return;
            }
            this.f21728b.m14617a(true);
            this.f21729c.m14995a();
            ((C3581rn) C2778Mb.this.f21726c).m16705a(C2778Mb.m14614b(C2778Mb.this), this.f21730d, TimeUnit.SECONDS);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Mb$b */
    public static final class b {

        /* renamed from: a */
        private volatile boolean f21731a;

        public b(boolean z) {
            this.f21731a = z;
        }

        /* renamed from: a */
        public final boolean m14618a() {
            return this.f21731a;
        }

        public /* synthetic */ b(boolean z, int i) {
            this((i & 1) != 0 ? false : z);
        }

        /* renamed from: a */
        public final void m14617a(boolean z) {
            this.f21731a = z;
        }
    }

    public C2778Mb(C3654ui c3654ui, b bVar, AbstractC9225eJ0 abstractC9225eJ0, InterfaceExecutorC3607sn interfaceExecutorC3607sn, C2902Rb c2902Rb) {
        this.f21726c = interfaceExecutorC3607sn;
        this.f21724a = new a(bVar, c2902Rb, c3654ui.m16926b());
        if (bVar.m14618a()) {
            AbstractRunnableC2739Km abstractRunnableC2739Km = this.f21724a;
            if (abstractRunnableC2739Km != null) {
                abstractRunnableC2739Km.run();
                return;
            } else {
                O90.m5977o("periodicRunnable");
                throw null;
            }
        }
        long jMo6524c = abstractC9225eJ0.mo6524c(c3654ui.m16925a() + 1);
        AbstractRunnableC2739Km abstractRunnableC2739Km2 = this.f21724a;
        if (abstractRunnableC2739Km2 == null) {
            O90.m5977o("periodicRunnable");
            throw null;
        }
        ((C3581rn) interfaceExecutorC3607sn).m16705a(abstractRunnableC2739Km2, jMo6524c, TimeUnit.SECONDS);
    }

    /* renamed from: b */
    public static final /* synthetic */ AbstractRunnableC2739Km m14614b(C2778Mb c2778Mb) {
        AbstractRunnableC2739Km abstractRunnableC2739Km = c2778Mb.f21724a;
        if (abstractRunnableC2739Km != null) {
            return abstractRunnableC2739Km;
        }
        O90.m5977o("periodicRunnable");
        throw null;
    }

    /* renamed from: a */
    public final void m14616a() {
        this.f21725b = true;
        InterfaceExecutorC3607sn interfaceExecutorC3607sn = this.f21726c;
        AbstractRunnableC2739Km abstractRunnableC2739Km = this.f21724a;
        if (abstractRunnableC2739Km != null) {
            ((C3581rn) interfaceExecutorC3607sn).m16703a(abstractRunnableC2739Km);
        } else {
            O90.m5977o("periodicRunnable");
            throw null;
        }
    }
}
