package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: lR */
/* loaded from: classes.dex */
public final class C5693lR extends QQ0 {
    public final /* synthetic */ AbstractC5884mR c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5693lR(AbstractC5884mR abstractC5884mR) {
        super(1);
        this.c = abstractC5884mR;
    }

    @Override // defpackage.QQ0
    public final Q1 F(int i) {
        return new Q1(AccessibilityNodeInfo.obtain(this.c.p(i).a));
    }

    @Override // defpackage.QQ0
    public final Q1 G(int i) {
        AbstractC5884mR abstractC5884mR = this.c;
        int i2 = i == 2 ? abstractC5884mR.k : abstractC5884mR.l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return F(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x002c  */
    @Override // defpackage.QQ0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean J(int r7, int r8, android.os.Bundle r9) {
        /*
            r6 = this;
            mR r0 = r6.c
            android.view.View r1 = r0.i
            r2 = -1
            if (r7 == r2) goto L64
            r9 = 1
            if (r8 == r9) goto L5f
            r2 = 2
            if (r8 == r2) goto L5a
            r2 = 64
            r3 = 0
            r4 = 65536(0x10000, float:9.1835E-41)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 == r2) goto L2f
            r2 = 128(0x80, float:1.8E-43)
            if (r8 == r2) goto L1f
            boolean r7 = r0.q(r7, r8)
            goto L6a
        L1f:
            int r8 = r0.k
            if (r8 != r7) goto L2c
            r0.k = r5
            r1.invalidate()
            r0.v(r7, r4)
            goto L2d
        L2c:
            r9 = r3
        L2d:
            r7 = r9
            goto L6a
        L2f:
            android.view.accessibility.AccessibilityManager r8 = r0.h
            boolean r2 = r8.isEnabled()
            if (r2 == 0) goto L2c
            boolean r8 = r8.isTouchExplorationEnabled()
            if (r8 != 0) goto L3e
            goto L2c
        L3e:
            int r8 = r0.k
            if (r8 == r7) goto L2c
            if (r8 == r5) goto L4e
            r0.k = r5
            android.view.View r2 = r0.i
            r2.invalidate()
            r0.v(r8, r4)
        L4e:
            r0.k = r7
            r1.invalidate()
            r8 = 32768(0x8000, float:4.5918E-41)
            r0.v(r7, r8)
            goto L2d
        L5a:
            boolean r7 = r0.j(r7)
            goto L6a
        L5f:
            boolean r7 = r0.u(r7)
            goto L6a
        L64:
            java.util.WeakHashMap r7 = defpackage.AbstractC6897rk1.a
            boolean r7 = r1.performAccessibilityAction(r8, r9)
        L6a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5693lR.J(int, int, android.os.Bundle):boolean");
    }
}
