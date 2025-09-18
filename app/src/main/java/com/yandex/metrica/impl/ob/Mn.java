package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;

/* loaded from: classes2.dex */
public class Mn extends Cn<String> {
    public Mn(int i, String str, Im im) {
        super(i, str, im);
    }

    @Override // com.yandex.metrica.impl.ob.Pn
    public String a(String str) throws UnsupportedEncodingException {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            if (bytes.length <= super.b()) {
                return str;
            }
            String str2 = new String(bytes, 0, super.b(), "UTF-8");
            try {
                if (this.c.c()) {
                    this.c.c("\"%s\" %s exceeded limit of %d bytes", super.a(), str, Integer.valueOf(super.b()));
                }
            } catch (UnsupportedEncodingException unused) {
            }
            return str2;
        } catch (UnsupportedEncodingException unused2) {
            return str;
        }
    }
}
