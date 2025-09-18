package io.sentry.android.replay.capture;

import defpackage.AbstractC1676Vg0;
import defpackage.InterfaceC5908mZ;
import io.sentry.A;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final class a extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public static final a e = new a(0);

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        return Executors.newSingleThreadScheduledExecutor(new A(4));
    }
}
