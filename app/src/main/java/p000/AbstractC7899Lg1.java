package p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: Lg1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7899Lg1 {

    /* renamed from: a */
    public final Unsafe f6799a;

    public AbstractC7899Lg1(Unsafe unsafe) {
        this.f6799a = unsafe;
    }

    /* renamed from: a */
    public final int m5052a(Class cls) {
        return this.f6799a.arrayBaseOffset(cls);
    }

    /* renamed from: b */
    public final int m5053b(Class cls) {
        return this.f6799a.arrayIndexScale(cls);
    }

    /* renamed from: c */
    public abstract boolean mo3540c(long j, Object obj);

    /* renamed from: d */
    public abstract byte mo3541d(long j, Object obj);

    /* renamed from: e */
    public abstract double mo3542e(long j, Object obj);

    /* renamed from: f */
    public abstract float mo3543f(long j, Object obj);

    /* renamed from: g */
    public final int m5054g(long j, Object obj) {
        return this.f6799a.getInt(obj, j);
    }

    /* renamed from: h */
    public final long m5055h(long j, Object obj) {
        return this.f6799a.getLong(obj, j);
    }

    /* renamed from: i */
    public final Object m5056i(long j, Object obj) {
        return this.f6799a.getObject(obj, j);
    }

    /* renamed from: j */
    public final long m5057j(Field field) {
        return this.f6799a.objectFieldOffset(field);
    }

    /* renamed from: k */
    public abstract void mo3544k(Object obj, long j, boolean z);

    /* renamed from: l */
    public abstract void mo3545l(Object obj, long j, byte b);

    /* renamed from: m */
    public abstract void mo3546m(Object obj, long j, double d);

    /* renamed from: n */
    public abstract void mo3547n(Object obj, long j, float f);

    /* renamed from: o */
    public final void m5058o(long j, Object obj, int i) {
        this.f6799a.putInt(obj, j, i);
    }

    /* renamed from: p */
    public final void m5059p(long j, long j2, Object obj) {
        this.f6799a.putLong(obj, j, j2);
    }

    /* renamed from: q */
    public final void m5060q(long j, Object obj, Object obj2) {
        this.f6799a.putObject(obj, j, obj2);
    }

    /* renamed from: r */
    public boolean mo4385r() {
        Unsafe unsafe = this.f6799a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            AbstractC8003Ng1.m5799a(th);
            return false;
        }
    }

    /* renamed from: s */
    public abstract boolean mo3548s();
}
