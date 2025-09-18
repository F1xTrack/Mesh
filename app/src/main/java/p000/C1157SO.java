package p000;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.types.Enumerable;
import java.lang.reflect.Field;

/* renamed from: SO */
/* loaded from: classes2.dex */
public final class C1157SO extends AbstractC0673Kg {

    /* renamed from: c */
    public final InterfaceC8412Vd0 f10710c;

    /* renamed from: d */
    public final Enum[] f10711d;

    /* renamed from: e */
    public final InterfaceC10931re0 f10712e;

    public C1157SO(InterfaceC8412Vd0 interfaceC8412Vd0, boolean z) {
        super(z, 1);
        this.f10710c = interfaceC8412Vd0;
        Object[] enumConstants = P22.m6213b(interfaceC8412Vd0).getEnumConstants();
        if (enumConstants == null) {
            throw new IllegalArgumentException("Passed type is not an enum type");
        }
        Enum[] enumArr = (Enum[]) enumConstants;
        if (enumArr.length == 0) {
            throw new IllegalArgumentException("Passed enum type is empty");
        }
        this.f10711d = enumArr;
        InterfaceC10931re0 interfaceC10931re0M7867b = U22.m7867b(interfaceC8412Vd0);
        if (interfaceC10931re0M7867b == null) {
            throw new IllegalArgumentException("Cannot convert js value to enum without the primary constructor");
        }
        this.f10712e = interfaceC10931re0M7867b;
        if (Enumerable.class.isAssignableFrom(P22.m6213b(interfaceC8412Vd0))) {
            return;
        }
        AbstractC6857sz.f42743a.m5471a("Enum '" + interfaceC8412Vd0 + "' should inherit from " + BP0.f799a.mo3846b(Enumerable.class) + ".", null);
    }

    @Override // p000.AbstractC0673Kg, p000.AbstractC8309Td1
    /* renamed from: b */
    public final ExpectedType mo3313b() {
        return new ExpectedType(EnumC1635Zz.f15250h, EnumC1635Zz.f15246d);
    }

    @Override // p000.AbstractC0673Kg, p000.AbstractC8309Td1
    /* renamed from: c */
    public final boolean mo3314c() {
        return false;
    }

    @Override // p000.AbstractC0673Kg
    /* renamed from: e */
    public final Object mo3315e(Object obj) throws C6861t2 {
        O90.m5968f(obj, "value");
        InterfaceC10931re0 interfaceC10931re0 = this.f10712e;
        boolean zIsEmpty = interfaceC10931re0.getParameters().isEmpty();
        Enum[] enumArr = this.f10711d;
        if (zIsEmpty) {
            return m7365i((String) obj, enumArr);
        }
        if (interfaceC10931re0.getParameters().size() != 1) {
            throw new C6861t2(V22.m8287b(BP0.f799a.mo3846b(obj.getClass()), false, 7), V22.m8287b(this.f10710c, false, 7));
        }
        String name = ((C8310Te0) ((InterfaceC8154Qe0) AbstractC7167xu.m25955A(interfaceC10931re0.getParameters()))).getName();
        O90.m5965c(name);
        return m7364h(obj, enumArr, name);
    }

    @Override // p000.AbstractC0673Kg
    /* renamed from: f */
    public final Object mo3316f(Dynamic dynamic) throws C6861t2 {
        C11572wf0 c11572wf0M8287b;
        O90.m5968f(dynamic, "value");
        InterfaceC10931re0 interfaceC10931re0 = this.f10712e;
        boolean zIsEmpty = interfaceC10931re0.getParameters().isEmpty();
        Enum[] enumArr = this.f10711d;
        if (zIsEmpty) {
            return m7365i(dynamic.asString(), enumArr);
        }
        if (interfaceC10931re0.getParameters().size() == 1) {
            String name = ((C8310Te0) ((InterfaceC8154Qe0) AbstractC7167xu.m25955A(interfaceC10931re0.getParameters()))).getName();
            O90.m5965c(name);
            return m7364h(dynamic, enumArr, name);
        }
        ReadableType type = dynamic.getType();
        O90.m5968f(type, "<this>");
        switch (AbstractC11663xN0.f45567a[type.ordinal()]) {
            case 1:
                c11572wf0M8287b = V22.m8287b(BP0.f799a.mo3846b(Object.class), true, 5);
                break;
            case 2:
                c11572wf0M8287b = V22.m8287b(BP0.f799a.mo3846b(Boolean.TYPE), false, 7);
                break;
            case 3:
                c11572wf0M8287b = V22.m8287b(BP0.f799a.mo3846b(Number.class), false, 7);
                break;
            case 4:
                c11572wf0M8287b = V22.m8287b(BP0.f799a.mo3846b(String.class), false, 7);
                break;
            case 5:
                c11572wf0M8287b = V22.m8287b(BP0.f799a.mo3846b(ReadableMap.class), false, 7);
                break;
            case 6:
                c11572wf0M8287b = V22.m8287b(BP0.f799a.mo3846b(ReadableArray.class), false, 7);
                break;
            default:
                throw new C6838sg();
        }
        throw new C6861t2(c11572wf0M8287b, V22.m8287b(this.f10710c, false, 7));
    }

    /* renamed from: h */
    public final Enum m7364h(Object obj, Enum[] enumArr, String str) throws NoSuchFieldException, SecurityException {
        int iIntValue;
        Object objValueOf;
        Enum r5;
        InterfaceC8412Vd0 interfaceC8412Vd0 = this.f10710c;
        Field declaredField = P22.m6213b(interfaceC8412Vd0).getDeclaredField(str);
        if (declaredField == null) {
            throw new IllegalArgumentException(AbstractC7222ym.m26234k("Cannot find a property for ", str, " parameter").toString());
        }
        declaredField.setAccessible(true);
        Class<?> type = declaredField.getType();
        if (obj instanceof Dynamic) {
            objValueOf = O90.m5963a(type, String.class) ? ((Dynamic) obj).asString() : Integer.valueOf(((Dynamic) obj).asInt());
        } else if (O90.m5963a(type, String.class)) {
            O90.m5966d(obj, "null cannot be cast to non-null type kotlin.String");
            objValueOf = (String) obj;
        } else {
            if (obj instanceof Double) {
                iIntValue = (int) ((Number) obj).doubleValue();
            } else {
                O90.m5966d(obj, "null cannot be cast to non-null type kotlin.Int");
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
            if (O90.m5963a(declaredField.get(r5), objValueOf)) {
                break;
            }
            i++;
        }
        if (r5 != null) {
            return r5;
        }
        String strMo2808f = interfaceC8412Vd0.mo2808f();
        StringBuilder sb = new StringBuilder("Couldn't convert '");
        sb.append(obj);
        sb.append("' to ");
        sb.append(strMo2808f);
        sb.append(" where ");
        throw new IllegalArgumentException(AbstractC1374Vq.m8593l(sb, str, " is the enum parameter").toString());
    }

    /* renamed from: i */
    public final Enum m7365i(String str, Enum[] enumArr) throws C6861t2 {
        Enum r3;
        int length = enumArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                r3 = null;
                break;
            }
            r3 = enumArr[i];
            if (O90.m5963a(r3.name(), str)) {
                break;
            }
            i++;
        }
        if (r3 != null) {
            return r3;
        }
        throw new C6861t2("'" + ((Object) str) + "' is not present in " + this.f10710c.mo2808f() + " enum, it must be one of: " + AbstractC0576J8.m4196w(enumArr, ", ", null, null, C6228jI.f35043u, 30), (Throwable) null);
    }
}
