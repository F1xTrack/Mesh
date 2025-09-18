package defpackage;

import android.graphics.Typeface;

/* renamed from: Fp */
/* loaded from: classes.dex */
public final class C0455Fp extends AbstractC5895mU1 {
    public final Typeface a;
    public final QQ0 b;
    public boolean c;

    public C0455Fp(QQ0 qq0, Typeface typeface) {
        this.a = typeface;
        this.b = qq0;
    }

    @Override // defpackage.AbstractC5895mU1
    public final void a(int i) {
        if (this.c) {
            return;
        }
        C7116su c7116su = (C7116su) this.b.a;
        if (c7116su.j(this.a)) {
            c7116su.h(false);
        }
    }

    @Override // defpackage.AbstractC5895mU1
    public final void b(Typeface typeface, boolean z) {
        if (this.c) {
            return;
        }
        C7116su c7116su = (C7116su) this.b.a;
        if (c7116su.j(typeface)) {
            c7116su.h(false);
        }
    }
}
