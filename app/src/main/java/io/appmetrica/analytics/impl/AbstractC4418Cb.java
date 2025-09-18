package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: io.appmetrica.analytics.impl.Cb */
/* loaded from: classes2.dex */
public abstract class AbstractC4418Cb {
    /* renamed from: a */
    public static final ArrayList m19268a(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        if (locales == null) {
            return arrayList;
        }
        int size = locales.size();
        for (int i = 0; i < size; i++) {
            Locale locale = locales.get(i);
            if (locale != null) {
                arrayList.add(AbstractC4949Yd.m20036a(locale));
            }
        }
        return arrayList;
    }
}
