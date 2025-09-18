package defpackage;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class TN0 extends AbstractC0818Kg {
    public final C1668Vd1 c;
    public final InterfaceC7454uf0 d;
    public final TE e;
    public final F71 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TN0(C1668Vd1 c1668Vd1, InterfaceC7454uf0 interfaceC7454uf0) {
        super(interfaceC7454uf0.e(), 1);
        O90.f(interfaceC7454uf0, "type");
        this.c = c1668Vd1;
        this.d = interfaceC7454uf0;
        this.e = new TE(18);
        this.f = LB.b(new C6685qd0(19, this));
    }

    @Override // defpackage.AbstractC0818Kg, defpackage.AbstractC1512Td1
    public final ExpectedType b() {
        return new ExpectedType(EnumC2044Zz.l);
    }

    @Override // defpackage.AbstractC0818Kg
    public final Object e(Object obj) {
        O90.f(obj, "value");
        return obj instanceof ReadableMap ? h((ReadableMap) obj) : (RN0) obj;
    }

    @Override // defpackage.AbstractC0818Kg
    public final Object f(Dynamic dynamic) throws C5445k8 {
        O90.f(dynamic, "value");
        try {
            return h(dynamic.asMap());
        } catch (Throwable th) {
            CodedException codedException = !(th instanceof CodedException) ? th instanceof AbstractC5398ju ? new CodedException(((AbstractC5398ju) th).a(), th.getMessage(), th.getCause()) : new UnexpectedException(th.toString(), th) : (CodedException) th;
            InterfaceC7454uf0 interfaceC7454uf0 = this.d;
            O90.f(interfaceC7454uf0, "recordType");
            throw new C5445k8("Cannot create a record of the type: '" + interfaceC7454uf0 + "'.", codedException);
        }
    }

    public final RN0 h(ReadableMap readableMap) throws NoSuchMethodException, SecurityException {
        InterfaceC1568Tw0 ee;
        Object c1724Vw0;
        InterfaceC4384ie0 interfaceC4384ie0I = this.d.i();
        O90.d(interfaceC4384ie0I, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        Class clsB = P22.b((InterfaceC1667Vd0) interfaceC4384ie0I);
        this.e.getClass();
        try {
            Constructor declaredConstructor = clsB.getDeclaredConstructor(null);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            ee = new C1724Vw0(0, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            ee = null;
        }
        if (ee == null) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    Object objInvoke = declaredMethod.invoke(null, Object.class);
                    O90.d(objInvoke, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue = ((Integer) objInvoke).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    c1724Vw0 = new C1069Nm(declaredMethod2, iIntValue, clsB);
                } catch (Throwable unused2) {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    c1724Vw0 = new C4290i9(cls.getMethod("allocateInstance", Class.class), declaredField.get(null), clsB, 22);
                }
            } catch (Throwable unused3) {
                c1724Vw0 = new C1724Vw0(23, clsB);
            }
            ee = new EE(29, c1724Vw0);
        }
        Object objC = ee.c();
        Iterator it = ((Map) this.f.getValue()).entrySet().iterator();
        if (!it.hasNext()) {
            O90.d(objC, "null cannot be cast to non-null type T of expo.modules.kotlin.records.RecordTypeConverter");
            return (RN0) objC;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ((SN0) entry.getValue()).getClass();
        throw null;
    }
}
