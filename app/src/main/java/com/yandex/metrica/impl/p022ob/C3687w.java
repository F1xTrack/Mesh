package com.yandex.metrica.impl.p022ob;

import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.w */
/* loaded from: classes2.dex */
public class C3687w {

    /* renamed from: c */
    public static final long f25138c = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a */
    private long f25139a;

    /* renamed from: b */
    private final C2814Nm f25140b;

    /* renamed from: com.yandex.metrica.impl.ob.w$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ c f25141a;

        public a(C3687w c3687w, c cVar) {
            this.f25141a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f25141a.mo13859a();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.w$b */
    public static class b {

        /* renamed from: a */
        private boolean f25142a = false;

        /* renamed from: b */
        private final c f25143b;

        /* renamed from: c */
        private final C3687w f25144c;

        /* renamed from: com.yandex.metrica.impl.ob.w$b$a */
        public class a implements c {

            /* renamed from: a */
            final /* synthetic */ Runnable f25145a;

            public a(Runnable runnable) {
                this.f25145a = runnable;
            }

            @Override // com.yandex.metrica.impl.p022ob.C3687w.c
            /* renamed from: a */
            public void mo13859a() {
                b.this.f25142a = true;
                this.f25145a.run();
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.w$b$b, reason: collision with other inner class name */
        public class RunnableC7313b implements Runnable {
            public RunnableC7313b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f25143b.mo13859a();
            }
        }

        public b(Runnable runnable, C3687w c3687w) {
            this.f25143b = new a(runnable);
            this.f25144c = c3687w;
        }

        /* renamed from: a */
        public void m17105a(long j, InterfaceExecutorC3607sn interfaceExecutorC3607sn) {
            if (!this.f25142a) {
                this.f25144c.m17102a(j, interfaceExecutorC3607sn, this.f25143b);
            } else {
                ((C3581rn) interfaceExecutorC3607sn).execute(new RunnableC7313b());
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.w$c */
    public interface c {
        /* renamed from: a */
        void mo13859a();
    }

    public C3687w() {
        this(new C2814Nm());
    }

    /* renamed from: a */
    public void m17101a() {
        this.f25140b.getClass();
        this.f25139a = System.currentTimeMillis();
    }

    public C3687w(C2814Nm c2814Nm) {
        this.f25140b = c2814Nm;
    }

    /* renamed from: a */
    public void m17102a(long j, InterfaceExecutorC3607sn interfaceExecutorC3607sn, c cVar) {
        this.f25140b.getClass();
        C3581rn c3581rn = (C3581rn) interfaceExecutorC3607sn;
        c3581rn.m16704a(new a(this, cVar), Math.max(j - (System.currentTimeMillis() - this.f25139a), 0L));
    }
}
