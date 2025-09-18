package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.Serializable;

/* renamed from: zN1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8352zN1 {
    public static void a(Serializable serializable) {
        c();
        String.valueOf(serializable);
        c();
        String.valueOf(serializable);
    }

    public static Drawable b(Context context, int i) {
        return C7796wS0.d().f(context, i);
    }

    public static void c() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        stackTrace[2].getMethodName();
        String className = stackTrace[2].getClassName();
        stackTrace[2].getLineNumber();
        className.substring(className.lastIndexOf(46) + 1);
    }
}
