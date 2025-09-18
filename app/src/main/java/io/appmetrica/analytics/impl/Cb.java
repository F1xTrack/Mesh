package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class Cb {
    public static final ArrayList a(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        if (locales == null) {
            return arrayList;
        }
        int size = locales.size();
        for (int i = 0; i < size; i++) {
            Locale locale = locales.get(i);
            if (locale != null) {
                arrayList.add(Yd.a(locale));
            }
        }
        return arrayList;
    }
}
