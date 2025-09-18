package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.UnsupportedEncodingException;

/* renamed from: io.appmetrica.analytics.impl.Vl */
/* loaded from: classes2.dex */
public final class C4885Vl extends AbstractC4842U2 {
    public C4885Vl(int i, String str) {
        this(i, str, PublicLogger.getAnonymousInstance());
    }

    /* renamed from: b */
    public final int m19922b() {
        return this.f30802a;
    }

    public C4885Vl(int i, String str, PublicLogger publicLogger) {
        super(i, str, publicLogger);
    }

    /* renamed from: a */
    public final String m19920a() {
        return this.f30803b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4551Hm
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String mo19479a(String str) throws UnsupportedEncodingException {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            int i = this.f30802a;
            if (length <= i) {
                return str;
            }
            String str2 = new String(bytes, 0, i, "UTF-8");
            try {
                this.f30804c.warning("\"%s\" %s exceeded limit of %d bytes", this.f30803b, str, Integer.valueOf(this.f30802a));
            } catch (UnsupportedEncodingException unused) {
            }
            return str2;
        } catch (UnsupportedEncodingException unused2) {
            return str;
        }
    }
}
