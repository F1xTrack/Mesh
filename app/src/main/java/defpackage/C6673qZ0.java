package defpackage;

import android.text.SpannableStringBuilder;

/* renamed from: qZ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6673qZ0 {
    public final int a;
    public final int b;
    public final LM0 c;

    public C6673qZ0(int i, int i2, LM0 lm0) {
        this.a = i;
        this.b = i2;
        this.c = lm0;
    }

    public final void a(SpannableStringBuilder spannableStringBuilder, int i) {
        if (i < 0) {
            throw new IllegalStateException("Check failed.");
        }
        int i2 = this.a;
        int i3 = i2 == 0 ? 18 : 34;
        int i4 = 255 - i;
        if (i4 < 0) {
            AbstractC3393dS.p("SetSpanOperation");
        }
        spannableStringBuilder.setSpan(this.c, i2, this.b, ((Math.max(i4, 0) << 16) & 16711680) | (i3 & (-16711681)));
    }
}
