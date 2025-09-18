package p000;

import android.window.OnBackInvokedCallback;
import java.lang.reflect.InvocationTargetException;

/* renamed from: z6 */
/* loaded from: classes.dex */
public final /* synthetic */ class C7243z6 implements OnBackInvokedCallback {

    /* renamed from: a */
    public final /* synthetic */ int f46633a;

    /* renamed from: b */
    public final /* synthetic */ Object f46634b;

    public /* synthetic */ C7243z6(int i, Object obj) {
        this.f46633a = i;
        this.f46634b = obj;
    }

    public final void onBackInvoked() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.f46633a) {
            case 0:
                ((LayoutInflaterFactory2C0448H6) this.f46634b).m3273E();
                break;
            case 1:
                InterfaceC6434mZ interfaceC6434mZ = (InterfaceC6434mZ) this.f46634b;
                O90.m5968f(interfaceC6434mZ, "$onBackInvoked");
                interfaceC6434mZ.invoke();
                break;
            default:
                ((Runnable) this.f46634b).run();
                break;
        }
    }
}
