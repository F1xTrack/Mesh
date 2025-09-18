package defpackage;

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
public abstract class AbstractC8183yU1 {
    public static final InterfaceC0173Bz a(InterfaceC0173Bz interfaceC0173Bz, InterfaceC0173Bz interfaceC0173Bz2, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) interfaceC0173Bz.j(bool, new C0251Cz(0))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC0173Bz2.j(bool, new C0251Cz(0))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC0173Bz.f(interfaceC0173Bz2);
        }
        JN jn = JN.a;
        InterfaceC0173Bz interfaceC0173Bz3 = (InterfaceC0173Bz) interfaceC0173Bz.j(jn, new C0251Cz(1));
        Object objJ = interfaceC0173Bz2;
        if (zBooleanValue2) {
            objJ = interfaceC0173Bz2.j(jn, new C0251Cz(2));
        }
        return interfaceC0173Bz3.f((InterfaceC0173Bz) objJ);
    }

    public static C7176tC0 b(C6969s7 c6969s7) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new C7176tC0(J91.c(c6969s7));
        }
        TextPaint textPaint = new TextPaint(c6969s7.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int iA = H91.a(c6969s7);
        int iD = H91.d(c6969s7);
        if (c6969s7.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i < 28 || (c6969s7.getInputType() & 15) != 3) {
                boolean z = c6969s7.getLayoutDirection() == 1;
                switch (c6969s7.getTextDirection()) {
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
                byte directionality = Character.getDirectionality(J91.b(I91.a(c6969s7.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new C7176tC0(textPaint, textDirectionHeuristic, iA, iD);
    }

    public static void c(TextView textView, int i) {
        AbstractC3377dM1.g(i);
        if (Build.VERSION.SDK_INT >= 28) {
            J91.d(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void d(TextView textView, int i) {
        AbstractC3377dM1.g(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void e(TextView textView, int i) {
        AbstractC3377dM1.g(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static ActionMode.Callback f(ActionMode.Callback callback) {
        return (!(callback instanceof L91) || Build.VERSION.SDK_INT < 26) ? callback : ((L91) callback).a;
    }

    public static final C1206Pf1 g(InterfaceC1729Vy interfaceC1729Vy, InterfaceC0173Bz interfaceC0173Bz, Object obj) {
        C1206Pf1 c1206Pf1 = null;
        if (!(interfaceC1729Vy instanceof InterfaceC1108Nz)) {
            return null;
        }
        if (interfaceC0173Bz.g(C1284Qf1.a) != null) {
            InterfaceC1108Nz callerFrame = (InterfaceC1108Nz) interfaceC1729Vy;
            while (true) {
                if ((callerFrame instanceof C8151yK) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof C1206Pf1) {
                    c1206Pf1 = (C1206Pf1) callerFrame;
                    break;
                }
            }
            if (c1206Pf1 != null) {
                c1206Pf1.V(interfaceC0173Bz, obj);
            }
        }
        return c1206Pf1;
    }

    public static ActionMode.Callback h(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof L91) || callback == null) ? callback : new L91(callback, textView);
    }
}
