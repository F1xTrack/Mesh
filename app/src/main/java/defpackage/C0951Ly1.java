package defpackage;

import java.util.Arrays;

/* renamed from: Ly1 */
/* loaded from: classes.dex */
public final class C0951Ly1 {
    public Object[] a = new Object[4];
    public int b = 0;
    public boolean c;

    public void a(Object obj) {
        int i;
        obj.getClass();
        int length = this.a.length;
        int i2 = this.b;
        int i3 = i2 + 1;
        if (i3 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i3 <= length) {
            i = length;
        } else {
            i = (length >> 1) + length + 1;
            if (i < i3) {
                int iHighestOneBit = Integer.highestOneBit(i2);
                i = iHighestOneBit + iHighestOneBit;
            }
            if (i < 0) {
                i = Integer.MAX_VALUE;
            }
        }
        if (i > length || this.c) {
            this.a = Arrays.copyOf(this.a, i);
            this.c = false;
        }
        Object[] objArr = this.a;
        int i4 = this.b;
        this.b = i4 + 1;
        objArr[i4] = obj;
    }

    public void b(Object obj) {
        obj.getClass();
        c(this.b + 1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    public void c(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        if (length >= i) {
            if (this.c) {
                this.a = (Object[]) objArr.clone();
                this.c = false;
                return;
            }
            return;
        }
        int i2 = length + (length >> 1) + 1;
        if (i2 < i) {
            int iHighestOneBit = Integer.highestOneBit(i - 1);
            i2 = iHighestOneBit + iHighestOneBit;
        }
        if (i2 < 0) {
            i2 = Integer.MAX_VALUE;
        }
        this.a = Arrays.copyOf(objArr, i2);
        this.c = false;
    }

    public ZE1 d() {
        this.c = true;
        Object[] objArr = this.a;
        int i = this.b;
        CD1 cd1 = KD1.b;
        return i == 0 ? ZE1.e : new ZE1(i, objArr);
    }
}
