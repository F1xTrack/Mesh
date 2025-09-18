package defpackage;

/* renamed from: El0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0366El0 implements Cloneable {
    public static final Object e = new Object();
    public boolean a;
    public long[] b;
    public Object[] c;
    public int d;

    public C0366El0() {
        this(10);
    }

    public final void a(long j, Long l) {
        int i = this.d;
        if (i != 0 && j <= this.b[i - 1]) {
            k(j, l);
            return;
        }
        if (this.a && i >= this.b.length) {
            i();
        }
        int i2 = this.d;
        if (i2 >= this.b.length) {
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
            long[] jArr2 = this.b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.b = jArr;
            this.c = objArr;
        }
        this.b[i2] = j;
        this.c[i2] = l;
        this.d = i2 + 1;
    }

    public final void e() {
        int i = this.d;
        Object[] objArr = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.d = 0;
        this.a = false;
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final C0366El0 clone() {
        try {
            C0366El0 c0366El0 = (C0366El0) super.clone();
            c0366El0.b = (long[]) this.b.clone();
            c0366El0.c = (Object[]) this.c.clone();
            return c0366El0;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void i() {
        int i = this.d;
        long[] jArr = this.b;
        Object[] objArr = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != e) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.a = false;
        this.d = i2;
    }

    public final Object j(long j, Long l) {
        Object obj;
        int iB = AbstractC0300Dp0.b(this.b, this.d, j);
        return (iB < 0 || (obj = this.c[iB]) == e) ? l : obj;
    }

    public final void k(long j, Object obj) {
        int iB = AbstractC0300Dp0.b(this.b, this.d, j);
        if (iB >= 0) {
            this.c[iB] = obj;
            return;
        }
        int i = ~iB;
        int i2 = this.d;
        if (i < i2) {
            Object[] objArr = this.c;
            if (objArr[i] == e) {
                this.b[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.a && i2 >= this.b.length) {
            i();
            i = ~AbstractC0300Dp0.b(this.b, this.d, j);
        }
        int i3 = this.d;
        if (i3 >= this.b.length) {
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
            long[] jArr2 = this.b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.b = jArr;
            this.c = objArr2;
        }
        int i8 = this.d - i;
        if (i8 != 0) {
            long[] jArr3 = this.b;
            int i9 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i9, i8);
            Object[] objArr4 = this.c;
            System.arraycopy(objArr4, i, objArr4, i9, this.d - i);
        }
        this.b[i] = j;
        this.c[i] = obj;
        this.d++;
    }

    public final int l() {
        if (this.a) {
            i();
        }
        return this.d;
    }

    public final Object m(int i) {
        if (this.a) {
            i();
        }
        return this.c[i];
    }

    public final String toString() {
        if (l() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        for (int i = 0; i < this.d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.a) {
                i();
            }
            sb.append(this.b[i]);
            sb.append('=');
            Object objM = m(i);
            if (objM != this) {
                sb.append(objM);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C0366El0(int i) {
        this.a = false;
        if (i == 0) {
            this.b = AbstractC0300Dp0.b;
            this.c = AbstractC0300Dp0.c;
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
        this.b = new long[i5];
        this.c = new Object[i5];
    }
}
