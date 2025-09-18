package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import io.appmetrica.analytics.BuildConfig;

/* renamed from: io.appmetrica.analytics.impl.wj */
/* loaded from: classes2.dex */
public final class C5553wj extends AbstractC5496uc {

    /* renamed from: a */
    public final C5457sn f32779a;

    public C5553wj() {
        this(C5244ka.m20614h().m20615A().m21190b());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5496uc
    /* renamed from: a */
    public final void mo20602a(int i) {
        C5457sn c5457sn = this.f32779a;
        synchronized (c5457sn) {
            C5507un c5507un = c5457sn.f32586a;
            c5507un.m21152a(c5507un.m21151a().put("last_migration_api_level", i));
        }
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5496uc
    /* renamed from: b */
    public final int mo20603b() {
        int iOptInt;
        C5457sn c5457sn = this.f32779a;
        synchronized (c5457sn) {
            iOptInt = c5457sn.f32586a.m21151a().optInt("last_migration_api_level", -1);
        }
        return iOptInt;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5496uc
    /* renamed from: c */
    public final SparseArray<InterfaceC5471tc> mo20604c() {
        SparseArray<InterfaceC5471tc> sparseArray = new SparseArray<>(1);
        sparseArray.put(112, new C5578xj(this.f32779a));
        sparseArray.put(BuildConfig.API_LEVEL, new C5603yj());
        return sparseArray;
    }

    public C5553wj(C5457sn c5457sn) {
        this.f32779a = c5457sn;
    }
}
