package p000;

import java.io.Serializable;
import kotlin.jvm.functions.Function2;

/* renamed from: Mu */
/* loaded from: classes2.dex */
public final class C0812Mu implements InterfaceC0125Bz, Serializable {

    /* renamed from: a */
    public final InterfaceC0125Bz f7386a;

    /* renamed from: b */
    public final InterfaceC7298zz f7387b;

    public C0812Mu(InterfaceC7298zz interfaceC7298zz, InterfaceC0125Bz interfaceC0125Bz) {
        O90.m5968f(interfaceC0125Bz, "left");
        O90.m5968f(interfaceC7298zz, "element");
        this.f7386a = interfaceC0125Bz;
        this.f7387b = interfaceC7298zz;
    }

    @Override // p000.InterfaceC0125Bz
    /* renamed from: c */
    public final InterfaceC0125Bz mo935c(InterfaceC0062Az interfaceC0062Az) {
        O90.m5968f(interfaceC0062Az, "key");
        InterfaceC7298zz interfaceC7298zz = this.f7387b;
        InterfaceC7298zz interfaceC7298zzMo937g = interfaceC7298zz.mo937g(interfaceC0062Az);
        InterfaceC0125Bz interfaceC0125Bz = this.f7386a;
        if (interfaceC7298zzMo937g != null) {
            return interfaceC0125Bz;
        }
        InterfaceC0125Bz interfaceC0125BzMo935c = interfaceC0125Bz.mo935c(interfaceC0062Az);
        return interfaceC0125BzMo935c == interfaceC0125Bz ? this : interfaceC0125BzMo935c == C0591JN.f5499a ? interfaceC7298zz : new C0812Mu(interfaceC7298zz, interfaceC0125BzMo935c);
    }

    public final boolean equals(Object obj) {
        boolean zM5963a;
        if (this != obj) {
            if (!(obj instanceof C0812Mu)) {
                return false;
            }
            C0812Mu c0812Mu = (C0812Mu) obj;
            c0812Mu.getClass();
            int i = 2;
            C0812Mu c0812Mu2 = c0812Mu;
            int i2 = 2;
            while (true) {
                InterfaceC0125Bz interfaceC0125Bz = c0812Mu2.f7386a;
                c0812Mu2 = interfaceC0125Bz instanceof C0812Mu ? (C0812Mu) interfaceC0125Bz : null;
                if (c0812Mu2 == null) {
                    break;
                }
                i2++;
            }
            C0812Mu c0812Mu3 = this;
            while (true) {
                InterfaceC0125Bz interfaceC0125Bz2 = c0812Mu3.f7386a;
                c0812Mu3 = interfaceC0125Bz2 instanceof C0812Mu ? (C0812Mu) interfaceC0125Bz2 : null;
                if (c0812Mu3 == null) {
                    break;
                }
                i++;
            }
            if (i2 != i) {
                return false;
            }
            C0812Mu c0812Mu4 = this;
            while (true) {
                InterfaceC7298zz interfaceC7298zz = c0812Mu4.f7387b;
                if (!O90.m5963a(c0812Mu.mo937g(interfaceC7298zz.getKey()), interfaceC7298zz)) {
                    zM5963a = false;
                    break;
                }
                InterfaceC0125Bz interfaceC0125Bz3 = c0812Mu4.f7386a;
                if (!(interfaceC0125Bz3 instanceof C0812Mu)) {
                    O90.m5966d(interfaceC0125Bz3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    InterfaceC7298zz interfaceC7298zz2 = (InterfaceC7298zz) interfaceC0125Bz3;
                    zM5963a = O90.m5963a(c0812Mu.mo937g(interfaceC7298zz2.getKey()), interfaceC7298zz2);
                    break;
                }
                c0812Mu4 = (C0812Mu) interfaceC0125Bz3;
            }
            if (!zM5963a) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.InterfaceC0125Bz
    /* renamed from: f */
    public final InterfaceC0125Bz mo936f(InterfaceC0125Bz interfaceC0125Bz) {
        O90.m5968f(interfaceC0125Bz, "context");
        return interfaceC0125Bz == C0591JN.f5499a ? this : (InterfaceC0125Bz) interfaceC0125Bz.mo938j(this, C7173y.f45979i);
    }

    @Override // p000.InterfaceC0125Bz
    /* renamed from: g */
    public final InterfaceC7298zz mo937g(InterfaceC0062Az interfaceC0062Az) {
        O90.m5968f(interfaceC0062Az, "key");
        C0812Mu c0812Mu = this;
        while (true) {
            InterfaceC7298zz interfaceC7298zzMo937g = c0812Mu.f7387b.mo937g(interfaceC0062Az);
            if (interfaceC7298zzMo937g != null) {
                return interfaceC7298zzMo937g;
            }
            InterfaceC0125Bz interfaceC0125Bz = c0812Mu.f7386a;
            if (!(interfaceC0125Bz instanceof C0812Mu)) {
                return interfaceC0125Bz.mo937g(interfaceC0062Az);
            }
            c0812Mu = (C0812Mu) interfaceC0125Bz;
        }
    }

    public final int hashCode() {
        return this.f7387b.hashCode() + this.f7386a.hashCode();
    }

    @Override // p000.InterfaceC0125Bz
    /* renamed from: j */
    public final Object mo938j(Object obj, Function2 function2) {
        return function2.invoke(this.f7386a.mo938j(obj, function2), this.f7387b);
    }

    public final String toString() {
        return F91.m2539v(new StringBuilder("["), (String) mo938j("", C7173y.f45978h), ']');
    }
}
