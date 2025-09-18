package p000;

/* renamed from: El0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7544El0 implements Cloneable {

    /* renamed from: e */
    public static final Object f2880e = new Object();

    /* renamed from: a */
    public boolean f2881a;

    /* renamed from: b */
    public long[] f2882b;

    /* renamed from: c */
    public Object[] f2883c;

    /* renamed from: d */
    public int f2884d;

    public C7544El0() {
        this(10);
    }

    /* renamed from: a */
    public final void m2378a(long j, Long l) {
        int i = this.f2884d;
        if (i != 0 && j <= this.f2882b[i - 1]) {
            m2383k(j, l);
            return;
        }
        if (this.f2881a && i >= this.f2882b.length) {
            m2381i();
        }
        int i2 = this.f2884d;
        if (i2 >= this.f2882b.length) {
            int i3 = (i2 + 1) * 8;
            int i4 = 4;
            while (true) {
                if (i4 >= 32) {
                    break;
                }
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
            int i6 = i3 / 8;
            long[] jArr = new long[i6];
            Object[] objArr = new Object[i6];
            long[] jArr2 = this.f2882b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f2883c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f2882b = jArr;
            this.f2883c = objArr;
        }
        this.f2882b[i2] = j;
        this.f2883c[i2] = l;
        this.f2884d = i2 + 1;
    }

    /* renamed from: e */
    public final void m2379e() {
        int i = this.f2884d;
        Object[] objArr = this.f2883c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f2884d = 0;
        this.f2881a = false;
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final C7544El0 clone() {
        try {
            C7544El0 c7544El0 = (C7544El0) super.clone();
            c7544El0.f2882b = (long[]) this.f2882b.clone();
            c7544El0.f2883c = (Object[]) this.f2883c.clone();
            return c7544El0;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: i */
    public final void m2381i() {
        int i = this.f2884d;
        long[] jArr = this.f2882b;
        Object[] objArr = this.f2883c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f2880e) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f2881a = false;
        this.f2884d = i2;
    }

    /* renamed from: j */
    public final Object m2382j(long j, Long l) {
        Object obj;
        int iM1901b = AbstractC7500Dp0.m1901b(this.f2882b, this.f2884d, j);
        return (iM1901b < 0 || (obj = this.f2883c[iM1901b]) == f2880e) ? l : obj;
    }

    /* renamed from: k */
    public final void m2383k(long j, Object obj) {
        int iM1901b = AbstractC7500Dp0.m1901b(this.f2882b, this.f2884d, j);
        if (iM1901b >= 0) {
            this.f2883c[iM1901b] = obj;
            return;
        }
        int i = ~iM1901b;
        int i2 = this.f2884d;
        if (i < i2) {
            Object[] objArr = this.f2883c;
            if (objArr[i] == f2880e) {
                this.f2882b[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f2881a && i2 >= this.f2882b.length) {
            m2381i();
            i = ~AbstractC7500Dp0.m1901b(this.f2882b, this.f2884d, j);
        }
        int i3 = this.f2884d;
        if (i3 >= this.f2882b.length) {
            int i4 = (i3 + 1) * 8;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 8;
            long[] jArr = new long[i7];
            Object[] objArr2 = new Object[i7];
            long[] jArr2 = this.f2882b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f2883c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2882b = jArr;
            this.f2883c = objArr2;
        }
        int i8 = this.f2884d - i;
        if (i8 != 0) {
            long[] jArr3 = this.f2882b;
            int i9 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i9, i8);
            Object[] objArr4 = this.f2883c;
            System.arraycopy(objArr4, i, objArr4, i9, this.f2884d - i);
        }
        this.f2882b[i] = j;
        this.f2883c[i] = obj;
        this.f2884d++;
    }

    /* renamed from: l */
    public final int m2384l() {
        if (this.f2881a) {
            m2381i();
        }
        return this.f2884d;
    }

    /* renamed from: m */
    public final Object m2385m(int i) {
        if (this.f2881a) {
            m2381i();
        }
        return this.f2883c[i];
    }

    public final String toString() {
        if (m2384l() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2884d * 28);
        sb.append('{');
        for (int i = 0; i < this.f2884d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.f2881a) {
                m2381i();
            }
            sb.append(this.f2882b[i]);
            sb.append('=');
            Object objM2385m = m2385m(i);
            if (objM2385m != this) {
                sb.append(objM2385m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C7544El0(int i) {
        this.f2881a = false;
        if (i == 0) {
            this.f2882b = AbstractC7500Dp0.f2263b;
            this.f2883c = AbstractC7500Dp0.f2264c;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.f2882b = new long[i5];
        this.f2883c = new Object[i5];
    }
}
