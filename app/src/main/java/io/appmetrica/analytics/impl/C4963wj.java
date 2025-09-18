package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import io.appmetrica.analytics.BuildConfig;

/* renamed from: io.appmetrica.analytics.impl.wj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4963wj extends AbstractC4908uc {
    public final sn a;

    public C4963wj() {
        this(C4667ka.h().A().b());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4908uc
    public final void a(int i) {
        sn snVar = this.a;
        synchronized (snVar) {
            un unVar = snVar.a;
            unVar.a(unVar.a().put("last_migration_api_level", i));
        }
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4908uc
    public final int b() {
        int iOptInt;
        sn snVar = this.a;
        synchronized (snVar) {
            iOptInt = snVar.a.a().optInt("last_migration_api_level", -1);
        }
        return iOptInt;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4908uc
    public final SparseArray<InterfaceC4884tc> c() {
        SparseArray<InterfaceC4884tc> sparseArray = new SparseArray<>(1);
        sparseArray.put(112, new C4987xj(this.a));
        sparseArray.put(BuildConfig.API_LEVEL, new C5011yj());
        return sparseArray;
    }

    public C4963wj(sn snVar) {
        this.a = snVar;
    }
}
