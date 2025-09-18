package defpackage;

import android.content.Context;
import com.facebook.react.bridge.ReactContext;

/* loaded from: classes2.dex */
public final /* synthetic */ class DU0 extends FZ implements InterfaceC6481pZ {
    public static final DU0 a = new DU0(3, EU0.class, "handleOnInsetsChange", "handleOnInsetsChange(Lcom/th3rdwave/safeareacontext/SafeAreaProvider;Lcom/th3rdwave/safeareacontext/EdgeInsets;Lcom/th3rdwave/safeareacontext/Rect;)V", 1);

    @Override // defpackage.InterfaceC6481pZ
    public final Object b(Object obj, Object obj2, Object obj3) {
        BU0 bu0 = (BU0) obj;
        WM wm = (WM) obj2;
        C5494kO0 c5494kO0 = (C5494kO0) obj3;
        O90.f(bu0, "p0");
        O90.f(wm, "p1");
        O90.f(c5494kO0, "p2");
        Context context = bu0.getContext();
        O90.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        int id = bu0.getId();
        InterfaceC7405uP interfaceC7405uPB = OZ1.b((ReactContext) context, id);
        if (interfaceC7405uPB != null) {
            interfaceC7405uPB.g(new L80(id, wm, c5494kO0));
        }
        return C1518Tf1.a;
    }
}
