package com.yandex.metrica.impl.ob;

import defpackage.AbstractC3557eJ0;
import defpackage.O90;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class Mb {
    private Km a;
    private volatile boolean b;
    private final InterfaceExecutorC3086sn c;

    public static final class a extends Km {
        final /* synthetic */ b b;
        final /* synthetic */ Rb c;
        final /* synthetic */ long d;

        public a(b bVar, Rb rb, long j) {
            this.b = bVar;
            this.c = rb;
            this.d = j;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() {
            if (Mb.this.b) {
                return;
            }
            this.b.a(true);
            this.c.a();
            ((C3061rn) Mb.this.c).a(Mb.b(Mb.this), this.d, TimeUnit.SECONDS);
        }
    }

    public static final class b {
        private volatile boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public /* synthetic */ b(boolean z, int i) {
            this((i & 1) != 0 ? false : z);
        }

        public final void a(boolean z) {
            this.a = z;
        }
    }

    public Mb(C3131ui c3131ui, b bVar, AbstractC3557eJ0 abstractC3557eJ0, InterfaceExecutorC3086sn interfaceExecutorC3086sn, Rb rb) {
        this.c = interfaceExecutorC3086sn;
        this.a = new a(bVar, rb, c3131ui.b());
        if (bVar.a()) {
            Km km = this.a;
            if (km != null) {
                km.run();
                return;
            } else {
                O90.o("periodicRunnable");
                throw null;
            }
        }
        long jC = abstractC3557eJ0.c(c3131ui.a() + 1);
        Km km2 = this.a;
        if (km2 == null) {
            O90.o("periodicRunnable");
            throw null;
        }
        ((C3061rn) interfaceExecutorC3086sn).a(km2, jC, TimeUnit.SECONDS);
    }

    public static final /* synthetic */ Km b(Mb mb) {
        Km km = mb.a;
        if (km != null) {
            return km;
        }
        O90.o("periodicRunnable");
        throw null;
    }

    public final void a() {
        this.b = true;
        InterfaceExecutorC3086sn interfaceExecutorC3086sn = this.c;
        Km km = this.a;
        if (km != null) {
            ((C3061rn) interfaceExecutorC3086sn).a(km);
        } else {
            O90.o("periodicRunnable");
            throw null;
        }
    }
}
