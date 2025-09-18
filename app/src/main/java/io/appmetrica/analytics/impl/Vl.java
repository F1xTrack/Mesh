package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.UnsupportedEncodingException;

/* loaded from: classes2.dex */
public final class Vl extends U2 {
    public Vl(int i, String str) {
        this(i, str, PublicLogger.getAnonymousInstance());
    }

    public final int b() {
        return this.a;
    }

    public Vl(int i, String str, PublicLogger publicLogger) {
        super(i, str, publicLogger);
    }

    public final String a() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.Hm
    public final String a(String str) throws UnsupportedEncodingException {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            int i = this.a;
            if (length <= i) {
                return str;
            }
            String str2 = new String(bytes, 0, i, "UTF-8");
            try {
                this.c.warning("\"%s\" %s exceeded limit of %d bytes", this.b, str, Integer.valueOf(this.a));
            } catch (UnsupportedEncodingException unused) {
            }
            return str2;
        } catch (UnsupportedEncodingException unused2) {
            return str;
        }
    }
}
