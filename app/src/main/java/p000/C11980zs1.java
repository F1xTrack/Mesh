package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: zs1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11980zs1 implements InterfaceC7713Hr1 {

    /* renamed from: a */
    public final C8021Np1 f47066a;

    /* renamed from: b */
    public final C7661Gr1 f47067b;

    /* renamed from: c */
    public final C9302ev1 f47068c;

    /* renamed from: d */
    public final C10228m81 f47069d;

    /* renamed from: e */
    public final long f47070e;

    public C11980zs1(C8021Np1 c8021Np1, C7661Gr1 c7661Gr1, C9302ev1 c9302ev1, C10228m81 c10228m81, long j) {
        O90.m5968f(c8021Np1, "timeRepository");
        O90.m5968f(c7661Gr1, "networkConfigRepository");
        O90.m5968f(c9302ev1, "persistableConfigRepository");
        O90.m5968f(c10228m81, "minAvailableUpdateIntervalRepository");
        this.f47066a = c8021Np1;
        this.f47067b = c7661Gr1;
        this.f47068c = c9302ev1;
        this.f47069d = c10228m81;
        this.f47070e = j;
    }

    /* renamed from: a */
    public final void m26563a(C7509Dt1 c7509Dt1) throws Throwable {
        C10436nm1 c10436nm1;
        C8311Te1 c8311Te1;
        C7661Gr1 c7661Gr1 = this.f47067b;
        if (c7509Dt1 != null) {
            c7661Gr1.f3932c.getClass();
            c10436nm1 = new C10436nm1(c7509Dt1.f2290b, c7509Dt1.f2291c, c7509Dt1.f2292d);
        } else {
            c10436nm1 = null;
        }
        A12 a12M4390a = c7661Gr1.f3930a.m4390a(c10436nm1);
        if (a12M4390a instanceof C9554gt1) {
            C11722xq1 c11722xq1 = c7661Gr1.f3931b;
            C10436nm1 c10436nm12 = ((C9554gt1) a12M4390a).f28076a;
            c11722xq1.getClass();
            O90.m5968f(c10436nm12, "dto");
            c8311Te1 = new C8311Te1(c10436nm12.f38503a, c10436nm12.f38504b, c10436nm12.f38505c);
        } else {
            if (!(a12M4390a instanceof C9810it1)) {
                throw new C6838sg();
            }
            C11722xq1 c11722xq12 = c7661Gr1.f3931b;
            C10436nm1 c10436nm13 = ((C9810it1) a12M4390a).f34794a;
            c11722xq12.getClass();
            O90.m5968f(c10436nm13, "dto");
            c8311Te1 = new C8311Te1(c10436nm13.f38503a, c10436nm13.f38504b, c10436nm13.f38505c);
        }
        C9172du1 c9172du1 = this.f47068c.f26941a;
        synchronized (c9172du1) {
            try {
                C8262Sg0 c8262Sg0 = c9172du1.f26386a;
                Set setM25987g0 = AbstractC7167xu.m25987g0(c8262Sg0.m7417a());
                List listM7417a = c8262Sg0.m7417a();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listM7417a) {
                    if (setM25987g0.contains((C7546Em0) obj)) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C7546Em0) it.next()).f2897a.delete();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C9302ev1 c9302ev1 = this.f47068c;
        Map map = c8311Te1.f11458a;
        C11224tw1 c11224tw1 = c8311Te1.f11459b;
        String str = c8311Te1.f11460c;
        c9302ev1.getClass();
        O90.m5968f(map, "data");
        O90.m5968f(c11224tw1, "configMetadata");
        O90.m5968f(str, "shortSegments");
        c9302ev1.f26942b.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        c9302ev1.f26944d.getClass();
        c9302ev1.f26943c.getClass();
        c9302ev1.f26941a.m17775b(new C11476vu1(jCurrentTimeMillis, map, c11224tw1, str));
    }

    /* renamed from: b */
    public final boolean m26564b(long j) {
        C6547oM c6547oM = new C6547oM(this.f47070e);
        this.f47069d.f37524a.getClass();
        EnumC6738rM enumC6738rM = EnumC6738rM.f41611d;
        C6547oM c6547oM2 = new C6547oM(AbstractC9313f02.m18151d(900, enumC6738rM));
        if (c6547oM.compareTo(c6547oM2) < 0) {
            c6547oM = c6547oM2;
        }
        long jM23371d = C6547oM.m23371d(c6547oM.f38967a, enumC6738rM);
        this.f47066a.f8023a.getClass();
        return (System.currentTimeMillis() / ((long) 1000)) - j > jM23371d;
    }

    @Override // p000.InterfaceC7713Hr1
    public final int invoke() {
        C7509Dt1 c7509Dt1;
        int i;
        synchronized (this) {
            try {
                C9302ev1 c9302ev1 = this.f47068c;
                C11476vu1 c11476vu1M17774a = c9302ev1.f26941a.m17774a();
                if (c11476vu1M17774a != null) {
                    c9302ev1.f26943c.getClass();
                    c7509Dt1 = new C7509Dt1(c11476vu1M17774a.f44597a, c11476vu1M17774a.f44598b, c11476vu1M17774a.f44599c, c11476vu1M17774a.f44600d);
                } else {
                    c7509Dt1 = null;
                }
                i = c7509Dt1 == null ? 2 : m26564b(c7509Dt1.f2289a) ? 3 : 1;
                if (i != 1) {
                    m26563a(c7509Dt1);
                }
            } finally {
            }
        }
        return i;
    }
}
