package p000;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* renamed from: ZE */
/* loaded from: classes.dex */
public final class C1588ZE {

    /* renamed from: a */
    public final /* synthetic */ int f14804a = 0;

    /* renamed from: b */
    public final long f14805b;

    /* renamed from: c */
    public final long f14806c;

    /* renamed from: d */
    public final Object f14807d;

    /* renamed from: e */
    public final Object f14808e;

    /* renamed from: f */
    public final Object f14809f;

    /* renamed from: g */
    public final Object f14810g;

    public C1588ZE(C9110dP1 c9110dP1, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        C10362nB1 c10362nB1;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.f14807d = str2;
        this.f14808e = str3;
        this.f14809f = TextUtils.isEmpty(str) ? null : str;
        this.f14805b = j;
        this.f14806c = j2;
        if (j2 != 0 && j2 > j) {
            OL1 ol1 = c9110dP1.f26039i;
            C9110dP1.m17592e(ol1);
            ol1.f8381j.m24554c(OL1.m6026B1(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            c10362nB1 = new C10362nB1(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    OL1 ol12 = c9110dP1.f26039i;
                    C9110dP1.m17592e(ol12);
                    ol12.f8378g.m24555d("Param name can't be null");
                    it.remove();
                } else {
                    C10282mZ1 c10282mZ1 = c9110dP1.f26042l;
                    C9110dP1.m17589b(c10282mZ1);
                    Object objM22892p2 = c10282mZ1.m22892p2(bundle2.get(next), next);
                    if (objM22892p2 == null) {
                        OL1 ol13 = c9110dP1.f26039i;
                        C9110dP1.m17592e(ol13);
                        ol13.f8381j.m24554c(c9110dP1.f26043m.m2166f(next), "Param value can't be null");
                        it.remove();
                    } else {
                        C10282mZ1 c10282mZ12 = c9110dP1.f26042l;
                        C9110dP1.m17589b(c10282mZ12);
                        c10282mZ12.m22875P1(next, bundle2, objM22892p2);
                    }
                }
            }
            c10362nB1 = new C10362nB1(bundle2);
        }
        this.f14810g = c10362nB1;
    }

    /* renamed from: a */
    public C1588ZE m9509a(long j, AbstractC10649pR0 abstractC10649pR0) throws C1863ch {
        long jMo3612I;
        InterfaceC7186yC interfaceC7186yCMo23139c = ((AbstractC10649pR0) this.f14808e).mo23139c();
        InterfaceC7186yC interfaceC7186yCMo23139c2 = abstractC10649pR0.mo23139c();
        if (interfaceC7186yCMo23139c == null) {
            return new C1588ZE(j, abstractC10649pR0, (C0735Lg) this.f14809f, (C4135gk) this.f14807d, this.f14806c, interfaceC7186yCMo23139c);
        }
        if (!interfaceC7186yCMo23139c.mo3613P()) {
            return new C1588ZE(j, abstractC10649pR0, (C0735Lg) this.f14809f, (C4135gk) this.f14807d, this.f14806c, interfaceC7186yCMo23139c2);
        }
        long jMo3615W = interfaceC7186yCMo23139c.mo3615W(j);
        if (jMo3615W == 0) {
            return new C1588ZE(j, abstractC10649pR0, (C0735Lg) this.f14809f, (C4135gk) this.f14807d, this.f14806c, interfaceC7186yCMo23139c2);
        }
        YN1.m9283h(interfaceC7186yCMo23139c2);
        long jMo3614R = interfaceC7186yCMo23139c.mo3614R();
        long jMo3617a = interfaceC7186yCMo23139c.mo3617a(jMo3614R);
        long jMo3612I2 = jMo3615W + jMo3614R;
        long j2 = jMo3612I2 - 1;
        long jMo3619e = interfaceC7186yCMo23139c.mo3619e(j2, j) + interfaceC7186yCMo23139c.mo3617a(j2);
        long jMo3614R2 = interfaceC7186yCMo23139c2.mo3614R();
        long jMo3617a2 = interfaceC7186yCMo23139c2.mo3617a(jMo3614R2);
        long j3 = this.f14806c;
        if (jMo3619e == jMo3617a2) {
            jMo3612I = (jMo3612I2 - jMo3614R2) + j3;
        } else {
            if (jMo3619e < jMo3617a2) {
                throw new C1863ch();
            }
            if (jMo3617a2 < jMo3617a) {
                jMo3612I = j3 - (interfaceC7186yCMo23139c2.mo3612I(jMo3617a, j) - jMo3614R);
            } else {
                jMo3612I2 = interfaceC7186yCMo23139c.mo3612I(jMo3617a2, j);
                jMo3612I = (jMo3612I2 - jMo3614R2) + j3;
            }
        }
        return new C1588ZE(j, abstractC10649pR0, (C0735Lg) this.f14809f, (C4135gk) this.f14807d, jMo3612I, interfaceC7186yCMo23139c2);
    }

    /* renamed from: b */
    public long m9510b(long j) {
        InterfaceC7186yC interfaceC7186yC = (InterfaceC7186yC) this.f14810g;
        YN1.m9283h(interfaceC7186yC);
        return interfaceC7186yC.mo3621g(this.f14805b, j) + this.f14806c;
    }

    /* renamed from: c */
    public long m9511c(long j) {
        long jM9510b = m9510b(j);
        InterfaceC7186yC interfaceC7186yC = (InterfaceC7186yC) this.f14810g;
        YN1.m9283h(interfaceC7186yC);
        return (interfaceC7186yC.mo3616X(this.f14805b, j) + jM9510b) - 1;
    }

    /* renamed from: d */
    public long m9512d() {
        InterfaceC7186yC interfaceC7186yC = (InterfaceC7186yC) this.f14810g;
        YN1.m9283h(interfaceC7186yC);
        return interfaceC7186yC.mo3615W(this.f14805b);
    }

    /* renamed from: e */
    public long m9513e(long j) {
        long jM9514f = m9514f(j);
        InterfaceC7186yC interfaceC7186yC = (InterfaceC7186yC) this.f14810g;
        YN1.m9283h(interfaceC7186yC);
        return interfaceC7186yC.mo3619e(j - this.f14806c, this.f14805b) + jM9514f;
    }

    /* renamed from: f */
    public long m9514f(long j) {
        InterfaceC7186yC interfaceC7186yC = (InterfaceC7186yC) this.f14810g;
        YN1.m9283h(interfaceC7186yC);
        return interfaceC7186yC.mo3617a(j - this.f14806c);
    }

    /* renamed from: g */
    public boolean m9515g(long j, long j2) {
        InterfaceC7186yC interfaceC7186yC = (InterfaceC7186yC) this.f14810g;
        YN1.m9283h(interfaceC7186yC);
        return interfaceC7186yC.mo3613P() || j2 == -9223372036854775807L || m9513e(j) <= j2;
    }

    /* renamed from: h */
    public C1588ZE m9516h(C9110dP1 c9110dP1, long j) {
        return new C1588ZE(c9110dP1, (String) this.f14809f, (String) this.f14807d, (String) this.f14808e, this.f14805b, j, (C10362nB1) this.f14810g);
    }

    public String toString() {
        switch (this.f14804a) {
            case 1:
                return "Event{appId='" + ((String) this.f14807d) + "', name='" + ((String) this.f14808e) + "', params=" + String.valueOf((C10362nB1) this.f14810g) + "}";
            default:
                return super.toString();
        }
    }

    public C1588ZE(C9110dP1 c9110dP1, String str, String str2, String str3, long j, long j2, C10362nB1 c10362nB1) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(c10362nB1);
        this.f14807d = str2;
        this.f14808e = str3;
        this.f14809f = TextUtils.isEmpty(str) ? null : str;
        this.f14805b = j;
        this.f14806c = j2;
        if (j2 != 0 && j2 > j) {
            OL1 ol1 = c9110dP1.f26039i;
            C9110dP1.m17592e(ol1);
            ol1.f8381j.m24553b(OL1.m6026B1(str2), OL1.m6026B1(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.f14810g = c10362nB1;
    }

    public C1588ZE(long j, AbstractC10649pR0 abstractC10649pR0, C0735Lg c0735Lg, C4135gk c4135gk, long j2, InterfaceC7186yC interfaceC7186yC) {
        this.f14805b = j;
        this.f14808e = abstractC10649pR0;
        this.f14809f = c0735Lg;
        this.f14806c = j2;
        this.f14807d = c4135gk;
        this.f14810g = interfaceC7186yC;
    }
}
