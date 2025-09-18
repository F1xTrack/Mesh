package defpackage;

import android.window.OnBackInvokedCallback;
import java.lang.reflect.InvocationTargetException;

/* renamed from: z6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8299z6 implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C8299z6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.a) {
            case 0:
                ((H6) this.b).E();
                break;
            case 1:
                InterfaceC5908mZ interfaceC5908mZ = (InterfaceC5908mZ) this.b;
                O90.f(interfaceC5908mZ, "$onBackInvoked");
                interfaceC5908mZ.invoke();
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
