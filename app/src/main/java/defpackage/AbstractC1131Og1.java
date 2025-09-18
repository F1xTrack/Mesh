package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* renamed from: Og1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1131Og1 {
    public static final Logger a = Logger.getLogger(AbstractC1131Og1.class.getName());
    public static final Unsafe b;
    public static final Class c;
    public static final AbstractC0975Mg1 d;
    public static final boolean e;
    public static final boolean f;
    public static final long g;
    public static final boolean h;

    /* JADX WARN: Removed duplicated region for block: B:110:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x027a  */
    static {
        /*
            Method dump skipped, instructions count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1131Og1.<clinit>():void");
    }

    public static Object a(Class cls) {
        try {
            return b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int b(Class cls) {
        if (f) {
            return d.a(cls);
        }
        return -1;
    }

    public static void c(Class cls) {
        if (f) {
            d.b(cls);
        }
    }

    public static Field d() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC3321d4.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean e(Class cls) {
        if (!AbstractC3321d4.a()) {
            return false;
        }
        try {
            Class cls2 = c;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte f(long j, byte[] bArr) {
        return d.d(g + j, bArr);
    }

    public static byte g(long j, Object obj) {
        return (byte) ((d.g((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static byte h(long j, Object obj) {
        return (byte) ((d.g((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static int i(L0 l0, long j) {
        return d.g(j, l0);
    }

    public static long j(L0 l0, long j) {
        return d.h(j, l0);
    }

    public static Object k(long j, Object obj) {
        return d.i(j, obj);
    }

    public static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C0508Gg1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void m(byte[] bArr, long j, byte b2) {
        d.l(bArr, g + j, b2);
    }

    public static void n(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int iG = d.g(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        p(j2, obj, ((255 & b2) << i) | (iG & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    public static void o(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        p(j2, obj, ((255 & b2) << i) | (d.g(j2, obj) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    public static void p(long j, Object obj, int i) {
        d.o(j, obj, i);
    }

    public static void q(long j, long j2, Object obj) {
        d.p(j, j2, obj);
    }

    public static void r(long j, Object obj, Object obj2) {
        d.q(j, obj, obj2);
    }
}
