package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import expo.modules.kotlin.exception.CodedException;

/* loaded from: classes.dex */
public abstract class FM1 {
    public static void l(InterfaceC7754wE0 interfaceC7754wE0, CodedException codedException) {
        interfaceC7754wE0.reject(codedException.a(), codedException.getLocalizedMessage(), codedException.getCause());
    }

    public boolean a() {
        return false;
    }

    public abstract boolean b();

    public abstract void c(boolean z);

    public abstract int d();

    public abstract Context e();

    public boolean f() {
        return false;
    }

    public abstract void g();

    public abstract boolean i(int i, KeyEvent keyEvent);

    public boolean j(KeyEvent keyEvent) {
        return false;
    }

    public boolean k() {
        return false;
    }

    public abstract void m(boolean z);

    public abstract void n(boolean z);

    public abstract void o();

    public abstract void p(Drawable drawable);

    public abstract void q(boolean z);

    public abstract void r(CharSequence charSequence);

    public abstract void s(CharSequence charSequence);

    public AbstractC6952s2 t(VH vh) {
        return null;
    }

    public void h() {
    }
}
