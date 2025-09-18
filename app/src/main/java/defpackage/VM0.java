package defpackage;

import android.text.SpannableStringBuilder;

/* loaded from: classes.dex */
public final class VM0 {
    public final SpannableStringBuilder a;
    public final float b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final CharSequence g;

    public VM0(C3370dK0 c3370dK0) {
        this.a = new SpannableStringBuilder(c3370dK0.getText());
        this.b = c3370dK0.getTextSize();
        this.e = c3370dK0.getInputType();
        this.g = c3370dK0.getHint();
        this.c = c3370dK0.getMinLines();
        this.d = c3370dK0.getMaxLines();
        this.f = c3370dK0.getBreakStrategy();
    }
}
