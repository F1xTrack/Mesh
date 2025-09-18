package defpackage;

import android.content.Context;
import com.facebook.react.bridge.ColorPropConverter;
import com.huawei.hms.rn.push.constants.NotificationConstants;
import java.lang.reflect.Method;

/* renamed from: Pk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1221Pk1 extends AbstractC1455Sk1 {
    public final /* synthetic */ int i;
    public final int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1221Pk1(InterfaceC5297jM0 interfaceC5297jM0, Method method, int i, int i2) {
        super(interfaceC5297jM0, "mixed", method);
        this.i = i2;
        switch (i2) {
            case 1:
                super(interfaceC5297jM0, NotificationConstants.NUMBER, method);
                this.j = i;
                break;
            default:
                this.j = i;
                break;
        }
    }

    @Override // defpackage.AbstractC1455Sk1
    public final Object a(Context context, Object obj) {
        switch (this.i) {
            case 0:
                return obj == null ? Integer.valueOf(this.j) : ColorPropConverter.getColor(obj, context);
            default:
                return Integer.valueOf(obj == null ? this.j : ((Double) obj).intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1221Pk1(InterfaceC5488kM0 interfaceC5488kM0, Method method, int i, int i2, int i3) {
        super(interfaceC5488kM0, "mixed", method, i);
        this.i = i3;
        switch (i3) {
            case 1:
                super(interfaceC5488kM0, NotificationConstants.NUMBER, method, i);
                this.j = i2;
                break;
            default:
                this.j = i2;
                break;
        }
    }
}
