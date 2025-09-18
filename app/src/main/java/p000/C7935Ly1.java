package p000;

import java.util.Arrays;

/* renamed from: Ly1 */
/* loaded from: classes.dex */
public final class C7935Ly1 {

    /* renamed from: a */
    public Object[] f6948a = new Object[4];

    /* renamed from: b */
    public int f6949b = 0;

    /* renamed from: c */
    public boolean f6950c;

    /* renamed from: a */
    public void m5174a(Object obj) {
        int i;
        obj.getClass();
        int length = this.f6948a.length;
        int i2 = this.f6949b;
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
        if (i > length || this.f6950c) {
            this.f6948a = Arrays.copyOf(this.f6948a, i);
            this.f6950c = false;
        }
        Object[] objArr = this.f6948a;
        int i4 = this.f6949b;
        this.f6949b = i4 + 1;
        objArr[i4] = obj;
    }

    /* renamed from: b */
    public void m5175b(Object obj) {
        obj.getClass();
        m5176c(this.f6949b + 1);
        Object[] objArr = this.f6948a;
        int i = this.f6949b;
        this.f6949b = i + 1;
        objArr[i] = obj;
    }

    /* renamed from: c */
    public void m5176c(int i) {
        Object[] objArr = this.f6948a;
        int length = objArr.length;
        if (length >= i) {
            if (this.f6950c) {
                this.f6948a = (Object[]) objArr.clone();
                this.f6950c = false;
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
        this.f6948a = Arrays.copyOf(objArr, i2);
        this.f6950c = false;
    }

    /* renamed from: d */
    public ZE1 m5177d() {
        this.f6950c = true;
        Object[] objArr = this.f6948a;
        int i = this.f6949b;
        CD1 cd1 = KD1.f5947b;
        return i == 0 ? ZE1.f14816e : new ZE1(i, objArr);
    }
}
