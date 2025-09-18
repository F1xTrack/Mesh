package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;
import kotlin.Lazy;
import p000.AbstractC0705LB;
import p000.O90;

/* renamed from: io.appmetrica.analytics.impl.tf */
/* loaded from: classes2.dex */
public final class C5474tf {

    /* renamed from: a */
    public final C4422Cf f32633a;

    /* renamed from: b */
    public final C5544wa f32634b;

    /* renamed from: c */
    public final C4688Nf f32635c;

    /* renamed from: d */
    public final Lazy f32636d = AbstractC0705LB.m4915b(new C5399qf(this));

    /* renamed from: e */
    public final Lazy f32637e = AbstractC0705LB.m4915b(new C5349of(this));

    /* renamed from: f */
    public final Lazy f32638f = AbstractC0705LB.m4915b(new C5449sf(this));

    /* renamed from: g */
    public final ArrayList f32639g = new ArrayList();

    public C5474tf(C4422Cf c4422Cf, C4664Mf c4664Mf, C5544wa c5544wa, C4688Nf c4688Nf) {
        this.f32633a = c4422Cf;
        this.f32634b = c5544wa;
        this.f32635c = c4688Nf;
    }

    /* renamed from: a */
    public static final InterfaceC5274lf m21080a(C5474tf c5474tf) {
        return (InterfaceC5274lf) c5474tf.f32636d.getValue();
    }

    /* renamed from: a */
    public static final void m21081a(C5474tf c5474tf, C4472Ef c4472Ef, InterfaceC5274lf interfaceC5274lf) {
        boolean zM5963a;
        c5474tf.f32639g.add(c4472Ef);
        C4688Nf c4688Nf = c5474tf.f32635c;
        if (c4472Ef == null) {
            c4688Nf.getClass();
        } else {
            SafePackageManager safePackageManager = c4688Nf.f30513b;
            Context context = c4688Nf.f30512a;
            String installerPackageName = safePackageManager.getInstallerPackageName(context, context.getPackageName());
            int iOrdinal = c4472Ef.f30079d.ordinal();
            if (iOrdinal == 1) {
                zM5963a = O90.m5963a(c4688Nf.f30517f, installerPackageName);
            } else if (iOrdinal == 2) {
                zM5963a = O90.m5963a(c4688Nf.f30518g, installerPackageName);
            }
            if (zM5963a) {
                c5474tf.m21082a(c4472Ef);
                return;
            }
        }
        interfaceC5274lf.mo20693a();
    }

    /* renamed from: a */
    public final void m21082a(C4472Ef c4472Ef) {
        C4422Cf c4422Cf = this.f32633a;
        synchronized (c4422Cf) {
            c4422Cf.f29963b = c4472Ef;
            c4422Cf.f29964c = true;
            c4422Cf.f29965d.m21058a(c4472Ef);
            c4422Cf.f29965d.m21063d();
            c4422Cf.m19278a(c4422Cf.f29963b);
        }
    }
}
