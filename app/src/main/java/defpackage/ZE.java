package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ZE {
    public final /* synthetic */ int a = 0;
    public final long b;
    public final long c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public ZE(C3386dP1 c3386dP1, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        C6029nB1 c6029nB1;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.d = str2;
        this.e = str3;
        this.f = TextUtils.isEmpty(str) ? null : str;
        this.b = j;
        this.c = j2;
        if (j2 != 0 && j2 > j) {
            OL1 ol1 = c3386dP1.i;
            C3386dP1.e(ol1);
            ol1.j.c(OL1.B1(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            c6029nB1 = new C6029nB1(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    OL1 ol12 = c3386dP1.i;
                    C3386dP1.e(ol12);
                    ol12.g.d("Param name can't be null");
                    it.remove();
                } else {
                    C5910mZ1 c5910mZ1 = c3386dP1.l;
                    C3386dP1.b(c5910mZ1);
                    Object objP2 = c5910mZ1.p2(bundle2.get(next), next);
                    if (objP2 == null) {
                        OL1 ol13 = c3386dP1.i;
                        C3386dP1.e(ol13);
                        ol13.j.c(c3386dP1.m.f(next), "Param value can't be null");
                        it.remove();
                    } else {
                        C5910mZ1 c5910mZ12 = c3386dP1.l;
                        C3386dP1.b(c5910mZ12);
                        c5910mZ12.P1(next, bundle2, objP2);
                    }
                }
            }
            c6029nB1 = new C6029nB1(bundle2);
        }
        this.g = c6029nB1;
    }

    public ZE a(long j, AbstractC6458pR0 abstractC6458pR0) throws C2562ch {
        long jI;
        InterfaceC8127yC interfaceC8127yCC = ((AbstractC6458pR0) this.e).c();
        InterfaceC8127yC interfaceC8127yCC2 = abstractC6458pR0.c();
        if (interfaceC8127yCC == null) {
            return new ZE(j, abstractC6458pR0, (C0896Lg) this.f, (C4019gk) this.d, this.c, interfaceC8127yCC);
        }
        if (!interfaceC8127yCC.P()) {
            return new ZE(j, abstractC6458pR0, (C0896Lg) this.f, (C4019gk) this.d, this.c, interfaceC8127yCC2);
        }
        long jW = interfaceC8127yCC.W(j);
        if (jW == 0) {
            return new ZE(j, abstractC6458pR0, (C0896Lg) this.f, (C4019gk) this.d, this.c, interfaceC8127yCC2);
        }
        YN1.h(interfaceC8127yCC2);
        long jR = interfaceC8127yCC.R();
        long jA = interfaceC8127yCC.a(jR);
        long jI2 = jW + jR;
        long j2 = jI2 - 1;
        long jE = interfaceC8127yCC.e(j2, j) + interfaceC8127yCC.a(j2);
        long jR2 = interfaceC8127yCC2.R();
        long jA2 = interfaceC8127yCC2.a(jR2);
        long j3 = this.c;
        if (jE == jA2) {
            jI = (jI2 - jR2) + j3;
        } else {
            if (jE < jA2) {
                throw new C2562ch();
            }
            if (jA2 < jA) {
                jI = j3 - (interfaceC8127yCC2.I(jA, j) - jR);
            } else {
                jI2 = interfaceC8127yCC.I(jA2, j);
                jI = (jI2 - jR2) + j3;
            }
        }
        return new ZE(j, abstractC6458pR0, (C0896Lg) this.f, (C4019gk) this.d, jI, interfaceC8127yCC2);
    }

    public long b(long j) {
        InterfaceC8127yC interfaceC8127yC = (InterfaceC8127yC) this.g;
        YN1.h(interfaceC8127yC);
        return interfaceC8127yC.g(this.b, j) + this.c;
    }

    public long c(long j) {
        long jB = b(j);
        InterfaceC8127yC interfaceC8127yC = (InterfaceC8127yC) this.g;
        YN1.h(interfaceC8127yC);
        return (interfaceC8127yC.X(this.b, j) + jB) - 1;
    }

    public long d() {
        InterfaceC8127yC interfaceC8127yC = (InterfaceC8127yC) this.g;
        YN1.h(interfaceC8127yC);
        return interfaceC8127yC.W(this.b);
    }

    public long e(long j) {
        long jF = f(j);
        InterfaceC8127yC interfaceC8127yC = (InterfaceC8127yC) this.g;
        YN1.h(interfaceC8127yC);
        return interfaceC8127yC.e(j - this.c, this.b) + jF;
    }

    public long f(long j) {
        InterfaceC8127yC interfaceC8127yC = (InterfaceC8127yC) this.g;
        YN1.h(interfaceC8127yC);
        return interfaceC8127yC.a(j - this.c);
    }

    public boolean g(long j, long j2) {
        InterfaceC8127yC interfaceC8127yC = (InterfaceC8127yC) this.g;
        YN1.h(interfaceC8127yC);
        return interfaceC8127yC.P() || j2 == -9223372036854775807L || e(j) <= j2;
    }

    public ZE h(C3386dP1 c3386dP1, long j) {
        return new ZE(c3386dP1, (String) this.f, (String) this.d, (String) this.e, this.b, j, (C6029nB1) this.g);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "Event{appId='" + ((String) this.d) + "', name='" + ((String) this.e) + "', params=" + String.valueOf((C6029nB1) this.g) + "}";
            default:
                return super.toString();
        }
    }

    public ZE(C3386dP1 c3386dP1, String str, String str2, String str3, long j, long j2, C6029nB1 c6029nB1) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(c6029nB1);
        this.d = str2;
        this.e = str3;
        this.f = TextUtils.isEmpty(str) ? null : str;
        this.b = j;
        this.c = j2;
        if (j2 != 0 && j2 > j) {
            OL1 ol1 = c3386dP1.i;
            C3386dP1.e(ol1);
            ol1.j.b(OL1.B1(str2), OL1.B1(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.g = c6029nB1;
    }

    public ZE(long j, AbstractC6458pR0 abstractC6458pR0, C0896Lg c0896Lg, C4019gk c4019gk, long j2, InterfaceC8127yC interfaceC8127yC) {
        this.b = j;
        this.e = abstractC6458pR0;
        this.f = c0896Lg;
        this.c = j2;
        this.d = c4019gk;
        this.g = interfaceC8127yC;
    }
}
