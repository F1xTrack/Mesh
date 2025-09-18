package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* renamed from: io.appmetrica.analytics.impl.Y3 */
/* loaded from: classes2.dex */
public class C4939Y3 {

    /* renamed from: a */
    public final C4782Re f31089a;

    /* renamed from: b */
    public final CounterConfiguration f31090b;

    public C4939Y3(C4782Re c4782Re, CounterConfiguration counterConfiguration) {
        this.f31089a = c4782Re;
        this.f31090b = counterConfiguration;
    }

    /* renamed from: a */
    public static C4939Y3 m20018a(Context context, Bundle bundle) {
        C4782Re c4782Re;
        String str = C4782Re.f30695c;
        if (bundle != null) {
            try {
                c4782Re = (C4782Re) bundle.getParcelable("PROCESS_CFG_OBJ");
            } catch (Throwable unused) {
            }
        } else {
            c4782Re = null;
        }
        CounterConfiguration counterConfigurationFromBundle = CounterConfiguration.fromBundle(bundle);
        if (counterConfigurationFromBundle == null || c4782Re == null || !context.getPackageName().equals(c4782Re.f30696a.getAsString("PROCESS_CFG_PACKAGE_NAME")) || c4782Re.f30696a.getAsInteger("PROCESS_CFG_SDK_API_LEVEL").intValue() != AppMetrica.getLibraryApiLevel()) {
            return null;
        }
        return new C4939Y3(c4782Re, counterConfigurationFromBundle);
    }

    /* renamed from: b */
    public final CounterConfiguration m20020b() {
        return this.f31090b;
    }

    public final String toString() {
        return "ClientConfiguration{mProcessConfiguration=" + this.f31089a + ", mCounterConfiguration=" + this.f31090b + '}';
    }

    /* renamed from: a */
    public final C4782Re m20019a() {
        return this.f31089a;
    }
}
