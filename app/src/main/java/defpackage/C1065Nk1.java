package defpackage;

import android.content.Context;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.lang.reflect.Method;

/* renamed from: Nk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1065Nk1 extends AbstractC1455Sk1 {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1065Nk1(InterfaceC5297jM0 interfaceC5297jM0, String str, Method method, int i) {
        super(interfaceC5297jM0, str, method);
        this.i = i;
    }

    @Override // defpackage.AbstractC1455Sk1
    public final Object a(Context context, Object obj) {
        switch (this.i) {
            case 0:
                return (ReadableArray) obj;
            case 1:
                if (obj != null) {
                    return ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
                }
                return null;
            case 2:
                if (obj != null) {
                    return ColorPropConverter.getColor(obj, context);
                }
                return null;
            case 3:
                if (obj != null) {
                    return obj instanceof Double ? Integer.valueOf(((Double) obj).intValue()) : (Integer) obj;
                }
                return null;
            case 4:
                return obj instanceof Dynamic ? obj : new DynamicFromObject(obj);
            case 5:
                return (ReadableMap) obj;
            default:
                return (String) obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1065Nk1(InterfaceC5488kM0 interfaceC5488kM0, String str, Method method, int i, int i2) {
        super(interfaceC5488kM0, str, method, i);
        this.i = i2;
    }
}
