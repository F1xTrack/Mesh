package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class I02 {
    public static void a(Throwable th, Throwable th2) {
        O90.f(th, "<this>");
        O90.f(th2, Core.Event.Result.EXCEPTION);
        if (th != th2) {
            Integer num = AbstractC6676qa0.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = AbstractC7745wB0.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static EditText b(int i, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return null;
        }
        int iIndexOfChild = viewGroup.indexOfChild(view);
        int i2 = i > 0 ? iIndexOfChild + 1 : iIndexOfChild - 1;
        int childCount = i > 0 ? viewGroup.getChildCount() : -1;
        while (i2 != childCount) {
            View childAt = viewGroup.getChildAt(i2);
            O90.c(childAt);
            EditText editTextC = c(i, childAt);
            if (editTextC != null) {
                return editTextC;
            }
            i2 += i;
        }
        return b(i, viewGroup);
    }

    public static EditText c(int i, View view) {
        if ((view instanceof EditText) && ((EditText) view).isEnabled()) {
            return (EditText) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            C3527e90 c3527e90H = i > 0 ? AbstractC5686lO1.h(0, childCount) : new C3527e90(childCount - 1, 0, -1);
            int i2 = c3527e90H.a;
            int i3 = c3527e90H.b;
            int i4 = c3527e90H.c;
            if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
                while (true) {
                    View childAt = viewGroup.getChildAt(i2);
                    O90.c(childAt);
                    EditText editTextC = c(i, childAt);
                    if (editTextC == null) {
                        if (i2 == i3) {
                            break;
                        }
                        i2 += i4;
                    } else {
                        return editTextC;
                    }
                }
            }
        }
        return null;
    }

    public static final void d(View view, ArrayList arrayList) {
        if ((view instanceof EditText) && ((EditText) view).isEnabled()) {
            O90.d(view, "null cannot be cast to non-null type android.widget.EditText");
            arrayList.add((EditText) view);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                d(viewGroup.getChildAt(i), arrayList);
            }
        }
    }

    public static String e(Throwable th) {
        O90.f(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        O90.e(string, "toString(...)");
        return string;
    }
}
