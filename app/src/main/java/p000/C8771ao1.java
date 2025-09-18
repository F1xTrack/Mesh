package p000;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* renamed from: ao1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8771ao1 {

    /* renamed from: a */
    public final AbstractC9572h12 f16606a;

    public C8771ao1(WindowInsetsController windowInsetsController) {
        this.f16606a = new C8641Zn1(windowInsetsController, new C10641pN0(windowInsetsController));
    }

    /* renamed from: a */
    public final void m10338a(int i) {
        this.f16606a.mo8862c(i);
    }

    /* renamed from: b */
    public final void m10339b(int i) {
        this.f16606a.mo8865i(i);
    }

    public C8771ao1(Window window, View view) {
        C10641pN0 c10641pN0 = new C10641pN0(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            C8641Zn1 c8641Zn1 = new C8641Zn1(window.getInsetsController(), c10641pN0);
            c8641Zn1.f15132d = window;
            this.f16606a = c8641Zn1;
        } else if (i >= 26) {
            this.f16606a = new C8537Xn1(window, c10641pN0);
        } else {
            this.f16606a = new C8485Wn1(window, c10641pN0);
        }
    }
}
