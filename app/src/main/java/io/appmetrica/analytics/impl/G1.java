package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class G1 {
    public final X9 a;
    public boolean b;

    public G1() {
        this(new X9());
    }

    public final synchronized long a(Context context) {
        String strA;
        try {
            this.a.getClass();
            strA = Ga.a(FileUtils.getFileFromAppStorage(context, "metrica_service_settings.dat"));
        } catch (Throwable unused) {
        }
        return !TextUtils.isEmpty(strA) ? new JSONObject(strA).optLong("delay") : 0L;
    }

    public final void b(Context context) {
        synchronized (this) {
        }
        if (this.b) {
            return;
        }
        long jA = a(context);
        if (jA > 0) {
            try {
                Thread.sleep(jA);
            } catch (Throwable unused) {
            }
        }
        this.b = true;
    }

    public G1(X9 x9) {
        this.b = false;
        this.a = x9;
    }
}
