package p000;

import android.content.res.Configuration;
import android.os.Build;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public abstract class MT1 {
    /* renamed from: a */
    public static final void m5370a(int i, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        O90.m5968f(str, "sectionName");
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC7369Bb1.m774a(i, OY1.m6088f(str));
            return;
        }
        String strM6088f = OY1.m6088f(str);
        try {
            if (OY1.f8485c == null) {
                OY1.f8485c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            OY1.f8485c.invoke(null, Long.valueOf(OY1.f8483a), strM6088f, Integer.valueOf(i));
        } catch (Exception e) {
            OY1.m6085c(e);
        }
    }

    /* renamed from: b */
    public static final void m5371b(String str) {
        O90.m5968f(str, "sectionName");
        Trace.beginSection(OY1.m6088f(str));
    }

    /* renamed from: c */
    public static final void m5372c(int i, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        O90.m5968f(str, "sectionName");
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC7369Bb1.m775b(i, OY1.m6088f(str));
            return;
        }
        String strM6088f = OY1.m6088f(str);
        try {
            if (OY1.f8486d == null) {
                OY1.f8486d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            OY1.f8486d.invoke(null, Long.valueOf(OY1.f8483a), strM6088f, Integer.valueOf(i));
        } catch (Exception e) {
            OY1.m6085c(e);
        }
    }

    /* renamed from: d */
    public static C7750Ik0 m5373d(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? new C7750Ik0(new C7958Mk0(AbstractC1066Qw.m6830a(configuration))) : C7750Ik0.m3993a(configuration.locale);
    }
}
