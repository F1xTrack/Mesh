package p000;

import android.content.Context;
import java.lang.reflect.Method;

/* renamed from: Qk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8167Qk1 extends AbstractC8271Sk1 {

    /* renamed from: i */
    public final double f9759i;

    public C8167Qk1(InterfaceC9871jM0 interfaceC9871jM0, Method method, double d) {
        super(interfaceC9871jM0, NotificationConstants.NUMBER, method);
        this.f9759i = d;
    }

    @Override // p000.AbstractC8271Sk1
    /* renamed from: a */
    public final Object mo5830a(Context context, Object obj) {
        return Double.valueOf(obj == null ? this.f9759i : ((Double) obj).doubleValue());
    }

    public C8167Qk1(InterfaceC9999kM0 interfaceC9999kM0, Method method, int i, double d) {
        super(interfaceC9999kM0, NotificationConstants.NUMBER, method, i);
        this.f9759i = d;
    }
}
