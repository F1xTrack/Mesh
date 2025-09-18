package p000;

import android.os.Build;
import android.util.Log;

/* renamed from: Km0 */
/* loaded from: classes.dex */
public abstract class AbstractC7858Km0 {

    /* renamed from: a */
    public static volatile C20 f6279a;

    /* renamed from: b */
    public static final String[] f6280b = {"best fit", "lookup"};

    /* renamed from: c */
    public static final String[] f6281c = {"base", "accent", "case", "variant"};

    /* renamed from: d */
    public static final String[] f6282d = {"upper", "lower", "false"};

    /* renamed from: e */
    public static final String[] f6283e = {"sort", "search"};

    /* renamed from: a */
    public static void m4711a(Object obj, String str, String str2) {
        if (Log.isLoggable(m4712b(str), 3)) {
            String.format(str2, obj);
        }
    }

    /* renamed from: b */
    public static String m4712b(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }
}
