package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

/* renamed from: ci */
/* loaded from: classes.dex */
public final class C1864ci extends AbstractC11458vl1 {

    /* renamed from: c */
    public Animatable f17692c;

    /* renamed from: d */
    public final /* synthetic */ int f17693d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1864ci(ImageView imageView, int i) {
        super(imageView);
        this.f17693d = i;
    }

    /* renamed from: d */
    public final void m10829d(Object obj) {
        switch (this.f17693d) {
            case 0:
                this.f44516a.setImageBitmap((Bitmap) obj);
                break;
            default:
                this.f44516a.setImageDrawable((Drawable) obj);
                break;
        }
    }

    @Override // p000.A81
    /* renamed from: e */
    public final void mo80e(Object obj) {
        m10829d(obj);
        if (!(obj instanceof Animatable)) {
            this.f17692c = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f17692c = animatable;
        animatable.start();
    }

    @Override // p000.A81
    /* renamed from: f */
    public final void mo81f(Drawable drawable) {
        m10829d(null);
        this.f17692c = null;
        this.f44516a.setImageDrawable(drawable);
    }

    @Override // p000.A81
    /* renamed from: g */
    public final void mo82g(Drawable drawable) {
        m10829d(null);
        this.f17692c = null;
        this.f44516a.setImageDrawable(drawable);
    }

    @Override // p000.A81
    /* renamed from: i */
    public final void mo84i(Drawable drawable) {
        C11330ul1 c11330ul1 = this.f44517b;
        ViewTreeObserver viewTreeObserver = c11330ul1.f43845a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c11330ul1.f43847c);
        }
        c11330ul1.f43847c = null;
        c11330ul1.f43846b.clear();
        Animatable animatable = this.f17692c;
        if (animatable != null) {
            animatable.stop();
        }
        m10829d(null);
        this.f17692c = null;
        this.f44516a.setImageDrawable(drawable);
    }

    @Override // p000.InterfaceC7798Ji0
    public final void onStart() {
        Animatable animatable = this.f17692c;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // p000.InterfaceC7798Ji0
    public final void onStop() {
        Animatable animatable = this.f17692c;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
