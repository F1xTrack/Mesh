package p000;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class I60 implements InterfaceC7059wB {

    /* renamed from: a */
    public final ArrayList f4698a;

    public I60(int i) {
        switch (i) {
            case 1:
                this.f4698a = new ArrayList();
                break;
            default:
                this.f4698a = new ArrayList();
                break;
        }
    }

    @Override // p000.InterfaceC7059wB
    /* renamed from: a */
    public long mo3744a(long j) {
        ArrayList arrayList = this.f4698a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((C7122xB) arrayList.get(0)).f45433b) {
            return ((C7122xB) arrayList.get(0)).f45433b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            C7122xB c7122xB = (C7122xB) arrayList.get(i);
            if (j < c7122xB.f45433b) {
                long j2 = ((C7122xB) arrayList.get(i - 1)).f45435d;
                long j3 = c7122xB.f45433b;
                return (j2 == -9223372036854775807L || j2 <= j || j2 >= j3) ? j3 : j2;
            }
        }
        long j4 = ((C7122xB) AbstractC11239u22.m25079b(arrayList)).f45435d;
        if (j4 == -9223372036854775807L || j >= j4) {
            return Long.MIN_VALUE;
        }
        return j4;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    @Override // p000.InterfaceC7059wB
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo3745b(p000.C7122xB r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.f45433b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto Lf
            r4 = r6
            goto L10
        Lf:
            r4 = r5
        L10:
            p000.YN1.m9278c(r4)
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 > 0) goto L23
            long r7 = r10.f45435d
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 >= 0) goto L23
        L21:
            r2 = r6
            goto L24
        L23:
            r2 = r5
        L24:
            java.util.ArrayList r3 = r9.f4698a
            int r4 = r3.size()
            int r4 = r4 - r6
        L2b:
            if (r4 < 0) goto L4e
            java.lang.Object r7 = r3.get(r4)
            xB r7 = (p000.C7122xB) r7
            long r7 = r7.f45433b
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 < 0) goto L3e
            int r4 = r4 + r6
            r3.add(r4, r10)
            return r2
        L3e:
            java.lang.Object r7 = r3.get(r4)
            xB r7 = (p000.C7122xB) r7
            long r7 = r7.f45433b
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 > 0) goto L4b
            r2 = r5
        L4b:
            int r4 = r4 + (-1)
            goto L2b
        L4e:
            r3.add(r5, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.I60.mo3745b(xB, long):boolean");
    }

    @Override // p000.InterfaceC7059wB
    /* renamed from: c */
    public P70 mo3746c(long j) {
        int iM3749f = m3749f(j);
        if (iM3749f == 0) {
            N70 n70 = P70.f8867b;
            return C9367fQ0.f27184e;
        }
        C7122xB c7122xB = (C7122xB) this.f4698a.get(iM3749f - 1);
        long j2 = c7122xB.f45435d;
        if (j2 == -9223372036854775807L || j < j2) {
            return c7122xB.f45432a;
        }
        N70 n702 = P70.f8867b;
        return C9367fQ0.f27184e;
    }

    @Override // p000.InterfaceC7059wB
    public void clear() {
        this.f4698a.clear();
    }

    @Override // p000.InterfaceC7059wB
    /* renamed from: d */
    public long mo3747d(long j) {
        ArrayList arrayList = this.f4698a;
        if (arrayList.isEmpty() || j < ((C7122xB) arrayList.get(0)).f45433b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((C7122xB) arrayList.get(i)).f45433b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                C7122xB c7122xB = (C7122xB) arrayList.get(i - 1);
                long j3 = c7122xB.f45435d;
                return (j3 == -9223372036854775807L || j3 > j) ? c7122xB.f45433b : j3;
            }
        }
        C7122xB c7122xB2 = (C7122xB) AbstractC11239u22.m25079b(arrayList);
        long j4 = c7122xB2.f45435d;
        return (j4 == -9223372036854775807L || j < j4) ? c7122xB2.f45433b : j4;
    }

    @Override // p000.InterfaceC7059wB
    /* renamed from: e */
    public void mo3748e(long j) {
        int iM3749f = m3749f(j);
        if (iM3749f > 0) {
            this.f4698a.subList(0, iM3749f).clear();
        }
    }

    /* renamed from: f */
    public int m3749f(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4698a;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            if (j < ((C7122xB) arrayList.get(i)).f45433b) {
                return i;
            }
            i++;
        }
    }
}
