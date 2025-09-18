package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Set;
import p000.AbstractBinderC8451Vw1;
import p000.AbstractC8503Ww1;
import p000.C9946jx1;
import p000.InterfaceC8789ax1;

/* loaded from: classes.dex */
public final class zact extends AbstractBinderC8451Vw1 implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    private static final Api.AbstractClientBuilder zaa = AbstractC8503Ww1.f13459a;
    private final Context zab;
    private final Handler zac;
    private final Api.AbstractClientBuilder zad;
    private final Set zae;
    private final ClientSettings zaf;
    private InterfaceC8789ax1 zag;
    private zacs zah;

    public zact(Context context, Handler handler, ClientSettings clientSettings) {
        Api.AbstractClientBuilder abstractClientBuilder = zaa;
        this.zab = context;
        this.zac = handler;
        this.zaf = (ClientSettings) Preconditions.checkNotNull(clientSettings, "ClientSettings must not be null");
        this.zae = clientSettings.getRequiredScopes();
        this.zad = abstractClientBuilder;
    }

    public static void zad(zact zactVar, C9946jx1 c9946jx1) {
        ConnectionResult connectionResult = c9946jx1.f35462b;
        if (connectionResult.isSuccess()) {
            com.google.android.gms.common.internal.zav zavVar = (com.google.android.gms.common.internal.zav) Preconditions.checkNotNull(c9946jx1.f35463c);
            ConnectionResult connectionResultZaa = zavVar.zaa();
            if (!connectionResultZaa.isSuccess()) {
                String strValueOf = String.valueOf(connectionResultZaa);
                new Exception();
                "Sign-in succeeded with resolve account failure: ".concat(strValueOf);
                zactVar.zah.zae(connectionResultZaa);
                zactVar.zag.disconnect();
                return;
            }
            zactVar.zah.zaf(zavVar.zab(), zactVar.zae);
        } else {
            zactVar.zah.zae(connectionResult);
        }
        zactVar.zag.disconnect();
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        this.zag.mo1972a(this);
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zah.zae(connectionResult);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.zah.zag(i);
    }

    @Override // p000.InterfaceC8917bx1
    public final void zab(C9946jx1 c9946jx1) {
        this.zac.post(new zacr(this, c9946jx1));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ax1, com.google.android.gms.common.api.Api$Client] */
    public final void zae(zacs zacsVar) {
        InterfaceC8789ax1 interfaceC8789ax1 = this.zag;
        if (interfaceC8789ax1 != null) {
            interfaceC8789ax1.disconnect();
        }
        this.zaf.zae(Integer.valueOf(System.identityHashCode(this)));
        Api.AbstractClientBuilder abstractClientBuilder = this.zad;
        Context context = this.zab;
        Handler handler = this.zac;
        ClientSettings clientSettings = this.zaf;
        this.zag = abstractClientBuilder.buildClient(context, handler.getLooper(), clientSettings, (ClientSettings) clientSettings.zaa(), (GoogleApiClient.ConnectionCallbacks) this, (GoogleApiClient.OnConnectionFailedListener) this);
        this.zah = zacsVar;
        Set set = this.zae;
        if (set == null || set.isEmpty()) {
            this.zac.post(new zacq(this));
        } else {
            this.zag.zab();
        }
    }

    public final void zaf() {
        InterfaceC8789ax1 interfaceC8789ax1 = this.zag;
        if (interfaceC8789ax1 != null) {
            interfaceC8789ax1.disconnect();
        }
    }
}
