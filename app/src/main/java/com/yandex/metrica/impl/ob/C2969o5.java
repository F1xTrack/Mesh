package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import android.text.TextUtils;
import com.yandex.metrica.impl.ac.CrashpadServiceHelper;

/* renamed from: com.yandex.metrica.impl.ob.o5 */
/* loaded from: classes2.dex */
public class C2969o5 extends AbstractC3068s5 {
    private final Um<String> b;

    /* renamed from: com.yandex.metrica.impl.ob.o5$a */
    public class a implements Um<String> {
        @Override // com.yandex.metrica.impl.ob.Um
        public void b(String str) {
            String str2 = str;
            if (U2.a(21)) {
                CrashpadServiceHelper.a(str2);
            }
        }
    }

    public C2969o5(C2744f4 c2744f4) {
        this(c2744f4, new a());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2944n5
    public boolean a(C2864k0 c2864k0) {
        Bundle bundleK = c2864k0.k();
        if (bundleK == null) {
            return true;
        }
        String string = bundleK.getString("payload_crash_id");
        if (TextUtils.isEmpty(string)) {
            return true;
        }
        this.b.b(string);
        return true;
    }

    public C2969o5(C2744f4 c2744f4, Um<String> um) {
        super(c2744f4);
        this.b = um;
    }
}
