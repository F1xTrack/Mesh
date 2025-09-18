package p000;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: Yi */
/* loaded from: classes2.dex */
public final class C1555Yi implements InvocationHandler {

    /* renamed from: a */
    public final /* synthetic */ int f14457a;

    /* renamed from: b */
    public final Object f14458b;

    public /* synthetic */ C1555Yi(int i, Object obj) {
        this.f14457a = i;
        this.f14458b = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        switch (this.f14457a) {
            case 0:
                try {
                    return Class.forName(method.getDeclaringClass().getName(), true, C7391Bm1.class.getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke((C7391Bm1) this.f14458b, objArr);
                } catch (InvocationTargetException e) {
                    throw e.getTargetException();
                } catch (ReflectiveOperationException e2) {
                    throw new RuntimeException("Reflection failed for method " + method, e2);
                }
            default:
                String name = method.getName();
                try {
                    boolean zEquals = name.equals("onInstallReferrerSetupFinished");
                    WH0 wh0 = (WH0) this.f14458b;
                    if (zEquals && objArr != null) {
                        Object obj2 = objArr[0];
                        if (obj2 instanceof Integer) {
                            wh0.f13124e.post(new RunnableC0552Il(this, ((Integer) obj2).intValue(), 3));
                            return null;
                        }
                    }
                    if (!name.equals("onInstallReferrerServiceDisconnected")) {
                        return null;
                    }
                    wh0.f13124e.post(new RunnableC10431nk0(3, this));
                    return null;
                } catch (Exception e3) {
                    throw new RuntimeException("unexpected invocation exception: " + e3.getMessage());
                }
        }
    }
}
