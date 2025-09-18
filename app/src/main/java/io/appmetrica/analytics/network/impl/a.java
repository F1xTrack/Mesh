package io.appmetrica.analytics.network.impl;

import defpackage.AbstractC1676Vg0;
import defpackage.InterfaceC5908mZ;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes2.dex */
public final class a extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ HttpsURLConnection a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(HttpsURLConnection httpsURLConnection) {
        super(0);
        this.a = httpsURLConnection;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        return this.a.getInputStream();
    }
}
