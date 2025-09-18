package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.C2769g4;

/* renamed from: com.yandex.metrica.impl.ob.u4 */
/* loaded from: classes2.dex */
public class C3117u4 {
    private final G9 a;
    private final I8 b;
    private C3144v6 c;
    private C3096t8 d;
    private final C2912ln e;
    private final A f;
    private final C2819i4 g;
    private a h;
    private final Om i;
    private final int j;
    private long k;
    private long l;
    private int m;

    /* renamed from: com.yandex.metrica.impl.ob.u4$a */
    public interface a {
    }

    public C3117u4(G9 g9, I8 i8, C3144v6 c3144v6, C3096t8 c3096t8, A a2, C2912ln c2912ln, int i, a aVar, C2819i4 c2819i4, Om om) {
        this.a = g9;
        this.b = i8;
        this.c = c3144v6;
        this.d = c3096t8;
        this.f = a2;
        this.e = c2912ln;
        this.j = i;
        this.g = c2819i4;
        this.i = om;
        this.h = aVar;
        this.k = g9.b(0L);
        this.l = g9.k();
        this.m = g9.h();
    }

    public void a(C2864k0 c2864k0) {
        this.c.c(c2864k0);
    }

    public void b(C2864k0 c2864k0) {
        a(c2864k0, this.c.b(c2864k0));
    }

    public void c(C2864k0 c2864k0) {
        a(c2864k0, this.c.b(c2864k0));
        int i = this.j;
        this.m = i;
        this.a.a(i).c();
    }

    public void d(C2864k0 c2864k0) {
        a(c2864k0, this.c.b(c2864k0));
        long jB = this.i.b();
        this.k = jB;
        this.a.c(jB).c();
    }

    public void e(C2864k0 c2864k0) {
        a(c2864k0, this.c.b(c2864k0));
        long jB = this.i.b();
        this.l = jB;
        this.a.e(jB).c();
    }

    public void f(C2864k0 c2864k0) {
        a(c2864k0, this.c.f(c2864k0));
    }

    public void a(C2864k0 c2864k0, C3174w6 c3174w6) {
        if (TextUtils.isEmpty(c2864k0.o())) {
            c2864k0.e(this.a.m());
        }
        c2864k0.d(this.a.l());
        c2864k0.a(Integer.valueOf(this.b.g()));
        this.d.a(this.e.a(c2864k0).a(c2864k0), c2864k0.n(), c3174w6, this.f.a(), this.g);
        ((C2769g4.a) this.h).a.g();
    }

    public void b() {
        int i = this.j;
        this.m = i;
        this.a.a(i).c();
    }

    public boolean c() {
        return this.m < this.j;
    }

    public boolean d() {
        return this.i.b() - this.k > C3069s6.a;
    }

    public long a() {
        return this.l;
    }
}
