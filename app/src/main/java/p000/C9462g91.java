package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* renamed from: g91 */
/* loaded from: classes.dex */
public final class C9462g91 extends AbstractC10272mU1 {

    /* renamed from: a */
    public final /* synthetic */ Context f27589a;

    /* renamed from: b */
    public final /* synthetic */ TextPaint f27590b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC10272mU1 f27591c;

    /* renamed from: d */
    public final /* synthetic */ C9590h91 f27592d;

    public C9462g91(C9590h91 c9590h91, Context context, TextPaint textPaint, AbstractC10272mU1 abstractC10272mU1) {
        this.f27592d = c9590h91;
        this.f27589a = context;
        this.f27590b = textPaint;
        this.f27591c = abstractC10272mU1;
    }

    @Override // p000.AbstractC10272mU1
    /* renamed from: a */
    public final void mo2788a(int i) {
        this.f27591c.mo2788a(i);
    }

    @Override // p000.AbstractC10272mU1
    /* renamed from: b */
    public final void mo2789b(Typeface typeface, boolean z) {
        this.f27592d.m18734g(this.f27589a, this.f27590b, typeface);
        this.f27591c.mo2789b(typeface, z);
    }
}
