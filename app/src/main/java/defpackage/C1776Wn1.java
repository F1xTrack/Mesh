package defpackage;

import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.animation.LinearInterpolator;

/* renamed from: Wn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1776Wn1 extends AbstractC4075h12 {
    public final Window b;
    public final C6446pN0 c;

    public C1776Wn1(Window window, C6446pN0 c6446pN0) {
        this.b = window;
        this.c = c6446pN0;
    }

    @Override // defpackage.AbstractC4075h12
    public final int b() {
        return 0;
    }

    @Override // defpackage.AbstractC4075h12
    public final void c(int i) {
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    l(4);
                } else if (i2 == 2) {
                    l(2);
                } else if (i2 == 8) {
                    ((L21) this.c.b).e();
                }
            }
        }
    }

    @Override // defpackage.AbstractC4075h12
    public final void g(boolean z) {
        if (!z) {
            m(8192);
            return;
        }
        Window window = this.b;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        l(8192);
    }

    @Override // defpackage.AbstractC4075h12
    public final void h(int i) {
        if (i == 0) {
            m(6144);
            return;
        }
        if (i == 1) {
            m(4096);
            l(2048);
        } else {
            if (i != 2) {
                return;
            }
            m(2048);
            l(4096);
        }
    }

    @Override // defpackage.AbstractC4075h12
    public final void i(int i) {
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    m(4);
                    this.b.clearFlags(1024);
                } else if (i2 == 2) {
                    m(2);
                } else if (i2 == 8) {
                    ((L21) this.c.b).g();
                }
            }
        }
    }

    public final void l(int i) {
        View decorView = this.b.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void m(int i) {
        View decorView = this.b.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // defpackage.AbstractC4075h12
    public final void a(LinearInterpolator linearInterpolator, CancellationSignal cancellationSignal, C1907Yf0 c1907Yf0) {
    }
}
