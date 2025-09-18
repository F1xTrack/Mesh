package p000;

import java.util.Iterator;

/* renamed from: e90 */
/* loaded from: classes2.dex */
public class C9205e90 implements Iterable, InterfaceC11315ue0 {

    /* renamed from: a */
    public final int f26569a;

    /* renamed from: b */
    public final int f26570b;

    /* renamed from: c */
    public final int f26571c;

    public C9205e90(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f26569a = i;
        this.f26570b = AbstractC11152tM1.m24880a(i, i2, i3);
        this.f26571c = i3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9205e90) {
            if (!isEmpty() || !((C9205e90) obj).isEmpty()) {
                C9205e90 c9205e90 = (C9205e90) obj;
                if (this.f26569a != c9205e90.f26569a || this.f26570b != c9205e90.f26570b || this.f26571c != c9205e90.f26571c) {
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
        return (((this.f26569a * 31) + this.f26570b) * 31) + this.f26571c;
    }

    public boolean isEmpty() {
        int i = this.f26571c;
        int i2 = this.f26570b;
        int i3 = this.f26569a;
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
        return new C9333f90(this.f26569a, this.f26570b, this.f26571c);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f26570b;
        int i2 = this.f26569a;
        int i3 = this.f26571c;
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
