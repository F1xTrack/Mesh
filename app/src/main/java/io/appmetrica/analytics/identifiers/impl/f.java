package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import defpackage.AbstractC1705Vq;
import defpackage.InterfaceC6099nZ;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* loaded from: classes2.dex */
public final class f {
    public final e a;
    public final InterfaceC6099nZ b;
    public final String c;
    public final SafePackageManager d;

    public f(e eVar, InterfaceC6099nZ interfaceC6099nZ, String str, SafePackageManager safePackageManager) {
        this.a = eVar;
        this.b = interfaceC6099nZ;
        this.c = str;
        this.d = safePackageManager;
    }

    public final Object a(Context context) throws g {
        IBinder iBinder;
        e eVar;
        if (this.d.resolveService(context, this.a.a, 0) == null) {
            throw new l(AbstractC1705Vq.l(new StringBuilder("could not resolve "), this.c, " services"));
        }
        try {
            eVar = this.a;
        } catch (Throwable unused) {
        }
        if (context.bindService(eVar.a, eVar, 1)) {
            e eVar2 = this.a;
            if (eVar2.b == null) {
                synchronized (eVar2.c) {
                    if (eVar2.b == null) {
                        try {
                            eVar2.c.wait(3000L);
                        } catch (InterruptedException unused2) {
                        }
                    }
                }
            }
            iBinder = eVar2.b;
        } else {
            iBinder = null;
        }
        if (iBinder != null) {
            return this.b.invoke(iBinder);
        }
        throw new g(AbstractC1705Vq.l(new StringBuilder("could not bind to "), this.c, " services"));
    }

    public final void b(Context context) {
        try {
            this.a.a(context);
        } catch (Throwable unused) {
        }
    }

    public f(Intent intent, InterfaceC6099nZ interfaceC6099nZ, String str) {
        this(new e(intent, str), interfaceC6099nZ, str, new SafePackageManager());
    }
}
