package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.LB;
import defpackage.O90;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;
import kotlin.Lazy;

/* renamed from: io.appmetrica.analytics.impl.tf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4887tf {
    public final Cf a;
    public final C4954wa b;
    public final Nf c;
    public final Lazy d = LB.b(new C4816qf(this));
    public final Lazy e = LB.b(new C4768of(this));
    public final Lazy f = LB.b(new C4863sf(this));
    public final ArrayList g = new ArrayList();

    public C4887tf(Cf cf, Mf mf, C4954wa c4954wa, Nf nf) {
        this.a = cf;
        this.b = c4954wa;
        this.c = nf;
    }

    public static final InterfaceC4696lf a(C4887tf c4887tf) {
        return (InterfaceC4696lf) c4887tf.d.getValue();
    }

    public static final void a(C4887tf c4887tf, Ef ef, InterfaceC4696lf interfaceC4696lf) {
        boolean zA;
        c4887tf.g.add(ef);
        Nf nf = c4887tf.c;
        if (ef == null) {
            nf.getClass();
        } else {
            SafePackageManager safePackageManager = nf.b;
            Context context = nf.a;
            String installerPackageName = safePackageManager.getInstallerPackageName(context, context.getPackageName());
            int iOrdinal = ef.d.ordinal();
            if (iOrdinal == 1) {
                zA = O90.a(nf.f, installerPackageName);
            } else if (iOrdinal == 2) {
                zA = O90.a(nf.g, installerPackageName);
            }
            if (zA) {
                c4887tf.a(ef);
                return;
            }
        }
        interfaceC4696lf.a();
    }

    public final void a(Ef ef) {
        Cf cf = this.a;
        synchronized (cf) {
            cf.b = ef;
            cf.c = true;
            cf.d.a(ef);
            cf.d.d();
            cf.a(cf.b);
        }
    }
}
