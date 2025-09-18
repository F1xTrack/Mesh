package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class L1 {
    private final L0 a;
    private boolean b;

    public L1(Dm dm) {
        this(dm, new L0());
    }

    public void a(Context context) {
        long jOptLong;
        String strA;
        synchronized (this) {
        }
        if (this.b) {
            return;
        }
        synchronized (this) {
            try {
                strA = V0.a(this.a.a(context, "metrica_service_settings.dat"));
            } catch (Throwable unused) {
            }
            jOptLong = !TextUtils.isEmpty(strA) ? new JSONObject(strA).optLong("delay") : 0L;
        }
        if (jOptLong > 0) {
            try {
                Thread.sleep(jOptLong);
            } catch (Throwable unused2) {
            }
        }
        this.b = true;
    }

    public L1(Dm dm, L0 l0) {
        this.b = false;
        this.a = l0;
    }
}
