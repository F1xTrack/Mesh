package p000;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: bN0 */
/* loaded from: classes.dex */
public class C8844bN0 extends KJ0 {

    /* renamed from: c0 */
    public static final TextPaint f16998c0 = new TextPaint(1);

    /* renamed from: a0 */
    public SpannableStringBuilder f16999a0;

    /* renamed from: b0 */
    public boolean f17000b0;

    public C8844bN0(InterfaceC9233eN0 interfaceC9233eN0) {
        super(interfaceC9233eN0);
        C9196e41 c9196e41 = new C9196e41(27, this);
        C7391Bm1 c7391Bm1 = new C7391Bm1(28, this);
        m2173D(c9196e41);
        YogaNodeJNIBase yogaNodeJNIBase = this.f2669u;
        yogaNodeJNIBase.f17996d = c7391Bm1;
        YogaNative.jni_YGNodeSetHasBaselineFuncJNI(yogaNodeJNIBase.f17997e, true);
    }

    /* renamed from: L */
    public static Layout m10450L(C8844bN0 c8844bN0, SpannableStringBuilder spannableStringBuilder, float f, EnumC7813Jp1 enumC7813Jp1) {
        TextPaint textPaint = f16998c0;
        textPaint.setTextSize(c8844bN0.f5989A.m21976a());
        BoringLayout.Metrics metricsIsBoring = BoringLayout.isBoring(spannableStringBuilder, textPaint);
        float desiredWidth = metricsIsBoring == null ? Layout.getDesiredWidth(spannableStringBuilder, textPaint) : Float.NaN;
        boolean z = enumC7813Jp1 == EnumC7813Jp1.f5715a || f < 0.0f;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        int i = c8844bN0.f5997I;
        if (c8844bN0.f2669u.m11092a() == 3) {
            if (i == 5) {
                i = 3;
            } else if (i == 3) {
                i = 5;
            }
        }
        if (i == 1) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i != 3 && i == 5) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        Layout.Alignment alignment2 = alignment;
        if (metricsIsBoring == null && (z || (!AbstractC11619x12.m25735a(desiredWidth) && desiredWidth <= f))) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, (int) Math.ceil(desiredWidth)).setAlignment(alignment2).setLineSpacing(0.0f, 1.0f).setIncludePad(c8844bN0.f6006R).setBreakStrategy(c8844bN0.f5998J).setHyphenationFrequency(0);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 26) {
                hyphenationFrequency.setJustificationMode(c8844bN0.f5999K);
            }
            if (i2 >= 28) {
                hyphenationFrequency.setUseLineSpacingFromFallbacks(true);
            }
            return hyphenationFrequency.build();
        }
        if (metricsIsBoring != null && (z || metricsIsBoring.width <= f)) {
            return BoringLayout.make(spannableStringBuilder, textPaint, Math.max(metricsIsBoring.width, 0), alignment2, 1.0f, 0.0f, metricsIsBoring, c8844bN0.f6006R);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 > 29) {
            f = (float) Math.ceil(f);
        }
        StaticLayout.Builder hyphenationFrequency2 = StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, (int) f).setAlignment(alignment2).setLineSpacing(0.0f, 1.0f).setIncludePad(c8844bN0.f6006R).setBreakStrategy(c8844bN0.f5998J).setHyphenationFrequency(0);
        if (i3 >= 28) {
            hyphenationFrequency2.setUseLineSpacingFromFallbacks(true);
        }
        return hyphenationFrequency2.build();
    }

    @Override // p000.EM0, p000.DM0
    /* renamed from: a */
    public final ArrayList mo1651a() {
        HashMap map = this.f6014Z;
        if (map == null || map.isEmpty()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = this.f16999a0;
        UN1.m8000d(spannableStringBuilder, "Spannable element has not been prepared in onBeforeLayout");
        C10870r91[] c10870r91Arr = (C10870r91[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C10870r91.class);
        ArrayList arrayList = new ArrayList(c10870r91Arr.length);
        for (C10870r91 c10870r91 : c10870r91Arr) {
            EM0 em0 = (EM0) ((DM0) this.f6014Z.get(Integer.valueOf(c10870r91.f41366a)));
            em0.m2179h(Float.NaN, Float.NaN);
            arrayList.add(em0);
        }
        return arrayList;
    }

    @Override // p000.EM0, p000.DM0
    /* renamed from: b */
    public final void mo1652b(C10910rT1 c10910rT1) {
        this.f16999a0 = m4595K(this, null, true, c10910rT1);
        mo2191t();
    }

    @Override // p000.EM0
    /* renamed from: q */
    public final boolean mo2188q() {
        return true;
    }

    @Override // p000.EM0
    /* renamed from: r */
    public final boolean mo2189r() {
        return false;
    }

    @InterfaceC9871jM0(name = "onTextLayout")
    public void setShouldNotifyOnTextLayout(boolean z) {
        this.f17000b0 = z;
    }

    @Override // p000.EM0
    /* renamed from: t */
    public final void mo2191t() {
        super.mo2191t();
        m2180i();
    }

    @Override // p000.EM0
    /* renamed from: u */
    public final void mo2192u(C11827yf1 c11827yf1) {
        SpannableStringBuilder spannableStringBuilder = this.f16999a0;
        if (spannableStringBuilder != null) {
            boolean z = this.f6013Y;
            float fM2185n = m2185n(4);
            float fM2185n2 = m2185n(1);
            float fM2185n3 = m2185n(5);
            float fM2185n4 = m2185n(3);
            int i = this.f5997I;
            if (this.f2669u.m11092a() == 3) {
                if (i == 5) {
                    i = 3;
                } else if (i == 3) {
                    i = 5;
                }
            }
            c11827yf1.f46391h.add(new C11573wf1(c11827yf1, this.f2649a, new C8972cN0(spannableStringBuilder, -1, z, fM2185n, fM2185n2, fM2185n3, fM2185n4, i, this.f5998J, this.f5999K), 1));
        }
    }
}
