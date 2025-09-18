package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import p000.InterfaceC8789ax1;

/* loaded from: classes.dex */
final class zaat implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    final /* synthetic */ zaaw zaa;

    public /* synthetic */ zaat(zaaw zaawVar, zaas zaasVar) {
        this.zaa = zaawVar;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        ((InterfaceC8789ax1) Preconditions.checkNotNull(this.zaa.zak)).mo1972a(new zaar(this.zaa));
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zaa.zab.lock();
        try {
            if (this.zaa.zaI(connectionResult)) {
                this.zaa.zaA();
                this.zaa.zaF();
            } else {
                this.zaa.zaD(connectionResult);
            }
            this.zaa.zab.unlock();
        } catch (Throwable th) {
            this.zaa.zab.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
