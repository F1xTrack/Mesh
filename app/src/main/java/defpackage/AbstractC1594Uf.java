package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: Uf */
/* loaded from: classes2.dex */
public abstract class AbstractC1594Uf implements InterfaceC1729Vy, InterfaceC1108Nz, Serializable {
    private final InterfaceC1729Vy completion;

    public AbstractC1594Uf(InterfaceC1729Vy interfaceC1729Vy) {
        this.completion = interfaceC1729Vy;
    }

    public InterfaceC1729Vy create(InterfaceC1729Vy interfaceC1729Vy) {
        O90.f(interfaceC1729Vy, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public InterfaceC1108Nz getCallerFrame() {
        InterfaceC1729Vy interfaceC1729Vy = this.completion;
        if (interfaceC1729Vy instanceof InterfaceC1108Nz) {
            return (InterfaceC1108Nz) interfaceC1729Vy;
        }
        return null;
    }

    public final InterfaceC1729Vy getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int iIntValue;
        String strC;
        InterfaceC7940xD interfaceC7940xD = (InterfaceC7940xD) getClass().getAnnotation(InterfaceC7940xD.class);
        String str = null;
        if (interfaceC7940xD == null) {
            return null;
        }
        int iV = interfaceC7940xD.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
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
        int i = iIntValue >= 0 ? interfaceC7940xD.l()[iIntValue] : -1;
        C5772lr0 c5772lr0 = AbstractC8123yA1.b;
        C5772lr0 c5772lr02 = AbstractC8123yA1.a;
        if (c5772lr0 == null) {
            try {
                C5772lr0 c5772lr03 = new C5772lr0(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 18);
                AbstractC8123yA1.b = c5772lr03;
                c5772lr0 = c5772lr03;
            } catch (Exception unused2) {
                AbstractC8123yA1.b = c5772lr02;
                c5772lr0 = c5772lr02;
            }
        }
        if (c5772lr0 != c5772lr02) {
            Method method = (Method) c5772lr0.b;
            Object objInvoke = method != null ? method.invoke(getClass(), null) : null;
            if (objInvoke != null) {
                Method method2 = (Method) c5772lr0.c;
                Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, null) : null;
                if (objInvoke2 != null) {
                    Method method3 = (Method) c5772lr0.d;
                    Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
                    if (objInvoke3 instanceof String) {
                        str = (String) objInvoke3;
                    }
                }
            }
        }
        if (str == null) {
            strC = interfaceC7940xD.c();
        } else {
            strC = str + '/' + interfaceC7940xD.c();
        }
        return new StackTraceElement(strC, interfaceC7940xD.m(), interfaceC7940xD.f(), i);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // defpackage.InterfaceC1729Vy
    public final void resumeWith(Object obj) {
        InterfaceC1729Vy interfaceC1729Vy = this;
        while (true) {
            AbstractC1594Uf abstractC1594Uf = (AbstractC1594Uf) interfaceC1729Vy;
            InterfaceC1729Vy interfaceC1729Vy2 = abstractC1594Uf.completion;
            O90.c(interfaceC1729Vy2);
            try {
                obj = abstractC1594Uf.invokeSuspend(obj);
                if (obj == EnumC1030Mz.a) {
                    return;
                }
            } catch (Throwable th) {
                obj = RQ1.b(th);
            }
            abstractC1594Uf.releaseIntercepted();
            if (!(interfaceC1729Vy2 instanceof AbstractC1594Uf)) {
                interfaceC1729Vy2.resumeWith(obj);
                return;
            }
            interfaceC1729Vy = interfaceC1729Vy2;
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

    public InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        O90.f(interfaceC1729Vy, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
