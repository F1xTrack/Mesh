package p000;

import com.p019vk.push.core.base.AidlException;
import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Hq */
/* loaded from: classes.dex */
public final class C0494Hq extends AbstractC0934Oq {

    /* renamed from: i */
    public final int f4531i;

    /* renamed from: j */
    public final int f4532j;

    /* renamed from: k */
    public final int f4533k;

    /* renamed from: o */
    public List f4537o;

    /* renamed from: p */
    public List f4538p;

    /* renamed from: q */
    public int f4539q;

    /* renamed from: r */
    public int f4540r;

    /* renamed from: s */
    public boolean f4541s;

    /* renamed from: t */
    public boolean f4542t;

    /* renamed from: u */
    public byte f4543u;

    /* renamed from: v */
    public byte f4544v;

    /* renamed from: x */
    public boolean f4546x;

    /* renamed from: y */
    public long f4547y;

    /* renamed from: z */
    public static final int[] f4529z = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: A */
    public static final int[] f4522A = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: B */
    public static final int[] f4523B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: C */
    public static final int[] f4524C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, AidlException.ILLEGAL_ARGUMENT_EXCEPTION, 102, AidlException.HOST_IS_NOT_MASTER, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, BuildConfig.API_LEVEL, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: D */
    public static final int[] f4525D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: E */
    public static final int[] f4526E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: F */
    public static final int[] f4527F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: G */
    public static final boolean[] f4528G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: h */
    public final C9591hA0 f4530h = new C9591hA0();

    /* renamed from: m */
    public final ArrayList f4535m = new ArrayList();

    /* renamed from: n */
    public C0431Gq f4536n = new C0431Gq(0, 4);

    /* renamed from: w */
    public int f4545w = 0;

    /* renamed from: l */
    public final long f4534l = 16000000;

    public C0494Hq(String str, int i) {
        this.f4531i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.f4533k = 0;
            this.f4532j = 0;
        } else if (i == 2) {
            this.f4533k = 1;
            this.f4532j = 0;
        } else if (i == 3) {
            this.f4533k = 0;
            this.f4532j = 1;
        } else if (i != 4) {
            AbstractC10872rA1.m24175h("Invalid channel. Defaulting to CC1.");
            this.f4533k = 0;
            this.f4532j = 0;
        } else {
            this.f4533k = 1;
            this.f4532j = 1;
        }
        m3606l(0);
        m3605k();
        this.f4546x = true;
        this.f4547y = -9223372036854775807L;
    }

    @Override // p000.AbstractC0934Oq
    /* renamed from: f */
    public final C0997Pq mo3600f() {
        List list = this.f4537o;
        this.f4538p = list;
        list.getClass();
        return new C0997Pq(list);
    }

    @Override // p000.AbstractC0934Oq, p000.InterfaceC1335VD
    public final void flush() {
        super.flush();
        this.f4537o = null;
        this.f4538p = null;
        m3606l(0);
        this.f4540r = 4;
        this.f4536n.f3922h = 4;
        m3605k();
        this.f4541s = false;
        this.f4542t = false;
        this.f4543u = (byte) 0;
        this.f4544v = (byte) 0;
        this.f4545w = 0;
        this.f4546x = true;
        this.f4547y = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6 A[FALL_THROUGH] */
    @Override // p000.AbstractC0934Oq
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo3601g(p000.C0808Mq r15) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0494Hq.mo3601g(Mq):void");
    }

    @Override // p000.AbstractC0934Oq, p000.InterfaceC1335VD
    /* renamed from: h */
    public final C0871Nq mo3599c() {
        C0871Nq c0871Nq;
        C0871Nq c0871NqMo3599c = super.mo3599c();
        if (c0871NqMo3599c != null) {
            return c0871NqMo3599c;
        }
        long j = this.f4534l;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j2 = this.f4547y;
        if (j2 == -9223372036854775807L || this.f8638e - j2 < j || (c0871Nq = (C0871Nq) this.f8635b.pollFirst()) == null) {
            return null;
        }
        this.f4537o = Collections.emptyList();
        this.f4547y = -9223372036854775807L;
        C0997Pq c0997PqMo3600f = mo3600f();
        long j3 = this.f8638e;
        c0871Nq.f15398c = j3;
        c0871Nq.f8024e = c0997PqMo3600f;
        c0871Nq.f8025f = j3;
        return c0871Nq;
    }

    @Override // p000.AbstractC0934Oq
    /* renamed from: i */
    public final boolean mo3603i() {
        return this.f4537o != this.f4538p;
    }

    /* renamed from: j */
    public final ArrayList m3604j() {
        ArrayList arrayList = this.f4535m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            C6933uB c6933uBM3178c = ((C0431Gq) arrayList.get(i)).m3178c(Integer.MIN_VALUE);
            arrayList2.add(c6933uBM3178c);
            if (c6933uBM3178c != null) {
                iMin = Math.min(iMin, c6933uBM3178c.f43574i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            C6933uB c6933uBM3178c2 = (C6933uB) arrayList2.get(i2);
            if (c6933uBM3178c2 != null) {
                if (c6933uBM3178c2.f43574i != iMin) {
                    c6933uBM3178c2 = ((C0431Gq) arrayList.get(i2)).m3178c(iMin);
                    c6933uBM3178c2.getClass();
                }
                arrayList3.add(c6933uBM3178c2);
            }
        }
        return arrayList3;
    }

    /* renamed from: k */
    public final void m3605k() {
        C0431Gq c0431Gq = this.f4536n;
        c0431Gq.f3921g = this.f4539q;
        c0431Gq.f3915a.clear();
        c0431Gq.f3916b.clear();
        c0431Gq.f3917c.setLength(0);
        c0431Gq.f3918d = 15;
        c0431Gq.f3919e = 0;
        c0431Gq.f3920f = 0;
        ArrayList arrayList = this.f4535m;
        arrayList.clear();
        arrayList.add(this.f4536n);
    }

    /* renamed from: l */
    public final void m3606l(int i) {
        int i2 = this.f4539q;
        if (i2 == i) {
            return;
        }
        this.f4539q = i;
        if (i != 3) {
            m3605k();
            if (i2 == 3 || i == 1 || i == 0) {
                this.f4537o = Collections.emptyList();
                return;
            }
            return;
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f4535m;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((C0431Gq) arrayList.get(i3)).f3921g = i;
            i3++;
        }
    }

    @Override // p000.AbstractC0934Oq, p000.InterfaceC1335VD
    public final void release() {
    }
}
