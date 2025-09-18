package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;

/* renamed from: com.yandex.metrica.impl.ob.Mn */
/* loaded from: classes2.dex */
public class C2790Mn extends AbstractC2540Cn<String> {
    public C2790Mn(int i, String str, C2689Im c2689Im) {
        super(i, str, c2689Im);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2865Pn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String mo14016a(String str) throws UnsupportedEncodingException {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            if (bytes.length <= super.m13974b()) {
                return str;
            }
            String str2 = new String(bytes, 0, super.m13974b(), "UTF-8");
            try {
                if (this.f20990c.m17370c()) {
                    this.f20990c.m17369c("\"%s\" %s exceeded limit of %d bytes", super.m13973a(), str, Integer.valueOf(super.m13974b()));
                }
            } catch (UnsupportedEncodingException unused) {
            }
            return str2;
        } catch (UnsupportedEncodingException unused2) {
            return str;
        }
    }
}
