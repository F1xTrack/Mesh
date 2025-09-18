package defpackage;

import android.content.Context;
import java.lang.reflect.Method;

/* renamed from: Rk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1377Rk1 extends AbstractC1455Sk1 {
    public final float i;

    public C1377Rk1(InterfaceC5297jM0 interfaceC5297jM0, Method method, float f) {
        super(interfaceC5297jM0, NotificationConstants.NUMBER, method);
        this.i = f;
    }

    @Override // defpackage.AbstractC1455Sk1
    public final Object a(Context context, Object obj) {
        return Float.valueOf(obj == null ? this.i : ((Double) obj).floatValue());
    }

    public C1377Rk1(InterfaceC5488kM0 interfaceC5488kM0, Method method, int i, float f) {
        super(interfaceC5488kM0, NotificationConstants.NUMBER, method, i);
        this.i = f;
    }
}
