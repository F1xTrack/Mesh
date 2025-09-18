package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseArray;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Y9 {
    public static final Y9 c = new Y9(P70.B(X9.d));
    public static final C3769fQ0 d;
    public static final C5500kQ0 e;
    public final SparseArray a = new SparseArray();
    public final int b;

    static {
        Object[] objArr = {2, 5, 6};
        AbstractC3353dE1.a(3, objArr);
        d = P70.s(3, objArr);
        VY vy = new VY(4);
        vy.Y(5, 6);
        vy.Y(17, 6);
        vy.Y(7, 6);
        vy.Y(30, 10);
        vy.Y(18, 6);
        vy.Y(6, 8);
        vy.Y(8, 8);
        vy.Y(14, 8);
        e = vy.p();
    }

    public Y9(C3769fQ0 c3769fQ0) {
        for (int i = 0; i < c3769fQ0.d; i++) {
            X9 x9 = (X9) c3769fQ0.get(i);
            this.a.put(x9.a, x9);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            iMax = Math.max(iMax, ((X9) this.a.valueAt(i2)).b);
        }
        this.b = iMax;
    }

    public static C3769fQ0 a(int i, int[] iArr) {
        M70 m70T = P70.t();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            m70T.a(new X9(i2, i));
        }
        return m70T.h();
    }

    public static Y9 b(Context context, Q9 q9, C3607ea c3607ea) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), q9, c3607ea);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.Y9 c(android.content.Context r5, android.content.Intent r6, defpackage.Q9 r7, defpackage.C3607ea r8) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Y9.c(android.content.Context, android.content.Intent, Q9, ea):Y9");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair d(defpackage.Q9 r17, defpackage.C6666qX r18) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Y9.d(Q9, qX):android.util.Pair");
    }

    public final boolean e(int i) {
        SparseArray sparseArray = this.a;
        int i2 = AbstractC0277Dh1.a;
        return sparseArray.indexOfKey(i) >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0019 A[EDGE_INSN: B:13:0x0019->B:27:0x004a BREAK  A[LOOP:0: B:21:0x0032->B:25:0x0047]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof defpackage.Y9
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Y9 r9 = (defpackage.Y9) r9
            android.util.SparseArray r1 = r8.a
            android.util.SparseArray r3 = r9.a
            int r4 = defpackage.AbstractC0277Dh1.a
            if (r1 != 0) goto L17
            if (r3 != 0) goto L19
            goto L49
        L17:
            if (r3 != 0) goto L1b
        L19:
            r1 = r2
            goto L4a
        L1b:
            int r4 = defpackage.AbstractC0277Dh1.a
            r5 = 31
            if (r4 < r5) goto L26
            boolean r1 = defpackage.AbstractC7865wp0.n(r1, r3)
            goto L4a
        L26:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 == r5) goto L31
            goto L19
        L31:
            r5 = r2
        L32:
            if (r5 >= r4) goto L49
            int r6 = r1.keyAt(r5)
            java.lang.Object r7 = r1.valueAt(r5)
            java.lang.Object r6 = r3.get(r6)
            boolean r6 = java.util.Objects.equals(r7, r6)
            if (r6 != 0) goto L47
            goto L19
        L47:
            int r5 = r5 + r0
            goto L32
        L49:
            r1 = r0
        L4a:
            if (r1 == 0) goto L53
            int r1 = r8.b
            int r9 = r9.b
            if (r1 != r9) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Y9.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iContentHashCode;
        SparseArray sparseArray = this.a;
        if (AbstractC0277Dh1.a >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i = 0; i < sparseArray.size(); i++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i)) + ((sparseArray.keyAt(i) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return (iContentHashCode * 31) + this.b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + "]";
    }
}
