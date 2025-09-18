package p000;

import android.content.Context;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import java.lang.reflect.Method;

/* renamed from: Rk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8219Rk1 extends AbstractC8271Sk1 {

    /* renamed from: i */
    public final float f10410i;

    public C8219Rk1(InterfaceC9871jM0 interfaceC9871jM0, Method method, float f) {
        super(interfaceC9871jM0, NotificationConstants.NUMBER, method);
        this.f10410i = f;
    }

    @Override // p000.AbstractC8271Sk1
    /* renamed from: a */
    public final Object mo5830a(Context context, Object obj) {
        return Float.valueOf(obj == null ? this.f10410i : ((Double) obj).floatValue());
    }

    public C8219Rk1(InterfaceC9999kM0 interfaceC9999kM0, Method method, int i, float f) {
        super(interfaceC9999kM0, NotificationConstants.NUMBER, method, i);
        this.f10410i = f;
    }
}
