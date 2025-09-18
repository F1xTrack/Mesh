package io.sentry.android.replay.capture;

import android.view.MotionEvent;
import io.sentry.EnumC5762E1;
import io.sentry.android.replay.C5954n;
import io.sentry.android.replay.C5961u;
import io.sentry.protocol.C6104t;
import p000.C10115lG0;

/* renamed from: io.sentry.android.replay.capture.l */
/* loaded from: classes2.dex */
public interface InterfaceC5938l {
    /* renamed from: a */
    void mo21652a(MotionEvent motionEvent);

    /* renamed from: b */
    void mo21660b(C5961u c5961u);

    /* renamed from: c */
    void mo21653c(C5961u c5961u, int i, C6104t c6104t, EnumC5762E1 enumC5762E1);

    /* renamed from: d */
    InterfaceC5938l mo21661d();

    /* renamed from: e */
    void mo21662e(boolean z, C10115lG0 c10115lG0);

    /* renamed from: f */
    void mo21663f(C5954n c5954n);

    void pause();

    void stop();
}
