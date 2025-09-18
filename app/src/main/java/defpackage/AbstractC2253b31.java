package defpackage;

import android.text.Html;
import java.util.regex.Pattern;

/* renamed from: b31, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2253b31 {
    public static final Pattern a = Pattern.compile("(&#13;)?&#10;");

    public static String a(CharSequence charSequence) {
        return a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
