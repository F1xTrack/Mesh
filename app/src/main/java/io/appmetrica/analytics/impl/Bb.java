package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import defpackage.AbstractC8259yu;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.util.List;

/* loaded from: classes2.dex */
public final class Bb {
    public static List a(Configuration configuration) {
        return AndroidUtils.isApiAchieved(24) ? Cb.a(configuration) : AbstractC8259yu.e(Yd.a(configuration.locale));
    }
}
