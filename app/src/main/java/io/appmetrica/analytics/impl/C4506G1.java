package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.p028io.FileUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.G1 */
/* loaded from: classes2.dex */
public final class C4506G1 {

    /* renamed from: a */
    public final C4921X9 f30158a;

    /* renamed from: b */
    public boolean f30159b;

    public C4506G1() {
        this(new C4921X9());
    }

    /* renamed from: a */
    public final synchronized long m19427a(Context context) {
        String strM19437a;
        try {
            this.f30158a.getClass();
            strM19437a = AbstractC4515Ga.m19437a(FileUtils.getFileFromAppStorage(context, "metrica_service_settings.dat"));
        } catch (Throwable unused) {
        }
        return !TextUtils.isEmpty(strM19437a) ? new JSONObject(strM19437a).optLong("delay") : 0L;
    }

    /* renamed from: b */
    public final void m19428b(Context context) {
        synchronized (this) {
        }
        if (this.f30159b) {
            return;
        }
        long jM19427a = m19427a(context);
        if (jM19427a > 0) {
            try {
                Thread.sleep(jM19427a);
            } catch (Throwable unused) {
            }
        }
        this.f30159b = true;
    }

    public C4506G1(C4921X9 c4921x9) {
        this.f30159b = false;
        this.f30158a = c4921x9;
    }
}
