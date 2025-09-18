package io.appmetrica.analytics.impl;

import p000.AbstractC7038vr;

/* renamed from: io.appmetrica.analytics.impl.D9 */
/* loaded from: classes2.dex */
public abstract class AbstractC4441D9 {
    /* renamed from: a */
    public static final C5568x9 m19321a(int i, String str) {
        byte[] bytes;
        C5568x9 c5568x9 = new C5568x9();
        c5568x9.f32817a = i;
        if (str == null || (bytes = str.getBytes(AbstractC7038vr.f44561a)) == null) {
            bytes = c5568x9.f32818b;
        }
        c5568x9.f32818b = bytes;
        return c5568x9;
    }
}
