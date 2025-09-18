package p000;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: DS */
/* loaded from: classes.dex */
public final class C0218DS extends CO0 {

    /* renamed from: a */
    public final /* synthetic */ C0344FS f2018a;

    public C0218DS(C0344FS c0344fs) {
        this.f2018a = c0344fs;
    }

    @Override // p000.CO0
    /* renamed from: b */
    public final void mo469b(RecyclerView recyclerView, int i, int i2) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0344FS c0344fs = this.f2018a;
        int iComputeVerticalScrollRange = c0344fs.f3248s.computeVerticalScrollRange();
        int i3 = c0344fs.f3247r;
        int i4 = iComputeVerticalScrollRange - i3;
        int i5 = c0344fs.f3230a;
        c0344fs.f3249t = i4 > 0 && i3 >= i5;
        int iComputeHorizontalScrollRange = c0344fs.f3248s.computeHorizontalScrollRange();
        int i6 = c0344fs.f3246q;
        boolean z = iComputeHorizontalScrollRange - i6 > 0 && i6 >= i5;
        c0344fs.f3250u = z;
        boolean z2 = c0344fs.f3249t;
        if (!z2 && !z) {
            if (c0344fs.f3251v != 0) {
                c0344fs.m2659f(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i3;
            c0344fs.f3241l = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
            c0344fs.f3240k = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
        }
        if (c0344fs.f3250u) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i6;
            c0344fs.f3244o = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
            c0344fs.f3243n = Math.min(i6, (i6 * i6) / iComputeHorizontalScrollRange);
        }
        int i7 = c0344fs.f3251v;
        if (i7 == 0 || i7 == 1) {
            c0344fs.m2659f(1);
        }
    }
}
