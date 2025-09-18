package p000;

import android.content.Context;
import android.view.inputmethod.EditorInfo;

/* renamed from: Sy */
/* loaded from: classes.dex */
public abstract class AbstractC1193Sy {
    /* renamed from: a */
    public static Context m7475a(Context context, String str) {
        return context.createAttributionContext(str);
    }

    /* renamed from: b */
    public static String m7476b(Context context) {
        return context.getAttributionTag();
    }

    /* renamed from: c */
    public static void m7477c(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }
}
