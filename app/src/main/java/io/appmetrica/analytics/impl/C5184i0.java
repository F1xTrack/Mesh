package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.reactnative.AppMetricaModule;

/* renamed from: io.appmetrica.analytics.impl.i0 */
/* loaded from: classes2.dex */
public final class C5184i0 {

    /* renamed from: a */
    public final C4862Um f31876a;

    /* renamed from: b */
    public volatile Boolean f31877b;

    /* renamed from: c */
    public InterfaceC5594ya f31878c;

    /* renamed from: d */
    public InterfaceC5619za f31879d;

    public C5184i0() {
        this(new C4862Um());
    }

    /* renamed from: a */
    public final synchronized InterfaceC5594ya m20516a(Context context, C5138g4 c5138g4) {
        try {
            if (this.f31878c == null) {
                if (m20517a(context)) {
                    this.f31878c = new C5234k0();
                } else {
                    this.f31878c = new C5159h0(context, c5138g4);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f31878c;
    }

    public C5184i0(C4862Um c4862Um) {
        this.f31876a = c4862Um;
    }

    /* renamed from: a */
    public final boolean m20517a(Context context) {
        Boolean boolValueOf = this.f31877b;
        if (boolValueOf == null) {
            synchronized (this) {
                try {
                    boolValueOf = this.f31877b;
                    if (boolValueOf == null) {
                        this.f31876a.getClass();
                        boolean zM19896a = C4862Um.m19896a(context);
                        boolValueOf = Boolean.valueOf(!zM19896a);
                        this.f31877b = boolValueOf;
                        if (!zM19896a) {
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
