package p000;

import android.text.Html;
import java.util.regex.Pattern;

/* renamed from: b31, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8804b31 {

    /* renamed from: a */
    public static final Pattern f16724a = Pattern.compile("(&#13;)?&#10;");

    /* renamed from: a */
    public static String m10420a(CharSequence charSequence) {
        return f16724a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
