package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: z00 */
/* loaded from: classes.dex */
public abstract class AbstractC8279z00 extends J0 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC8279z00> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected C4009gg1 unknownFields;

    public AbstractC8279z00() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C4009gg1.f;
    }

    public static AbstractC8279z00 n(Class cls) throws ClassNotFoundException {
        AbstractC8279z00 abstractC8279z00 = defaultInstanceMap.get(cls);
        if (abstractC8279z00 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC8279z00 = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC8279z00 == null) {
            abstractC8279z00 = (AbstractC8279z00) ((AbstractC8279z00) AbstractC1053Ng1.b(cls)).m(6);
            if (abstractC8279z00 == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC8279z00);
        }
        return abstractC8279z00;
    }

    public static Object o(Method method, J0 j0, Object... objArr) {
        try {
            return method.invoke(j0, objArr);
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

    public static InterfaceC7549v90 r(InterfaceC7549v90 interfaceC7549v90) {
        int size = interfaceC7549v90.size();
        return interfaceC7549v90.e(size == 0 ? 10 : size * 2);
    }

    public static void s(Class cls, AbstractC8279z00 abstractC8279z00) {
        abstractC8279z00.q();
        defaultInstanceMap.put(cls, abstractC8279z00);
    }

    @Override // defpackage.J0
    public final int c(DV0 dv0) {
        int iE;
        int iE2;
        if (p()) {
            if (dv0 == null) {
                YF0 yf0 = YF0.c;
                yf0.getClass();
                iE2 = yf0.a(getClass()).e(this);
            } else {
                iE2 = dv0.e(this);
            }
            if (iE2 >= 0) {
                return iE2;
            }
            throw new IllegalStateException(AbstractC7209tN0.u(iE2, "serialized size must be non-negative, was "));
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (dv0 == null) {
            YF0 yf02 = YF0.c;
            yf02.getClass();
            iE = yf02.a(getClass()).e(this);
        } else {
            iE = dv0.e(this);
        }
        t(iE);
        return iE;
    }

    @Override // defpackage.J0
    public final void d(C6162nu c6162nu) {
        YF0 yf0 = YF0.c;
        yf0.getClass();
        DV0 dv0A = yf0.a(getClass());
        C1562Tu0 c1562Tu0 = c6162nu.a;
        if (c1562Tu0 == null) {
            c1562Tu0 = new C1562Tu0(c6162nu);
        }
        dv0A.g(this, c1562Tu0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        YF0 yf0 = YF0.c;
        yf0.getClass();
        return yf0.a(getClass()).f(this, (AbstractC8279z00) obj);
    }

    public final void f() {
        this.memoizedHashCode = 0;
    }

    public final void g() {
        t(Integer.MAX_VALUE);
    }

    public final int hashCode() {
        if (p()) {
            YF0 yf0 = YF0.c;
            yf0.getClass();
            return yf0.a(getClass()).h(this);
        }
        if (this.memoizedHashCode == 0) {
            YF0 yf02 = YF0.c;
            yf02.getClass();
            this.memoizedHashCode = yf02.a(getClass()).h(this);
        }
        return this.memoizedHashCode;
    }

    public final AbstractC6564q00 l() {
        return (AbstractC6564q00) m(5);
    }

    public abstract Object m(int i);

    public final boolean p() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void q() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final void t(int i) {
        if (i < 0) {
            throw new IllegalStateException(AbstractC7209tN0.u(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = AbstractC7108sr0.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC7108sr0.c(this, sb, 0);
        return sb.toString();
    }
}
