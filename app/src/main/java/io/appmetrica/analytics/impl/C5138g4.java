package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.g4 */
/* loaded from: classes2.dex */
public final class C5138g4 {

    /* renamed from: a */
    public final C5113f4 f31719a;

    /* renamed from: b */
    public volatile C5543w9 f31720b;

    /* renamed from: c */
    public volatile C5543w9 f31721c;

    public C5138g4() {
        this(new C5113f4());
    }

    /* renamed from: a */
    public final IHandlerExecutor m20407a() {
        if (this.f31720b == null) {
            synchronized (this) {
                try {
                    if (this.f31720b == null) {
                        this.f31719a.getClass();
                        HandlerThreadC4922Xa handlerThreadC4922XaM21177a = C5543w9.m21177a("IAA-CDE");
                        this.f31720b = new C5543w9(handlerThreadC4922XaM21177a, handlerThreadC4922XaM21177a.getLooper(), new Handler(handlerThreadC4922XaM21177a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f31720b;
    }

    /* renamed from: b */
    public final ICommonExecutor m20408b() {
        if (this.f31721c == null) {
            synchronized (this) {
                try {
                    if (this.f31721c == null) {
                        this.f31719a.getClass();
                        HandlerThreadC4922Xa handlerThreadC4922XaM21177a = C5543w9.m21177a("IAA-CRS");
                        this.f31721c = new C5543w9(handlerThreadC4922XaM21177a, handlerThreadC4922XaM21177a.getLooper(), new Handler(handlerThreadC4922XaM21177a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f31721c;
    }

    public C5138g4(C5113f4 c5113f4) {
        this.f31719a = c5113f4;
    }
}
