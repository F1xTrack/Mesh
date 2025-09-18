package defpackage;

import android.content.res.Configuration;
import android.os.Build;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public abstract class MT1 {
    public static final void a(int i, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        O90.f(str, "sectionName");
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0103Bb1.a(i, OY1.f(str));
            return;
        }
        String strF = OY1.f(str);
        try {
            if (OY1.c == null) {
                OY1.c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            OY1.c.invoke(null, Long.valueOf(OY1.a), strF, Integer.valueOf(i));
        } catch (Exception e) {
            OY1.c(e);
        }
    }

    public static final void b(String str) {
        O90.f(str, "sectionName");
        Trace.beginSection(OY1.f(str));
    }

    public static final void c(int i, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        O90.f(str, "sectionName");
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0103Bb1.b(i, OY1.f(str));
            return;
        }
        String strF = OY1.f(str);
        try {
            if (OY1.d == null) {
                OY1.d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            OY1.d.invoke(null, Long.valueOf(OY1.a), strF, Integer.valueOf(i));
        } catch (Exception e) {
            OY1.c(e);
        }
    }

    public static C0675Ik0 d(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? new C0675Ik0(new C0986Mk0(AbstractC1333Qw.a(configuration))) : C0675Ik0.a(configuration.locale);
    }
}
