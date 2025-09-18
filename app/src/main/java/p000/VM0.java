package p000;

import android.text.SpannableStringBuilder;

/* loaded from: classes.dex */
public final class VM0 {

    /* renamed from: a */
    public final SpannableStringBuilder f12527a;

    /* renamed from: b */
    public final float f12528b;

    /* renamed from: c */
    public final int f12529c;

    /* renamed from: d */
    public final int f12530d;

    /* renamed from: e */
    public final int f12531e;

    /* renamed from: f */
    public final int f12532f;

    /* renamed from: g */
    public final CharSequence f12533g;

    public VM0(C9099dK0 c9099dK0) {
        this.f12527a = new SpannableStringBuilder(c9099dK0.getText());
        this.f12528b = c9099dK0.getTextSize();
        this.f12531e = c9099dK0.getInputType();
        this.f12533g = c9099dK0.getHint();
        this.f12529c = c9099dK0.getMinLines();
        this.f12530d = c9099dK0.getMaxLines();
        this.f12532f = c9099dK0.getBreakStrategy();
    }
}
