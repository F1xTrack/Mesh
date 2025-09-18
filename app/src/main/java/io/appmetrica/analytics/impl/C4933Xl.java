package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.Xl */
/* loaded from: classes2.dex */
public final class C4933Xl extends AbstractC4842U2 {
    public C4933Xl(int i, String str) {
        this(i, str, PublicLogger.getAnonymousInstance());
    }

    /* renamed from: b */
    public final int m20010b() {
        return this.f30802a;
    }

    public C4933Xl(int i, String str, PublicLogger publicLogger) {
        super(i, str, publicLogger);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4551Hm
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String mo19479a(String str) {
        if (str != null) {
            int length = str.length();
            int i = this.f30802a;
            if (length > i) {
                String strSubstring = str.substring(0, i);
                this.f30804c.warning("\"%s\" %s size exceeded limit of %d characters", this.f30803b, str, Integer.valueOf(this.f30802a));
                return strSubstring;
            }
        }
        return str;
    }

    /* renamed from: a */
    public final String m20008a() {
        return this.f30803b;
    }
}
