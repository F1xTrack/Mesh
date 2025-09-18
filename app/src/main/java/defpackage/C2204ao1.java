package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* renamed from: ao1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2204ao1 {
    public final AbstractC4075h12 a;

    public C2204ao1(WindowInsetsController windowInsetsController) {
        this.a = new C2010Zn1(windowInsetsController, new C6446pN0(windowInsetsController));
    }

    public final void a(int i) {
        this.a.c(i);
    }

    public final void b(int i) {
        this.a.i(i);
    }

    public C2204ao1(Window window, View view) {
        C6446pN0 c6446pN0 = new C6446pN0(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            C2010Zn1 c2010Zn1 = new C2010Zn1(window.getInsetsController(), c6446pN0);
            c2010Zn1.d = window;
            this.a = c2010Zn1;
        } else if (i >= 26) {
            this.a = new C1854Xn1(window, c6446pN0);
        } else {
            this.a = new C1776Wn1(window, c6446pN0);
        }
    }
}
