package defpackage;

import android.graphics.Typeface;

/* renamed from: f91 */
/* loaded from: classes.dex */
public final class C3719f91 extends EQ1 {
    public final /* synthetic */ AbstractC5895mU1 a;
    public final /* synthetic */ C4101h91 b;

    public C3719f91(C4101h91 c4101h91, AbstractC5895mU1 abstractC5895mU1) {
        this.b = c4101h91;
        this.a = abstractC5895mU1;
    }

    @Override // defpackage.EQ1
    public final void c(int i) {
        this.b.m = true;
        this.a.a(i);
    }

    @Override // defpackage.EQ1
    public final void d(Typeface typeface) {
        C4101h91 c4101h91 = this.b;
        c4101h91.n = Typeface.create(typeface, c4101h91.c);
        c4101h91.m = true;
        this.a.b(c4101h91.n, false);
    }
}
