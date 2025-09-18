package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

/* renamed from: ci, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2565ci extends AbstractC7664vl1 {
    public Animatable c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2565ci(ImageView imageView, int i) {
        super(imageView);
        this.d = i;
    }

    public final void d(Object obj) {
        switch (this.d) {
            case 0:
                this.a.setImageBitmap((Bitmap) obj);
                break;
            default:
                this.a.setImageDrawable((Drawable) obj);
                break;
        }
    }

    @Override // defpackage.A81
    public final void e(Object obj) {
        d(obj);
        if (!(obj instanceof Animatable)) {
            this.c = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.c = animatable;
        animatable.start();
    }

    @Override // defpackage.A81
    public final void f(Drawable drawable) {
        d(null);
        this.c = null;
        this.a.setImageDrawable(drawable);
    }

    @Override // defpackage.A81
    public final void g(Drawable drawable) {
        d(null);
        this.c = null;
        this.a.setImageDrawable(drawable);
    }

    @Override // defpackage.A81
    public final void i(Drawable drawable) {
        C7473ul1 c7473ul1 = this.b;
        ViewTreeObserver viewTreeObserver = c7473ul1.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c7473ul1.c);
        }
        c7473ul1.c = null;
        c7473ul1.b.clear();
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
        d(null);
        this.c = null;
        this.a.setImageDrawable(drawable);
    }

    @Override // defpackage.InterfaceC0747Ji0
    public final void onStart() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // defpackage.InterfaceC0747Ji0
    public final void onStop() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
