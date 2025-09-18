package p000;

import android.view.MotionEvent;
import java.lang.reflect.Method;

/* renamed from: Da0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7470Da0 extends C7418Ca0 {

    /* renamed from: k */
    public final F71 f2048k;

    public C7470Da0(C10461nz0 c10461nz0) {
        super(c10461nz0);
        this.f2048k = AbstractC0705LB.m4915b(C1225TT.f11384t);
    }

    /* renamed from: h */
    public final void m1727h(MotionEvent motionEvent, InterfaceC6947uP interfaceC6947uP, boolean z) {
        Method method = (Method) this.f2048k.getValue();
        if (method != null) {
            if (method.getParameterTypes().length == 3) {
                method.invoke(this, motionEvent, interfaceC6947uP, Boolean.valueOf(z));
            } else {
                method.invoke(this, motionEvent, interfaceC6947uP);
            }
        }
    }
}
