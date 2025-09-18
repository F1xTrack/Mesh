package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* loaded from: classes2.dex */
public final class B6 extends ResultReceiver {
    public final A6 a;

    public B6(Handler handler, A6 a6) {
        super(handler);
        this.a = a6;
    }

    public static void a(ResultReceiver resultReceiver, C4590h4 c4590h4) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            c4590h4.b(bundle);
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.a.a(i, bundle);
    }

    public static void a(ResultReceiver resultReceiver, Kk kk, C4590h4 c4590h4) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("startup_error_key_code", kk.a);
            c4590h4.b(bundle);
            resultReceiver.send(2, bundle);
        }
    }
}
