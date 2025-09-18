package p000;

import android.graphics.Typeface;

/* renamed from: Fp */
/* loaded from: classes.dex */
public final class C0367Fp extends AbstractC10272mU1 {

    /* renamed from: a */
    public final Typeface f3427a;

    /* renamed from: b */
    public final QQ0 f3428b;

    /* renamed from: c */
    public boolean f3429c;

    public C0367Fp(QQ0 qq0, Typeface typeface) {
        this.f3427a = typeface;
        this.f3428b = qq0;
    }

    @Override // p000.AbstractC10272mU1
    /* renamed from: a */
    public final void mo2788a(int i) {
        if (this.f3429c) {
            return;
        }
        C6852su c6852su = (C6852su) this.f3428b.f9619a;
        if (c6852su.m24805j(this.f3427a)) {
            c6852su.m24803h(false);
        }
    }

    @Override // p000.AbstractC10272mU1
    /* renamed from: b */
    public final void mo2789b(Typeface typeface, boolean z) {
        if (this.f3429c) {
            return;
        }
        C6852su c6852su = (C6852su) this.f3428b.f9619a;
        if (c6852su.m24805j(typeface)) {
            c6852su.m24803h(false);
        }
    }
}
