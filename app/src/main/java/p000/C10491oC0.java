package p000;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: oC0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10491oC0 extends Animation implements InterfaceC9785ih0 {

    /* renamed from: a */
    public final View f38876a;

    /* renamed from: b */
    public float f38877b;

    /* renamed from: c */
    public float f38878c;

    /* renamed from: d */
    public float f38879d;

    /* renamed from: e */
    public float f38880e;

    /* renamed from: f */
    public int f38881f;

    /* renamed from: g */
    public int f38882g;

    /* renamed from: h */
    public int f38883h;

    /* renamed from: i */
    public int f38884i;

    public C10491oC0(View view, int i, int i2, int i3, int i4) {
        this.f38876a = view;
        m23361a(i, i2, i3, i4);
    }

    /* renamed from: a */
    public final void m23361a(int i, int i2, int i3, int i4) {
        View view = this.f38876a;
        this.f38877b = view.getX() - view.getTranslationX();
        this.f38878c = view.getY() - view.getTranslationY();
        this.f38881f = view.getWidth();
        int height = view.getHeight();
        this.f38882g = height;
        this.f38879d = i - this.f38877b;
        this.f38880e = i2 - this.f38878c;
        this.f38883h = i3 - this.f38881f;
        this.f38884i = i4 - height;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        float f2 = (this.f38879d * f) + this.f38877b;
        float f3 = (this.f38880e * f) + this.f38878c;
        this.f38876a.layout(Math.round(f2), Math.round(f3), Math.round(f2 + (this.f38883h * f) + this.f38881f), Math.round(f3 + (this.f38884i * f) + this.f38882g));
    }

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return true;
    }
}
