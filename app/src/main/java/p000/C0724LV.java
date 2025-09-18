package p000;

import java.util.Arrays;

/* renamed from: LV */
/* loaded from: classes.dex */
public final class C0724LV {

    /* renamed from: a */
    public long f6667a;

    /* renamed from: b */
    public long f6668b;

    /* renamed from: c */
    public long f6669c;

    /* renamed from: d */
    public long f6670d;

    /* renamed from: e */
    public long f6671e;

    /* renamed from: f */
    public long f6672f;

    /* renamed from: g */
    public final boolean[] f6673g = new boolean[15];

    /* renamed from: h */
    public int f6674h;

    /* renamed from: a */
    public final boolean m5009a() {
        return this.f6670d > 15 && this.f6674h == 0;
    }

    /* renamed from: b */
    public final void m5010b(long j) {
        long j2 = this.f6670d;
        if (j2 == 0) {
            this.f6667a = j;
        } else if (j2 == 1) {
            long j3 = j - this.f6667a;
            this.f6668b = j3;
            this.f6672f = j3;
            this.f6671e = 1L;
        } else {
            long j4 = j - this.f6669c;
            int i = (int) (j2 % 15);
            long jAbs = Math.abs(j4 - this.f6668b);
            boolean[] zArr = this.f6673g;
            if (jAbs <= 1000000) {
                this.f6671e++;
                this.f6672f += j4;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.f6674h--;
                }
            } else if (!zArr[i]) {
                zArr[i] = true;
                this.f6674h++;
            }
        }
        this.f6670d++;
        this.f6669c = j;
    }

    /* renamed from: c */
    public final void m5011c() {
        this.f6670d = 0L;
        this.f6671e = 0L;
        this.f6672f = 0L;
        this.f6674h = 0;
        Arrays.fill(this.f6673g, false);
    }
}
