package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.AbstractC3523ph;
import com.yandex.metrica.impl.p022ob.C3662v0;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.U1 */
/* loaded from: classes2.dex */
public abstract class AbstractC2967U1<T extends AbstractC3523ph> extends AbstractC3042X1<T, C3662v0.a> {

    /* renamed from: o */
    private final C3321hn f22431o;

    /* renamed from: p */
    private final C3684vm f22432p;

    /* renamed from: q */
    private final InterfaceC2839Om f22433q;

    public AbstractC2967U1(T t) {
        this(new C3610t0(), new C3321hn(), new C3684vm(), new C2814Nm(), t);
    }

    /* renamed from: C */
    public abstract void mo14536C();

    /* renamed from: D */
    public abstract void mo14537D();

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: a */
    public void mo15147a(byte[] bArr) {
        super.mo15147a(bArr);
    }

    /* renamed from: c */
    public boolean m15226c(byte[] bArr) throws Throwable {
        byte[] bArrM16057a;
        try {
            this.f22432p.getClass();
            byte[] bArrM15299b = C2991V0.m15299b(bArr);
            if (bArrM15299b == null || (bArrM16057a = this.f22431o.m16057a(bArrM15299b)) == null) {
                return false;
            }
            super.mo15147a(bArrM16057a);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: p */
    public boolean mo15160p() {
        boolean zMo15160p = super.mo15160p();
        m15143a(this.f22433q.mo14674a());
        return zMo15160p;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: r */
    public boolean mo14463r() {
        C3662v0.a aVarM15409B = m15409B();
        boolean z = aVarM15409B != null && "accepted".equals(aVarM15409B.f24972a);
        if (z) {
            mo14536C();
        } else if (m15158m()) {
            mo14537D();
        }
        return z;
    }

    public AbstractC2967U1(InterfaceC2917S1 interfaceC2917S1, C3321hn c3321hn, C3684vm c3684vm, InterfaceC2839Om interfaceC2839Om, T t) {
        super(interfaceC2917S1, t);
        this.f22431o = c3321hn;
        this.f22432p = c3684vm;
        this.f22433q = interfaceC2839Om;
        t.m16589a(c3321hn);
    }
}
