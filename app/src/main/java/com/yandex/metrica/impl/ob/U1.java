package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.AbstractC3006ph;
import com.yandex.metrica.impl.ob.C3138v0;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class U1<T extends AbstractC3006ph> extends X1<T, C3138v0.a> {
    private final C2813hn o;
    private final C3165vm p;
    private final Om q;

    public U1(T t) {
        this(new C3088t0(), new C2813hn(), new C3165vm(), new Nm(), t);
    }

    public abstract void C();

    public abstract void D();

    @Override // com.yandex.metrica.impl.ob.T1
    public void a(byte[] bArr) {
        super.a(bArr);
    }

    public boolean c(byte[] bArr) throws Throwable {
        byte[] bArrA;
        try {
            this.p.getClass();
            byte[] bArrB = V0.b(bArr);
            if (bArrB == null || (bArrA = this.o.a(bArrB)) == null) {
                return false;
            }
            super.a(bArrA);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public boolean p() {
        boolean zP = super.p();
        a(this.q.a());
        return zP;
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public boolean r() {
        C3138v0.a aVarB = B();
        boolean z = aVarB != null && "accepted".equals(aVarB.a);
        if (z) {
            C();
        } else if (m()) {
            D();
        }
        return z;
    }

    public U1(S1 s1, C2813hn c2813hn, C3165vm c3165vm, Om om, T t) {
        super(s1, t);
        this.o = c2813hn;
        this.p = c3165vm;
        this.q = om;
        t.a(c2813hn);
    }
}
