package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class DS extends CO0 {
    public final /* synthetic */ FS a;

    public DS(FS fs) {
        this.a = fs;
    }

    @Override // defpackage.CO0
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        FS fs = this.a;
        int iComputeVerticalScrollRange = fs.s.computeVerticalScrollRange();
        int i3 = fs.r;
        int i4 = iComputeVerticalScrollRange - i3;
        int i5 = fs.a;
        fs.t = i4 > 0 && i3 >= i5;
        int iComputeHorizontalScrollRange = fs.s.computeHorizontalScrollRange();
        int i6 = fs.q;
        boolean z = iComputeHorizontalScrollRange - i6 > 0 && i6 >= i5;
        fs.u = z;
        boolean z2 = fs.t;
        if (!z2 && !z) {
            if (fs.v != 0) {
                fs.f(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i3;
            fs.l = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
            fs.k = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
        }
        if (fs.u) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i6;
            fs.o = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
            fs.n = Math.min(i6, (i6 * i6) / iComputeHorizontalScrollRange);
        }
        int i7 = fs.v;
        if (i7 == 0 || i7 == 1) {
            fs.f(1);
        }
    }
}
