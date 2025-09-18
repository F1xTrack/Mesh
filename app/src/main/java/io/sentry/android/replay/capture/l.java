package io.sentry.android.replay.capture;

import android.view.MotionEvent;
import defpackage.C5661lG0;
import io.sentry.E1;
import io.sentry.android.replay.u;
import io.sentry.protocol.t;

/* loaded from: classes2.dex */
public interface l {
    void a(MotionEvent motionEvent);

    void b(u uVar);

    void c(u uVar, int i, t tVar, E1 e1);

    l d();

    void e(boolean z, C5661lG0 c5661lG0);

    void f(io.sentry.android.replay.n nVar);

    void pause();

    void stop();
}
