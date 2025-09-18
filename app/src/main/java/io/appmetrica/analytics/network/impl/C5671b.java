package io.appmetrica.analytics.network.impl;

import javax.net.ssl.HttpsURLConnection;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6434mZ;

/* renamed from: io.appmetrica.analytics.network.impl.b */
/* loaded from: classes2.dex */
public final class C5671b extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: a */
    public final /* synthetic */ HttpsURLConnection f33057a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5671b(HttpsURLConnection httpsURLConnection) {
        super(0);
        this.f33057a = httpsURLConnection;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        return this.f33057a.getErrorStream();
    }
}
