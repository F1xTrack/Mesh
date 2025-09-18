package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class XB implements A81 {
    public final int a;
    public final int b;
    public InterfaceC6839rR0 c;

    public XB() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // defpackage.A81
    public final void b(J11 j11) throws Throwable {
        j11.n(this.a, this.b);
    }

    @Override // defpackage.A81
    public final void c(InterfaceC6839rR0 interfaceC6839rR0) {
        this.c = interfaceC6839rR0;
    }

    @Override // defpackage.A81
    public final InterfaceC6839rR0 h() {
        return this.c;
    }

    public XB(int i, int i2) {
        if (!AbstractC0121Bh1.j(i, i2)) {
            throw new IllegalArgumentException(AbstractC8235ym.f(i, "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", i2, " and height: "));
        }
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.InterfaceC0747Ji0
    public final void onDestroy() {
    }

    @Override // defpackage.InterfaceC0747Ji0
    public final void onStart() {
    }

    @Override // defpackage.InterfaceC0747Ji0
    public final void onStop() {
    }

    @Override // defpackage.A81
    public final void a(J11 j11) {
    }

    @Override // defpackage.A81
    public final void f(Drawable drawable) {
    }

    @Override // defpackage.A81
    public final void g(Drawable drawable) {
    }
}
