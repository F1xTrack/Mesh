package p000;

import android.graphics.Typeface;

/* renamed from: f91 */
/* loaded from: classes.dex */
public final class C9334f91 extends EQ1 {

    /* renamed from: a */
    public final /* synthetic */ AbstractC10272mU1 f27094a;

    /* renamed from: b */
    public final /* synthetic */ C9590h91 f27095b;

    public C9334f91(C9590h91 c9590h91, AbstractC10272mU1 abstractC10272mU1) {
        this.f27095b = c9590h91;
        this.f27094a = abstractC10272mU1;
    }

    @Override // p000.EQ1
    /* renamed from: c */
    public final void mo2267c(int i) {
        this.f27095b.f28287m = true;
        this.f27094a.mo2788a(i);
    }

    @Override // p000.EQ1
    /* renamed from: d */
    public final void mo2268d(Typeface typeface) {
        C9590h91 c9590h91 = this.f27095b;
        c9590h91.f28288n = Typeface.create(typeface, c9590h91.f28277c);
        c9590h91.f28287m = true;
        this.f27094a.mo2789b(c9590h91.f28288n, false);
    }
}
