package p000;

import android.content.Context;

/* renamed from: Ky */
/* loaded from: classes.dex */
public abstract class AbstractC0691Ky {
    /* renamed from: a */
    public static int m4783a(Context context, int i) {
        return context.getColor(i);
    }

    /* renamed from: b */
    public static <T> T m4784b(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    /* renamed from: c */
    public static String m4785c(Context context, Class<?> cls) {
        return context.getSystemServiceName(cls);
    }
}
