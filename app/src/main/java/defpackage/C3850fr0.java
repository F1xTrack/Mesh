package defpackage;

import java.util.ArrayList;

/* renamed from: fr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3850fr0 implements InterfaceC7744wB {
    public static final C5786lw b;
    public final ArrayList a = new ArrayList();

    static {
        C0081Au0 c0081Au0 = C0081Au0.a;
        C0681Im0 c0681Im0 = new C0681Im0(7);
        c0081Au0.getClass();
        C4400ik c4400ik = new C4400ik(c0681Im0, c0081Au0);
        C3397dT0 c3397dT0 = C3397dT0.a;
        C0681Im0 c0681Im02 = new C0681Im0(8);
        c3397dT0.getClass();
        b = new C5786lw(c4400ik, new C4400ik(c0681Im02, c3397dT0));
    }

    @Override // defpackage.InterfaceC7744wB
    public final long a(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                break;
            }
            long j2 = ((C7934xB) arrayList.get(i)).b;
            long j3 = ((C7934xB) arrayList.get(i)).d;
            if (j < j2) {
                jMin = jMin == -9223372036854775807L ? j2 : Math.min(jMin, j2);
            } else {
                if (j < j3) {
                    jMin = jMin == -9223372036854775807L ? j3 : Math.min(jMin, j3);
                }
                i++;
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.InterfaceC7744wB
    public final boolean b(C7934xB c7934xB, long j) {
        long j2 = c7934xB.b;
        YN1.c(j2 != -9223372036854775807L);
        YN1.c(c7934xB.c != -9223372036854775807L);
        boolean z = j2 <= j && j < c7934xB.d;
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((C7934xB) arrayList.get(size)).b) {
                arrayList.add(size + 1, c7934xB);
                return z;
            }
        }
        arrayList.add(0, c7934xB);
        return z;
    }

    @Override // defpackage.InterfaceC7744wB
    public final P70 c(long j) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j >= ((C7934xB) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    C7934xB c7934xB = (C7934xB) arrayList.get(i);
                    if (j >= c7934xB.b && j < c7934xB.d) {
                        arrayList2.add(c7934xB);
                    }
                    if (j < c7934xB.b) {
                        break;
                    }
                }
                C3769fQ0 c3769fQ0E = P70.E(b, arrayList2);
                M70 m70T = P70.t();
                for (int i2 = 0; i2 < c3769fQ0E.size(); i2++) {
                    m70T.e(((C7934xB) c3769fQ0E.get(i2)).a);
                }
                return m70T.h();
            }
        }
        return P70.z();
    }

    @Override // defpackage.InterfaceC7744wB
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.InterfaceC7744wB
    public final long d(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((C7934xB) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        long jMax = ((C7934xB) arrayList.get(0)).b;
        for (int i = 0; i < arrayList.size(); i++) {
            long j2 = ((C7934xB) arrayList.get(i)).b;
            long j3 = ((C7934xB) arrayList.get(i)).d;
            if (j3 > j) {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            } else {
                jMax = Math.max(jMax, j3);
            }
        }
        return jMax;
    }

    @Override // defpackage.InterfaceC7744wB
    public final void e(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((C7934xB) arrayList.get(i)).b;
            if (j > j2 && j > ((C7934xB) arrayList.get(i)).d) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }
}
