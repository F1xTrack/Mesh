package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.yandex.metrica.impl.ob.T1;

/* loaded from: classes2.dex */
public class Ld extends U1<C2981oh> {
    private Pd r;
    private final M2 s;
    private final Uc t;
    private final H8 u;
    private final Nd v;
    private final InterfaceC2952nd w;
    private long x;
    private Md y;

    public Ld(Context context, Pd pd, M2 m2, InterfaceC2952nd interfaceC2952nd, H8 h8, C2981oh c2981oh, Nd nd) {
        super(c2981oh);
        this.r = pd;
        this.s = m2;
        this.w = interfaceC2952nd;
        this.t = pd.A();
        this.u = h8;
        this.v = nd;
        F();
        a(this.r.B());
    }

    private boolean E() {
        Md mdA = this.v.a(this.t.d);
        this.y = mdA;
        Uf uf = mdA.c;
        if (uf.c.length == 0 && uf.b.length == 0) {
            return false;
        }
        return c(AbstractC2714e.a(uf));
    }

    private void F() {
        long jF = this.u.f() + 1;
        this.x = jF;
        ((C2981oh) this.j).a(jF);
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public boolean A() {
        return super.A() & (!m());
    }

    @Override // com.yandex.metrica.impl.ob.U1
    public void C() {
        this.v.a(this.y);
    }

    @Override // com.yandex.metrica.impl.ob.U1
    public void D() {
        this.v.a(this.y);
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public void a(Uri.Builder builder) {
        ((C2981oh) this.j).a(builder, this.r);
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public void b(Throwable th) {
        this.u.a(this.x);
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public Ci j() {
        return this.r.r();
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public boolean o() {
        if (this.s.d() || TextUtils.isEmpty(this.r.g()) || TextUtils.isEmpty(this.r.x()) || U2.b(c())) {
            return false;
        }
        return E();
    }

    @Override // com.yandex.metrica.impl.ob.U1, com.yandex.metrica.impl.ob.T1
    public boolean r() {
        boolean zR = super.r();
        this.u.a(this.x);
        return zR;
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public void t() {
        this.w.a();
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public T1.a b() {
        return T1.a.LOCATION;
    }
}
