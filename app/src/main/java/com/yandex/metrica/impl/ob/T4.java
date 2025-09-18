package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.X3;
import com.yandex.metrica.impl.ob.X4;

/* loaded from: classes2.dex */
public class T4 implements InterfaceC2843j4, Y4, InterfaceC2868k4 {
    private final C2669c4 a;
    private final C3243z0 b;
    private U4 c;
    private C3247z4 d;

    public static class a {
        public U4 a(Context context, C2669c4 c2669c4, Qi qi, X4.a aVar) {
            return new U4(new X4.b(context, c2669c4.b()), qi, aVar);
        }
    }

    public static class b {
        private final C2965o1 a;

        public b() {
            this(P0.i().j());
        }

        public C3243z0<T4> a(T4 t4, Wi wi, Z4 z4, I8 i8) {
            C3243z0<T4> c3243z0 = new C3243z0<>(t4, wi.a(), z4, i8);
            this.a.a(c3243z0);
            return c3243z0;
        }

        public b(C2965o1 c2965o1) {
            this.a = c2965o1;
        }
    }

    public T4(Context context, C2669c4 c2669c4, X3.a aVar, Qi qi, Wi wi, com.yandex.metrica.c cVar) {
        this(context, c2669c4, aVar, qi, wi, cVar, new Z4(), new b(), new a(), new C3247z4(context, c2669c4), P0.i().y().a(c2669c4.a()));
    }

    @Override // com.yandex.metrica.impl.ob.Li
    public void a(Hi hi, Qi qi) {
    }

    public void b() {
        if (this.d.a(this.c.b().E())) {
            this.b.a(J0.a());
            this.d.a();
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2918m4
    public void a(X3.a aVar) {
        this.c.a((U4) aVar);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2918m4
    public void a(C2864k0 c2864k0) {
        this.b.a(c2864k0);
    }

    @Override // com.yandex.metrica.impl.ob.Li
    public synchronized void a(Qi qi) {
        this.c.a(qi);
        this.d.a(qi.P());
    }

    public T4(Context context, C2669c4 c2669c4, X3.a aVar, Qi qi, Wi wi, com.yandex.metrica.c cVar, Z4 z4, b bVar, a aVar2, C3247z4 c3247z4, I8 i8) {
        this.a = c2669c4;
        this.d = c3247z4;
        this.b = bVar.a(this, wi, z4, i8);
        synchronized (this) {
            this.d.a(qi.P());
            this.c = aVar2.a(context, c2669c4, qi, new X4.a(aVar));
        }
    }

    @Override // com.yandex.metrica.impl.ob.Y4
    public X4 a() {
        return this.c.b();
    }
}
