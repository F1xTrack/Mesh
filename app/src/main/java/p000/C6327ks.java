package p000;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: ks */
/* loaded from: classes.dex */
public final class C6327ks {

    /* renamed from: a */
    public int f36730a;

    /* renamed from: b */
    public int f36731b;

    /* renamed from: c */
    public int[] f36732c;

    /* renamed from: d */
    public int f36733d;

    public C6327ks() {
        int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f36733d = iHighestOneBit - 1;
        this.f36732c = new int[iHighestOneBit];
    }

    /* renamed from: a */
    public void m22275a(int i) {
        int[] iArr = this.f36732c;
        int i2 = this.f36731b;
        iArr[i2] = i;
        int i3 = this.f36733d & (i2 + 1);
        this.f36731b = i3;
        int i4 = this.f36730a;
        if (i3 == i4) {
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length << 1;
            if (i6 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i6];
            System.arraycopy(iArr, i4, iArr2, 0, i5);
            System.arraycopy(this.f36732c, 0, iArr2, i5, this.f36730a);
            this.f36732c = iArr2;
            this.f36730a = 0;
            this.f36731b = length;
            this.f36733d = i6 - 1;
        }
    }

    /* renamed from: b */
    public void m22276b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.f36733d;
        int i4 = i3 * 2;
        int[] iArr = this.f36732c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f36732c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f36732c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f36732c;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.f36733d++;
    }

    /* renamed from: c */
    public void m22277c(RecyclerView recyclerView, boolean z) {
        this.f36733d = 0;
        int[] iArr = this.f36732c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC11919zO0 abstractC11919zO0 = recyclerView.f16512n;
        if (recyclerView.f16511m == null || abstractC11919zO0 == null || !abstractC11919zO0.f46821i) {
            return;
        }
        if (z) {
            if (!recyclerView.f16502e.m18946k()) {
                abstractC11919zO0.mo10219i(recyclerView.f16511m.mo3173a(), this);
            }
        } else if (!recyclerView.m10247O()) {
            abstractC11919zO0.mo10217h(this.f36730a, this.f36731b, recyclerView.f16520s1, this);
        }
        int i = this.f36733d;
        if (i > abstractC11919zO0.f46822j) {
            abstractC11919zO0.f46822j = i;
            abstractC11919zO0.f46823k = z;
            recyclerView.f16498c.m2630m();
        }
    }
}
