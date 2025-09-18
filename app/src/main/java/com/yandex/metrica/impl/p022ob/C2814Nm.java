package com.yandex.metrica.impl.p022ob;

import android.os.SystemClock;

/* renamed from: com.yandex.metrica.impl.ob.Nm */
/* loaded from: classes2.dex */
public class C2814Nm implements InterfaceC2839Om {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2839Om
    /* renamed from: a */
    public long mo14674a() {
        return System.currentTimeMillis();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2839Om
    /* renamed from: b */
    public long mo14675b() {
        return System.currentTimeMillis() / 1000;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2839Om
    /* renamed from: c */
    public long mo14676c() {
        return SystemClock.elapsedRealtime();
    }
}
