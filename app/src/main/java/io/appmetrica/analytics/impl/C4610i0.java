package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.reactnative.AppMetricaModule;

/* renamed from: io.appmetrica.analytics.impl.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4610i0 {
    public final Um a;
    public volatile Boolean b;
    public InterfaceC5002ya c;
    public InterfaceC5026za d;

    public C4610i0() {
        this(new Um());
    }

    public final synchronized InterfaceC5002ya a(Context context, C4566g4 c4566g4) {
        try {
            if (this.c == null) {
                if (a(context)) {
                    this.c = new C4657k0();
                } else {
                    this.c = new C4586h0(context, c4566g4);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    public C4610i0(Um um) {
        this.a = um;
    }

    public final boolean a(Context context) {
        Boolean boolValueOf = this.b;
        if (boolValueOf == null) {
            synchronized (this) {
                try {
                    boolValueOf = this.b;
                    if (boolValueOf == null) {
                        this.a.getClass();
                        boolean zA = Um.a(context);
                        boolValueOf = Boolean.valueOf(!zA);
                        this.b = boolValueOf;
                        if (!zA) {
                            ImportantLogger.INSTANCE.info(AppMetricaModule.NAME, "User is locked. So use stubs. Events will not be sent.", new Object[0]);
                        }
                    }
                } finally {
                }
            }
        }
        return boolValueOf.booleanValue();
    }
}
