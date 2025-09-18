package io.sentry.android.core;

import android.content.Context;
import android.os.SystemClock;
import io.sentry.AbstractC5802S0;
import io.sentry.C5759D1;
import io.sentry.C6180v0;
import io.sentry.EnumC6069n1;
import io.sentry.InterfaceC5775J;
import io.sentry.InterfaceC5799R0;
import io.sentry.InterfaceC5819Y;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.sentry.android.core.X */
/* loaded from: classes2.dex */
public abstract class AbstractC5851X {

    /* renamed from: a */
    public static final long f33635a = SystemClock.uptimeMillis();

    /* renamed from: b */
    public static final /* synthetic */ int f33636b = 0;

    /* renamed from: a */
    public static void m21554a(C5759D1 c5759d1, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC5819Y interfaceC5819Y : c5759d1.getIntegrations()) {
            if (z && (interfaceC5819Y instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(interfaceC5819Y);
            }
            if (z2 && (interfaceC5819Y instanceof SentryTimberIntegration)) {
                arrayList.add(interfaceC5819Y);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i = 0; i < arrayList2.size() - 1; i++) {
                c5759d1.getIntegrations().remove((InterfaceC5819Y) arrayList2.get(i));
            }
        }
        if (arrayList.size() > 1) {
            for (int i2 = 0; i2 < arrayList.size() - 1; i2++) {
                c5759d1.getIntegrations().remove((InterfaceC5819Y) arrayList.get(i2));
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m21555b(Context context, C5847T c5847t, InterfaceC5799R0 interfaceC5799R0) {
        try {
            try {
                try {
                    AbstractC5802S0.m21466d(new C6180v0(6), new C5869h(c5847t, context, interfaceC5799R0));
                    InterfaceC5775J interfaceC5775JM21465c = AbstractC5802S0.m21465c();
                    if (AbstractC5911t.m21631l()) {
                        if (interfaceC5775JM21465c.mo21364A().isEnableAutoSessionTracking()) {
                            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                            interfaceC5775JM21465c.mo21377w(new C5841M(3, atomicBoolean));
                            if (!atomicBoolean.get()) {
                                interfaceC5775JM21465c.mo21368E();
                            }
                        }
                        interfaceC5775JM21465c.mo21364A().getReplayController().start();
                    }
                } catch (InstantiationException e) {
                    c5847t.mo21406d(EnumC6069n1.FATAL, "Fatal error during SentryAndroid.init(...)", e);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e);
                } catch (NoSuchMethodException e2) {
                    c5847t.mo21406d(EnumC6069n1.FATAL, "Fatal error during SentryAndroid.init(...)", e2);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e2);
                }
            } catch (IllegalAccessException e3) {
                c5847t.mo21406d(EnumC6069n1.FATAL, "Fatal error during SentryAndroid.init(...)", e3);
                throw new RuntimeException("Failed to initialize Sentry's SDK", e3);
            } catch (InvocationTargetException e4) {
                c5847t.mo21406d(EnumC6069n1.FATAL, "Fatal error during SentryAndroid.init(...)", e4);
                throw new RuntimeException("Failed to initialize Sentry's SDK", e4);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
