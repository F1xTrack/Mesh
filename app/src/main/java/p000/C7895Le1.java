package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: Le1 */
/* loaded from: classes.dex */
public class C7895Le1 extends GZ1 {

    /* renamed from: a */
    public static Class f6778a = null;

    /* renamed from: b */
    public static Constructor f6779b = null;

    /* renamed from: c */
    public static Method f6780c = null;

    /* renamed from: d */
    public static Method f6781d = null;

    /* renamed from: e */
    public static boolean f6782e = false;

    /* renamed from: k */
    public static boolean m5049k(String str, boolean z, int i, Object obj) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        m5050l();
        try {
            return ((Boolean) f6780c.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: l */
    public static void m5050l() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f6782e) {
            return;
        }
        f6782e = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            cls = null;
            method2 = null;
        }
        f6779b = constructor;
        f6778a = cls;
        f6780c = method2;
        f6781d = method;
    }

    @Override // p000.GZ1
    /* renamed from: b */
    public Typeface mo3089b(Context context, C4185hX c4185hX, Resources resources, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        m5050l();
        try {
            Object objNewInstance = f6779b.newInstance(null);
            for (C4248iX c4248iX : c4185hX.f28444a) {
                File fileM3509e = HZ1.m3509e(context);
                if (fileM3509e == null) {
                    return null;
                }
                try {
                    if (!HZ1.m3507c(fileM3509e, resources, c4248iX.f29303f)) {
                        return null;
                    }
                    if (!m5049k(fileM3509e.getPath(), c4248iX.f29300c, c4248iX.f29299b, objNewInstance)) {
                        return null;
                    }
                    fileM3509e.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileM3509e.delete();
                }
            }
            m5050l();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f6778a, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f6781d.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p000.GZ1
    /* renamed from: c */
    public Typeface mo3090c(Context context, C6369lX[] c6369lXArr, int i) throws IOException {
        String str;
        if (c6369lXArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(mo3093f(i, c6369lXArr).f37093a, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                } finally {
                }
            } catch (ErrnoException unused) {
            }
            File file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
            if (file != null && file.canRead()) {
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceCreateFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                Typeface typefaceMo3091d = mo3091d(context, fileInputStream);
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceMo3091d;
            } finally {
            }
        } catch (IOException unused2) {
            return null;
        }
    }
}
