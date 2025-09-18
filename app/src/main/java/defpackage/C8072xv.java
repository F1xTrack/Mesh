package defpackage;

import android.window.OnBackInvokedDispatcher;
import androidx.activity.a;

/* renamed from: xv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8072xv implements InterfaceC0669Ii0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C8072xv(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.InterfaceC0669Ii0
    public final void f(InterfaceC0903Li0 interfaceC0903Li0, EnumC0123Bi0 enumC0123Bi0) {
        switch (this.a) {
            case 0:
                a aVar = (a) this.b;
                O90.f(aVar, "$dispatcher");
                AbstractActivityC0629Hv abstractActivityC0629Hv = (AbstractActivityC0629Hv) this.c;
                O90.f(abstractActivityC0629Hv, "this$0");
                if (enumC0123Bi0 == EnumC0123Bi0.ON_CREATE) {
                    OnBackInvokedDispatcher onBackInvokedDispatcherA = C8262yv.a.a(abstractActivityC0629Hv);
                    O90.f(onBackInvokedDispatcherA, "invoker");
                    aVar.e = onBackInvokedDispatcherA;
                    aVar.d(aVar.g);
                    break;
                }
                break;
            default:
                EnumC0123Bi0 enumC0123Bi02 = EnumC0123Bi0.ON_DESTROY;
                C0615Hq0 c0615Hq0 = (C0615Hq0) this.b;
                if (enumC0123Bi0 != enumC0123Bi02) {
                    c0615Hq0.getClass();
                    break;
                } else {
                    c0615Hq0.b((InterfaceC1940Yq0) this.c);
                    break;
                }
        }
    }
}
