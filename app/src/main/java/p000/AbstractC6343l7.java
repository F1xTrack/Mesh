package p000;

import android.os.LocaleList;
import android.widget.TextView;

/* renamed from: l7 */
/* loaded from: classes.dex */
public abstract class AbstractC6343l7 {
    /* renamed from: a */
    public static LocaleList m22364a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    /* renamed from: b */
    public static void m22365b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
