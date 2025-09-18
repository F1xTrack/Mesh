package io.sentry;

import io.sentry.android.core.internal.util.C5883c;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: io.sentry.z */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC6196z implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f34751a;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f34751a) {
            case 0:
                return InetAddress.getLocalHost();
            case 1:
                return null;
            case 2:
                return new ArrayList();
            default:
                return C5883c.f33752b.m21582a();
        }
    }
}
