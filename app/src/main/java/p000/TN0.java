package p000;

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
public final class TN0 extends AbstractC0673Kg {

    /* renamed from: c */
    public final C8413Vd1 f11331c;

    /* renamed from: d */
    public final InterfaceC11317uf0 f11332d;

    /* renamed from: e */
    public final C1210TE f11333e;

    /* renamed from: f */
    public final F71 f11334f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TN0(C8413Vd1 c8413Vd1, InterfaceC11317uf0 interfaceC11317uf0) {
        super(interfaceC11317uf0.mo8537e(), 1);
        O90.m5968f(interfaceC11317uf0, "type");
        this.f11331c = c8413Vd1;
        this.f11332d = interfaceC11317uf0;
        this.f11333e = new C1210TE(18);
        this.f11334f = AbstractC0705LB.m4915b(new C10801qd0(19, this));
    }

    @Override // p000.AbstractC0673Kg, p000.AbstractC8309Td1
    /* renamed from: b */
    public final ExpectedType mo3313b() {
        return new ExpectedType(EnumC1635Zz.f15254l);
    }

    @Override // p000.AbstractC0673Kg
    /* renamed from: e */
    public final Object mo3315e(Object obj) {
        O90.m5968f(obj, "value");
        return obj instanceof ReadableMap ? m7687h((ReadableMap) obj) : (RN0) obj;
    }

    @Override // p000.AbstractC0673Kg
    /* renamed from: f */
    public final Object mo3316f(Dynamic dynamic) throws C6281k8 {
        O90.m5968f(dynamic, "value");
        try {
            return m7687h(dynamic.asMap());
        } catch (Throwable th) {
            CodedException codedException = !(th instanceof CodedException) ? th instanceof AbstractC6266ju ? new CodedException(((AbstractC6266ju) th).mo2811a(), th.getMessage(), th.getCause()) : new UnexpectedException(th.toString(), th) : (CodedException) th;
            InterfaceC11317uf0 interfaceC11317uf0 = this.f11332d;
            O90.m5968f(interfaceC11317uf0, "recordType");
            throw new C6281k8("Cannot create a record of the type: '" + interfaceC11317uf0 + "'.", codedException);
        }
    }

    /* renamed from: h */
    public final RN0 m7687h(ReadableMap readableMap) throws NoSuchMethodException, SecurityException {
        InterfaceC8346Tw0 c0267ee;
        Object c8450Vw0;
        InterfaceC9779ie0 interfaceC9779ie0Mo8539i = this.f11332d.mo8539i();
        O90.m5966d(interfaceC9779ie0Mo8539i, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        Class clsM6213b = P22.m6213b((InterfaceC8412Vd0) interfaceC9779ie0Mo8539i);
        this.f11333e.getClass();
        try {
            Constructor declaredConstructor = clsM6213b.getDeclaredConstructor(null);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            c0267ee = new C8450Vw0(0, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            c0267ee = null;
        }
        if (c0267ee == null) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    Object objInvoke = declaredMethod.invoke(null, Object.class);
                    O90.m5966d(objInvoke, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue = ((Integer) objInvoke).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    c8450Vw0 = new C0867Nm(declaredMethod2, iIntValue, clsM6213b);
                } catch (Throwable unused2) {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    c8450Vw0 = new C4224i9(cls.getMethod("allocateInstance", Class.class), declaredField.get(null), clsM6213b, 22);
                }
            } catch (Throwable unused3) {
                c8450Vw0 = new C8450Vw0(23, clsM6213b);
            }
            c0267ee = new C0267EE(29, c8450Vw0);
        }
        Object objMo2071c = c0267ee.mo2071c();
        Iterator it = ((Map) this.f11334f.getValue()).entrySet().iterator();
        if (!it.hasNext()) {
            O90.m5966d(objMo2071c, "null cannot be cast to non-null type T of expo.modules.kotlin.records.RecordTypeConverter");
            return (RN0) objMo2071c;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ((SN0) entry.getValue()).getClass();
        throw null;
    }
}
