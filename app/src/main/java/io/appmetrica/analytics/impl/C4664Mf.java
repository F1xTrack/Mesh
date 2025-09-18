package io.appmetrica.analytics.impl;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;

/* renamed from: io.appmetrica.analytics.impl.Mf */
/* loaded from: classes2.dex */
public final class C4664Mf {
    public C4664Mf(InterfaceC4635La interfaceC4635La) {
    }

    /* renamed from: a */
    public static InterfaceC4635La m19638a(Context context, IHandlerExecutor iHandlerExecutor) {
        C5624zf c5624zf;
        if (ReflectionUtils.detectClassExists("com.android.installreferrer.api.InstallReferrerClient")) {
            try {
                c5624zf = new C5624zf(InstallReferrerClient.newBuilder(context).build(), iHandlerExecutor);
            } catch (Throwable unused) {
            }
        } else {
            c5624zf = null;
        }
        return c5624zf == null ? new C4640Lf() : c5624zf;
    }
}
