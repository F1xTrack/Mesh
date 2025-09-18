package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class B00 extends AbstractC0694L0 {
    private static Map<Object, B00> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize;
    protected C9656hg1 unknownFields;

    public B00() {
        this.memoizedHashCode = 0;
        this.unknownFields = C9656hg1.f28522f;
        this.memoizedSerializedSize = -1;
    }

    /* renamed from: e */
    public static B00 m427e(Class cls) throws ClassNotFoundException {
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
            b00 = (B00) ((B00) AbstractC8055Og1.m6098a(cls)).mo432d(6);
            if (b00 == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, b00);
        }
        return b00;
    }

    /* renamed from: f */
    public static Object m428f(Method method, AbstractC0694L0 abstractC0694L0, Object... objArr) {
        try {
            return method.invoke(abstractC0694L0, objArr);
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

    /* renamed from: h */
    public static void m429h(Class cls, B00 b00) {
        defaultInstanceMap.put(cls, b00);
    }

    @Override // p000.AbstractC0694L0
    /* renamed from: a */
    public final int mo430a() {
        if (this.memoizedSerializedSize == -1) {
            ZF0 zf0 = ZF0.f14820c;
            zf0.getClass();
            this.memoizedSerializedSize = zf0.m9517a(getClass()).mo2325i(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // p000.AbstractC0694L0
    /* renamed from: c */
    public final void mo431c(C6709qu c6709qu) {
        ZF0 zf0 = ZF0.f14820c;
        zf0.getClass();
        EV0 ev0M9517a = zf0.m9517a(getClass());
        C8170Qm0 c8170Qm0 = c6709qu.f41240a;
        if (c8170Qm0 == null) {
            c8170Qm0 = new C8170Qm0(c6709qu);
        }
        ev0M9517a.mo2320d(this, c8170Qm0);
    }

    /* renamed from: d */
    public abstract Object mo432d(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((B00) mo432d(6)).getClass().isInstance(obj)) {
            return false;
        }
        ZF0 zf0 = ZF0.f14820c;
        zf0.getClass();
        return zf0.m9517a(getClass()).mo2324h(this, (B00) obj);
    }

    /* renamed from: g */
    public final boolean m433g() {
        byte bByteValue = ((Byte) mo432d(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        ZF0 zf0 = ZF0.f14820c;
        zf0.getClass();
        boolean zMo2319c = zf0.m9517a(getClass()).mo2319c(this);
        mo432d(2);
        return zMo2319c;
    }

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        ZF0 zf0 = ZF0.f14820c;
        zf0.getClass();
        int iMo2322f = zf0.m9517a(getClass()).mo2322f(this);
        this.memoizedHashCode = iMo2322f;
        return iMo2322f;
    }

    public final String toString() {
        String string = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC11511wA1.m25572e(this, sb, 0);
        return sb.toString();
    }
}
