package com.facebook.common.time;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import p000.InterfaceC1090RK;
import p000.InterfaceC8130Ps0;

@InterfaceC1090RK
/* loaded from: classes.dex */
public class RealtimeSinceBootClock implements InterfaceC8130Ps0 {

    /* renamed from: a */
    public static final RealtimeSinceBootClock f17793a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    @InterfaceC1090RK
    public static RealtimeSinceBootClock get() {
        return f17793a;
    }

    @Override // p000.InterfaceC8130Ps0
    public final long now() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p000.InterfaceC8130Ps0
    public final long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
    }
}
