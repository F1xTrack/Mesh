package com.yandex.metrica.impl.p022ob;

import android.os.Bundle;
import android.text.TextUtils;
import com.yandex.metrica.impl.p021ac.CrashpadServiceHelper;

/* renamed from: com.yandex.metrica.impl.ob.o5 */
/* loaded from: classes2.dex */
public class C3485o5 extends AbstractC3589s5 {

    /* renamed from: b */
    private final InterfaceC2988Um<String> f24367b;

    /* renamed from: com.yandex.metrica.impl.ob.o5$a */
    public class a implements InterfaceC2988Um<String> {
        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2988Um
        /* renamed from: b */
        public void mo13904b(String str) {
            String str2 = str;
            if (C2968U2.m15243a(21)) {
                CrashpadServiceHelper.m13833a(str2);
            }
        }
    }

    public C3485o5(C3250f4 c3250f4) {
        this(c3250f4, new a());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3459n5
    /* renamed from: a */
    public boolean mo13844a(C3376k0 c3376k0) {
        Bundle bundleM16241k = c3376k0.m16241k();
        if (bundleM16241k == null) {
            return true;
        }
        String string = bundleM16241k.getString("payload_crash_id");
        if (TextUtils.isEmpty(string)) {
            return true;
        }
        this.f24367b.mo13904b(string);
        return true;
    }

    public C3485o5(C3250f4 c3250f4, InterfaceC2988Um<String> interfaceC2988Um) {
        super(c3250f4);
        this.f24367b = interfaceC2988Um;
    }
}
