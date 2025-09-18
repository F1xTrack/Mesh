package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.C3167w;

/* loaded from: classes2.dex */
class Ad implements InterfaceC2952nd {
    private final Context a;
    private Qi b;
    private volatile Uc c;
    private final B8 d;
    private final A8 e;
    private final Om f;
    private final Od g;
    private final C3167w h;
    private final C3167w.c i;
    private final InterfaceExecutorC3086sn j;
    private boolean k;

    public class a implements C3167w.c {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.C3167w.c
        public void a() {
            Ad.this.k = true;
            Ad.this.b();
        }
    }

    public Ad(Context context, Qi qi, Uc uc, B8 b8, A8 a8, InterfaceExecutorC3086sn interfaceExecutorC3086sn) {
        this(context, qi, uc, b8, a8, interfaceExecutorC3086sn, new Nm(), new Od(), P0.i().a());
    }

    public void b() {
        R1 r1L = P0.i().l();
        Uc uc = this.c;
        if (uc == null || r1L == null) {
            return;
        }
        r1L.b(this.g.a(this.a, this.b, uc, this));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2952nd
    public void a() {
        boolean zA = a(this.d);
        boolean zA2 = a(this.e);
        if (zA || zA2) {
            if (!this.k) {
                this.h.a(C3167w.c, this.j, this.i);
            } else {
                b();
            }
        }
    }

    public Ad(Context context, Qi qi, Uc uc, B8 b8, A8 a8, InterfaceExecutorC3086sn interfaceExecutorC3086sn, Om om, Od od, C3167w c3167w) {
        this.k = false;
        this.a = context;
        this.c = uc;
        this.b = qi;
        this.d = b8;
        this.e = a8;
        this.j = interfaceExecutorC3086sn;
        this.f = om;
        this.g = od;
        this.h = c3167w;
        this.i = new a();
    }

    private boolean a(AbstractC3046r8 abstractC3046r8) {
        if (this.c != null) {
            if (this.c != null) {
                if (abstractC3046r8.c() < r0.c) {
                }
                return true;
            }
            Uc uc = this.c;
            if (uc != null) {
                if (this.f.a() - abstractC3046r8.b() > uc.e) {
                    return true;
                }
            }
        }
        return false;
    }

    public void a(Qi qi) {
        this.b = qi;
    }

    public void a(Uc uc) {
        this.c = uc;
    }
}
