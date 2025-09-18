package p000;

import android.content.Context;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.lang.reflect.Method;

/* renamed from: Nk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8011Nk1 extends AbstractC8271Sk1 {

    /* renamed from: i */
    public final /* synthetic */ int f7985i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8011Nk1(InterfaceC9871jM0 interfaceC9871jM0, String str, Method method, int i) {
        super(interfaceC9871jM0, str, method);
        this.f7985i = i;
    }

    @Override // p000.AbstractC8271Sk1
    /* renamed from: a */
    public final Object mo5830a(Context context, Object obj) {
        switch (this.f7985i) {
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
    public /* synthetic */ C8011Nk1(InterfaceC9999kM0 interfaceC9999kM0, String str, Method method, int i, int i2) {
        super(interfaceC9999kM0, str, method, i);
        this.f7985i = i2;
    }
}
