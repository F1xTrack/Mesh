package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.c5 */
/* loaded from: classes2.dex */
public abstract class AbstractC5039c5 {

    /* renamed from: a */
    public final C5139g5 f31353a;

    /* renamed from: b */
    public final String f31354b = "[ComponentMigrationToV113]";

    public AbstractC5039c5(C5139g5 c5139g5) {
        this.f31353a = c5139g5;
    }

    /* renamed from: a */
    public final C5139g5 m20210a() {
        return this.f31353a;
    }

    /* renamed from: b */
    public final String m20212b() {
        return this.f31354b;
    }

    /* renamed from: b */
    public abstract boolean mo20213b(int i);

    /* renamed from: c */
    public abstract void mo20214c();

    /* renamed from: a */
    public final void m20211a(int i) {
        if (mo20213b(i)) {
            mo20214c();
        }
    }
}
