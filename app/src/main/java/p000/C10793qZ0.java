package p000;

import android.text.SpannableStringBuilder;

/* renamed from: qZ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10793qZ0 {

    /* renamed from: a */
    public final int f41022a;

    /* renamed from: b */
    public final int f41023b;

    /* renamed from: c */
    public final LM0 f41024c;

    public C10793qZ0(int i, int i2, LM0 lm0) {
        this.f41022a = i;
        this.f41023b = i2;
        this.f41024c = lm0;
    }

    /* renamed from: a */
    public final void m24024a(SpannableStringBuilder spannableStringBuilder, int i) {
        if (i < 0) {
            throw new IllegalStateException("Check failed.");
        }
        int i2 = this.f41022a;
        int i3 = i2 == 0 ? 18 : 34;
        int i4 = 255 - i;
        if (i4 < 0) {
            AbstractC3929dS.m17683p("SetSpanOperation");
        }
        spannableStringBuilder.setSpan(this.f41024c, i2, this.f41023b, ((Math.max(i4, 0) << 16) & 16711680) | (i3 & (-16711681)));
    }
}
