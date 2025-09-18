package p000;

import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.animation.LinearInterpolator;

/* renamed from: Zn1 */
/* loaded from: classes.dex */
public final class C8641Zn1 extends AbstractC9572h12 {

    /* renamed from: b */
    public final WindowInsetsController f15130b;

    /* renamed from: c */
    public final C10641pN0 f15131c;

    /* renamed from: d */
    public Window f15132d;

    public C8641Zn1(WindowInsetsController windowInsetsController, C10641pN0 c10641pN0) {
        this.f15130b = windowInsetsController;
        this.f15131c = c10641pN0;
    }

    @Override // p000.AbstractC9572h12
    /* renamed from: a */
    public final void mo8860a(LinearInterpolator linearInterpolator, CancellationSignal cancellationSignal, C8572Yf0 c8572Yf0) {
        this.f15130b.controlWindowInsetsAnimation(8, -1L, linearInterpolator, cancellationSignal, new WindowInsetsAnimationControlListenerC8589Yn1(c8572Yf0));
    }

    @Override // p000.AbstractC9572h12
    /* renamed from: b */
    public final int mo8861b() {
        return this.f15130b.getSystemBarsBehavior();
    }

    @Override // p000.AbstractC9572h12
    /* renamed from: c */
    public final void mo8862c(int i) {
        if ((i & 8) != 0) {
            ((L21) this.f15131c.f40042b).mo4873e();
        }
        this.f15130b.hide(i & (-9));
    }

    @Override // p000.AbstractC9572h12
    /* renamed from: f */
    public final void mo9116f(boolean z) {
        Window window = this.f15132d;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f15130b.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f15130b.setSystemBarsAppearance(0, 16);
    }

    @Override // p000.AbstractC9572h12
    /* renamed from: g */
    public final void mo8863g(boolean z) {
        Window window = this.f15132d;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f15130b.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f15130b.setSystemBarsAppearance(0, 8);
    }

    @Override // p000.AbstractC9572h12
    /* renamed from: h */
    public final void mo8864h(int i) {
        this.f15130b.setSystemBarsBehavior(i);
    }

    @Override // p000.AbstractC9572h12
    /* renamed from: i */
    public final void mo8865i(int i) {
        if ((i & 8) != 0) {
            ((L21) this.f15131c.f40042b).mo4875g();
        }
        this.f15130b.show(i & (-9));
    }
}
