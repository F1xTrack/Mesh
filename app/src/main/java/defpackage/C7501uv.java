package defpackage;

import android.view.View;
import android.view.Window;

/* renamed from: uv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7501uv implements InterfaceC0669Ii0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C7501uv(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC0669Ii0
    public final void f(InterfaceC0903Li0 interfaceC0903Li0, EnumC0123Bi0 enumC0123Bi0) {
        Window window;
        View viewPeekDecorView;
        switch (this.a) {
            case 0:
                AbstractActivityC0629Hv abstractActivityC0629Hv = (AbstractActivityC0629Hv) this.b;
                if (enumC0123Bi0 == EnumC0123Bi0.ON_STOP && (window = abstractActivityC0629Hv.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                AbstractActivityC0629Hv.c((AbstractActivityC0629Hv) this.b, interfaceC0903Li0, enumC0123Bi0);
                break;
            default:
                C5706lV0 c5706lV0 = (C5706lV0) this.b;
                O90.f(c5706lV0, "this$0");
                if (enumC0123Bi0 != EnumC0123Bi0.ON_START) {
                    if (enumC0123Bi0 == EnumC0123Bi0.ON_STOP) {
                        c5706lV0.f = false;
                        break;
                    }
                } else {
                    c5706lV0.f = true;
                    break;
                }
                break;
        }
    }
}
