package p000;

import android.content.Context;
import com.facebook.react.bridge.ReactContext;

/* loaded from: classes2.dex */
public final /* synthetic */ class DU0 extends AbstractC0351FZ implements InterfaceC6625pZ {

    /* renamed from: a */
    public static final DU0 f2020a = new DU0(3, EU0.class, "handleOnInsetsChange", "handleOnInsetsChange(Lcom/th3rdwave/safeareacontext/SafeAreaProvider;Lcom/th3rdwave/safeareacontext/EdgeInsets;Lcom/th3rdwave/safeareacontext/Rect;)V", 1);

    @Override // p000.InterfaceC6625pZ
    /* renamed from: b */
    public final Object mo300b(Object obj, Object obj2, Object obj3) {
        BU0 bu0 = (BU0) obj;
        C1407WM c1407wm = (C1407WM) obj2;
        C10003kO0 c10003kO0 = (C10003kO0) obj3;
        O90.m5968f(bu0, "p0");
        O90.m5968f(c1407wm, "p1");
        O90.m5968f(c10003kO0, "p2");
        Context context = bu0.getContext();
        O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        int id = bu0.getId();
        InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b((ReactContext) context, id);
        if (interfaceC6947uPM6091b != null) {
            interfaceC6947uPM6091b.mo11046g(new L80(id, c1407wm, c10003kO0));
        }
        return C8313Tf1.f11463a;
    }
}
