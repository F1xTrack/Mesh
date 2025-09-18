package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.widget.TextView;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: hZ */
/* loaded from: classes.dex */
public final class C4177hZ extends ReplacementSpan implements LM0 {
    public C7036sT0 a;
    public final O b;
    public final C6394p6 c;
    public final Object d;
    public final int e;
    public final int f;
    public final Uri g;
    public final int h;
    public final ReadableMap i;
    public final String j;
    public TextView k;

    public C4177hZ(Resources resources, int i, int i2, int i3, Uri uri, ReadableMap readableMap, O o, Object obj, String str) {
        this.c = new C6394p6(new F00(new G00(resources)));
        this.b = o;
        this.d = obj;
        this.f = i3;
        this.g = uri == null ? Uri.EMPTY : uri;
        this.i = readableMap;
        this.h = (int) AbstractC7586vL1.b(i2);
        this.e = (int) AbstractC7586vL1.b(i);
        this.j = str;
    }

    public static final void a(Spannable spannable, TextView textView) {
        O90.f(spannable, "spannable");
        Object[] spans = spannable.getSpans(0, spannable.length(), C4177hZ.class);
        O90.e(spans, "getSpans(...)");
        for (Object obj : spans) {
            C4177hZ c4177hZ = (C4177hZ) obj;
            EnumC7202tL enumC7202tL = EnumC7202tL.o;
            C6394p6 c6394p6 = c4177hZ.c;
            ((C7393uL) c6394p6.c).a(enumC7202tL);
            c6394p6.e = true;
            c6394p6.d();
            c4177hZ.k = textView;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.a == null) {
            WL0 wl0 = new WL0(C6779r70.c(this.g), this.i);
            C6394p6 c6394p6 = this.c;
            InterfaceC7584vL interfaceC7584vL = (InterfaceC7584vL) c6394p6.g;
            interfaceC7584vL.getClass();
            AbstractC6268oR1 abstractC6268oR1A = AbstractC4270i22.a(this.j);
            C6851rV0 c6851rV0F = ((F00) interfaceC7584vL).f(2);
            if (!EI1.a(c6851rV0F.d, abstractC6268oR1A)) {
                c6851rV0F.d = abstractC6268oR1A;
                c6851rV0F.v();
                c6851rV0F.invalidateSelf();
            }
            O o = this.b;
            o.b();
            o.f = (InterfaceC7011sL) c6394p6.b;
            o.a = this.d;
            o.b = wl0;
            c6394p6.j(o.a());
            o.b();
            C7036sT0 c7036sT0F = c6394p6.f();
            this.a = c7036sT0F;
            c7036sT0F.setBounds(0, 0, this.h, this.e);
            int i6 = this.f;
            if (i6 != 0) {
                this.a.setColorFilter(i6, PorterDuff.Mode.SRC_IN);
            }
            this.a.setCallback(this.k);
        }
        canvas.save();
        canvas.translate(f, ((i4 + ((int) paint.descent())) - (((int) (paint.descent() - paint.ascent())) / 2)) - ((this.a.getBounds().bottom - this.a.getBounds().top) / 2));
        this.a.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i3 = -this.e;
            fontMetricsInt.ascent = i3;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i3;
            fontMetricsInt.bottom = 0;
        }
        return this.h;
    }
}
