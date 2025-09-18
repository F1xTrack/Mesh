package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import java.util.Iterator;
import java.util.Set;
import p000.C6867t8;
import p000.C7119x8;
import p000.S81;

/* loaded from: classes.dex */
public final class zal {
    private int zad;
    private final C7119x8 zab = new C7119x8();
    private final S81 zac = new S81();
    private boolean zae = false;
    private final C7119x8 zaa = new C7119x8();

    public zal(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zaa.put(((HasApiKey) it.next()).getApiKey(), null);
        }
        this.zad = ((C6867t8) this.zaa.keySet()).f42880a.f6450c;
    }

    public final Task zaa() {
        return this.zac.f10598a;
    }

    public final Set zab() {
        return this.zaa.keySet();
    }

    public final void zac(ApiKey apiKey, ConnectionResult connectionResult, String str) {
        this.zaa.put(apiKey, connectionResult);
        this.zab.put(apiKey, str);
        this.zad--;
        if (!connectionResult.isSuccess()) {
            this.zae = true;
        }
        if (this.zad == 0) {
            if (!this.zae) {
                this.zac.m7184b(this.zab);
            } else {
                this.zac.m7183a(new AvailabilityException(this.zaa));
            }
        }
    }
}
