package io.sentry;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: io.sentry.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC5188z implements Callable {
    public final /* synthetic */ int a;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return InetAddress.getLocalHost();
            case 1:
                return null;
            case 2:
                return new ArrayList();
            default:
                return io.sentry.android.core.internal.util.c.b.a();
        }
    }
}
