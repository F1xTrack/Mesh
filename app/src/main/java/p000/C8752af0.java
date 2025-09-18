package p000;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: af0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8752af0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f15605e;

    /* renamed from: f */
    public final /* synthetic */ C8880bf0 f15606f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8752af0(C8880bf0 c8880bf0, int i) {
        super(0);
        this.f15605e = i;
        this.f15606f = c8880bf0;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() throws SecurityException, C0226Da {
        C8880bf0 c8880bf0 = this.f15606f;
        switch (this.f15605e) {
            case 0:
                return new C8622Ze0(c8880bf0);
            default:
                Object objM24957t = c8880bf0.m24957t();
                try {
                    Object obj = AbstractC11189tf0.f43196m;
                    Object objM25294b = c8880bf0.mo8097s() ? AbstractC11361v02.m25294b(c8880bf0.f43200j, c8880bf0.mo8094p()) : null;
                    if (objM25294b == obj) {
                        objM25294b = null;
                    }
                    c8880bf0.mo8097s();
                    AccessibleObject accessibleObject = objM24957t instanceof AccessibleObject ? (AccessibleObject) objM24957t : null;
                    if (accessibleObject != null) {
                        accessibleObject.setAccessible(T22.m7537a(c8880bf0));
                    }
                    if (objM24957t == null) {
                        return null;
                    }
                    if (objM24957t instanceof Field) {
                        return ((Field) objM24957t).get(objM25294b);
                    }
                    if (!(objM24957t instanceof Method)) {
                        throw new AssertionError("delegate field/method " + objM24957t + " neither field nor method");
                    }
                    int length = ((Method) objM24957t).getParameterTypes().length;
                    if (length == 0) {
                        return ((Method) objM24957t).invoke(null, null);
                    }
                    if (length == 1) {
                        Method method = (Method) objM24957t;
                        if (objM25294b == null) {
                            Class<?> cls = ((Method) objM24957t).getParameterTypes()[0];
                            O90.m5967e(cls, "get(...)");
                            objM25294b = AbstractC7589Fh1.m2753e(cls);
                        }
                        return method.invoke(null, objM25294b);
                    }
                    if (length == 2) {
                        Method method2 = (Method) objM24957t;
                        Class<?> cls2 = ((Method) objM24957t).getParameterTypes()[1];
                        O90.m5967e(cls2, "get(...)");
                        return method2.invoke(null, objM25294b, AbstractC7589Fh1.m2753e(cls2));
                    }
                    throw new AssertionError("delegate method " + objM24957t + " should take 0, 1, or 2 parameters");
                } catch (IllegalAccessException e) {
                    throw new C0226Da(8, "Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", e);
                }
        }
    }
}
