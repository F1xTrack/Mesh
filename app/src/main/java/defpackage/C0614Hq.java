package defpackage;

import com.vk.push.core.base.AidlException;
import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Hq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0614Hq extends AbstractC1159Oq {
    public final int i;
    public final int j;
    public final int k;
    public List o;
    public List p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public byte u;
    public byte v;
    public boolean x;
    public long y;
    public static final int[] z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, AidlException.ILLEGAL_ARGUMENT_EXCEPTION, 102, AidlException.HOST_IS_NOT_MASTER, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, BuildConfig.API_LEVEL, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final C4103hA0 h = new C4103hA0();
    public final ArrayList m = new ArrayList();
    public C0536Gq n = new C0536Gq(0, 4);
    public int w = 0;
    public final long l = 16000000;

    public C0614Hq(String str, int i) {
        this.i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.k = 0;
            this.j = 0;
        } else if (i == 2) {
            this.k = 1;
            this.j = 0;
        } else if (i == 3) {
            this.k = 0;
            this.j = 1;
        } else if (i != 4) {
            AbstractC6789rA1.h("Invalid channel. Defaulting to CC1.");
            this.k = 0;
            this.j = 0;
        } else {
            this.k = 1;
            this.j = 1;
        }
        l(0);
        k();
        this.x = true;
        this.y = -9223372036854775807L;
    }

    @Override // defpackage.AbstractC1159Oq
    public final C1237Pq f() {
        List list = this.o;
        this.p = list;
        list.getClass();
        return new C1237Pq(list);
    }

    @Override // defpackage.AbstractC1159Oq, defpackage.VD
    public final void flush() {
        super.flush();
        this.o = null;
        this.p = null;
        l(0);
        this.r = 4;
        this.n.h = 4;
        k();
        this.s = false;
        this.t = false;
        this.u = (byte) 0;
        this.v = (byte) 0;
        this.w = 0;
        this.x = true;
        this.y = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6 A[FALL_THROUGH] */
    @Override // defpackage.AbstractC1159Oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(defpackage.C1003Mq r15) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0614Hq.g(Mq):void");
    }

    @Override // defpackage.AbstractC1159Oq, defpackage.VD
    /* renamed from: h */
    public final C1081Nq c() {
        C1081Nq c1081Nq;
        C1081Nq c1081NqC = super.c();
        if (c1081NqC != null) {
            return c1081NqC;
        }
        long j = this.l;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j2 = this.y;
        if (j2 == -9223372036854775807L || this.e - j2 < j || (c1081Nq = (C1081Nq) this.b.pollFirst()) == null) {
            return null;
        }
        this.o = Collections.emptyList();
        this.y = -9223372036854775807L;
        C1237Pq c1237PqF = f();
        long j3 = this.e;
        c1081Nq.c = j3;
        c1081Nq.e = c1237PqF;
        c1081Nq.f = j3;
        return c1081Nq;
    }

    @Override // defpackage.AbstractC1159Oq
    public final boolean i() {
        return this.o != this.p;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            C7363uB c7363uBC = ((C0536Gq) arrayList.get(i)).c(Integer.MIN_VALUE);
            arrayList2.add(c7363uBC);
            if (c7363uBC != null) {
                iMin = Math.min(iMin, c7363uBC.i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            C7363uB c7363uBC2 = (C7363uB) arrayList2.get(i2);
            if (c7363uBC2 != null) {
                if (c7363uBC2.i != iMin) {
                    c7363uBC2 = ((C0536Gq) arrayList.get(i2)).c(iMin);
                    c7363uBC2.getClass();
                }
                arrayList3.add(c7363uBC2);
            }
        }
        return arrayList3;
    }

    public final void k() {
        C0536Gq c0536Gq = this.n;
        c0536Gq.g = this.q;
        c0536Gq.a.clear();
        c0536Gq.b.clear();
        c0536Gq.c.setLength(0);
        c0536Gq.d = 15;
        c0536Gq.e = 0;
        c0536Gq.f = 0;
        ArrayList arrayList = this.m;
        arrayList.clear();
        arrayList.add(this.n);
    }

    public final void l(int i) {
        int i2 = this.q;
        if (i2 == i) {
            return;
        }
        this.q = i;
        if (i != 3) {
            k();
            if (i2 == 3 || i == 1 || i == 0) {
                this.o = Collections.emptyList();
                return;
            }
            return;
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((C0536Gq) arrayList.get(i3)).g = i;
            i3++;
        }
    }

    @Override // defpackage.AbstractC1159Oq, defpackage.VD
    public final void release() {
    }
}
