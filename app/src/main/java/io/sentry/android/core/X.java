package io.sentry.android.core;

import android.content.Context;
import android.os.SystemClock;
import io.sentry.C5177v0;
import io.sentry.D1;
import io.sentry.EnumC5148n1;
import io.sentry.R0;
import io.sentry.S0;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public abstract class X {
    public static final long a = SystemClock.uptimeMillis();
    public static final /* synthetic */ int b = 0;

    public static void a(D1 d1, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (io.sentry.Y y : d1.getIntegrations()) {
            if (z && (y instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(y);
            }
            if (z2 && (y instanceof SentryTimberIntegration)) {
                arrayList.add(y);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i = 0; i < arrayList2.size() - 1; i++) {
                d1.getIntegrations().remove((io.sentry.Y) arrayList2.get(i));
            }
        }
        if (arrayList.size() > 1) {
            for (int i2 = 0; i2 < arrayList.size() - 1; i2++) {
                d1.getIntegrations().remove((io.sentry.Y) arrayList.get(i2));
            }
        }
    }

    public static synchronized void b(Context context, T t, R0 r0) {
        try {
            try {
                try {
                    S0.d(new C5177v0(6), new C5091h(t, context, r0));
                    io.sentry.J jC = S0.c();
                    if (AbstractC5102t.l()) {
                        if (jC.A().isEnableAutoSessionTracking()) {
                            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                            jC.w(new M(3, atomicBoolean));
                            if (!atomicBoolean.get()) {
                                jC.E();
                            }
                        }
                        jC.A().getReplayController().start();
                    }
                } catch (InstantiationException e) {
                    t.d(EnumC5148n1.FATAL, "Fatal error during SentryAndroid.init(...)", e);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e);
                } catch (NoSuchMethodException e2) {
                    t.d(EnumC5148n1.FATAL, "Fatal error during SentryAndroid.init(...)", e2);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e2);
                }
            } catch (IllegalAccessException e3) {
                t.d(EnumC5148n1.FATAL, "Fatal error during SentryAndroid.init(...)", e3);
                throw new RuntimeException("Failed to initialize Sentry's SDK", e3);
            } catch (InvocationTargetException e4) {
                t.d(EnumC5148n1.FATAL, "Fatal error during SentryAndroid.init(...)", e4);
                throw new RuntimeException("Failed to initialize Sentry's SDK", e4);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
