package p000;

import android.content.Context;
import com.facebook.react.bridge.ColorPropConverter;
import java.lang.reflect.Method;

/* renamed from: Pk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8115Pk1 extends AbstractC8271Sk1 {

    /* renamed from: i */
    public final /* synthetic */ int f9271i;

    /* renamed from: j */
    public final int f9272j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8115Pk1(InterfaceC9871jM0 interfaceC9871jM0, Method method, int i, int i2) {
        super(interfaceC9871jM0, "mixed", method);
        this.f9271i = i2;
        switch (i2) {
            case 1:
                super(interfaceC9871jM0, NotificationConstants.NUMBER, method);
                this.f9272j = i;
                break;
            default:
                this.f9272j = i;
                break;
        }
    }

    @Override // p000.AbstractC8271Sk1
    /* renamed from: a */
    public final Object mo5830a(Context context, Object obj) {
        switch (this.f9271i) {
            case 0:
                return obj == null ? Integer.valueOf(this.f9272j) : ColorPropConverter.getColor(obj, context);
            default:
                return Integer.valueOf(obj == null ? this.f9272j : ((Double) obj).intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8115Pk1(InterfaceC9999kM0 interfaceC9999kM0, Method method, int i, int i2, int i3) {
        super(interfaceC9999kM0, "mixed", method, i);
        this.f9271i = i3;
        switch (i3) {
            case 1:
                super(interfaceC9999kM0, NotificationConstants.NUMBER, method, i);
                this.f9272j = i2;
                break;
            default:
                this.f9272j = i2;
                break;
        }
    }
}
