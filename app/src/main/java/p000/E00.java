package p000;

import android.util.SparseIntArray;

/* loaded from: classes.dex */
public class E00 extends AbstractC6901tg {

    /* renamed from: j */
    public final int[] f2335j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E00(C7564Ev0 c7564Ev0, C9211eC0 c9211eC0, C7616Fv0 c7616Fv0) {
        super(c7564Ev0, c9211eC0, c7616Fv0);
        O90.m5968f(c7564Ev0, "memoryTrimmableRegistry");
        O90.m5968f(c9211eC0, "poolParams");
        O90.m5968f(c7616Fv0, "poolStatsTracker");
        SparseIntArray sparseIntArray = c9211eC0.f26592c;
        if (sparseIntArray != null) {
            this.f2335j = new int[sparseIntArray.size()];
            int size = sparseIntArray.size();
            for (int i = 0; i < size; i++) {
                this.f2335j[i] = sparseIntArray.keyAt(i);
            }
        } else {
            this.f2335j = new int[0];
        }
        this.f43206b.getClass();
        this.f43213i.getClass();
    }

    @Override // p000.AbstractC6901tg
    /* renamed from: a */
    public final Object mo1967a(int i) {
        return new byte[i];
    }

    @Override // p000.AbstractC6901tg
    /* renamed from: e */
    public final void mo1968e(Object obj) {
        O90.m5968f((byte[]) obj, "value");
    }

    @Override // p000.AbstractC6901tg
    /* renamed from: h */
    public final int mo1969h(int i) {
        if (i <= 0) {
            throw new C6838sg(Integer.valueOf(i));
        }
        for (int i2 : this.f2335j) {
            if (i2 >= i) {
                return i2;
            }
        }
        return i;
    }

    @Override // p000.AbstractC6901tg
    /* renamed from: i */
    public final int mo1970i(Object obj) {
        byte[] bArr = (byte[]) obj;
        O90.m5968f(bArr, "value");
        return bArr.length;
    }

    @Override // p000.AbstractC6901tg
    /* renamed from: j */
    public final int mo1971j(int i) {
        return i;
    }
}
