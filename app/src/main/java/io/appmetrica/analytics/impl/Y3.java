package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* loaded from: classes2.dex */
public class Y3 {
    public final Re a;
    public final CounterConfiguration b;

    public Y3(Re re, CounterConfiguration counterConfiguration) {
        this.a = re;
        this.b = counterConfiguration;
    }

    public static Y3 a(Context context, Bundle bundle) {
        Re re;
        String str = Re.c;
        if (bundle != null) {
            try {
                re = (Re) bundle.getParcelable("PROCESS_CFG_OBJ");
            } catch (Throwable unused) {
            }
        } else {
            re = null;
        }
        CounterConfiguration counterConfigurationFromBundle = CounterConfiguration.fromBundle(bundle);
        if (counterConfigurationFromBundle == null || re == null || !context.getPackageName().equals(re.a.getAsString("PROCESS_CFG_PACKAGE_NAME")) || re.a.getAsInteger("PROCESS_CFG_SDK_API_LEVEL").intValue() != AppMetrica.getLibraryApiLevel()) {
            return null;
        }
        return new Y3(re, counterConfigurationFromBundle);
    }

    public final CounterConfiguration b() {
        return this.b;
    }

    public final String toString() {
        return "ClientConfiguration{mProcessConfiguration=" + this.a + ", mCounterConfiguration=" + this.b + '}';
    }

    public final Re a() {
        return this.a;
    }
}
