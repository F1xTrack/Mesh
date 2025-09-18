package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* renamed from: g91 */
/* loaded from: classes.dex */
public final class C3910g91 extends AbstractC5895mU1 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ TextPaint b;
    public final /* synthetic */ AbstractC5895mU1 c;
    public final /* synthetic */ C4101h91 d;

    public C3910g91(C4101h91 c4101h91, Context context, TextPaint textPaint, AbstractC5895mU1 abstractC5895mU1) {
        this.d = c4101h91;
        this.a = context;
        this.b = textPaint;
        this.c = abstractC5895mU1;
    }

    @Override // defpackage.AbstractC5895mU1
    public final void a(int i) {
        this.c.a(i);
    }

    @Override // defpackage.AbstractC5895mU1
    public final void b(Typeface typeface, boolean z) {
        this.d.g(this.a, this.b, typeface);
        this.c.b(typeface, z);
    }
}
