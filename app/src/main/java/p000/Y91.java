package p000;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public class Y91 {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14179b = AtomicIntegerFieldUpdater.newUpdater(Y91.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a */
    public AbstractRunnableC0467HP[] f14180a;

    /* renamed from: a */
    public final void m9228a(AbstractRunnableC0467HP abstractRunnableC0467HP) {
        abstractRunnableC0467HP.m3410e((C0530IP) this);
        AbstractRunnableC0467HP[] abstractRunnableC0467HPArr = this.f14180a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f14179b;
        if (abstractRunnableC0467HPArr == null) {
            abstractRunnableC0467HPArr = new AbstractRunnableC0467HP[4];
            this.f14180a = abstractRunnableC0467HPArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= abstractRunnableC0467HPArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(abstractRunnableC0467HPArr, atomicIntegerFieldUpdater.get(this) * 2);
            O90.m5967e(objArrCopyOf, "copyOf(...)");
            abstractRunnableC0467HPArr = (AbstractRunnableC0467HP[]) objArrCopyOf;
            this.f14180a = abstractRunnableC0467HPArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        abstractRunnableC0467HPArr[i] = abstractRunnableC0467HP;
        abstractRunnableC0467HP.f4283b = i;
        m9231d(i);
    }

    /* renamed from: b */
    public final void m9229b(AbstractRunnableC0467HP abstractRunnableC0467HP) {
        synchronized (this) {
            if (abstractRunnableC0467HP.m3408c() != null) {
                m9230c(abstractRunnableC0467HP.f4283b);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.AbstractRunnableC0467HP m9230c(int r9) {
        /*
            r8 = this;
            HP[] r0 = r8.f14180a
            p000.O90.m5965c(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = p000.Y91.f14179b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.m9232e(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            p000.O90.m5965c(r4)
            r5 = r0[r2]
            p000.O90.m5965c(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.m9232e(r9, r2)
            r8.m9231d(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            HP[] r5 = r8.f14180a
            p000.O90.m5965c(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            p000.O90.m5965c(r6)
            r7 = r5[r4]
            p000.O90.m5965c(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            p000.O90.m5965c(r4)
            r5 = r5[r2]
            p000.O90.m5965c(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.m9232e(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            p000.O90.m5965c(r9)
            r2 = 0
            r9.m3410e(r2)
            r9.f4283b = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.Y91.m9230c(int):HP");
    }

    /* renamed from: d */
    public final void m9231d(int i) {
        while (i > 0) {
            AbstractRunnableC0467HP[] abstractRunnableC0467HPArr = this.f14180a;
            O90.m5965c(abstractRunnableC0467HPArr);
            int i2 = (i - 1) / 2;
            AbstractRunnableC0467HP abstractRunnableC0467HP = abstractRunnableC0467HPArr[i2];
            O90.m5965c(abstractRunnableC0467HP);
            AbstractRunnableC0467HP abstractRunnableC0467HP2 = abstractRunnableC0467HPArr[i];
            O90.m5965c(abstractRunnableC0467HP2);
            if (abstractRunnableC0467HP.compareTo(abstractRunnableC0467HP2) <= 0) {
                return;
            }
            m9232e(i, i2);
            i = i2;
        }
    }

    /* renamed from: e */
    public final void m9232e(int i, int i2) {
        AbstractRunnableC0467HP[] abstractRunnableC0467HPArr = this.f14180a;
        O90.m5965c(abstractRunnableC0467HPArr);
        AbstractRunnableC0467HP abstractRunnableC0467HP = abstractRunnableC0467HPArr[i2];
        O90.m5965c(abstractRunnableC0467HP);
        AbstractRunnableC0467HP abstractRunnableC0467HP2 = abstractRunnableC0467HPArr[i];
        O90.m5965c(abstractRunnableC0467HP2);
        abstractRunnableC0467HPArr[i] = abstractRunnableC0467HP;
        abstractRunnableC0467HPArr[i2] = abstractRunnableC0467HP2;
        abstractRunnableC0467HP.f4283b = i;
        abstractRunnableC0467HP2.f4283b = i2;
    }
}
