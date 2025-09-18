package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public class Y91 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(Y91.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public HP[] a;

    public final void a(HP hp) {
        hp.e((IP) this);
        HP[] hpArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (hpArr == null) {
            hpArr = new HP[4];
            this.a = hpArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= hpArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(hpArr, atomicIntegerFieldUpdater.get(this) * 2);
            O90.e(objArrCopyOf, "copyOf(...)");
            hpArr = (HP[]) objArrCopyOf;
            this.a = hpArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        hpArr[i] = hp;
        hp.b = i;
        d(i);
    }

    public final void b(HP hp) {
        synchronized (this) {
            if (hp.c() != null) {
                c(hp.b);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.HP c(int r9) {
        /*
            r8 = this;
            HP[] r0 = r8.a
            defpackage.O90.c(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.Y91.b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.e(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            defpackage.O90.c(r4)
            r5 = r0[r2]
            defpackage.O90.c(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.e(r9, r2)
            r8.d(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            HP[] r5 = r8.a
            defpackage.O90.c(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            defpackage.O90.c(r6)
            r7 = r5[r4]
            defpackage.O90.c(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            defpackage.O90.c(r4)
            r5 = r5[r2]
            defpackage.O90.c(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.e(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            defpackage.O90.c(r9)
            r2 = 0
            r9.e(r2)
            r9.b = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Y91.c(int):HP");
    }

    public final void d(int i) {
        while (i > 0) {
            HP[] hpArr = this.a;
            O90.c(hpArr);
            int i2 = (i - 1) / 2;
            HP hp = hpArr[i2];
            O90.c(hp);
            HP hp2 = hpArr[i];
            O90.c(hp2);
            if (hp.compareTo(hp2) <= 0) {
                return;
            }
            e(i, i2);
            i = i2;
        }
    }

    public final void e(int i, int i2) {
        HP[] hpArr = this.a;
        O90.c(hpArr);
        HP hp = hpArr[i2];
        O90.c(hp);
        HP hp2 = hpArr[i];
        O90.c(hp2);
        hpArr[i] = hp;
        hpArr[i2] = hp2;
        hp.b = i;
        hp2.b = i2;
    }
}
