package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class TV1 {
    public final Unsafe a;

    public TV1(Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract double a(long j, Object obj);

    public final void b(long j, long j2, Object obj) {
        this.a.putLong(obj, j, j2);
    }

    public final void c(long j, Object obj, int i) {
        this.a.putInt(obj, j, i);
    }

    public abstract void d(Object obj, long j, byte b);

    public abstract void e(Object obj, long j, double d);

    public abstract void f(Object obj, long j, float f);

    public abstract void g(Object obj, long j, boolean z);

    public final boolean h() {
        Unsafe unsafe = this.a;
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
            Unsafe unsafe2 = VV1.a;
            Logger.getLogger(VV1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
            return false;
        }
    }

    public abstract float i(long j, Object obj);

    public final boolean j() {
        Field declaredField;
        Field declaredField2;
        Unsafe unsafe = this.a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            Unsafe unsafe2 = VV1.a;
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
            Unsafe unsafe3 = VV1.a;
            Logger.getLogger(VV1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
            return false;
        }
    }

    public abstract boolean k(long j, Object obj);

    public final int l(long j, Object obj) {
        return this.a.getInt(obj, j);
    }

    public final long m(long j, Object obj) {
        return this.a.getLong(obj, j);
    }
}
