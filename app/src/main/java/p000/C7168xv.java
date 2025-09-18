package p000;

import android.window.OnBackInvokedDispatcher;
import androidx.activity.C1690a;

/* renamed from: xv */
/* loaded from: classes.dex */
public final /* synthetic */ class C7168xv implements InterfaceC7746Ii0 {

    /* renamed from: a */
    public final /* synthetic */ int f45894a;

    /* renamed from: b */
    public final /* synthetic */ Object f45895b;

    /* renamed from: c */
    public final /* synthetic */ Object f45896c;

    public /* synthetic */ C7168xv(Object obj, int i, Object obj2) {
        this.f45894a = i;
        this.f45895b = obj;
        this.f45896c = obj2;
    }

    @Override // p000.InterfaceC7746Ii0
    /* renamed from: f */
    public final void mo2792f(InterfaceC7902Li0 interfaceC7902Li0, EnumC7382Bi0 enumC7382Bi0) {
        switch (this.f45894a) {
            case 0:
                C1690a c1690a = (C1690a) this.f45895b;
                O90.m5968f(c1690a, "$dispatcher");
                AbstractActivityC0499Hv abstractActivityC0499Hv = (AbstractActivityC0499Hv) this.f45896c;
                O90.m5968f(abstractActivityC0499Hv, "this$0");
                if (enumC7382Bi0 == EnumC7382Bi0.ON_CREATE) {
                    OnBackInvokedDispatcher onBackInvokedDispatcherM26284a = C7231yv.f46536a.m26284a(abstractActivityC0499Hv);
                    O90.m5968f(onBackInvokedDispatcherM26284a, "invoker");
                    c1690a.f15746e = onBackInvokedDispatcherM26284a;
                    c1690a.m9822d(c1690a.f15748g);
                    break;
                }
                break;
            default:
                EnumC7382Bi0 enumC7382Bi02 = EnumC7382Bi0.ON_DESTROY;
                C7710Hq0 c7710Hq0 = (C7710Hq0) this.f45895b;
                if (enumC7382Bi0 != enumC7382Bi02) {
                    c7710Hq0.getClass();
                    break;
                } else {
                    c7710Hq0.m3608b((InterfaceC8594Yq0) this.f45896c);
                    break;
                }
        }
    }
}
