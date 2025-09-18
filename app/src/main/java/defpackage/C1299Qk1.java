package defpackage;

import android.content.Context;
import com.huawei.hms.rn.push.constants.NotificationConstants;
import java.lang.reflect.Method;

/* renamed from: Qk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1299Qk1 extends AbstractC1455Sk1 {
    public final double i;

    public C1299Qk1(InterfaceC5297jM0 interfaceC5297jM0, Method method, double d) {
        super(interfaceC5297jM0, NotificationConstants.NUMBER, method);
        this.i = d;
    }

    @Override // defpackage.AbstractC1455Sk1
    public final Object a(Context context, Object obj) {
        return Double.valueOf(obj == null ? this.i : ((Double) obj).doubleValue());
    }

    public C1299Qk1(InterfaceC5488kM0 interfaceC5488kM0, Method method, int i, double d) {
        super(interfaceC5488kM0, NotificationConstants.NUMBER, method, i);
        this.i = d;
    }
}
