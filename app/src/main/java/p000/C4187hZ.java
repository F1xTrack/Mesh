package p000;

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
public final class C4187hZ extends ReplacementSpan implements LM0 {

    /* renamed from: a */
    public C11037sT0 f28448a;

    /* renamed from: b */
    public final AbstractC0881O f28449b;

    /* renamed from: c */
    public final C6596p6 f28450c;

    /* renamed from: d */
    public final Object f28451d;

    /* renamed from: e */
    public final int f28452e;

    /* renamed from: f */
    public final int f28453f;

    /* renamed from: g */
    public final Uri f28454g;

    /* renamed from: h */
    public final int f28455h;

    /* renamed from: i */
    public final ReadableMap f28456i;

    /* renamed from: j */
    public final String f28457j;

    /* renamed from: k */
    public TextView f28458k;

    public C4187hZ(Resources resources, int i, int i2, int i3, Uri uri, ReadableMap readableMap, AbstractC0881O abstractC0881O, Object obj, String str) {
        this.f28450c = new C6596p6(new F00(new G00(resources)));
        this.f28449b = abstractC0881O;
        this.f28451d = obj;
        this.f28453f = i3;
        this.f28454g = uri == null ? Uri.EMPTY : uri;
        this.f28456i = readableMap;
        this.f28455h = (int) AbstractC11406vL1.m25403b(i2);
        this.f28452e = (int) AbstractC11406vL1.m25403b(i);
        this.f28457j = str;
    }

    /* renamed from: a */
    public static final void m18837a(Spannable spannable, TextView textView) {
        O90.m5968f(spannable, "spannable");
        Object[] spans = spannable.getSpans(0, spannable.length(), C4187hZ.class);
        O90.m5967e(spans, "getSpans(...)");
        for (Object obj : spans) {
            C4187hZ c4187hZ = (C4187hZ) obj;
            EnumC6880tL enumC6880tL = EnumC6880tL.f43011o;
            C6596p6 c6596p6 = c4187hZ.f28450c;
            ((C6943uL) c6596p6.f39834c).m25182a(enumC6880tL);
            c6596p6.f39836e = true;
            c6596p6.m23614d();
            c4187hZ.f28458k = textView;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.f28448a == null) {
            WL0 wl0 = new WL0(C10865r70.m24160c(this.f28454g), this.f28456i);
            C6596p6 c6596p6 = this.f28450c;
            InterfaceC7006vL interfaceC7006vL = (InterfaceC7006vL) c6596p6.f39838g;
            interfaceC7006vL.getClass();
            AbstractC10522oR1 abstractC10522oR1M18934a = AbstractC9703i22.m18934a(this.f28457j);
            C10913rV0 c10913rV0M2477f = ((F00) interfaceC7006vL).m2477f(2);
            if (!EI1.m2118a(c10913rV0M2477f.f41687d, abstractC10522oR1M18934a)) {
                c10913rV0M2477f.f41687d = abstractC10522oR1M18934a;
                c10913rV0M2477f.m24393v();
                c10913rV0M2477f.invalidateSelf();
            }
            AbstractC0881O abstractC0881O = this.f28449b;
            abstractC0881O.m5920b();
            abstractC0881O.f8162f = (InterfaceC6817sL) c6596p6.f39833b;
            abstractC0881O.f8157a = this.f28451d;
            abstractC0881O.f8158b = wl0;
            c6596p6.m23620j(abstractC0881O.m5919a());
            abstractC0881O.m5920b();
            C11037sT0 c11037sT0M23616f = c6596p6.m23616f();
            this.f28448a = c11037sT0M23616f;
            c11037sT0M23616f.setBounds(0, 0, this.f28455h, this.f28452e);
            int i6 = this.f28453f;
            if (i6 != 0) {
                this.f28448a.setColorFilter(i6, PorterDuff.Mode.SRC_IN);
            }
            this.f28448a.setCallback(this.f28458k);
        }
        canvas.save();
        canvas.translate(f, ((i4 + ((int) paint.descent())) - (((int) (paint.descent() - paint.ascent())) / 2)) - ((this.f28448a.getBounds().bottom - this.f28448a.getBounds().top) / 2));
        this.f28448a.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i3 = -this.f28452e;
            fontMetricsInt.ascent = i3;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i3;
            fontMetricsInt.bottom = 0;
        }
        return this.f28455h;
    }
}
