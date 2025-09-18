package defpackage;

import android.view.MotionEvent;
import java.lang.reflect.Method;

/* renamed from: Da0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0255Da0 extends C0177Ca0 {
    public final F71 k;

    public C0255Da0(C6178nz0 c6178nz0) {
        super(c6178nz0);
        this.k = LB.b(TT.t);
    }

    public final void h(MotionEvent motionEvent, InterfaceC7405uP interfaceC7405uP, boolean z) {
        Method method = (Method) this.k.getValue();
        if (method != null) {
            if (method.getParameterTypes().length == 3) {
                method.invoke(this, motionEvent, interfaceC7405uP, Boolean.valueOf(z));
            } else {
                method.invoke(this, motionEvent, interfaceC7405uP);
            }
        }
    }
}
