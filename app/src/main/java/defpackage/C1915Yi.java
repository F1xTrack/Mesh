package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: Yi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1915Yi implements InvocationHandler {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ C1915Yi(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        switch (this.a) {
            case 0:
                try {
                    return Class.forName(method.getDeclaringClass().getName(), true, C0136Bm1.class.getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke((C0136Bm1) this.b, objArr);
                } catch (InvocationTargetException e) {
                    throw e.getTargetException();
                } catch (ReflectiveOperationException e2) {
                    throw new RuntimeException("Reflection failed for method " + method, e2);
                }
            default:
                String name = method.getName();
                try {
                    boolean zEquals = name.equals("onInstallReferrerSetupFinished");
                    WH0 wh0 = (WH0) this.b;
                    if (zEquals && objArr != null) {
                        Object obj2 = objArr[0];
                        if (obj2 instanceof Integer) {
                            wh0.e.post(new RunnableC0677Il(this, ((Integer) obj2).intValue(), 3));
                            return null;
                        }
                    }
                    if (!name.equals("onInstallReferrerServiceDisconnected")) {
                        return null;
                    }
                    wh0.e.post(new RunnableC6133nk0(3, this));
                    return null;
                } catch (Exception e3) {
                    throw new RuntimeException("unexpected invocation exception: " + e3.getMessage());
                }
        }
    }
}
