package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: z00 */
/* loaded from: classes.dex */
public abstract class AbstractC11868z00 extends AbstractC0568J0 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC11868z00> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected C9528gg1 unknownFields;

    public AbstractC11868z00() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C9528gg1.f27928f;
    }

    /* renamed from: n */
    public static AbstractC11868z00 m26289n(Class cls) throws ClassNotFoundException {
        AbstractC11868z00 abstractC11868z00 = defaultInstanceMap.get(cls);
        if (abstractC11868z00 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC11868z00 = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC11868z00 == null) {
            abstractC11868z00 = (AbstractC11868z00) ((AbstractC11868z00) AbstractC8003Ng1.m5800b(cls)).mo2061m(6);
            if (abstractC11868z00 == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC11868z00);
        }
        return abstractC11868z00;
    }

    /* renamed from: o */
    public static Object m26290o(Method method, AbstractC0568J0 abstractC0568J0, Object... objArr) {
        try {
            return method.invoke(abstractC0568J0, objArr);
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

    /* renamed from: r */
    public static InterfaceC11381v90 m26291r(InterfaceC11381v90 interfaceC11381v90) {
        int size = interfaceC11381v90.size();
        return interfaceC11381v90.mo9686e(size == 0 ? 10 : size * 2);
    }

    /* renamed from: s */
    public static void m26292s(Class cls, AbstractC11868z00 abstractC11868z00) {
        abstractC11868z00.m26297q();
        defaultInstanceMap.put(cls, abstractC11868z00);
    }

    @Override // p000.AbstractC0568J0
    /* renamed from: c */
    public final int mo4101c(DV0 dv0) {
        int iMo1712e;
        int iMo1712e2;
        if (m26296p()) {
            if (dv0 == null) {
                YF0 yf0 = YF0.f14212c;
                yf0.getClass();
                iMo1712e2 = yf0.m9251a(getClass()).mo1712e(this);
            } else {
                iMo1712e2 = dv0.mo1712e(this);
            }
            if (iMo1712e2 >= 0) {
                return iMo1712e2;
            }
            throw new IllegalStateException(AbstractC11153tN0.m24909u(iMo1712e2, "serialized size must be non-negative, was "));
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (dv0 == null) {
            YF0 yf02 = YF0.f14212c;
            yf02.getClass();
            iMo1712e = yf02.m9251a(getClass()).mo1712e(this);
        } else {
            iMo1712e = dv0.mo1712e(this);
        }
        m26298t(iMo1712e);
        return iMo1712e;
    }

    @Override // p000.AbstractC0568J0
    /* renamed from: d */
    public final void mo4102d(C6518nu c6518nu) {
        YF0 yf0 = YF0.f14212c;
        yf0.getClass();
        DV0 dv0M9251a = yf0.m9251a(getClass());
        C8342Tu0 c8342Tu0 = c6518nu.f38599a;
        if (c8342Tu0 == null) {
            c8342Tu0 = new C8342Tu0(c6518nu);
        }
        dv0M9251a.mo1714g(this, c8342Tu0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        YF0 yf0 = YF0.f14212c;
        yf0.getClass();
        return yf0.m9251a(getClass()).mo1713f(this, (AbstractC11868z00) obj);
    }

    /* renamed from: f */
    public final void m26293f() {
        this.memoizedHashCode = 0;
    }

    /* renamed from: g */
    public final void m26294g() {
        m26298t(Integer.MAX_VALUE);
    }

    public final int hashCode() {
        if (m26296p()) {
            YF0 yf0 = YF0.f14212c;
            yf0.getClass();
            return yf0.m9251a(getClass()).mo1715h(this);
        }
        if (this.memoizedHashCode == 0) {
            YF0 yf02 = YF0.f14212c;
            yf02.getClass();
            this.memoizedHashCode = yf02.m9251a(getClass()).mo1715h(this);
        }
        return this.memoizedHashCode;
    }

    /* renamed from: l */
    public final AbstractC10719q00 m26295l() {
        return (AbstractC10719q00) mo2061m(5);
    }

    /* renamed from: m */
    public abstract Object mo2061m(int i);

    /* renamed from: p */
    public final boolean m26296p() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    /* renamed from: q */
    public final void m26297q() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    /* renamed from: t */
    public final void m26298t(int i) {
        if (i < 0) {
            throw new IllegalStateException(AbstractC11153tN0.m24909u(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = AbstractC11085sr0.f42643a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC11085sr0.m24794c(this, sb, 0);
        return sb.toString();
    }
}
