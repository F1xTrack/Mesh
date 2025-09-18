package p000;

import android.graphics.Paint;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.widget.TextView;

/* renamed from: yU1 */
/* loaded from: classes.dex */
public abstract class AbstractC11805yU1 {
    /* renamed from: a */
    public static final InterfaceC0125Bz m26153a(InterfaceC0125Bz interfaceC0125Bz, InterfaceC0125Bz interfaceC0125Bz2, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) interfaceC0125Bz.mo938j(bool, new C0188Cz(0))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC0125Bz2.mo938j(bool, new C0188Cz(0))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC0125Bz.mo936f(interfaceC0125Bz2);
        }
        C0591JN c0591jn = C0591JN.f5499a;
        InterfaceC0125Bz interfaceC0125Bz3 = (InterfaceC0125Bz) interfaceC0125Bz.mo938j(c0591jn, new C0188Cz(1));
        Object objMo938j = interfaceC0125Bz2;
        if (zBooleanValue2) {
            objMo938j = interfaceC0125Bz2.mo938j(c0591jn, new C0188Cz(2));
        }
        return interfaceC0125Bz3.mo936f((InterfaceC0125Bz) objMo938j);
    }

    /* renamed from: b */
    public static C11131tC0 m26154b(C6803s7 c6803s7) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new C11131tC0(J91.m4239c(c6803s7));
        }
        TextPaint textPaint = new TextPaint(c6803s7.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int iM3321a = H91.m3321a(c6803s7);
        int iM3324d = H91.m3324d(c6803s7);
        if (c6803s7.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i < 28 || (c6803s7.getInputType() & 15) != 3) {
                boolean z = c6803s7.getLayoutDirection() == 1;
                switch (c6803s7.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(J91.m4238b(I91.m3771a(c6803s7.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new C11131tC0(textPaint, textDirectionHeuristic, iM3321a, iM3324d);
    }

    /* renamed from: c */
    public static void m26155c(TextView textView, int i) {
        AbstractC9104dM1.m17548g(i);
        if (Build.VERSION.SDK_INT >= 28) {
            J91.m4240d(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: d */
    public static void m26156d(TextView textView, int i) {
        AbstractC9104dM1.m17548g(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: e */
    public static void m26157e(TextView textView, int i) {
        AbstractC9104dM1.m17548g(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    /* renamed from: f */
    public static ActionMode.Callback m26158f(ActionMode.Callback callback) {
        return (!(callback instanceof L91) || Build.VERSION.SDK_INT < 26) ? callback : ((L91) callback).f6521a;
    }

    /* renamed from: g */
    public static final C8105Pf1 m26159g(InterfaceC1382Vy interfaceC1382Vy, InterfaceC0125Bz interfaceC0125Bz, Object obj) {
        C8105Pf1 c8105Pf1 = null;
        if (!(interfaceC1382Vy instanceof InterfaceC0880Nz)) {
            return null;
        }
        if (interfaceC0125Bz.mo937g(C8157Qf1.f9714a) != null) {
            InterfaceC0880Nz callerFrame = (InterfaceC0880Nz) interfaceC1382Vy;
            while (true) {
                if ((callerFrame instanceof C7194yK) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof C8105Pf1) {
                    c8105Pf1 = (C8105Pf1) callerFrame;
                    break;
                }
            }
            if (c8105Pf1 != null) {
                c8105Pf1.m6410V(interfaceC0125Bz, obj);
            }
        }
        return c8105Pf1;
    }

    /* renamed from: h */
    public static ActionMode.Callback m26160h(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof L91) || callback == null) ? callback : new L91(callback, textView);
    }
}
