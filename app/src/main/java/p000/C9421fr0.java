package p000;

import java.util.ArrayList;

/* renamed from: fr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9421fr0 implements InterfaceC7059wB {

    /* renamed from: b */
    public static final C6394lw f27417b;

    /* renamed from: a */
    public final ArrayList f27418a = new ArrayList();

    static {
        C7354Au0 c7354Au0 = C7354Au0.f461a;
        C7754Im0 c7754Im0 = new C7754Im0(7);
        c7354Au0.getClass();
        C4261ik c4261ik = new C4261ik(c7754Im0, c7354Au0);
        C9117dT0 c9117dT0 = C9117dT0.f26118a;
        C7754Im0 c7754Im02 = new C7754Im0(8);
        c9117dT0.getClass();
        f27417b = new C6394lw(c4261ik, new C4261ik(c7754Im02, c9117dT0));
    }

    @Override // p000.InterfaceC7059wB
    /* renamed from: a */
    public final long mo3744a(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f27418a;
            if (i >= arrayList.size()) {
                break;
            }
            long j2 = ((C7122xB) arrayList.get(i)).f45433b;
            long j3 = ((C7122xB) arrayList.get(i)).f45435d;
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

    @Override // p000.InterfaceC7059wB
    /* renamed from: b */
    public final boolean mo3745b(C7122xB c7122xB, long j) {
        long j2 = c7122xB.f45433b;
        YN1.m9278c(j2 != -9223372036854775807L);
        YN1.m9278c(c7122xB.f45434c != -9223372036854775807L);
        boolean z = j2 <= j && j < c7122xB.f45435d;
        ArrayList arrayList = this.f27418a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((C7122xB) arrayList.get(size)).f45433b) {
                arrayList.add(size + 1, c7122xB);
                return z;
            }
        }
        arrayList.add(0, c7122xB);
        return z;
    }

    @Override // p000.InterfaceC7059wB
    /* renamed from: c */
    public final P70 mo3746c(long j) {
        ArrayList arrayList = this.f27418a;
        if (!arrayList.isEmpty()) {
            if (j >= ((C7122xB) arrayList.get(0)).f45433b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    C7122xB c7122xB = (C7122xB) arrayList.get(i);
                    if (j >= c7122xB.f45433b && j < c7122xB.f45435d) {
                        arrayList2.add(c7122xB);
                    }
                    if (j < c7122xB.f45433b) {
                        break;
                    }
                }
                C9367fQ0 c9367fQ0M6231E = P70.m6231E(f27417b, arrayList2);
                M70 m70M6233t = P70.m6233t();
                for (int i2 = 0; i2 < c9367fQ0M6231E.size(); i2++) {
                    m70M6233t.m3759e(((C7122xB) c9367fQ0M6231E.get(i2)).f45432a);
                }
                return m70M6233t.m5273h();
            }
        }
        return P70.m6236z();
    }

    @Override // p000.InterfaceC7059wB
    public final void clear() {
        this.f27418a.clear();
    }

    @Override // p000.InterfaceC7059wB
    /* renamed from: d */
    public final long mo3747d(long j) {
        ArrayList arrayList = this.f27418a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((C7122xB) arrayList.get(0)).f45433b) {
            return -9223372036854775807L;
        }
        long jMax = ((C7122xB) arrayList.get(0)).f45433b;
        for (int i = 0; i < arrayList.size(); i++) {
            long j2 = ((C7122xB) arrayList.get(i)).f45433b;
            long j3 = ((C7122xB) arrayList.get(i)).f45435d;
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

    @Override // p000.InterfaceC7059wB
    /* renamed from: e */
    public final void mo3748e(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f27418a;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((C7122xB) arrayList.get(i)).f45433b;
            if (j > j2 && j > ((C7122xB) arrayList.get(i)).f45435d) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }
}
