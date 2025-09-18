package p000;

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
    /* renamed from: a */
    public static void m3687a(Throwable th, Throwable th2) {
        O90.m5968f(th, "<this>");
        O90.m5968f(th2, Core.Event.Result.EXCEPTION);
        if (th != th2) {
            Integer num = AbstractC10795qa0.f41030a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = AbstractC11512wB0.f44703a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    /* renamed from: b */
    public static EditText m3688b(int i, View view) {
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
            O90.m5965c(childAt);
            EditText editTextM3689c = m3689c(i, childAt);
            if (editTextM3689c != null) {
                return editTextM3689c;
            }
            i2 += i;
        }
        return m3688b(i, viewGroup);
    }

    /* renamed from: c */
    public static EditText m3689c(int i, View view) {
        if ((view instanceof EditText) && ((EditText) view).isEnabled()) {
            return (EditText) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            C9205e90 c9205e90M22423h = i > 0 ? AbstractC10132lO1.m22423h(0, childCount) : new C9205e90(childCount - 1, 0, -1);
            int i2 = c9205e90M22423h.f26569a;
            int i3 = c9205e90M22423h.f26570b;
            int i4 = c9205e90M22423h.f26571c;
            if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
                while (true) {
                    View childAt = viewGroup.getChildAt(i2);
                    O90.m5965c(childAt);
                    EditText editTextM3689c = m3689c(i, childAt);
                    if (editTextM3689c == null) {
                        if (i2 == i3) {
                            break;
                        }
                        i2 += i4;
                    } else {
                        return editTextM3689c;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    public static final void m3690d(View view, ArrayList arrayList) {
        if ((view instanceof EditText) && ((EditText) view).isEnabled()) {
            O90.m5966d(view, "null cannot be cast to non-null type android.widget.EditText");
            arrayList.add((EditText) view);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                m3690d(viewGroup.getChildAt(i), arrayList);
            }
        }
    }

    /* renamed from: e */
    public static String m3691e(Throwable th) {
        O90.m5968f(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        O90.m5967e(string, "toString(...)");
        return string;
    }
}
