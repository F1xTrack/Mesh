package defpackage;

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
public class C0892Le1 extends GZ1 {
    public static Class a = null;
    public static Constructor b = null;
    public static Method c = null;
    public static Method d = null;
    public static boolean e = false;

    public static boolean k(String str, boolean z, int i, Object obj) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        l();
        try {
            return ((Boolean) c.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void l() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?> cls;
        Method method2;
        if (e) {
            return;
        }
        e = true;
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
        b = constructor;
        a = cls;
        c = method2;
        d = method;
    }

    @Override // defpackage.GZ1
    public Typeface b(Context context, C4171hX c4171hX, Resources resources, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        l();
        try {
            Object objNewInstance = b.newInstance(null);
            for (C4362iX c4362iX : c4171hX.a) {
                File fileE = HZ1.e(context);
                if (fileE == null) {
                    return null;
                }
                try {
                    if (!HZ1.c(fileE, resources, c4362iX.f)) {
                        return null;
                    }
                    if (!k(fileE.getPath(), c4362iX.c, c4362iX.b, objNewInstance)) {
                        return null;
                    }
                    fileE.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileE.delete();
                }
            }
            l();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) a, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) d.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // defpackage.GZ1
    public Typeface c(Context context, C5711lX[] c5711lXArr, int i) throws IOException {
        String str;
        if (c5711lXArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(f(i, c5711lXArr).a, "r", null);
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
                Typeface typefaceD = d(context, fileInputStream);
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceD;
            } finally {
            }
        } catch (IOException unused2) {
            return null;
        }
    }
}
