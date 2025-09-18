package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class I60 implements InterfaceC7744wB {
    public final ArrayList a;

    public I60(int i) {
        switch (i) {
            case 1:
                this.a = new ArrayList();
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    @Override // defpackage.InterfaceC7744wB
    public long a(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((C7934xB) arrayList.get(0)).b) {
            return ((C7934xB) arrayList.get(0)).b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            C7934xB c7934xB = (C7934xB) arrayList.get(i);
            if (j < c7934xB.b) {
                long j2 = ((C7934xB) arrayList.get(i - 1)).d;
                long j3 = c7934xB.b;
                return (j2 == -9223372036854775807L || j2 <= j || j2 >= j3) ? j3 : j2;
            }
        }
        long j4 = ((C7934xB) AbstractC7337u22.b(arrayList)).d;
        if (j4 == -9223372036854775807L || j >= j4) {
            return Long.MIN_VALUE;
        }
        return j4;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    @Override // defpackage.InterfaceC7744wB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(defpackage.C7934xB r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.b
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
            defpackage.YN1.c(r4)
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 > 0) goto L23
            long r7 = r10.d
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
            java.util.ArrayList r3 = r9.a
            int r4 = r3.size()
            int r4 = r4 - r6
        L2b:
            if (r4 < 0) goto L4e
            java.lang.Object r7 = r3.get(r4)
            xB r7 = (defpackage.C7934xB) r7
            long r7 = r7.b
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 < 0) goto L3e
            int r4 = r4 + r6
            r3.add(r4, r10)
            return r2
        L3e:
            java.lang.Object r7 = r3.get(r4)
            xB r7 = (defpackage.C7934xB) r7
            long r7 = r7.b
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.I60.b(xB, long):boolean");
    }

    @Override // defpackage.InterfaceC7744wB
    public P70 c(long j) {
        int iF = f(j);
        if (iF == 0) {
            N70 n70 = P70.b;
            return C3769fQ0.e;
        }
        C7934xB c7934xB = (C7934xB) this.a.get(iF - 1);
        long j2 = c7934xB.d;
        if (j2 == -9223372036854775807L || j < j2) {
            return c7934xB.a;
        }
        N70 n702 = P70.b;
        return C3769fQ0.e;
    }

    @Override // defpackage.InterfaceC7744wB
    public void clear() {
        this.a.clear();
    }

    @Override // defpackage.InterfaceC7744wB
    public long d(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty() || j < ((C7934xB) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((C7934xB) arrayList.get(i)).b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                C7934xB c7934xB = (C7934xB) arrayList.get(i - 1);
                long j3 = c7934xB.d;
                return (j3 == -9223372036854775807L || j3 > j) ? c7934xB.b : j3;
            }
        }
        C7934xB c7934xB2 = (C7934xB) AbstractC7337u22.b(arrayList);
        long j4 = c7934xB2.d;
        return (j4 == -9223372036854775807L || j < j4) ? c7934xB2.b : j4;
    }

    @Override // defpackage.InterfaceC7744wB
    public void e(long j) {
        int iF = f(j);
        if (iF > 0) {
            this.a.subList(0, iF).clear();
        }
    }

    public int f(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            if (j < ((C7934xB) arrayList.get(i)).b) {
                return i;
            }
            i++;
        }
    }
}
