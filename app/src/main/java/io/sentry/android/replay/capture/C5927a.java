package io.sentry.android.replay.capture;

import io.sentry.ThreadFactoryC5748A;
import java.util.concurrent.Executors;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6434mZ;

/* renamed from: io.sentry.android.replay.capture.a */
/* loaded from: classes2.dex */
public final class C5927a extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public static final C5927a f33911e = new C5927a(0);

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC5748A(4));
    }
}
