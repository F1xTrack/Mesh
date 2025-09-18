package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.Field;

/* renamed from: bx0 */
/* loaded from: classes.dex */
public final class BinderC2421bx0 extends NA1 implements InterfaceC3515e50 {
    public final Object a;

    public BinderC2421bx0(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.a = obj;
    }

    public static InterfaceC3515e50 G(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3515e50 ? (InterfaceC3515e50) iInterfaceQueryLocalInterface : new LA1(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
    }

    public static Object H(InterfaceC3515e50 interfaceC3515e50) throws SecurityException {
        if (interfaceC3515e50 instanceof BinderC2421bx0) {
            return ((BinderC2421bx0) interfaceC3515e50).a;
        }
        IBinder iBinderAsBinder = interfaceC3515e50.asBinder();
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
            throw new IllegalArgumentException(AbstractC7209tN0.u(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
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
