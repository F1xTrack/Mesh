package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.ld, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2902ld<T> {
    static final long e = TimeUnit.SECONDS.toMillis(1);
    protected final Context a;
    protected final InterfaceC2779ge b;
    protected final LocationListener c;
    protected final Looper d;

    public AbstractC2902ld(Context context, LocationListener locationListener, InterfaceC2779ge interfaceC2779ge, Looper looper) {
        this.a = context;
        this.c = locationListener;
        this.b = interfaceC2779ge;
        this.d = looper;
    }

    public abstract void a();

    public abstract boolean a(T t);

    public abstract void b();
}
