package p000;

import android.content.Context;
import android.os.Build;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: Vq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8438Vq0 extends C7696Hj0 implements InterfaceC7814Jq0 {

    /* renamed from: E */
    public static final Method f12800E;

    /* renamed from: D */
    public QQ0 f12801D;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f12800E = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // p000.InterfaceC7814Jq0
    /* renamed from: B */
    public final void mo4453B(MenuC7450Cq0 menuC7450Cq0, C7866Kq0 c7866Kq0) {
        QQ0 qq0 = this.f12801D;
        if (qq0 != null) {
            qq0.mo4453B(menuC7450Cq0, c7866Kq0);
        }
    }

    @Override // p000.InterfaceC7814Jq0
    /* renamed from: n */
    public final void mo4454n(MenuC7450Cq0 menuC7450Cq0, C7866Kq0 c7866Kq0) {
        QQ0 qq0 = this.f12801D;
        if (qq0 != null) {
            qq0.mo4454n(menuC7450Cq0, c7866Kq0);
        }
    }

    @Override // p000.C7696Hj0
    /* renamed from: p */
    public final C1659aM mo3568p(Context context, boolean z) {
        C8386Uq0 c8386Uq0 = new C8386Uq0(context, z);
        c8386Uq0.setHoverListener(this);
        return c8386Uq0;
    }
}
