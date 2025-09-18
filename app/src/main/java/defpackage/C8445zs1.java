package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: zs1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8445zs1 implements InterfaceC0619Hr1 {
    public final C1080Np1 a;
    public final C0541Gr1 b;
    public final C3672ev1 c;
    public final C5829m81 d;
    public final long e;

    public C8445zs1(C1080Np1 c1080Np1, C0541Gr1 c0541Gr1, C3672ev1 c3672ev1, C5829m81 c5829m81, long j) {
        O90.f(c1080Np1, "timeRepository");
        O90.f(c0541Gr1, "networkConfigRepository");
        O90.f(c3672ev1, "persistableConfigRepository");
        O90.f(c5829m81, "minAvailableUpdateIntervalRepository");
        this.a = c1080Np1;
        this.b = c0541Gr1;
        this.c = c3672ev1;
        this.d = c5829m81;
        this.e = j;
    }

    public final void a(C0313Dt1 c0313Dt1) throws Throwable {
        C6140nm1 c6140nm1;
        C1515Te1 c1515Te1;
        C0541Gr1 c0541Gr1 = this.b;
        if (c0313Dt1 != null) {
            c0541Gr1.c.getClass();
            c6140nm1 = new C6140nm1(c0313Dt1.b, c0313Dt1.c, c0313Dt1.d);
        } else {
            c6140nm1 = null;
        }
        A12 a12A = c0541Gr1.a.a(c6140nm1);
        if (a12A instanceof C4048gt1) {
            C8059xq1 c8059xq1 = c0541Gr1.b;
            C6140nm1 c6140nm12 = ((C4048gt1) a12A).a;
            c8059xq1.getClass();
            O90.f(c6140nm12, "dto");
            c1515Te1 = new C1515Te1(c6140nm12.a, c6140nm12.b, c6140nm12.c);
        } else {
            if (!(a12A instanceof C5206it1)) {
                throw new C7074sg();
            }
            C8059xq1 c8059xq12 = c0541Gr1.b;
            C6140nm1 c6140nm13 = ((C5206it1) a12A).a;
            c8059xq12.getClass();
            O90.f(c6140nm13, "dto");
            c1515Te1 = new C1515Te1(c6140nm13.a, c6140nm13.b, c6140nm13.c);
        }
        C3478du1 c3478du1 = this.c.a;
        synchronized (c3478du1) {
            try {
                C1442Sg0 c1442Sg0 = c3478du1.a;
                Set setG0 = AbstractC8069xu.g0(c1442Sg0.a());
                List listA = c1442Sg0.a();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listA) {
                    if (setG0.contains((C0369Em0) obj)) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C0369Em0) it.next()).a.delete();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C3672ev1 c3672ev1 = this.c;
        Map map = c1515Te1.a;
        C7315tw1 c7315tw1 = c1515Te1.b;
        String str = c1515Te1.c;
        c3672ev1.getClass();
        O90.f(map, "data");
        O90.f(c7315tw1, "configMetadata");
        O90.f(str, "shortSegments");
        c3672ev1.b.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        c3672ev1.d.getClass();
        c3672ev1.c.getClass();
        c3672ev1.a.b(new C7691vu1(jCurrentTimeMillis, map, c7315tw1, str));
    }

    public final boolean b(long j) {
        C6251oM c6251oM = new C6251oM(this.e);
        this.d.a.getClass();
        EnumC6823rM enumC6823rM = EnumC6823rM.d;
        C6251oM c6251oM2 = new C6251oM(AbstractC3689f02.d(900, enumC6823rM));
        if (c6251oM.compareTo(c6251oM2) < 0) {
            c6251oM = c6251oM2;
        }
        long jD = C6251oM.d(c6251oM.a, enumC6823rM);
        this.a.a.getClass();
        return (System.currentTimeMillis() / ((long) 1000)) - j > jD;
    }

    @Override // defpackage.InterfaceC0619Hr1
    public final int invoke() {
        C0313Dt1 c0313Dt1;
        int i;
        synchronized (this) {
            try {
                C3672ev1 c3672ev1 = this.c;
                C7691vu1 c7691vu1A = c3672ev1.a.a();
                if (c7691vu1A != null) {
                    c3672ev1.c.getClass();
                    c0313Dt1 = new C0313Dt1(c7691vu1A.a, c7691vu1A.b, c7691vu1A.c, c7691vu1A.d);
                } else {
                    c0313Dt1 = null;
                }
                i = c0313Dt1 == null ? 2 : b(c0313Dt1.a) ? 3 : 1;
                if (i != 1) {
                    a(c0313Dt1);
                }
            } finally {
            }
        }
        return i;
    }
}
