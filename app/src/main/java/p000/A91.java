package p000;

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

    /* renamed from: a */
    public static final TextPaint f92a = new TextPaint(1);

    /* renamed from: b */
    public static final ConcurrentHashMap f93b = new ConcurrentHashMap();

    /* renamed from: a */
    public static void m91a(Spannable spannable, float f, EnumC7813Jp1 enumC7813Jp1, float f2, EnumC7813Jp1 enumC7813Jp12, double d, int i, boolean z, int i2, int i3, Layout.Alignment alignment) {
        BoringLayout.Metrics metricsIsBoring = BoringLayout.isBoring(spannable, f92a);
        Layout layoutM92b = m92b(spannable, metricsIsBoring, f, enumC7813Jp1, z, i2, i3, alignment);
        int iM25403b = (int) (Double.isNaN(d) ? AbstractC11406vL1.m25403b(4.0f) : d);
        int i4 = 0;
        int iMax = iM25403b;
        for (C11017sJ0 c11017sJ0 : (C11017sJ0[]) spannable.getSpans(0, spannable.length(), C11017sJ0.class)) {
            iMax = Math.max(iMax, c11017sJ0.getSize());
        }
        int i5 = iMax;
        while (i5 > iM25403b) {
            if ((i == -1 || i == 0 || layoutM92b.getLineCount() <= i) && (enumC7813Jp12 == EnumC7813Jp1.f5715a || layoutM92b.getHeight() <= f2)) {
                return;
            }
            int iMax2 = i5 - Math.max(1, (int) AbstractC11406vL1.m25403b(1.0f));
            float f3 = iMax2 / iMax;
            C11017sJ0[] c11017sJ0Arr = (C11017sJ0[]) spannable.getSpans(i4, spannable.length(), C11017sJ0.class);
            int length = c11017sJ0Arr.length;
            int i6 = i4;
            while (i6 < length) {
                C11017sJ0 c11017sJ02 = c11017sJ0Arr[i6];
                spannable.setSpan(new C11017sJ0((int) Math.max(c11017sJ02.getSize() * f3, iM25403b)), spannable.getSpanStart(c11017sJ02), spannable.getSpanEnd(c11017sJ02), spannable.getSpanFlags(c11017sJ02));
                spannable.removeSpan(c11017sJ02);
                i6++;
                f3 = f3;
            }
            layoutM92b = m92b(spannable, metricsIsBoring, f, enumC7813Jp1, z, i2, i3, alignment);
            i5 = iMax2;
            i4 = 0;
        }
    }

    /* renamed from: b */
    public static Layout m92b(Spannable spannable, BoringLayout.Metrics metrics, float f, EnumC7813Jp1 enumC7813Jp1, boolean z, int i, int i2, Layout.Alignment alignment) {
        int i3;
        int length = spannable.length();
        boolean z2 = enumC7813Jp1 == EnumC7813Jp1.f5715a || f < 0.0f;
        TextPaint textPaint = f92a;
        float desiredWidth = metrics == null ? Layout.getDesiredWidth(spannable, textPaint) : Float.NaN;
        boolean zIsRtl = TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(spannable, 0, length);
        EnumC7813Jp1 enumC7813Jp12 = EnumC7813Jp1.f5716b;
        if (metrics == null && (z2 || (!AbstractC11619x12.m25735a(desiredWidth) && desiredWidth <= f))) {
            if (enumC7813Jp1 == enumC7813Jp12) {
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
        if (enumC7813Jp1 == enumC7813Jp12) {
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
    
        r9.add(new p000.C10793qZ0(r13, r2, new p000.NJ0(r3)));
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
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.Spannable m93c(android.content.Context r24, p000.InterfaceC8534Xm0 r25, p000.InterfaceC9233eN0 r26) {
        /*
            Method dump skipped, instructions count: 1760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.A91.m93c(android.content.Context, Xm0, eN0):android.text.Spannable");
    }

    /* renamed from: d */
    public static Layout.Alignment m94d(InterfaceC8534Xm0 interfaceC8534Xm0, Spannable spannable) {
        if (!interfaceC8534Xm0.mo9114J(2)) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        boolean z = m95e(interfaceC8534Xm0) != TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(spannable, 0, spannable.length());
        Layout.Alignment alignment = z ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        InterfaceC8534Xm0 interfaceC8534Xm0Mo9115W = interfaceC8534Xm0.mo9115W(2);
        if (interfaceC8534Xm0Mo9115W.getF17901c() == 0) {
            return alignment;
        }
        InterfaceC8534Xm0 interfaceC8534Xm0Mo9115W2 = interfaceC8534Xm0Mo9115W.mo9115W(0).mo9115W(5);
        if (!interfaceC8534Xm0Mo9115W2.mo9114J(12)) {
            return alignment;
        }
        String string = interfaceC8534Xm0Mo9115W2.getString(12);
        if (string.equals("center")) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (string.equals("right")) {
            return z ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
        }
        return alignment;
    }

    /* renamed from: e */
    public static boolean m95e(InterfaceC8534Xm0 interfaceC8534Xm0) {
        if (!interfaceC8534Xm0.mo9114J(2)) {
            return false;
        }
        InterfaceC8534Xm0 interfaceC8534Xm0Mo9115W = interfaceC8534Xm0.mo9115W(2);
        if (interfaceC8534Xm0Mo9115W.getF17901c() == 0) {
            return false;
        }
        InterfaceC8534Xm0 interfaceC8534Xm0Mo9115W2 = interfaceC8534Xm0Mo9115W.mo9115W(0).mo9115W(5);
        return interfaceC8534Xm0Mo9115W2.mo9114J(23) && C9718i91.m18975b(interfaceC8534Xm0Mo9115W2.getString(23)) == 1;
    }
}
