package p000;

import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.animation.LinearInterpolator;

/* renamed from: Wn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8485Wn1 extends AbstractC9572h12 {

    /* renamed from: b */
    public final Window f13410b;

    /* renamed from: c */
    public final C10641pN0 f13411c;

    public C8485Wn1(Window window, C10641pN0 c10641pN0) {
        this.f13410b = window;
        this.f13411c = c10641pN0;
    }

    @Override // p000.AbstractC9572h12
    /* renamed from: b */
    public final int mo8861b() {
        return 0;
    }

    @Override // p000.AbstractC9572h12
    /* renamed from: c */
    public final void mo8862c(int i) {
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    m8866l(4);
                } else if (i2 == 2) {
                    m8866l(2);
                } else if (i2 == 8) {
                    ((L21) this.f13411c.f40042b).mo4873e();
                }
            }
        }
    }

    @Override // p000.AbstractC9572h12
    /* renamed from: g */
    public final void mo8863g(boolean z) {
        if (!z) {
            m8867m(8192);
            return;
        }
        Window window = this.f13410b;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        m8866l(8192);
    }

    @Override // p000.AbstractC9572h12
    /* renamed from: h */
    public final void mo8864h(int i) {
        if (i == 0) {
            m8867m(6144);
            return;
        }
        if (i == 1) {
            m8867m(4096);
            m8866l(2048);
        } else {
            if (i != 2) {
                return;
            }
            m8867m(2048);
            m8866l(4096);
        }
    }

    @Override // p000.AbstractC9572h12
    /* renamed from: i */
    public final void mo8865i(int i) {
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    m8867m(4);
                    this.f13410b.clearFlags(1024);
                } else if (i2 == 2) {
                    m8867m(2);
                } else if (i2 == 8) {
                    ((L21) this.f13411c.f40042b).mo4875g();
                }
            }
        }
    }

    /* renamed from: l */
    public final void m8866l(int i) {
        View decorView = this.f13410b.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    /* renamed from: m */
    public final void m8867m(int i) {
        View decorView = this.f13410b.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // p000.AbstractC9572h12
    /* renamed from: a */
    public final void mo8860a(LinearInterpolator linearInterpolator, CancellationSignal cancellationSignal, C8572Yf0 c8572Yf0) {
    }
}
