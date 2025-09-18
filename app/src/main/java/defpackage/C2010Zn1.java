package defpackage;

import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.animation.LinearInterpolator;

/* renamed from: Zn1 */
/* loaded from: classes.dex */
public final class C2010Zn1 extends AbstractC4075h12 {
    public final WindowInsetsController b;
    public final C6446pN0 c;
    public Window d;

    public C2010Zn1(WindowInsetsController windowInsetsController, C6446pN0 c6446pN0) {
        this.b = windowInsetsController;
        this.c = c6446pN0;
    }

    @Override // defpackage.AbstractC4075h12
    public final void a(LinearInterpolator linearInterpolator, CancellationSignal cancellationSignal, C1907Yf0 c1907Yf0) {
        this.b.controlWindowInsetsAnimation(8, -1L, linearInterpolator, cancellationSignal, new WindowInsetsAnimationControlListenerC1932Yn1(c1907Yf0));
    }

    @Override // defpackage.AbstractC4075h12
    public final int b() {
        return this.b.getSystemBarsBehavior();
    }

    @Override // defpackage.AbstractC4075h12
    public final void c(int i) {
        if ((i & 8) != 0) {
            ((L21) this.c.b).e();
        }
        this.b.hide(i & (-9));
    }

    @Override // defpackage.AbstractC4075h12
    public final void f(boolean z) {
        Window window = this.d;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.b.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.b.setSystemBarsAppearance(0, 16);
    }

    @Override // defpackage.AbstractC4075h12
    public final void g(boolean z) {
        Window window = this.d;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.b.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.b.setSystemBarsAppearance(0, 8);
    }

    @Override // defpackage.AbstractC4075h12
    public final void h(int i) {
        this.b.setSystemBarsBehavior(i);
    }

    @Override // defpackage.AbstractC4075h12
    public final void i(int i) {
        if ((i & 8) != 0) {
            ((L21) this.c.b).g();
        }
        this.b.show(i & (-9));
    }
}
