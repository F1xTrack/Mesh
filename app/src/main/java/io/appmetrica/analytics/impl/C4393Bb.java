package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.util.List;
import p000.AbstractC7230yu;

/* renamed from: io.appmetrica.analytics.impl.Bb */
/* loaded from: classes2.dex */
public final class C4393Bb {
    /* renamed from: a */
    public static List m19231a(Configuration configuration) {
        return AndroidUtils.isApiAchieved(24) ? AbstractC4418Cb.m19268a(configuration) : AbstractC7230yu.m26274e(AbstractC4949Yd.m20036a(configuration.locale));
    }
}
