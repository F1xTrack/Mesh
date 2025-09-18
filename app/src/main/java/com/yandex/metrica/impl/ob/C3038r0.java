package com.yandex.metrica.impl.ob;

import android.content.Intent;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.r0 */
/* loaded from: classes2.dex */
public class C3038r0 {
    private final U0 a;
    private final Map<Boolean, String> b = new HashMap();

    public C3038r0(U0 u0) {
        this.a = u0;
    }

    public void a(Intent intent) {
        if (intent != null) {
            a(intent.getDataString(), false);
        }
    }

    public void b(String str) {
        a(str, true);
    }

    public void a(String str) {
        a(str, false);
    }

    private void a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!U2.a(str, this.b.get(Boolean.valueOf(!z)))) {
            this.a.a(str, z);
        }
        this.b.put(Boolean.valueOf(z), str);
    }
}
