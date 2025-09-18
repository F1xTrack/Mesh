package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class B00 extends L0 {
    private static Map<Object, B00> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize;
    protected C4200hg1 unknownFields;

    public B00() {
        this.memoizedHashCode = 0;
        this.unknownFields = C4200hg1.f;
        this.memoizedSerializedSize = -1;
    }

    public static B00 e(Class cls) throws ClassNotFoundException {
        B00 b00 = defaultInstanceMap.get(cls);
        if (b00 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                b00 = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (b00 == null) {
            b00 = (B00) ((B00) AbstractC1131Og1.a(cls)).d(6);
            if (b00 == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, b00);
        }
        return b00;
    }

    public static Object f(Method method, L0 l0, Object... objArr) {
        try {
            return method.invoke(l0, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void h(Class cls, B00 b00) {
        defaultInstanceMap.put(cls, b00);
    }

    @Override // defpackage.L0
    public final int a() {
        if (this.memoizedSerializedSize == -1) {
            ZF0 zf0 = ZF0.c;
            zf0.getClass();
            this.memoizedSerializedSize = zf0.a(getClass()).i(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // defpackage.L0
    public final void c(C6735qu c6735qu) {
        ZF0 zf0 = ZF0.c;
        zf0.getClass();
        EV0 ev0A = zf0.a(getClass());
        C1304Qm0 c1304Qm0 = c6735qu.a;
        if (c1304Qm0 == null) {
            c1304Qm0 = new C1304Qm0(c6735qu);
        }
        ev0A.d(this, c1304Qm0);
    }

    public abstract Object d(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((B00) d(6)).getClass().isInstance(obj)) {
            return false;
        }
        ZF0 zf0 = ZF0.c;
        zf0.getClass();
        return zf0.a(getClass()).h(this, (B00) obj);
    }

    public final boolean g() {
        byte bByteValue = ((Byte) d(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        ZF0 zf0 = ZF0.c;
        zf0.getClass();
        boolean zC = zf0.a(getClass()).c(this);
        d(2);
        return zC;
    }

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        ZF0 zf0 = ZF0.c;
        zf0.getClass();
        int iF = zf0.a(getClass()).f(this);
        this.memoizedHashCode = iF;
        return iF;
    }

    public final String toString() {
        String string = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC7743wA1.e(this, sb, 0);
        return sb.toString();
    }
}
