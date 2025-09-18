package com.yandex.metrica.impl.ob;

import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3167w {
    public static final long c = TimeUnit.SECONDS.toMillis(10);
    private long a;
    private final Nm b;

    /* renamed from: com.yandex.metrica.impl.ob.w$a */
    public class a implements Runnable {
        final /* synthetic */ c a;

        public a(C3167w c3167w, c cVar) {
            this.a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.w$b */
    public static class b {
        private boolean a = false;
        private final c b;
        private final C3167w c;

        /* renamed from: com.yandex.metrica.impl.ob.w$b$a */
        public class a implements c {
            final /* synthetic */ Runnable a;

            public a(Runnable runnable) {
                this.a = runnable;
            }

            @Override // com.yandex.metrica.impl.ob.C3167w.c
            public void a() {
                b.this.a = true;
                this.a.run();
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.w$b$b, reason: collision with other inner class name */
        public class RunnableC0019b implements Runnable {
            public RunnableC0019b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b.a();
            }
        }

        public b(Runnable runnable, C3167w c3167w) {
            this.b = new a(runnable);
            this.c = c3167w;
        }

        public void a(long j, InterfaceExecutorC3086sn interfaceExecutorC3086sn) {
            if (!this.a) {
                this.c.a(j, interfaceExecutorC3086sn, this.b);
            } else {
                ((C3061rn) interfaceExecutorC3086sn).execute(new RunnableC0019b());
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.w$c */
    public interface c {
        void a();
    }

    public C3167w() {
        this(new Nm());
    }

    public void a() {
        this.b.getClass();
        this.a = System.currentTimeMillis();
    }

    public C3167w(Nm nm) {
        this.b = nm;
    }

    public void a(long j, InterfaceExecutorC3086sn interfaceExecutorC3086sn, c cVar) {
        this.b.getClass();
        C3061rn c3061rn = (C3061rn) interfaceExecutorC3086sn;
        c3061rn.a(new a(this, cVar), Math.max(j - (System.currentTimeMillis() - this.a), 0L));
    }
}
