package p000;

import java.util.List;

/* renamed from: Yv */
/* loaded from: classes.dex */
public final class C1568Yv implements InterfaceC9511gY0 {

    /* renamed from: a */
    public final C9367fQ0 f14612a;

    /* renamed from: b */
    public long f14613b;

    public C1568Yv(List list, List list2) {
        M70 m70M6233t = P70.m6233t();
        YN1.m9278c(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            m70M6233t.m3755a(new C1505Xv((InterfaceC9511gY0) list.get(i), (List) list2.get(i)));
        }
        this.f14612a = m70M6233t.m5273h();
        this.f14613b = -9223372036854775807L;
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: e */
    public final long mo1880e() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            C9367fQ0 c9367fQ0 = this.f14612a;
            if (i >= c9367fQ0.size()) {
                break;
            }
            long jMo1880e = ((C1505Xv) c9367fQ0.get(i)).mo1880e();
            if (jMo1880e != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo1880e);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: l */
    public final boolean mo1884l() {
        int i = 0;
        while (true) {
            C9367fQ0 c9367fQ0 = this.f14612a;
            if (i >= c9367fQ0.size()) {
                return false;
            }
            if (((C1505Xv) c9367fQ0.get(i)).mo1884l()) {
                return true;
            }
            i++;
        }
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: r */
    public final boolean mo1889r(C11455vk0 c11455vk0) {
        boolean zMo1889r;
        boolean z = false;
        do {
            long jMo1880e = mo1880e();
            if (jMo1880e == Long.MIN_VALUE) {
                break;
            }
            int i = 0;
            zMo1889r = false;
            while (true) {
                C9367fQ0 c9367fQ0 = this.f14612a;
                if (i >= c9367fQ0.size()) {
                    break;
                }
                long jMo1880e2 = ((C1505Xv) c9367fQ0.get(i)).mo1880e();
                boolean z2 = jMo1880e2 != Long.MIN_VALUE && jMo1880e2 <= c11455vk0.f44511a;
                if (jMo1880e2 == jMo1880e || z2) {
                    zMo1889r |= ((C1505Xv) c9367fQ0.get(i)).mo1889r(c11455vk0);
                }
                i++;
            }
            z |= zMo1889r;
        } while (zMo1889r);
        return z;
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: s */
    public final long mo1890s() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            C9367fQ0 c9367fQ0 = this.f14612a;
            if (i >= c9367fQ0.size()) {
                break;
            }
            C1505Xv c1505Xv = (C1505Xv) c9367fQ0.get(i);
            long jMo1890s = c1505Xv.mo1890s();
            if ((c1505Xv.m9181a().contains(1) || c1505Xv.m9181a().contains(2) || c1505Xv.m9181a().contains(4)) && jMo1890s != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo1890s);
            }
            if (jMo1890s != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jMo1890s);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.f14613b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.f14613b;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: t */
    public final void mo1891t(long j) {
        int i = 0;
        while (true) {
            C9367fQ0 c9367fQ0 = this.f14612a;
            if (i >= c9367fQ0.size()) {
                return;
            }
            ((C1505Xv) c9367fQ0.get(i)).mo1891t(j);
            i++;
        }
    }
}
