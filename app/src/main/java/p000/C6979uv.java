package p000;

import android.view.View;
import android.view.Window;

/* renamed from: uv */
/* loaded from: classes.dex */
public final /* synthetic */ class C6979uv implements InterfaceC7746Ii0 {

    /* renamed from: a */
    public final /* synthetic */ int f44018a;

    /* renamed from: b */
    public final /* synthetic */ Object f44019b;

    public /* synthetic */ C6979uv(int i, Object obj) {
        this.f44018a = i;
        this.f44019b = obj;
    }

    @Override // p000.InterfaceC7746Ii0
    /* renamed from: f */
    public final void mo2792f(InterfaceC7902Li0 interfaceC7902Li0, EnumC7382Bi0 enumC7382Bi0) {
        Window window;
        View viewPeekDecorView;
        switch (this.f44018a) {
            case 0:
                AbstractActivityC0499Hv abstractActivityC0499Hv = (AbstractActivityC0499Hv) this.f44019b;
                if (enumC7382Bi0 == EnumC7382Bi0.ON_STOP && (window = abstractActivityC0499Hv.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                AbstractActivityC0499Hv.m3647c((AbstractActivityC0499Hv) this.f44019b, interfaceC7902Li0, enumC7382Bi0);
                break;
            default:
                C10145lV0 c10145lV0 = (C10145lV0) this.f44019b;
                O90.m5968f(c10145lV0, "this$0");
                if (enumC7382Bi0 != EnumC7382Bi0.ON_START) {
                    if (enumC7382Bi0 == EnumC7382Bi0.ON_STOP) {
                        c10145lV0.f37089f = false;
                        break;
                    }
                } else {
                    c10145lV0.f37089f = true;
                    break;
                }
                break;
        }
    }
}
