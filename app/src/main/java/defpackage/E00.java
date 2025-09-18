package defpackage;

import android.util.SparseIntArray;

/* loaded from: classes.dex */
public class E00 extends AbstractC7265tg {
    public final int[] j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E00(C0396Ev0 c0396Ev0, C3536eC0 c3536eC0, C0474Fv0 c0474Fv0) {
        super(c0396Ev0, c3536eC0, c0474Fv0);
        O90.f(c0396Ev0, "memoryTrimmableRegistry");
        O90.f(c3536eC0, "poolParams");
        O90.f(c0474Fv0, "poolStatsTracker");
        SparseIntArray sparseIntArray = c3536eC0.c;
        if (sparseIntArray != null) {
            this.j = new int[sparseIntArray.size()];
            int size = sparseIntArray.size();
            for (int i = 0; i < size; i++) {
                this.j[i] = sparseIntArray.keyAt(i);
            }
        } else {
            this.j = new int[0];
        }
        this.b.getClass();
        this.i.getClass();
    }

    @Override // defpackage.AbstractC7265tg
    public final Object a(int i) {
        return new byte[i];
    }

    @Override // defpackage.AbstractC7265tg
    public final void e(Object obj) {
        O90.f((byte[]) obj, "value");
    }

    @Override // defpackage.AbstractC7265tg
    public final int h(int i) {
        if (i <= 0) {
            throw new C7074sg(Integer.valueOf(i));
        }
        for (int i2 : this.j) {
            if (i2 >= i) {
                return i2;
            }
        }
        return i;
    }

    @Override // defpackage.AbstractC7265tg
    public final int i(Object obj) {
        byte[] bArr = (byte[]) obj;
        O90.f(bArr, "value");
        return bArr.length;
    }

    @Override // defpackage.AbstractC7265tg
    public final int j(int i) {
        return i;
    }
}
