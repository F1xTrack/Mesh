package io.appmetrica.analytics.impl;

import p000.C6838sg;

/* renamed from: io.appmetrica.analytics.impl.Hd */
/* loaded from: classes2.dex */
public abstract class AbstractC4542Hd {

    /* renamed from: a */
    public final int f30248a = -1;

    /* renamed from: b */
    public final int f30249b = 0;

    /* renamed from: c */
    public final int f30250c = 1;

    /* renamed from: a */
    public final int m19468a(Boolean bool) {
        if (bool == null) {
            return this.f30248a;
        }
        if (bool.equals(Boolean.FALSE)) {
            return this.f30249b;
        }
        if (bool.equals(Boolean.TRUE)) {
            return this.f30250c;
        }
        throw new C6838sg();
    }

    /* renamed from: a */
    public final Boolean m19469a(int i) {
        if (i == this.f30249b) {
            return Boolean.FALSE;
        }
        if (i == this.f30250c) {
            return Boolean.TRUE;
        }
        return null;
    }
}
