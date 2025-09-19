package com.google.mlkit.vision.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p000.C10654pT1;
import p000.C1338VG;
import p000.EnumC7382Bi0;
import p000.FA1;
import p000.G10;
import p000.InterfaceC7850Ki0;
import p000.InterfaceC8504Wx0;
import p000.JA1;
import p000.NV1;
import p000.RO1;
import p000.S81;

@KeepForSdk
/* loaded from: classes.dex */
public class MobileVisionBase<DetectionResultT> implements Closeable, InterfaceC7850Ki0 {

    /* renamed from: e */
    public static final GmsLogger f18532e = new GmsLogger("MobileVisionBase", "");

    /* renamed from: a */
    public final AtomicBoolean f18533a = new AtomicBoolean(false);

    /* renamed from: b */
    public final C10654pT1 f18534b;

    /* renamed from: c */
    public final G10 f18535c;

    /* renamed from: d */
    public final Executor f18536d;

    public MobileVisionBase(C10654pT1 c10654pT1, Executor executor) {
        this.f18534b = c10654pT1;
        G10 g10 = new G10(7);
        this.f18535c = g10;
        this.f18536d = executor;
        ((AtomicInteger) c10654pT1.f3415c).incrementAndGet();
        c10654pT1.m2772b(executor, JA1.f5371b, (FA1) g10.f3531b).mo11136c(NV1.f7841g);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, p000.InterfaceC0294Ef
    @InterfaceC8504Wx0(EnumC7382Bi0.ON_DESTROY)
    @KeepForSdk
    public synchronized void close() {
        boolean z = true;
        if (this.f18533a.getAndSet(true)) {
            return;
        }
        this.f18535c.m2909y();
        C10654pT1 c10654pT1 = this.f18534b;
        Executor executor = this.f18536d;
        if (((AtomicInteger) c10654pT1.f3415c).get() <= 0) {
            z = false;
        }
        Preconditions.checkState(z);
        ((C1338VG) c10654pT1.f3414b).m8349n(new RO1(c10654pT1, 4, new S81()), executor);
    }
}
