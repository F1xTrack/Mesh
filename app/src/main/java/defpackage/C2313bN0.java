package defpackage;

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
public class C2313bN0 extends KJ0 {
    public static final TextPaint c0 = new TextPaint(1);
    public SpannableStringBuilder a0;
    public boolean b0;

    public C2313bN0(InterfaceC3569eN0 interfaceC3569eN0) {
        super(interfaceC3569eN0);
        C3513e41 c3513e41 = new C3513e41(27, this);
        C0136Bm1 c0136Bm1 = new C0136Bm1(28, this);
        D(c3513e41);
        YogaNodeJNIBase yogaNodeJNIBase = this.u;
        yogaNodeJNIBase.d = c0136Bm1;
        YogaNative.jni_YGNodeSetHasBaselineFuncJNI(yogaNodeJNIBase.e, true);
    }

    public static Layout L(C2313bN0 c2313bN0, SpannableStringBuilder spannableStringBuilder, float f, EnumC0769Jp1 enumC0769Jp1) {
        TextPaint textPaint = c0;
        textPaint.setTextSize(c2313bN0.A.a());
        BoringLayout.Metrics metricsIsBoring = BoringLayout.isBoring(spannableStringBuilder, textPaint);
        float desiredWidth = metricsIsBoring == null ? Layout.getDesiredWidth(spannableStringBuilder, textPaint) : Float.NaN;
        boolean z = enumC0769Jp1 == EnumC0769Jp1.a || f < 0.0f;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        int i = c2313bN0.I;
        if (c2313bN0.u.a() == 3) {
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
        if (metricsIsBoring == null && (z || (!AbstractC7905x12.a(desiredWidth) && desiredWidth <= f))) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, (int) Math.ceil(desiredWidth)).setAlignment(alignment2).setLineSpacing(0.0f, 1.0f).setIncludePad(c2313bN0.R).setBreakStrategy(c2313bN0.J).setHyphenationFrequency(0);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 26) {
                hyphenationFrequency.setJustificationMode(c2313bN0.K);
            }
            if (i2 >= 28) {
                hyphenationFrequency.setUseLineSpacingFromFallbacks(true);
            }
            return hyphenationFrequency.build();
        }
        if (metricsIsBoring != null && (z || metricsIsBoring.width <= f)) {
            return BoringLayout.make(spannableStringBuilder, textPaint, Math.max(metricsIsBoring.width, 0), alignment2, 1.0f, 0.0f, metricsIsBoring, c2313bN0.R);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 > 29) {
            f = (float) Math.ceil(f);
        }
        StaticLayout.Builder hyphenationFrequency2 = StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, (int) f).setAlignment(alignment2).setLineSpacing(0.0f, 1.0f).setIncludePad(c2313bN0.R).setBreakStrategy(c2313bN0.J).setHyphenationFrequency(0);
        if (i3 >= 28) {
            hyphenationFrequency2.setUseLineSpacingFromFallbacks(true);
        }
        return hyphenationFrequency2.build();
    }

    @Override // defpackage.EM0, defpackage.DM0
    public final ArrayList a() {
        HashMap map = this.Z;
        if (map == null || map.isEmpty()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = this.a0;
        UN1.d(spannableStringBuilder, "Spannable element has not been prepared in onBeforeLayout");
        C6786r91[] c6786r91Arr = (C6786r91[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C6786r91.class);
        ArrayList arrayList = new ArrayList(c6786r91Arr.length);
        for (C6786r91 c6786r91 : c6786r91Arr) {
            EM0 em0 = (EM0) ((DM0) this.Z.get(Integer.valueOf(c6786r91.a)));
            em0.h(Float.NaN, Float.NaN);
            arrayList.add(em0);
        }
        return arrayList;
    }

    @Override // defpackage.EM0, defpackage.DM0
    public final void b(C6846rT1 c6846rT1) {
        this.a0 = K(this, null, true, c6846rT1);
        t();
    }

    @Override // defpackage.EM0
    public final boolean q() {
        return true;
    }

    @Override // defpackage.EM0
    public final boolean r() {
        return false;
    }

    @InterfaceC5297jM0(name = "onTextLayout")
    public void setShouldNotifyOnTextLayout(boolean z) {
        this.b0 = z;
    }

    @Override // defpackage.EM0
    public final void t() {
        super.t();
        i();
    }

    @Override // defpackage.EM0
    public final void u(C8216yf1 c8216yf1) {
        SpannableStringBuilder spannableStringBuilder = this.a0;
        if (spannableStringBuilder != null) {
            boolean z = this.Y;
            float fN = n(4);
            float fN2 = n(1);
            float fN3 = n(5);
            float fN4 = n(3);
            int i = this.I;
            if (this.u.a() == 3) {
                if (i == 5) {
                    i = 3;
                } else if (i == 3) {
                    i = 5;
                }
            }
            c8216yf1.h.add(new C7836wf1(c8216yf1, this.a, new C2503cN0(spannableStringBuilder, -1, z, fN, fN2, fN3, fN4, i, this.J, this.K), 1));
        }
    }
}
