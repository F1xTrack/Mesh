package defpackage;

import android.os.Build;
import android.util.Log;

/* renamed from: Km0 */
/* loaded from: classes.dex */
public abstract class AbstractC0837Km0 {
    public static volatile C20 a;
    public static final String[] b = {"best fit", "lookup"};
    public static final String[] c = {"base", "accent", "case", "variant"};
    public static final String[] d = {"upper", "lower", "false"};
    public static final String[] e = {"sort", "search"};

    public static void a(Object obj, String str, String str2) {
        if (Log.isLoggable(b(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static String b(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }
}
