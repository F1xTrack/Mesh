package p000;

/* renamed from: c31, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8932c31 implements Cloneable {

    /* renamed from: d */
    public static final Object f17273d = new Object();

    /* renamed from: a */
    public int[] f17274a;

    /* renamed from: b */
    public Object[] f17275b;

    /* renamed from: c */
    public int f17276c;

    public C8932c31() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.f17274a = new int[i4];
        this.f17275b = new Object[i4];
    }

    /* renamed from: a */
    public final void m10580a(int i, Object obj) {
        int i2 = this.f17276c;
        if (i2 != 0 && i <= this.f17274a[i2 - 1]) {
            m10583g(i, obj);
            return;
        }
        if (i2 >= this.f17274a.length) {
            int i3 = (i2 + 1) * 4;
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
            int i6 = i3 / 4;
            int[] iArr = new int[i6];
            Object[] objArr = new Object[i6];
            int[] iArr2 = this.f17274a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f17275b;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f17274a = iArr;
            this.f17275b = objArr;
        }
        this.f17274a[i2] = i;
        this.f17275b[i2] = obj;
        this.f17276c = i2 + 1;
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final C8932c31 clone() {
        try {
            C8932c31 c8932c31 = (C8932c31) super.clone();
            c8932c31.f17274a = (int[]) this.f17274a.clone();
            c8932c31.f17275b = (Object[]) this.f17275b.clone();
            return c8932c31;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: f */
    public final Object m10582f(int i, Integer num) {
        Object obj;
        int iM1900a = AbstractC7500Dp0.m1900a(this.f17276c, i, this.f17274a);
        return (iM1900a < 0 || (obj = this.f17275b[iM1900a]) == f17273d) ? num : obj;
    }

    /* renamed from: g */
    public final void m10583g(int i, Object obj) {
        int iM1900a = AbstractC7500Dp0.m1900a(this.f17276c, i, this.f17274a);
        if (iM1900a >= 0) {
            this.f17275b[iM1900a] = obj;
            return;
        }
        int i2 = ~iM1900a;
        int i3 = this.f17276c;
        if (i2 < i3) {
            Object[] objArr = this.f17275b;
            if (objArr[i2] == f17273d) {
                this.f17274a[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.f17274a.length) {
            int i4 = (i3 + 1) * 4;
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
            int i7 = i4 / 4;
            int[] iArr = new int[i7];
            Object[] objArr2 = new Object[i7];
            int[] iArr2 = this.f17274a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f17275b;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f17274a = iArr;
            this.f17275b = objArr2;
        }
        int i8 = this.f17276c - i2;
        if (i8 != 0) {
            int[] iArr3 = this.f17274a;
            int i9 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i9, i8);
            Object[] objArr4 = this.f17275b;
            System.arraycopy(objArr4, i2, objArr4, i9, this.f17276c - i2);
        }
        this.f17274a[i2] = i;
        this.f17275b[i2] = obj;
        this.f17276c++;
    }

    public final String toString() {
        int i = this.f17276c;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f17276c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(this.f17274a[i2]);
            sb.append('=');
            Object obj = this.f17275b[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
