package defpackage;

import android.text.Html;
import android.text.Spanned;

/* loaded from: classes.dex */
public abstract class S30 {
    public static Spanned a(String str, int i) {
        return Html.fromHtml(str, i);
    }

    public static Spanned b(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
        return Html.fromHtml(str, i, imageGetter, tagHandler);
    }

    public static String c(Spanned spanned, int i) {
        return Html.toHtml(spanned, i);
    }
}
