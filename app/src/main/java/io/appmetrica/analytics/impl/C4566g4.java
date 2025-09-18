package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.g4 */
/* loaded from: classes2.dex */
public final class C4566g4 {
    public final C4542f4 a;
    public volatile C4953w9 b;
    public volatile C4953w9 c;

    public C4566g4() {
        this(new C4542f4());
    }

    public final IHandlerExecutor a() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.a.getClass();
                        Xa xaA = C4953w9.a("IAA-CDE");
                        this.b = new C4953w9(xaA, xaA.getLooper(), new Handler(xaA.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.b;
    }

    public final ICommonExecutor b() {
        if (this.c == null) {
            synchronized (this) {
                try {
                    if (this.c == null) {
                        this.a.getClass();
                        Xa xaA = C4953w9.a("IAA-CRS");
                        this.c = new C4953w9(xaA, xaA.getLooper(), new Handler(xaA.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public C4566g4(C4542f4 c4542f4) {
        this.a = c4542f4;
    }
}
