package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.L1 */
/* loaded from: classes2.dex */
public class C2743L1 {

    /* renamed from: a */
    private final C2742L0 f21615a;

    /* renamed from: b */
    private boolean f21616b;

    public C2743L1(C2564Dm c2564Dm) {
        this(c2564Dm, new C2742L0());
    }

    /* renamed from: a */
    public void m14505a(Context context) {
        long jOptLong;
        String strM15292a;
        synchronized (this) {
        }
        if (this.f21616b) {
            return;
        }
        synchronized (this) {
            try {
                strM15292a = C2991V0.m15292a(this.f21615a.m14500a(context, "metrica_service_settings.dat"));
            } catch (Throwable unused) {
            }
            jOptLong = !TextUtils.isEmpty(strM15292a) ? new JSONObject(strM15292a).optLong("delay") : 0L;
        }
        if (jOptLong > 0) {
            try {
                Thread.sleep(jOptLong);
            } catch (Throwable unused2) {
            }
        }
        this.f21616b = true;
    }

    public C2743L1(C2564Dm c2564Dm, C2742L0 c2742l0) {
        this.f21616b = false;
        this.f21615a = c2742l0;
    }
}
