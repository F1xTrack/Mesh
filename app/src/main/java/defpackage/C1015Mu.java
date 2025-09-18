package defpackage;

import java.io.Serializable;
import kotlin.jvm.functions.Function2;

/* renamed from: Mu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1015Mu implements InterfaceC0173Bz, Serializable {
    public final InterfaceC0173Bz a;
    public final InterfaceC8464zz b;

    public C1015Mu(InterfaceC8464zz interfaceC8464zz, InterfaceC0173Bz interfaceC0173Bz) {
        O90.f(interfaceC0173Bz, "left");
        O90.f(interfaceC8464zz, "element");
        this.a = interfaceC0173Bz;
        this.b = interfaceC8464zz;
    }

    @Override // defpackage.InterfaceC0173Bz
    public final InterfaceC0173Bz c(InterfaceC0095Az interfaceC0095Az) {
        O90.f(interfaceC0095Az, "key");
        InterfaceC8464zz interfaceC8464zz = this.b;
        InterfaceC8464zz interfaceC8464zzG = interfaceC8464zz.g(interfaceC0095Az);
        InterfaceC0173Bz interfaceC0173Bz = this.a;
        if (interfaceC8464zzG != null) {
            return interfaceC0173Bz;
        }
        InterfaceC0173Bz interfaceC0173BzC = interfaceC0173Bz.c(interfaceC0095Az);
        return interfaceC0173BzC == interfaceC0173Bz ? this : interfaceC0173BzC == JN.a ? interfaceC8464zz : new C1015Mu(interfaceC8464zz, interfaceC0173BzC);
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this != obj) {
            if (!(obj instanceof C1015Mu)) {
                return false;
            }
            C1015Mu c1015Mu = (C1015Mu) obj;
            c1015Mu.getClass();
            int i = 2;
            C1015Mu c1015Mu2 = c1015Mu;
            int i2 = 2;
            while (true) {
                InterfaceC0173Bz interfaceC0173Bz = c1015Mu2.a;
                c1015Mu2 = interfaceC0173Bz instanceof C1015Mu ? (C1015Mu) interfaceC0173Bz : null;
                if (c1015Mu2 == null) {
                    break;
                }
                i2++;
            }
            C1015Mu c1015Mu3 = this;
            while (true) {
                InterfaceC0173Bz interfaceC0173Bz2 = c1015Mu3.a;
                c1015Mu3 = interfaceC0173Bz2 instanceof C1015Mu ? (C1015Mu) interfaceC0173Bz2 : null;
                if (c1015Mu3 == null) {
                    break;
                }
                i++;
            }
            if (i2 != i) {
                return false;
            }
            C1015Mu c1015Mu4 = this;
            while (true) {
                InterfaceC8464zz interfaceC8464zz = c1015Mu4.b;
                if (!O90.a(c1015Mu.g(interfaceC8464zz.getKey()), interfaceC8464zz)) {
                    zA = false;
                    break;
                }
                InterfaceC0173Bz interfaceC0173Bz3 = c1015Mu4.a;
                if (!(interfaceC0173Bz3 instanceof C1015Mu)) {
                    O90.d(interfaceC0173Bz3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    InterfaceC8464zz interfaceC8464zz2 = (InterfaceC8464zz) interfaceC0173Bz3;
                    zA = O90.a(c1015Mu.g(interfaceC8464zz2.getKey()), interfaceC8464zz2);
                    break;
                }
                c1015Mu4 = (C1015Mu) interfaceC0173Bz3;
            }
            if (!zA) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.InterfaceC0173Bz
    public final InterfaceC0173Bz f(InterfaceC0173Bz interfaceC0173Bz) {
        O90.f(interfaceC0173Bz, "context");
        return interfaceC0173Bz == JN.a ? this : (InterfaceC0173Bz) interfaceC0173Bz.j(this, C8087y.i);
    }

    @Override // defpackage.InterfaceC0173Bz
    public final InterfaceC8464zz g(InterfaceC0095Az interfaceC0095Az) {
        O90.f(interfaceC0095Az, "key");
        C1015Mu c1015Mu = this;
        while (true) {
            InterfaceC8464zz interfaceC8464zzG = c1015Mu.b.g(interfaceC0095Az);
            if (interfaceC8464zzG != null) {
                return interfaceC8464zzG;
            }
            InterfaceC0173Bz interfaceC0173Bz = c1015Mu.a;
            if (!(interfaceC0173Bz instanceof C1015Mu)) {
                return interfaceC0173Bz.g(interfaceC0095Az);
            }
            c1015Mu = (C1015Mu) interfaceC0173Bz;
        }
    }

    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode();
    }

    @Override // defpackage.InterfaceC0173Bz
    public final Object j(Object obj, Function2 function2) {
        return function2.invoke(this.a.j(obj, function2), this.b);
    }

    public final String toString() {
        return F91.v(new StringBuilder("["), (String) j("", C8087y.h), ']');
    }
}
