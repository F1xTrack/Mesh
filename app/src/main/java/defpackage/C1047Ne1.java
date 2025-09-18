package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: Ne1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1047Ne1 extends C0892Le1 {
    public final Class f;
    public final Constructor g;
    public final Method h;
    public final Method i;
    public final Method j;
    public final Method k;
    public final Method l;

    public C1047Ne1() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method methodS;
        Constructor<?> constructor;
        Method methodR;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodR = r(cls2);
            Class<?> cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodS = s(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            methodS = null;
            constructor = null;
            methodR = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f = cls;
        this.g = constructor;
        this.h = methodR;
        this.i = method;
        this.j = method2;
        this.k = method3;
        this.l = methodS;
    }

    public static Method r(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override // defpackage.C0892Le1, defpackage.GZ1
    public final Typeface b(Context context, C4171hX c4171hX, Resources resources, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.h == null) {
            return super.b(context, c4171hX, resources, i);
        }
        Object objQ = q();
        if (objQ == null) {
            return null;
        }
        for (C4362iX c4362iX : c4171hX.a) {
            if (!n(context, objQ, c4362iX.a, c4362iX.e, c4362iX.b, c4362iX.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c4362iX.d))) {
                m(objQ);
                return null;
            }
        }
        if (p(objQ)) {
            return o(objQ);
        }
        return null;
    }

    @Override // defpackage.C0892Le1, defpackage.GZ1
    public final Typeface c(Context context, C5711lX[] c5711lXArr, int i) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Typeface typefaceO;
        boolean zBooleanValue;
        if (c5711lXArr.length < 1) {
            return null;
        }
        if (this.h == null) {
            C5711lX c5711lXF = f(i, c5711lXArr);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c5711lXF.a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c5711lXF.c).setItalic(c5711lXF.d).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap map = new HashMap();
        for (C5711lX c5711lX : c5711lXArr) {
            if (c5711lX.e == 0) {
                Uri uri = c5711lX.a;
                if (!map.containsKey(uri)) {
                    map.put(uri, HZ1.f(context, uri));
                }
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Object objQ = q();
        if (objQ == null) {
            return null;
        }
        int length = c5711lXArr.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            C5711lX c5711lX2 = c5711lXArr[i2];
            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c5711lX2.a);
            if (byteBuffer != null) {
                try {
                    zBooleanValue = ((Boolean) this.i.invoke(objQ, byteBuffer, Integer.valueOf(c5711lX2.b), null, Integer.valueOf(c5711lX2.c), Integer.valueOf(c5711lX2.d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    zBooleanValue = false;
                }
                if (!zBooleanValue) {
                    m(objQ);
                    return null;
                }
                z = true;
            }
            i2++;
            z = z;
        }
        if (!z) {
            m(objQ);
            return null;
        }
        if (p(objQ) && (typefaceO = o(objQ)) != null) {
            return Typeface.create(typefaceO, i);
        }
        return null;
    }

    @Override // defpackage.GZ1
    public final Typeface e(Context context, Resources resources, int i, String str, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.h == null) {
            return super.e(context, resources, i, str, i2);
        }
        Object objQ = q();
        if (objQ == null) {
            return null;
        }
        if (!n(context, objQ, str, 0, -1, -1, null)) {
            m(objQ);
            return null;
        }
        if (p(objQ)) {
            return o(objQ);
        }
        return null;
    }

    public final void m(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.k.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean n(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface o(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.l.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean p(Object obj) {
        try {
            return ((Boolean) this.j.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final Object q() {
        try {
            return this.g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method s(Class cls) throws NoSuchMethodException, SecurityException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
