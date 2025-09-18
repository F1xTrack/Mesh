package p000;

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
public class C7999Ne1 extends C7895Le1 {

    /* renamed from: f */
    public final Class f7935f;

    /* renamed from: g */
    public final Constructor f7936g;

    /* renamed from: h */
    public final Method f7937h;

    /* renamed from: i */
    public final Method f7938i;

    /* renamed from: j */
    public final Method f7939j;

    /* renamed from: k */
    public final Method f7940k;

    /* renamed from: l */
    public final Method f7941l;

    public C7999Ne1() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method methodMo5796s;
        Constructor<?> constructor;
        Method methodM5790r;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodM5790r = m5790r(cls2);
            Class<?> cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodMo5796s = mo5796s(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            methodMo5796s = null;
            constructor = null;
            methodM5790r = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f7935f = cls;
        this.f7936g = constructor;
        this.f7937h = methodM5790r;
        this.f7938i = method;
        this.f7939j = method2;
        this.f7940k = method3;
        this.f7941l = methodMo5796s;
    }

    /* renamed from: r */
    public static Method m5790r(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override // p000.C7895Le1, p000.GZ1
    /* renamed from: b */
    public final Typeface mo3089b(Context context, C4185hX c4185hX, Resources resources, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f7937h == null) {
            return super.mo3089b(context, c4185hX, resources, i);
        }
        Object objM5795q = m5795q();
        if (objM5795q == null) {
            return null;
        }
        for (C4248iX c4248iX : c4185hX.f28444a) {
            if (!m5792n(context, objM5795q, c4248iX.f29298a, c4248iX.f29302e, c4248iX.f29299b, c4248iX.f29300c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c4248iX.f29301d))) {
                m5791m(objM5795q);
                return null;
            }
        }
        if (m5794p(objM5795q)) {
            return mo5793o(objM5795q);
        }
        return null;
    }

    @Override // p000.C7895Le1, p000.GZ1
    /* renamed from: c */
    public final Typeface mo3090c(Context context, C6369lX[] c6369lXArr, int i) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Typeface typefaceMo5793o;
        boolean zBooleanValue;
        if (c6369lXArr.length < 1) {
            return null;
        }
        if (this.f7937h == null) {
            C6369lX c6369lXMo3093f = mo3093f(i, c6369lXArr);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c6369lXMo3093f.f37093a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c6369lXMo3093f.f37095c).setItalic(c6369lXMo3093f.f37096d).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap map = new HashMap();
        for (C6369lX c6369lX : c6369lXArr) {
            if (c6369lX.f37097e == 0) {
                Uri uri = c6369lX.f37093a;
                if (!map.containsKey(uri)) {
                    map.put(uri, HZ1.m3510f(context, uri));
                }
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Object objM5795q = m5795q();
        if (objM5795q == null) {
            return null;
        }
        int length = c6369lXArr.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            C6369lX c6369lX2 = c6369lXArr[i2];
            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c6369lX2.f37093a);
            if (byteBuffer != null) {
                try {
                    zBooleanValue = ((Boolean) this.f7938i.invoke(objM5795q, byteBuffer, Integer.valueOf(c6369lX2.f37094b), null, Integer.valueOf(c6369lX2.f37095c), Integer.valueOf(c6369lX2.f37096d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    zBooleanValue = false;
                }
                if (!zBooleanValue) {
                    m5791m(objM5795q);
                    return null;
                }
                z = true;
            }
            i2++;
            z = z;
        }
        if (!z) {
            m5791m(objM5795q);
            return null;
        }
        if (m5794p(objM5795q) && (typefaceMo5793o = mo5793o(objM5795q)) != null) {
            return Typeface.create(typefaceMo5793o, i);
        }
        return null;
    }

    @Override // p000.GZ1
    /* renamed from: e */
    public final Typeface mo3092e(Context context, Resources resources, int i, String str, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f7937h == null) {
            return super.mo3092e(context, resources, i, str, i2);
        }
        Object objM5795q = m5795q();
        if (objM5795q == null) {
            return null;
        }
        if (!m5792n(context, objM5795q, str, 0, -1, -1, null)) {
            m5791m(objM5795q);
            return null;
        }
        if (m5794p(objM5795q)) {
            return mo5793o(objM5795q);
        }
        return null;
    }

    /* renamed from: m */
    public final void m5791m(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f7940k.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: n */
    public final boolean m5792n(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f7937h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: o */
    public Typeface mo5793o(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f7935f, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f7941l.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: p */
    public final boolean m5794p(Object obj) {
        try {
            return ((Boolean) this.f7939j.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: q */
    public final Object m5795q() {
        try {
            return this.f7936g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: s */
    public Method mo5796s(Class cls) throws NoSuchMethodException, SecurityException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
