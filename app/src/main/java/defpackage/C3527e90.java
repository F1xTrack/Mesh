package defpackage;

import java.util.Iterator;

/* renamed from: e90 */
/* loaded from: classes2.dex */
public class C3527e90 implements Iterable, InterfaceC7451ue0 {
    public final int a;
    public final int b;
    public final int c;

    public C3527e90(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.a = i;
        this.b = AbstractC7207tM1.a(i, i2, i3);
        this.c = i3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3527e90) {
            if (!isEmpty() || !((C3527e90) obj).isEmpty()) {
                C3527e90 c3527e90 = (C3527e90) obj;
                if (this.a != c3527e90.a || this.b != c3527e90.b || this.c != c3527e90.c) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public boolean isEmpty() {
        int i = this.c;
        int i2 = this.b;
        int i3 = this.a;
        if (i > 0) {
            if (i3 <= i2) {
                return false;
            }
        } else if (i3 >= i2) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C3718f90(this.a, this.b, this.c);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.b;
        int i2 = this.a;
        int i3 = this.c;
        if (i3 > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i3);
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i3);
        }
        return sb.toString();
    }
}
