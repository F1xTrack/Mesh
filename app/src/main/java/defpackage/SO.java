package defpackage;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.types.Enumerable;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public final class SO extends AbstractC0818Kg {
    public final InterfaceC1667Vd0 c;
    public final Enum[] d;
    public final InterfaceC6878re0 e;

    public SO(InterfaceC1667Vd0 interfaceC1667Vd0, boolean z) {
        super(z, 1);
        this.c = interfaceC1667Vd0;
        Object[] enumConstants = P22.b(interfaceC1667Vd0).getEnumConstants();
        if (enumConstants == null) {
            throw new IllegalArgumentException("Passed type is not an enum type");
        }
        Enum[] enumArr = (Enum[]) enumConstants;
        if (enumArr.length == 0) {
            throw new IllegalArgumentException("Passed enum type is empty");
        }
        this.d = enumArr;
        InterfaceC6878re0 interfaceC6878re0B = U22.b(interfaceC1667Vd0);
        if (interfaceC6878re0B == null) {
            throw new IllegalArgumentException("Cannot convert js value to enum without the primary constructor");
        }
        this.e = interfaceC6878re0B;
        if (Enumerable.class.isAssignableFrom(P22.b(interfaceC1667Vd0))) {
            return;
        }
        AbstractC7131sz.a.a("Enum '" + interfaceC1667Vd0 + "' should inherit from " + BP0.a.b(Enumerable.class) + ".", null);
    }

    @Override // defpackage.AbstractC0818Kg, defpackage.AbstractC1512Td1
    public final ExpectedType b() {
        return new ExpectedType(EnumC2044Zz.h, EnumC2044Zz.d);
    }

    @Override // defpackage.AbstractC0818Kg, defpackage.AbstractC1512Td1
    public final boolean c() {
        return false;
    }

    @Override // defpackage.AbstractC0818Kg
    public final Object e(Object obj) throws C7143t2 {
        O90.f(obj, "value");
        InterfaceC6878re0 interfaceC6878re0 = this.e;
        boolean zIsEmpty = interfaceC6878re0.getParameters().isEmpty();
        Enum[] enumArr = this.d;
        if (zIsEmpty) {
            return i((String) obj, enumArr);
        }
        if (interfaceC6878re0.getParameters().size() != 1) {
            throw new C7143t2(V22.b(BP0.a.b(obj.getClass()), false, 7), V22.b(this.c, false, 7));
        }
        String name = ((C1514Te0) ((InterfaceC1280Qe0) AbstractC8069xu.A(interfaceC6878re0.getParameters()))).getName();
        O90.c(name);
        return h(obj, enumArr, name);
    }

    @Override // defpackage.AbstractC0818Kg
    public final Object f(Dynamic dynamic) throws C7143t2 {
        C7835wf0 c7835wf0B;
        O90.f(dynamic, "value");
        InterfaceC6878re0 interfaceC6878re0 = this.e;
        boolean zIsEmpty = interfaceC6878re0.getParameters().isEmpty();
        Enum[] enumArr = this.d;
        if (zIsEmpty) {
            return i(dynamic.asString(), enumArr);
        }
        if (interfaceC6878re0.getParameters().size() == 1) {
            String name = ((C1514Te0) ((InterfaceC1280Qe0) AbstractC8069xu.A(interfaceC6878re0.getParameters()))).getName();
            O90.c(name);
            return h(dynamic, enumArr, name);
        }
        ReadableType type = dynamic.getType();
        O90.f(type, "<this>");
        switch (AbstractC7971xN0.a[type.ordinal()]) {
            case 1:
                c7835wf0B = V22.b(BP0.a.b(Object.class), true, 5);
                break;
            case 2:
                c7835wf0B = V22.b(BP0.a.b(Boolean.TYPE), false, 7);
                break;
            case 3:
                c7835wf0B = V22.b(BP0.a.b(Number.class), false, 7);
                break;
            case 4:
                c7835wf0B = V22.b(BP0.a.b(String.class), false, 7);
                break;
            case 5:
                c7835wf0B = V22.b(BP0.a.b(ReadableMap.class), false, 7);
                break;
            case 6:
                c7835wf0B = V22.b(BP0.a.b(ReadableArray.class), false, 7);
                break;
            default:
                throw new C7074sg();
        }
        throw new C7143t2(c7835wf0B, V22.b(this.c, false, 7));
    }

    public final Enum h(Object obj, Enum[] enumArr, String str) throws NoSuchFieldException, SecurityException {
        int iIntValue;
        Object objValueOf;
        Enum r5;
        InterfaceC1667Vd0 interfaceC1667Vd0 = this.c;
        Field declaredField = P22.b(interfaceC1667Vd0).getDeclaredField(str);
        if (declaredField == null) {
            throw new IllegalArgumentException(AbstractC8235ym.k("Cannot find a property for ", str, " parameter").toString());
        }
        declaredField.setAccessible(true);
        Class<?> type = declaredField.getType();
        if (obj instanceof Dynamic) {
            objValueOf = O90.a(type, String.class) ? ((Dynamic) obj).asString() : Integer.valueOf(((Dynamic) obj).asInt());
        } else if (O90.a(type, String.class)) {
            O90.d(obj, "null cannot be cast to non-null type kotlin.String");
            objValueOf = (String) obj;
        } else {
            if (obj instanceof Double) {
                iIntValue = (int) ((Number) obj).doubleValue();
            } else {
                O90.d(obj, "null cannot be cast to non-null type kotlin.Int");
                iIntValue = ((Integer) obj).intValue();
            }
            objValueOf = Integer.valueOf(iIntValue);
        }
        int length = enumArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                r5 = null;
                break;
            }
            r5 = enumArr[i];
            if (O90.a(declaredField.get(r5), objValueOf)) {
                break;
            }
            i++;
        }
        if (r5 != null) {
            return r5;
        }
        String strF = interfaceC1667Vd0.f();
        StringBuilder sb = new StringBuilder("Couldn't convert '");
        sb.append(obj);
        sb.append("' to ");
        sb.append(strF);
        sb.append(" where ");
        throw new IllegalArgumentException(AbstractC1705Vq.l(sb, str, " is the enum parameter").toString());
    }

    public final Enum i(String str, Enum[] enumArr) throws C7143t2 {
        Enum r3;
        int length = enumArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                r3 = null;
                break;
            }
            r3 = enumArr[i];
            if (O90.a(r3.name(), str)) {
                break;
            }
            i++;
        }
        if (r3 != null) {
            return r3;
        }
        throw new C7143t2("'" + ((Object) str) + "' is not present in " + this.c.f() + " enum, it must be one of: " + J8.w(enumArr, ", ", null, null, C5284jI.u, 30), (Throwable) null);
    }
}
