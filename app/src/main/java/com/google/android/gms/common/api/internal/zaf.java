package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ListenerHolder;
import p000.S81;

/* loaded from: classes.dex */
public final class zaf extends zad {
    public final zaci zab;

    public zaf(zaci zaciVar, S81 s81) {
        super(3, s81);
        this.zab = zaciVar;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean zaa(zabq zabqVar) {
        return this.zab.zaa.zab();
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final Feature[] zab(zabq zabqVar) {
        return this.zab.zaa.getRequiredFeatures();
    }

    @Override // com.google.android.gms.common.api.internal.zad
    public final void zac(zabq zabqVar) throws RemoteException {
        this.zab.zaa.registerListener(zabqVar.zaf(), this.zaa);
        ListenerHolder.ListenerKey listenerKey = this.zab.zaa.getListenerKey();
        if (listenerKey != null) {
            zabqVar.zah().put(listenerKey, this.zab);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zad, com.google.android.gms.common.api.internal.zai
    public final /* bridge */ /* synthetic */ void zag(zaad zaadVar, boolean z) {
    }
}
