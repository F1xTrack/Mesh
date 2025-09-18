package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* renamed from: io.appmetrica.analytics.impl.Kf */
/* loaded from: classes2.dex */
public final class ResultReceiverC4616Kf extends ResultReceiver {

    /* renamed from: a */
    public final InterfaceC5499uf f30404a;

    public ResultReceiverC4616Kf(Handler handler, InterfaceC5499uf interfaceC5499uf) {
        super(handler);
        this.f30404a = interfaceC5499uf;
    }

    /* renamed from: a */
    public static void m19558a(ResultReceiver resultReceiver, C4472Ef c4472Ef) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("referrer", c4472Ef == null ? null : c4472Ef.m19359a());
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            C4472Ef c4472Ef = null;
            try {
                byte[] byteArray = bundle.getByteArray("referrer");
                if (byteArray != null && byteArray.length != 0) {
                    c4472Ef = new C4472Ef(byteArray);
                }
            } catch (Throwable unused) {
            }
            this.f30404a.mo19203a(c4472Ef);
        }
    }
}
