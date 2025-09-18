package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.yandex.metrica.impl.p022ob.AbstractC2942T1;

/* renamed from: com.yandex.metrica.impl.ob.Ld */
/* loaded from: classes2.dex */
public class C2755Ld extends AbstractC2967U1<C3497oh> {

    /* renamed from: r */
    private C2855Pd f21630r;

    /* renamed from: s */
    private final C2769M2 f21631s;

    /* renamed from: t */
    private final C2978Uc f21632t;

    /* renamed from: u */
    private final C2650H8 f21633u;

    /* renamed from: v */
    private final C2805Nd f21634v;

    /* renamed from: w */
    private final InterfaceC3467nd f21635w;

    /* renamed from: x */
    private long f21636x;

    /* renamed from: y */
    private C2780Md f21637y;

    public C2755Ld(Context context, C2855Pd c2855Pd, C2769M2 c2769m2, InterfaceC3467nd interfaceC3467nd, C2650H8 c2650h8, C3497oh c3497oh, C2805Nd c2805Nd) {
        super(c3497oh);
        this.f21630r = c2855Pd;
        this.f21631s = c2769m2;
        this.f21635w = interfaceC3467nd;
        this.f21632t = c2855Pd.m14783A();
        this.f21633u = c2650h8;
        this.f21634v = c2805Nd;
        m14534F();
        m15146a(this.f21630r.m14784B());
    }

    /* renamed from: E */
    private boolean m14533E() {
        C2780Md c2780MdM14644a = this.f21634v.m14644a(this.f21632t.f22442d);
        this.f21637y = c2780MdM14644a;
        C2981Uf c2981Uf = c2780MdM14644a.f21735c;
        if (c2981Uf.f22457c.length == 0 && c2981Uf.f22456b.length == 0) {
            return false;
        }
        return m15226c(AbstractC3219e.m15809a(c2981Uf));
    }

    /* renamed from: F */
    private void m14534F() {
        long jM14243f = this.f21633u.m14243f() + 1;
        this.f21636x = jM14243f;
        ((C3497oh) this.f22346j).m16544a(jM14243f);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: A */
    public boolean mo14535A() {
        return super.mo14535A() & (!m15158m());
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2967U1
    /* renamed from: C */
    public void mo14536C() {
        this.f21634v.m14645a(this.f21637y);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2967U1
    /* renamed from: D */
    public void mo14537D() {
        this.f21634v.m14645a(this.f21637y);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: a */
    public void mo14458a(Uri.Builder builder) {
        ((C3497oh) this.f22346j).m16545a(builder, this.f21630r);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: b */
    public void mo14460b(Throwable th) {
        this.f21633u.m14234a(this.f21636x);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: j */
    public C2535Ci mo14461j() {
        return this.f21630r.m15794r();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: o */
    public boolean mo14462o() {
        if (this.f21631s.m14597d() || TextUtils.isEmpty(this.f21630r.m15783g()) || TextUtils.isEmpty(this.f21630r.m15800x()) || C2968U2.m15249b(m15149c())) {
            return false;
        }
        return m14533E();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2967U1, com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: r */
    public boolean mo14463r() {
        boolean zMo14463r = super.mo14463r();
        this.f21633u.m14234a(this.f21636x);
        return zMo14463r;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: t */
    public void mo14465t() {
        this.f21635w.mo13856a();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: b */
    public AbstractC2942T1.a mo14459b() {
        return AbstractC2942T1.a.LOCATION;
    }
}
