package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class ZC0 extends XB {
    public static final Handler e = new Handler(Looper.getMainLooper(), new C0506Gg(1));
    public final JR0 d;

    public ZC0(JR0 jr0, int i, int i2) {
        super(i, i2);
        this.d = jr0;
    }

    @Override // defpackage.A81
    public final void e(Object obj) {
        InterfaceC6839rR0 interfaceC6839rR0 = this.c;
        if (interfaceC6839rR0 == null || !interfaceC6839rR0.k()) {
            return;
        }
        e.obtainMessage(1, this).sendToTarget();
    }

    @Override // defpackage.A81
    public final void i(Drawable drawable) {
    }
}
