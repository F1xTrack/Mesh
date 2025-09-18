package p000;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class J41 {

    /* renamed from: a */
    public CharSequence f5320a;

    /* renamed from: b */
    public final TextPaint f5321b;

    /* renamed from: c */
    public final int f5322c;

    /* renamed from: d */
    public int f5323d;

    /* renamed from: j */
    public boolean f5329j;

    /* renamed from: e */
    public Layout.Alignment f5324e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f */
    public int f5325f = Integer.MAX_VALUE;

    /* renamed from: g */
    public float f5326g = 1.0f;

    /* renamed from: h */
    public int f5327h = 1;

    /* renamed from: i */
    public boolean f5328i = true;

    /* renamed from: k */
    public TextUtils.TruncateAt f5330k = null;

    public J41(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f5320a = charSequence;
        this.f5321b = textPaint;
        this.f5322c = i;
        this.f5323d = charSequence.length();
    }

    /* renamed from: a */
    public final StaticLayout m4152a() {
        if (this.f5320a == null) {
            this.f5320a = "";
        }
        int iMax = Math.max(0, this.f5322c);
        CharSequence charSequenceEllipsize = this.f5320a;
        int i = this.f5325f;
        TextPaint textPaint = this.f5321b;
        if (i == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f5330k);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f5323d);
        this.f5323d = iMin;
        if (this.f5329j && this.f5325f == 1) {
            this.f5324e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f5324e);
        builderObtain.setIncludePad(this.f5328i);
        builderObtain.setTextDirection(this.f5329j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f5330k;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f5325f);
        float f = this.f5326g;
        if (f != 1.0f) {
            builderObtain.setLineSpacing(0.0f, f);
        }
        if (this.f5325f > 1) {
            builderObtain.setHyphenationFrequency(this.f5327h);
        }
        return builderObtain.build();
    }
}
