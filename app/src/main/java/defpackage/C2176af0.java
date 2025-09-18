package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: af0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2176af0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ C2367bf0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2176af0(C2367bf0 c2367bf0, int i) {
        super(0);
        this.e = i;
        this.f = c2367bf0;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() throws SecurityException, C0254Da {
        C2367bf0 c2367bf0 = this.f;
        switch (this.e) {
            case 0:
                return new C1982Ze0(c2367bf0);
            default:
                Object objT = c2367bf0.t();
                try {
                    Object obj = AbstractC7263tf0.m;
                    Object objB = c2367bf0.s() ? AbstractC7520v02.b(c2367bf0.j, c2367bf0.p()) : null;
                    if (objB == obj) {
                        objB = null;
                    }
                    c2367bf0.s();
                    AccessibleObject accessibleObject = objT instanceof AccessibleObject ? (AccessibleObject) objT : null;
                    if (accessibleObject != null) {
                        accessibleObject.setAccessible(T22.a(c2367bf0));
                    }
                    if (objT == null) {
                        return null;
                    }
                    if (objT instanceof Field) {
                        return ((Field) objT).get(objB);
                    }
                    if (!(objT instanceof Method)) {
                        throw new AssertionError("delegate field/method " + objT + " neither field nor method");
                    }
                    int length = ((Method) objT).getParameterTypes().length;
                    if (length == 0) {
                        return ((Method) objT).invoke(null, null);
                    }
                    if (length == 1) {
                        Method method = (Method) objT;
                        if (objB == null) {
                            Class<?> cls = ((Method) objT).getParameterTypes()[0];
                            O90.e(cls, "get(...)");
                            objB = AbstractC0433Fh1.e(cls);
                        }
                        return method.invoke(null, objB);
                    }
                    if (length == 2) {
                        Method method2 = (Method) objT;
                        Class<?> cls2 = ((Method) objT).getParameterTypes()[1];
                        O90.e(cls2, "get(...)");
                        return method2.invoke(null, objB, AbstractC0433Fh1.e(cls2));
                    }
                    throw new AssertionError("delegate method " + objT + " should take 0, 1, or 2 parameters");
                } catch (IllegalAccessException e) {
                    throw new C0254Da(8, "Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", e);
                }
        }
    }
}
