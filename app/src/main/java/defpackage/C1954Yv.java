package defpackage;

import java.util.List;

/* renamed from: Yv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1954Yv implements InterfaceC3984gY0 {
    public final C3769fQ0 a;
    public long b;

    public C1954Yv(List list, List list2) {
        M70 m70T = P70.t();
        YN1.c(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            m70T.a(new C1876Xv((InterfaceC3984gY0) list.get(i), (List) list2.get(i)));
        }
        this.a = m70T.h();
        this.b = -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC3984gY0
    public final long e() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            C3769fQ0 c3769fQ0 = this.a;
            if (i >= c3769fQ0.size()) {
                break;
            }
            long jE = ((C1876Xv) c3769fQ0.get(i)).e();
            if (jE != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jE);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // defpackage.InterfaceC3984gY0
    public final boolean l() {
        int i = 0;
        while (true) {
            C3769fQ0 c3769fQ0 = this.a;
            if (i >= c3769fQ0.size()) {
                return false;
            }
            if (((C1876Xv) c3769fQ0.get(i)).l()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.InterfaceC3984gY0
    public final boolean r(C7660vk0 c7660vk0) {
        boolean zR;
        boolean z = false;
        do {
            long jE = e();
            if (jE == Long.MIN_VALUE) {
                break;
            }
            int i = 0;
            zR = false;
            while (true) {
                C3769fQ0 c3769fQ0 = this.a;
                if (i >= c3769fQ0.size()) {
                    break;
                }
                long jE2 = ((C1876Xv) c3769fQ0.get(i)).e();
                boolean z2 = jE2 != Long.MIN_VALUE && jE2 <= c7660vk0.a;
                if (jE2 == jE || z2) {
                    zR |= ((C1876Xv) c3769fQ0.get(i)).r(c7660vk0);
                }
                i++;
            }
            z |= zR;
        } while (zR);
        return z;
    }

    @Override // defpackage.InterfaceC3984gY0
    public final long s() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            C3769fQ0 c3769fQ0 = this.a;
            if (i >= c3769fQ0.size()) {
                break;
            }
            C1876Xv c1876Xv = (C1876Xv) c3769fQ0.get(i);
            long jS = c1876Xv.s();
            if ((c1876Xv.a().contains(1) || c1876Xv.a().contains(2) || c1876Xv.a().contains(4)) && jS != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jS);
            }
            if (jS != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jS);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.b;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // defpackage.InterfaceC3984gY0
    public final void t(long j) {
        int i = 0;
        while (true) {
            C3769fQ0 c3769fQ0 = this.a;
            if (i >= c3769fQ0.size()) {
                return;
            }
            ((C1876Xv) c3769fQ0.get(i)).t(j);
            i++;
        }
    }
}
