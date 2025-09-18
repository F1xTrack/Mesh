package p000;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class ZC0 extends AbstractC1459XB {

    /* renamed from: e */
    public static final Handler f14790e = new Handler(Looper.getMainLooper(), new C0421Gg(1));

    /* renamed from: d */
    public final JR0 f14791d;

    public ZC0(JR0 jr0, int i, int i2) {
        super(i, i2);
        this.f14791d = jr0;
    }

    @Override // p000.A81
    /* renamed from: e */
    public final void mo80e(Object obj) {
        InterfaceC10905rR0 interfaceC10905rR0 = this.f13605c;
        if (interfaceC10905rR0 == null || !interfaceC10905rR0.mo4126k()) {
            return;
        }
        f14790e.obtainMessage(1, this).sendToTarget();
    }

    @Override // p000.A81
    /* renamed from: i */
    public final void mo84i(Drawable drawable) {
    }
}
