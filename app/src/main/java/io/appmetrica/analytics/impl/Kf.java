package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* loaded from: classes2.dex */
public final class Kf extends ResultReceiver {
    public final InterfaceC4911uf a;

    public Kf(Handler handler, InterfaceC4911uf interfaceC4911uf) {
        super(handler);
        this.a = interfaceC4911uf;
    }

    public static void a(ResultReceiver resultReceiver, Ef ef) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("referrer", ef == null ? null : ef.a());
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            Ef ef = null;
            try {
                byte[] byteArray = bundle.getByteArray("referrer");
                if (byteArray != null && byteArray.length != 0) {
                    ef = new Ef(byteArray);
                }
            } catch (Throwable unused) {
            }
            this.a.a(ef);
        }
    }
}
