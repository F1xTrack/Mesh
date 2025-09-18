package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: Me1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7947Me1 extends GZ1 {

    /* renamed from: a */
    public static final Class f7285a;

    /* renamed from: b */
    public static final Constructor f7286b;

    /* renamed from: c */
    public static final Method f7287c;

    /* renamed from: d */
    public static final Method f7288d;

    static {
        Method method;
        Class<?> cls;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            cls = null;
            method2 = null;
        }
        f7286b = constructor;
        f7285a = cls;
        f7287c = method2;
        f7288d = method;
    }

    /* renamed from: k */
    public static boolean m5411k(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f7287c.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: l */
    public static Typeface m5412l(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f7285a, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f7288d.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005b A[SYNTHETIC] */
    @Override // p000.GZ1
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Typeface mo3089b(android.content.Context r17, p000.C4185hX r18, android.content.res.Resources r19, int r20) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r16 = this;
            r1 = 0
            java.lang.reflect.Constructor r0 = p000.C7947Me1.f7286b     // Catch: java.lang.Throwable -> L9
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> L9
            r2 = r0
            goto La
        L9:
            r2 = r1
        La:
            if (r2 != 0) goto Ld
            return r1
        Ld:
            r0 = r18
            iX[] r3 = r0.f28444a
            int r4 = r3.length
            r0 = 0
            r5 = r0
        L14:
            if (r5 >= r4) goto L71
            r6 = r3[r5]
            int r0 = r6.f29303f
            java.io.File r7 = p000.HZ1.m3509e(r17)
            if (r7 != 0) goto L24
            r8 = r19
        L22:
            r0 = r1
            goto L59
        L24:
            r8 = r19
            boolean r0 = p000.HZ1.m3507c(r7, r8, r0)     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto L30
            r7.delete()
            goto L22
        L30:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            r9.<init>(r7)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch: java.lang.Throwable -> L49
            long r14 = r10.size()     // Catch: java.lang.Throwable -> L49
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L49
            r12 = 0
            java.nio.MappedByteBuffer r0 = r10.map(r11, r12, r14)     // Catch: java.lang.Throwable -> L49
            r9.close()     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            goto L56
        L49:
            r0 = move-exception
            r10 = r0
            r9.close()     // Catch: java.lang.Throwable -> L4f
            goto L54
        L4f:
            r0 = move-exception
            r9 = r0
            r10.addSuppressed(r9)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
        L54:
            throw r10     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
        L55:
            r0 = r1
        L56:
            r7.delete()
        L59:
            if (r0 != 0) goto L5c
            return r1
        L5c:
            int r7 = r6.f29299b
            boolean r9 = r6.f29300c
            int r6 = r6.f29302e
            boolean r0 = m5411k(r2, r0, r6, r7, r9)
            if (r0 != 0) goto L69
            return r1
        L69:
            int r5 = r5 + 1
            goto L14
        L6c:
            r0 = move-exception
            r7.delete()
            throw r0
        L71:
            android.graphics.Typeface r0 = m5412l(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7947Me1.mo3089b(android.content.Context, hX, android.content.res.Resources, int):android.graphics.Typeface");
    }

    @Override // p000.GZ1
    /* renamed from: c */
    public final Typeface mo3090c(Context context, C6369lX[] c6369lXArr, int i) throws IllegalAccessException, InstantiationException, IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        Object objNewInstance;
        try {
            objNewInstance = f7286b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        L01 l01 = new L01();
        for (C6369lX c6369lX : c6369lXArr) {
            Uri uri = c6369lX.f37093a;
            ByteBuffer byteBufferM3510f = (ByteBuffer) l01.getOrDefault(uri, null);
            if (byteBufferM3510f == null) {
                byteBufferM3510f = HZ1.m3510f(context, uri);
                l01.put(uri, byteBufferM3510f);
            }
            if (byteBufferM3510f == null) {
                return null;
            }
            if (!m5411k(objNewInstance, byteBufferM3510f, c6369lX.f37094b, c6369lX.f37095c, c6369lX.f37096d)) {
                return null;
            }
        }
        Typeface typefaceM5412l = m5412l(objNewInstance);
        if (typefaceM5412l == null) {
            return null;
        }
        return Typeface.create(typefaceM5412l, i);
    }
}
