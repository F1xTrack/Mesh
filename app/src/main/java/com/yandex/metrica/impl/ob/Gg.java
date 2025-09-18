package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* loaded from: classes2.dex */
public class Gg extends ResultReceiver {
    public static final /* synthetic */ int b = 0;
    private final Eg a;

    public Gg(Handler handler, Eg eg) {
        super(handler);
        this.a = eg;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i, Bundle bundle) {
        Fg fgA;
        if (i == 1) {
            try {
                fgA = Fg.a(bundle.getByteArray("referrer"));
            } catch (Throwable unused) {
                fgA = null;
            }
            this.a.a(fgA);
        }
    }
}
