package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: o8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6209o8 implements InterfaceC5293jL {
    public final /* synthetic */ int a;
    public final /* synthetic */ C6269oS b;

    public C6209o8(C6269oS c6269oS, int i) {
        this.b = c6269oS;
        this.a = i;
    }

    @Override // defpackage.InterfaceC5293jL
    public final Drawable k(Drawable drawable) {
        return this.b.d(drawable, this.a);
    }

    @Override // defpackage.InterfaceC5293jL
    public final Drawable p() {
        return this.b.c(this.a);
    }
}
