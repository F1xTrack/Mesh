package p000;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.Field;

/* renamed from: bx0 */
/* loaded from: classes.dex */
public final class BinderC8916bx0 extends NA1 implements InterfaceC9197e50 {

    /* renamed from: a */
    public final Object f17241a;

    public BinderC8916bx0(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.f17241a = obj;
    }

    /* renamed from: G */
    public static InterfaceC9197e50 m10546G(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof InterfaceC9197e50 ? (InterfaceC9197e50) iInterfaceQueryLocalInterface : new LA1(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
    }

    /* renamed from: H */
    public static Object m10547H(InterfaceC9197e50 interfaceC9197e50) throws SecurityException {
        if (interfaceC9197e50 instanceof BinderC8916bx0) {
            return ((BinderC8916bx0) interfaceC9197e50).f17241a;
        }
        IBinder iBinderAsBinder = interfaceC9197e50.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            throw new IllegalArgumentException(AbstractC11153tN0.m24909u(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
        }
        Preconditions.checkNotNull(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
