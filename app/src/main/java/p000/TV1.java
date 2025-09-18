package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class TV1 {

    /* renamed from: a */
    public final Unsafe f11405a;

    public TV1(Unsafe unsafe) {
        this.f11405a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo7384a(long j, Object obj);

    /* renamed from: b */
    public final void m7697b(long j, long j2, Object obj) {
        this.f11405a.putLong(obj, j, j2);
    }

    /* renamed from: c */
    public final void m7698c(long j, Object obj, int i) {
        this.f11405a.putInt(obj, j, i);
    }

    /* renamed from: d */
    public abstract void mo7385d(Object obj, long j, byte b);

    /* renamed from: e */
    public abstract void mo7386e(Object obj, long j, double d);

    /* renamed from: f */
    public abstract void mo7387f(Object obj, long j, float f);

    /* renamed from: g */
    public abstract void mo7388g(Object obj, long j, boolean z);

    /* renamed from: h */
    public final boolean m7699h() {
        Unsafe unsafe = this.f11405a;
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
            Unsafe unsafe2 = VV1.f12596a;
            Logger.getLogger(VV1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
            return false;
        }
    }

    /* renamed from: i */
    public abstract float mo7389i(long j, Object obj);

    /* renamed from: j */
    public final boolean m7700j() {
        Field declaredField;
        Field declaredField2;
        Unsafe unsafe = this.f11405a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            Unsafe unsafe2 = VV1.f12596a;
            Field field = null;
            try {
                declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField = null;
            }
            if (declaredField != null) {
                field = declaredField;
            } else {
                try {
                    declaredField2 = Buffer.class.getDeclaredField("address");
                } catch (Throwable unused2) {
                    declaredField2 = null;
                }
                if (declaredField2 != null) {
                    if (declaredField2.getType() == Long.TYPE) {
                        field = declaredField2;
                    }
                }
            }
            return field != null;
        } catch (Throwable th) {
            Unsafe unsafe3 = VV1.f12596a;
            Logger.getLogger(VV1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
            return false;
        }
    }

    /* renamed from: k */
    public abstract boolean mo7390k(long j, Object obj);

    /* renamed from: l */
    public final int m7701l(long j, Object obj) {
        return this.f11405a.getInt(obj, j);
    }

    /* renamed from: m */
    public final long m7702m(long j, Object obj) {
        return this.f11405a.getLong(obj, j);
    }
}
