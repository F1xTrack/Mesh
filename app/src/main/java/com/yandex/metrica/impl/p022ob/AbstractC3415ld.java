package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.ld */
/* loaded from: classes2.dex */
public abstract class AbstractC3415ld<T> {

    /* renamed from: e */
    static final long f24185e = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: a */
    protected final Context f24186a;

    /* renamed from: b */
    protected final InterfaceC3286ge f24187b;

    /* renamed from: c */
    protected final LocationListener f24188c;

    /* renamed from: d */
    protected final Looper f24189d;

    public AbstractC3415ld(Context context, LocationListener locationListener, InterfaceC3286ge interfaceC3286ge, Looper looper) {
        this.f24186a = context;
        this.f24188c = locationListener;
        this.f24187b = interfaceC3286ge;
        this.f24189d = looper;
    }

    /* renamed from: a */
    public abstract void mo13927a();

    /* renamed from: a */
    public abstract boolean mo13928a(T t);

    /* renamed from: b */
    public abstract void mo13929b();
}
