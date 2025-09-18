package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseArray;
import java.util.Objects;

/* renamed from: Y9 */
/* loaded from: classes.dex */
public final class C1520Y9 {

    /* renamed from: c */
    public static final C1520Y9 f14173c = new C1520Y9(P70.m6229B(C1457X9.f13578d));

    /* renamed from: d */
    public static final C9367fQ0 f14174d;

    /* renamed from: e */
    public static final C10007kQ0 f14175e;

    /* renamed from: a */
    public final SparseArray f14176a = new SparseArray();

    /* renamed from: b */
    public final int f14177b;

    static {
        Object[] objArr = {2, 5, 6};
        AbstractC9088dE1.m17509a(3, objArr);
        f14174d = P70.m6232s(3, objArr);
        C1356VY c1356vy = new C1356VY(4);
        c1356vy.m8486Y(5, 6);
        c1356vy.m8486Y(17, 6);
        c1356vy.m8486Y(7, 6);
        c1356vy.m8486Y(30, 10);
        c1356vy.m8486Y(18, 6);
        c1356vy.m8486Y(6, 8);
        c1356vy.m8486Y(8, 8);
        c1356vy.m8486Y(14, 8);
        f14175e = c1356vy.m8503p();
    }

    public C1520Y9(C9367fQ0 c9367fQ0) {
        for (int i = 0; i < c9367fQ0.f27186d; i++) {
            C1457X9 c1457x9 = (C1457X9) c9367fQ0.get(i);
            this.f14176a.put(c1457x9.f13579a, c1457x9);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.f14176a.size(); i2++) {
            iMax = Math.max(iMax, ((C1457X9) this.f14176a.valueAt(i2)).f13580b);
        }
        this.f14177b = iMax;
    }

    /* renamed from: a */
    public static C9367fQ0 m9222a(int i, int[] iArr) {
        M70 m70M6233t = P70.m6233t();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            m70M6233t.m3755a(new C1457X9(i2, i));
        }
        return m70M6233t.m5273h();
    }

    /* renamed from: b */
    public static C1520Y9 m9223b(Context context, C1017Q9 c1017q9, C3999ea c3999ea) {
        return m9224c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c1017q9, c3999ea);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.C1520Y9 m9224c(android.content.Context r5, android.content.Intent r6, p000.C1017Q9 r7, p000.C3999ea r8) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1520Y9.m9224c(android.content.Context, android.content.Intent, Q9, ea):Y9");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00d1  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair m9225d(p000.C1017Q9 r17, p000.C6686qX r18) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1520Y9.m9225d(Q9, qX):android.util.Pair");
    }

    /* renamed from: e */
    public final boolean m9226e(int i) {
        SparseArray sparseArray = this.f14176a;
        int i2 = AbstractC7485Dh1.f2166a;
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
            boolean r1 = r9 instanceof p000.C1520Y9
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Y9 r9 = (p000.C1520Y9) r9
            android.util.SparseArray r1 = r8.f14176a
            android.util.SparseArray r3 = r9.f14176a
            int r4 = p000.AbstractC7485Dh1.f2166a
            if (r1 != 0) goto L17
            if (r3 != 0) goto L19
            goto L49
        L17:
            if (r3 != 0) goto L1b
        L19:
            r1 = r2
            goto L4a
        L1b:
            int r4 = p000.AbstractC7485Dh1.f2166a
            r5 = 31
            if (r4 < r5) goto L26
            boolean r1 = p000.AbstractC11592wp0.m25717n(r1, r3)
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
            int r1 = r8.f14177b
            int r9 = r9.f14177b
            if (r1 != r9) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1520Y9.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iContentHashCode;
        SparseArray sparseArray = this.f14176a;
        if (AbstractC7485Dh1.f2166a >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i = 0; i < sparseArray.size(); i++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i)) + ((sparseArray.keyAt(i) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return (iContentHashCode * 31) + this.f14177b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f14177b + ", audioProfiles=" + this.f14176a + "]";
    }
}
