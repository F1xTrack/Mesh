package com.yandex.metrica.impl.p022ob;

import android.content.Intent;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.r0 */
/* loaded from: classes2.dex */
public class C3558r0 {

    /* renamed from: a */
    private final InterfaceC2966U0 f24569a;

    /* renamed from: b */
    private final Map<Boolean, String> f24570b = new HashMap();

    public C3558r0(InterfaceC2966U0 interfaceC2966U0) {
        this.f24569a = interfaceC2966U0;
    }

    /* renamed from: a */
    public void m16642a(Intent intent) {
        if (intent != null) {
            m16641a(intent.getDataString(), false);
        }
    }

    /* renamed from: b */
    public void m16644b(String str) {
        m16641a(str, true);
    }

    /* renamed from: a */
    public void m16643a(String str) {
        m16641a(str, false);
    }

    /* renamed from: a */
    private void m16641a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!C2968U2.m15245a(str, this.f24570b.get(Boolean.valueOf(!z)))) {
            this.f24569a.mo14488a(str, z);
        }
        this.f24570b.put(Boolean.valueOf(z), str);
    }
}
