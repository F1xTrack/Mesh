package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.Serializable;

/* renamed from: zN1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11918zN1 {
    /* renamed from: a */
    public static void m26393a(Serializable serializable) {
        m26395c();
        String.valueOf(serializable);
        m26395c();
        String.valueOf(serializable);
    }

    /* renamed from: b */
    public static Drawable m26394b(Context context, int i) {
        return C11546wS0.m25618d().m25625f(context, i);
    }

    /* renamed from: c */
    public static void m26395c() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        stackTrace[2].getMethodName();
        String className = stackTrace[2].getClassName();
        stackTrace[2].getLineNumber();
        className.substring(className.lastIndexOf(46) + 1);
    }
}
