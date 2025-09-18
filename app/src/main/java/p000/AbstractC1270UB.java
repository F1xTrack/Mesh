package p000;

import android.os.LocaleList;

/* renamed from: UB */
/* loaded from: classes.dex */
public abstract class AbstractC1270UB {
    /* renamed from: a */
    public static String m7927a() {
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        if (adjustedDefault.size() > 0) {
            return adjustedDefault.get(0).toLanguageTag();
        }
        return null;
    }
}
