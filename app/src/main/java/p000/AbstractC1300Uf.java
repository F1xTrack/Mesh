package p000;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: Uf */
/* loaded from: classes2.dex */
public abstract class AbstractC1300Uf implements InterfaceC1382Vy, InterfaceC0880Nz, Serializable {
    private final InterfaceC1382Vy completion;

    public AbstractC1300Uf(InterfaceC1382Vy interfaceC1382Vy) {
        this.completion = interfaceC1382Vy;
    }

    public InterfaceC1382Vy create(InterfaceC1382Vy interfaceC1382Vy) {
        O90.m5968f(interfaceC1382Vy, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public InterfaceC0880Nz getCallerFrame() {
        InterfaceC1382Vy interfaceC1382Vy = this.completion;
        if (interfaceC1382Vy instanceof InterfaceC0880Nz) {
            return (InterfaceC0880Nz) interfaceC1382Vy;
        }
        return null;
    }

    public final InterfaceC1382Vy getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int iIntValue;
        String strM25814c;
        InterfaceC7124xD interfaceC7124xD = (InterfaceC7124xD) getClass().getAnnotation(InterfaceC7124xD.class);
        String str = null;
        if (interfaceC7124xD == null) {
            return null;
        }
        int iM25818v = interfaceC7124xD.m25818v();
        if (iM25818v > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iM25818v + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? interfaceC7124xD.m25816l()[iIntValue] : -1;
        C10189lr0 c10189lr0 = AbstractC11765yA1.f46131b;
        C10189lr0 c10189lr02 = AbstractC11765yA1.f46130a;
        if (c10189lr0 == null) {
            try {
                C10189lr0 c10189lr03 = new C10189lr0(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 18);
                AbstractC11765yA1.f46131b = c10189lr03;
                c10189lr0 = c10189lr03;
            } catch (Exception unused2) {
                AbstractC11765yA1.f46131b = c10189lr02;
                c10189lr0 = c10189lr02;
            }
        }
        if (c10189lr0 != c10189lr02) {
            Method method = (Method) c10189lr0.f37323b;
            Object objInvoke = method != null ? method.invoke(getClass(), null) : null;
            if (objInvoke != null) {
                Method method2 = (Method) c10189lr0.f37324c;
                Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, null) : null;
                if (objInvoke2 != null) {
                    Method method3 = (Method) c10189lr0.f37325d;
                    Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
                    if (objInvoke3 instanceof String) {
                        str = (String) objInvoke3;
                    }
                }
            }
        }
        if (str == null) {
            strM25814c = interfaceC7124xD.m25814c();
        } else {
            strM25814c = str + '/' + interfaceC7124xD.m25814c();
        }
        return new StackTraceElement(strM25814c, interfaceC7124xD.m25817m(), interfaceC7124xD.m25815f(), i);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // p000.InterfaceC1382Vy
    public final void resumeWith(Object obj) {
        InterfaceC1382Vy interfaceC1382Vy = this;
        while (true) {
            AbstractC1300Uf abstractC1300Uf = (AbstractC1300Uf) interfaceC1382Vy;
            InterfaceC1382Vy interfaceC1382Vy2 = abstractC1300Uf.completion;
            O90.m5965c(interfaceC1382Vy2);
            try {
                obj = abstractC1300Uf.invokeSuspend(obj);
                if (obj == EnumC0817Mz.f7418a) {
                    return;
                }
            } catch (Throwable th) {
                obj = RQ1.m7015b(th);
            }
            abstractC1300Uf.releaseIntercepted();
            if (!(interfaceC1382Vy2 instanceof AbstractC1300Uf)) {
                interfaceC1382Vy2.resumeWith(obj);
                return;
            }
            interfaceC1382Vy = interfaceC1382Vy2;
        }
    }

    public String toString() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        O90.m5968f(interfaceC1382Vy, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
