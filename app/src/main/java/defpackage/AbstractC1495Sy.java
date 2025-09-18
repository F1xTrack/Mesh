package defpackage;

import android.content.Context;
import android.view.inputmethod.EditorInfo;

/* renamed from: Sy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1495Sy {
    public static Context a(Context context, String str) {
        return context.createAttributionContext(str);
    }

    public static String b(Context context) {
        return context.getAttributionTag();
    }

    public static void c(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }
}
