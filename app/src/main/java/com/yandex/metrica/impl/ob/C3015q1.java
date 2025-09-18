package com.yandex.metrica.impl.ob;

import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.q1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3015q1 {
    private final W0 a;

    public C3015q1() {
        this(Oh.a());
    }

    public void a(Map<String, Object> map) {
        this.a.reportEvent("login_sdk", map);
    }

    public C3015q1(W0 w0) {
        this.a = w0;
    }
}
