package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* renamed from: Fg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0428Fg implements InterfaceC5311jR {
    public final C1272Qb1 a;
    public final int b;
    public final int[] c;
    public final C6666qX[] d;
    public final long[] e;
    public int f;

    public AbstractC0428Fg(C1272Qb1 c1272Qb1, int[] iArr) {
        int i = 0;
        YN1.f(iArr.length > 0);
        c1272Qb1.getClass();
        this.a = c1272Qb1;
        int length = iArr.length;
        this.b = length;
        this.d = new C6666qX[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.d[i2] = c1272Qb1.d[iArr[i2]];
        }
        Arrays.sort(this.d, new C0350Eg(0));
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i >= i3) {
                this.e = new long[i3];
                return;
            } else {
                this.c[i] = c1272Qb1.b(this.d[i]);
                i++;
            }
        }
    }

    @Override // defpackage.InterfaceC5311jR
    public /* synthetic */ long a() {
        return -2147483647L;
    }

    @Override // defpackage.InterfaceC5311jR
    public final boolean b(int i, long j) {
        return this.e[i] > j;
    }

    @Override // defpackage.InterfaceC5311jR
    public final C1272Qb1 d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC0428Fg abstractC0428Fg = (AbstractC0428Fg) obj;
        return this.a.equals(abstractC0428Fg.a) && Arrays.equals(this.c, abstractC0428Fg.c);
    }

    @Override // defpackage.InterfaceC5311jR
    public final int f(C6666qX c6666qX) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == c6666qX) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.InterfaceC5311jR
    public final /* synthetic */ boolean g(long j, AbstractC1318Qr abstractC1318Qr, List list) {
        return false;
    }

    @Override // defpackage.InterfaceC5311jR
    public final /* synthetic */ void h(boolean z) {
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f;
    }

    @Override // defpackage.InterfaceC5311jR
    public final C6666qX i(int i) {
        return this.d[i];
    }

    @Override // defpackage.InterfaceC5311jR
    public final int j(int i) {
        return this.c[i];
    }

    @Override // defpackage.InterfaceC5311jR
    public int k(long j, List list) {
        return list.size();
    }

    @Override // defpackage.InterfaceC5311jR
    public final int l() {
        return this.c[e()];
    }

    @Override // defpackage.InterfaceC5311jR
    public final int length() {
        return this.c.length;
    }

    @Override // defpackage.InterfaceC5311jR
    public final C6666qX m() {
        return this.d[e()];
    }

    @Override // defpackage.InterfaceC5311jR
    public final boolean o(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zB = b(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.b && !zB) {
            zB = (i2 == i || b(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zB) {
            return false;
        }
        long[] jArr = this.e;
        long j2 = jArr[i];
        int i3 = AbstractC0277Dh1.a;
        long j3 = jElapsedRealtime + j;
        if (((j ^ j3) & (jElapsedRealtime ^ j3)) < 0) {
            j3 = Long.MAX_VALUE;
        }
        jArr[i] = Math.max(j2, j3);
        return true;
    }

    @Override // defpackage.InterfaceC5311jR
    public final /* synthetic */ void r() {
    }

    @Override // defpackage.InterfaceC5311jR
    public final /* synthetic */ void s() {
    }

    @Override // defpackage.InterfaceC5311jR
    public final int t(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.InterfaceC5311jR
    public void disable() {
    }

    @Override // defpackage.InterfaceC5311jR
    public void enable() {
    }

    @Override // defpackage.InterfaceC5311jR
    public void p(float f) {
    }
}
