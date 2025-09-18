package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: oC0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6222oC0 extends Animation implements InterfaceC4392ih0 {
    public final View a;
    public float b;
    public float c;
    public float d;
    public float e;
    public int f;
    public int g;
    public int h;
    public int i;

    public C6222oC0(View view, int i, int i2, int i3, int i4) {
        this.a = view;
        a(i, i2, i3, i4);
    }

    public final void a(int i, int i2, int i3, int i4) {
        View view = this.a;
        this.b = view.getX() - view.getTranslationX();
        this.c = view.getY() - view.getTranslationY();
        this.f = view.getWidth();
        int height = view.getHeight();
        this.g = height;
        this.d = i - this.b;
        this.e = i2 - this.c;
        this.h = i3 - this.f;
        this.i = i4 - height;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        float f2 = (this.d * f) + this.b;
        float f3 = (this.e * f) + this.c;
        this.a.layout(Math.round(f2), Math.round(f3), Math.round(f2 + (this.h * f) + this.f), Math.round(f3 + (this.i * f) + this.g));
    }

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return true;
    }
}
