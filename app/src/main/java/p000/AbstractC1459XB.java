package p000;

import android.graphics.drawable.Drawable;

/* renamed from: XB */
/* loaded from: classes.dex */
public abstract class AbstractC1459XB implements A81 {

    /* renamed from: a */
    public final int f13603a;

    /* renamed from: b */
    public final int f13604b;

    /* renamed from: c */
    public InterfaceC10905rR0 f13605c;

    public AbstractC1459XB() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // p000.A81
    /* renamed from: b */
    public final void mo78b(J11 j11) throws Throwable {
        j11.m4129n(this.f13603a, this.f13604b);
    }

    @Override // p000.A81
    /* renamed from: c */
    public final void mo79c(InterfaceC10905rR0 interfaceC10905rR0) {
        this.f13605c = interfaceC10905rR0;
    }

    @Override // p000.A81
    /* renamed from: h */
    public final InterfaceC10905rR0 mo83h() {
        return this.f13605c;
    }

    public AbstractC1459XB(int i, int i2) {
        if (!AbstractC7381Bh1.m811j(i, i2)) {
            throw new IllegalArgumentException(AbstractC7222ym.m26229f(i, "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", i2, " and height: "));
        }
        this.f13603a = i;
        this.f13604b = i2;
    }

    @Override // p000.InterfaceC7798Ji0
    public final void onDestroy() {
    }

    @Override // p000.InterfaceC7798Ji0
    public final void onStart() {
    }

    @Override // p000.InterfaceC7798Ji0
    public final void onStop() {
    }

    @Override // p000.A81
    /* renamed from: a */
    public final void mo77a(J11 j11) {
    }

    @Override // p000.A81
    /* renamed from: f */
    public final void mo81f(Drawable drawable) {
    }

    @Override // p000.A81
    /* renamed from: g */
    public final void mo82g(Drawable drawable) {
    }
}
