package p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: Jg1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7795Jg1 extends AbstractC7899Lg1 {
    @Override // p000.AbstractC7899Lg1
    /* renamed from: c */
    public final boolean mo3540c(long j, Object obj) {
        return this.f6799a.getBoolean(obj, j);
    }

    @Override // p000.AbstractC7899Lg1
    /* renamed from: d */
    public final byte mo3541d(long j, Object obj) {
        return this.f6799a.getByte(obj, j);
    }

    @Override // p000.AbstractC7899Lg1
    /* renamed from: e */
    public final double mo3542e(long j, Object obj) {
        return this.f6799a.getDouble(obj, j);
    }

    @Override // p000.AbstractC7899Lg1
    /* renamed from: f */
    public final float mo3543f(long j, Object obj) {
        return this.f6799a.getFloat(obj, j);
    }

    @Override // p000.AbstractC7899Lg1
    /* renamed from: k */
    public final void mo3544k(Object obj, long j, boolean z) {
        this.f6799a.putBoolean(obj, j, z);
    }

    @Override // p000.AbstractC7899Lg1
    /* renamed from: l */
    public final void mo3545l(Object obj, long j, byte b) {
        this.f6799a.putByte(obj, j, b);
    }

    @Override // p000.AbstractC7899Lg1
    /* renamed from: m */
    public final void mo3546m(Object obj, long j, double d) {
        this.f6799a.putDouble(obj, j, d);
    }

    @Override // p000.AbstractC7899Lg1
    /* renamed from: n */
    public final void mo3547n(Object obj, long j, float f) {
        this.f6799a.putFloat(obj, j, f);
    }

    @Override // p000.AbstractC7899Lg1
    /* renamed from: r */
    public final boolean mo4385r() {
        if (!super.mo4385r()) {
            return false;
        }
        try {
            Class<?> cls = this.f6799a.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            AbstractC8003Ng1.m5799a(th);
            return false;
        }
    }

    @Override // p000.AbstractC7899Lg1
    /* renamed from: s */
    public final boolean mo3548s() {
        Unsafe unsafe = this.f6799a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (AbstractC8003Ng1.m5803e() != null) {
                    try {
                        Class<?> cls3 = this.f6799a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        AbstractC8003Ng1.m5799a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                AbstractC8003Ng1.m5799a(th2);
            }
        }
        return false;
    }
}
