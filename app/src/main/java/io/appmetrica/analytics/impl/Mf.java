package io.appmetrica.analytics.impl;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;

/* loaded from: classes2.dex */
public final class Mf {
    public Mf(La la) {
    }

    public static La a(Context context, IHandlerExecutor iHandlerExecutor) {
        C5031zf c5031zf;
        if (ReflectionUtils.detectClassExists("com.android.installreferrer.api.InstallReferrerClient")) {
            try {
                c5031zf = new C5031zf(InstallReferrerClient.newBuilder(context).build(), iHandlerExecutor);
            } catch (Throwable unused) {
            }
        } else {
            c5031zf = null;
        }
        return c5031zf == null ? new Lf() : c5031zf;
    }
}
