package p000;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* renamed from: Fg */
/* loaded from: classes.dex */
public abstract class AbstractC0358Fg implements InterfaceC6237jR {

    /* renamed from: a */
    public final C8149Qb1 f3382a;

    /* renamed from: b */
    public final int f3383b;

    /* renamed from: c */
    public final int[] f3384c;

    /* renamed from: d */
    public final C6686qX[] f3385d;

    /* renamed from: e */
    public final long[] f3386e;

    /* renamed from: f */
    public int f3387f;

    public AbstractC0358Fg(C8149Qb1 c8149Qb1, int[] iArr) {
        int i = 0;
        YN1.m9281f(iArr.length > 0);
        c8149Qb1.getClass();
        this.f3382a = c8149Qb1;
        int length = iArr.length;
        this.f3383b = length;
        this.f3385d = new C6686qX[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f3385d[i2] = c8149Qb1.f9690d[iArr[i2]];
        }
        Arrays.sort(this.f3385d, new C0295Eg(0));
        this.f3384c = new int[this.f3383b];
        while (true) {
            int i3 = this.f3383b;
            if (i >= i3) {
                this.f3386e = new long[i3];
                return;
            } else {
                this.f3384c[i] = c8149Qb1.m6736b(this.f3385d[i]);
                i++;
            }
        }
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: a */
    public /* synthetic */ long mo2722a() {
        return -2147483647L;
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: b */
    public final boolean mo2723b(int i, long j) {
        return this.f3386e[i] > j;
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: d */
    public final C8149Qb1 mo2724d() {
        return this.f3382a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC0358Fg abstractC0358Fg = (AbstractC0358Fg) obj;
        return this.f3382a.equals(abstractC0358Fg.f3382a) && Arrays.equals(this.f3384c, abstractC0358Fg.f3384c);
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: f */
    public final int mo2725f(C6686qX c6686qX) {
        for (int i = 0; i < this.f3383b; i++) {
            if (this.f3385d[i] == c6686qX) {
                return i;
            }
        }
        return -1;
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: g */
    public final /* synthetic */ boolean mo2726g(long j, AbstractC1061Qr abstractC1061Qr, List list) {
        return false;
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: h */
    public final /* synthetic */ void mo2727h(boolean z) {
    }

    public final int hashCode() {
        if (this.f3387f == 0) {
            this.f3387f = Arrays.hashCode(this.f3384c) + (System.identityHashCode(this.f3382a) * 31);
        }
        return this.f3387f;
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: i */
    public final C6686qX mo2728i(int i) {
        return this.f3385d[i];
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: j */
    public final int mo2729j(int i) {
        return this.f3384c[i];
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: k */
    public int mo2730k(long j, List list) {
        return list.size();
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: l */
    public final int mo2731l() {
        return this.f3384c[mo6374e()];
    }

    @Override // p000.InterfaceC6237jR
    public final int length() {
        return this.f3384c.length;
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: m */
    public final C6686qX mo2732m() {
        return this.f3385d[mo6374e()];
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: o */
    public final boolean mo2733o(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zMo2723b = mo2723b(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.f3383b && !zMo2723b) {
            zMo2723b = (i2 == i || mo2723b(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zMo2723b) {
            return false;
        }
        long[] jArr = this.f3386e;
        long j2 = jArr[i];
        int i3 = AbstractC7485Dh1.f2166a;
        long j3 = jElapsedRealtime + j;
        if (((j ^ j3) & (jElapsedRealtime ^ j3)) < 0) {
            j3 = Long.MAX_VALUE;
        }
        jArr[i] = Math.max(j2, j3);
        return true;
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: r */
    public final /* synthetic */ void mo2735r() {
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: s */
    public final /* synthetic */ void mo2736s() {
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: t */
    public final int mo2737t(int i) {
        for (int i2 = 0; i2 < this.f3383b; i2++) {
            if (this.f3384c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.InterfaceC6237jR
    public void disable() {
    }

    @Override // p000.InterfaceC6237jR
    public void enable() {
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: p */
    public void mo2734p(float f) {
    }
}
