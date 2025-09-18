package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: Vq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1706Vq0 extends C0594Hj0 implements InterfaceC0771Jq0 {
    public static final Method E;
    public QQ0 D;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                E = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // defpackage.InterfaceC0771Jq0
    public final void B(MenuC0225Cq0 menuC0225Cq0, C0849Kq0 c0849Kq0) {
        QQ0 qq0 = this.D;
        if (qq0 != null) {
            qq0.B(menuC0225Cq0, c0849Kq0);
        }
    }

    @Override // defpackage.InterfaceC0771Jq0
    public final void n(MenuC0225Cq0 menuC0225Cq0, C0849Kq0 c0849Kq0) {
        QQ0 qq0 = this.D;
        if (qq0 != null) {
            qq0.n(menuC0225Cq0, c0849Kq0);
        }
    }

    @Override // defpackage.C0594Hj0
    public final C2118aM p(Context context, boolean z) {
        C1628Uq0 c1628Uq0 = new C1628Uq0(context, z);
        c1628Uq0.setHoverListener(this);
        return c1628Uq0;
    }
}
