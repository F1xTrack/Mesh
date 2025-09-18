package com.yandex.metrica.impl.p022ob;

import p000.C6838sg;

/* renamed from: com.yandex.metrica.impl.ob.Z1 */
/* loaded from: classes2.dex */
public class C3092Z1 {

    /* renamed from: a */
    private final int f22906a;

    /* renamed from: b */
    private final int f22907b;

    /* renamed from: c */
    private final int f22908c;

    public C3092Z1(int i, int i2, int i3) {
        this.f22906a = i;
        this.f22907b = i2;
        this.f22908c = i3;
    }

    /* renamed from: a */
    public final int m15523a(Boolean bool) {
        if (bool == null) {
            return this.f22906a;
        }
        if (bool.equals(Boolean.FALSE)) {
            return this.f22907b;
        }
        if (bool.equals(Boolean.TRUE)) {
            return this.f22908c;
        }
        throw new C6838sg();
    }

    /* renamed from: a */
    public final Boolean m15524a(int i) {
        if (i == this.f22907b) {
            return Boolean.FALSE;
        }
        if (i == this.f22908c) {
            return Boolean.TRUE;
        }
        return null;
    }
}
