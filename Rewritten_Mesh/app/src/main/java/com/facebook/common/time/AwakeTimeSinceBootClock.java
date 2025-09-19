package com.facebook.common.time;

import p000.AbstractC8078Os0;
import p000.InterfaceC1090RK;
import p000.InterfaceC8234Rs0;

@InterfaceC1090RK
/* loaded from: classes.dex */
public class AwakeTimeSinceBootClock implements InterfaceC8234Rs0 {

    @InterfaceC1090RK
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    @InterfaceC1090RK
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // p000.InterfaceC8234Rs0, p000.InterfaceC8130Ps0
    @InterfaceC1090RK
    public /* bridge */ /* synthetic */ long now() {
        return AbstractC8078Os0.m6175a(this);
    }

    @Override // p000.InterfaceC8234Rs0, p000.InterfaceC8130Ps0
    @InterfaceC1090RK
    public long nowNanos() {
        return System.nanoTime();
    }
}
