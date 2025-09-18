package defpackage;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class A91 {
    public static final TextPaint a = new TextPaint(1);
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    public static void a(Spannable spannable, float f, EnumC0769Jp1 enumC0769Jp1, float f2, EnumC0769Jp1 enumC0769Jp12, double d, int i, boolean z, int i2, int i3, Layout.Alignment alignment) {
        BoringLayout.Metrics metricsIsBoring = BoringLayout.isBoring(spannable, a);
        Layout layoutB = b(spannable, metricsIsBoring, f, enumC0769Jp1, z, i2, i3, alignment);
        int iB = (int) (Double.isNaN(d) ? AbstractC7586vL1.b(4.0f) : d);
        int i4 = 0;
        int iMax = iB;
        for (C7006sJ0 c7006sJ0 : (C7006sJ0[]) spannable.getSpans(0, spannable.length(), C7006sJ0.class)) {
            iMax = Math.max(iMax, c7006sJ0.getSize());
        }
        int i5 = iMax;
        while (i5 > iB) {
            if ((i == -1 || i == 0 || layoutB.getLineCount() <= i) && (enumC0769Jp12 == EnumC0769Jp1.a || layoutB.getHeight() <= f2)) {
                return;
            }
            int iMax2 = i5 - Math.max(1, (int) AbstractC7586vL1.b(1.0f));
            float f3 = iMax2 / iMax;
            C7006sJ0[] c7006sJ0Arr = (C7006sJ0[]) spannable.getSpans(i4, spannable.length(), C7006sJ0.class);
            int length = c7006sJ0Arr.length;
            int i6 = i4;
            while (i6 < length) {
                C7006sJ0 c7006sJ02 = c7006sJ0Arr[i6];
                spannable.setSpan(new C7006sJ0((int) Math.max(c7006sJ02.getSize() * f3, iB)), spannable.getSpanStart(c7006sJ02), spannable.getSpanEnd(c7006sJ02), spannable.getSpanFlags(c7006sJ02));
                spannable.removeSpan(c7006sJ02);
                i6++;
                f3 = f3;
            }
            layoutB = b(spannable, metricsIsBoring, f, enumC0769Jp1, z, i2, i3, alignment);
            i5 = iMax2;
            i4 = 0;
        }
    }

    public static Layout b(Spannable spannable, BoringLayout.Metrics metrics, float f, EnumC0769Jp1 enumC0769Jp1, boolean z, int i, int i2, Layout.Alignment alignment) {
        int i3;
        int length = spannable.length();
        boolean z2 = enumC0769Jp1 == EnumC0769Jp1.a || f < 0.0f;
        TextPaint textPaint = a;
        float desiredWidth = metrics == null ? Layout.getDesiredWidth(spannable, textPaint) : Float.NaN;
        boolean zIsRtl = TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(spannable, 0, length);
        EnumC0769Jp1 enumC0769Jp12 = EnumC0769Jp1.b;
        if (metrics == null && (z2 || (!AbstractC7905x12.a(desiredWidth) && desiredWidth <= f))) {
            if (enumC0769Jp1 == enumC0769Jp12) {
                desiredWidth = f;
            }
            return StaticLayout.Builder.obtain(spannable, 0, length, textPaint, (int) Math.ceil(desiredWidth)).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(zIsRtl ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR).build();
        }
        if (metrics == null || (!z2 && metrics.width > f)) {
            StaticLayout.Builder textDirection = StaticLayout.Builder.obtain(spannable, 0, length, textPaint, (int) Math.ceil(f)).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(zIsRtl ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            if (Build.VERSION.SDK_INT >= 28) {
                textDirection.setUseLineSpacingFromFallbacks(true);
            }
            return textDirection.build();
        }
        int iCeil = metrics.width;
        if (enumC0769Jp1 == enumC0769Jp12) {
            iCeil = (int) Math.ceil(f);
        }
        if (metrics.width < 0) {
            ReactSoftExceptionLogger.logSoftException("A91", new ReactNoCrashSoftException("Text width is invalid: " + metrics.width));
            i3 = 0;
        } else {
            i3 = iCeil;
        }
        return BoringLayout.make(spannable, textPaint, i3, alignment, 1.0f, 0.0f, metrics, z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:624:0x04aa, code lost:
    
        r9.add(new defpackage.C6673qZ0(r13, r2, new defpackage.NJ0(r3)));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:468:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:640:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:658:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:666:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:673:0x05c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.Spannable c(android.content.Context r24, defpackage.InterfaceC1850Xm0 r25, defpackage.InterfaceC3569eN0 r26) {
        /*
            Method dump skipped, instructions count: 1760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.A91.c(android.content.Context, Xm0, eN0):android.text.Spannable");
    }

    public static Layout.Alignment d(InterfaceC1850Xm0 interfaceC1850Xm0, Spannable spannable) {
        if (!interfaceC1850Xm0.J(2)) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        boolean z = e(interfaceC1850Xm0) != TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(spannable, 0, spannable.length());
        Layout.Alignment alignment = z ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        InterfaceC1850Xm0 interfaceC1850Xm0W = interfaceC1850Xm0.W(2);
        if (interfaceC1850Xm0W.getC() == 0) {
            return alignment;
        }
        InterfaceC1850Xm0 interfaceC1850Xm0W2 = interfaceC1850Xm0W.W(0).W(5);
        if (!interfaceC1850Xm0W2.J(12)) {
            return alignment;
        }
        String string = interfaceC1850Xm0W2.getString(12);
        if (string.equals("center")) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (string.equals("right")) {
            return z ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
        }
        return alignment;
    }

    public static boolean e(InterfaceC1850Xm0 interfaceC1850Xm0) {
        if (!interfaceC1850Xm0.J(2)) {
            return false;
        }
        InterfaceC1850Xm0 interfaceC1850Xm0W = interfaceC1850Xm0.W(2);
        if (interfaceC1850Xm0W.getC() == 0) {
            return false;
        }
        InterfaceC1850Xm0 interfaceC1850Xm0W2 = interfaceC1850Xm0W.W(0).W(5);
        return interfaceC1850Xm0W2.J(23) && C4292i91.b(interfaceC1850Xm0W2.getString(23)) == 1;
    }
}
