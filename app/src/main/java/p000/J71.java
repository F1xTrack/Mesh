package p000;

import android.os.Build;
import com.facebook.soloader.SoLoader;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Stack;

/* loaded from: classes.dex */
public abstract class J71 {
    /* renamed from: a */
    public static void m4166a(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.canWrite() && !parentFile.setWritable(true)) {
            parentFile.toString();
        }
        if (!file.delete() && file.exists()) {
            throw new IOException(AbstractC1374Vq.m8588g(file, "Could not delete file "));
        }
    }

    /* renamed from: b */
    public static void m4167b(File file) throws IOException {
        Stack stack = new Stack();
        stack.push(file);
        ArrayList arrayList = new ArrayList();
        while (!stack.isEmpty()) {
            File file2 = (File) stack.pop();
            if (file2.isDirectory()) {
                arrayList.add(file2);
                File[] fileArrListFiles = file2.listFiles();
                if (fileArrListFiles != null) {
                    for (File file3 : fileArrListFiles) {
                        stack.push(file3);
                    }
                }
            } else {
                m4166a(file2);
            }
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m4166a((File) arrayList.get(size));
        }
    }

    /* renamed from: c */
    public static void m4168c(File file) throws IOException {
        Stack stack = new Stack();
        stack.push(file);
        while (!stack.isEmpty()) {
            File file2 = (File) stack.pop();
            if (file2.isDirectory()) {
                File[] fileArrListFiles = file2.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException(AbstractC1374Vq.m8588g(file2, "cannot list directory "));
                }
                for (File file3 : fileArrListFiles) {
                    stack.push(file3);
                }
            } else if (file2.getPath().endsWith("_lock")) {
                continue;
            } else {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "r");
                    try {
                        randomAccessFile.getFD().sync();
                        randomAccessFile.close();
                    } catch (Throwable th) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    file2.toString();
                    e.getMessage();
                }
            }
        }
    }

    /* renamed from: d */
    public static C1482XY m4169d(File file, File file2) throws Throwable {
        boolean z;
        try {
            return new C1482XY(file2);
        } catch (FileNotFoundException e) {
            z = true;
            try {
                if (!file.setWritable(true)) {
                    throw e;
                }
                C1482XY c1482xy = new C1482XY(file2);
                if (!file.setWritable(false)) {
                    file.getCanonicalPath();
                }
                return c1482xy;
            } catch (Throwable th) {
                th = th;
                if (z && !file.setWritable(false)) {
                    file.getCanonicalPath();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
            if (z) {
                file.getCanonicalPath();
            }
            throw th;
        }
    }

    @InterfaceC0902OK
    public static String getClassLoaderLdLoadLibrary() throws NoSuchMethodException, SecurityException {
        ClassLoader classLoader = SoLoader.class.getClassLoader();
        if (classLoader == null || (classLoader instanceof BaseDexClassLoader)) {
            try {
                return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", null).invoke((BaseDexClassLoader) classLoader, null);
            } catch (Exception unused) {
                return null;
            }
        }
        throw new IllegalStateException("ClassLoader " + classLoader.getClass().getName() + " should be of type BaseDexClassLoader");
    }

    @InterfaceC0902OK
    public static Method getNativeLoadRuntimeMethod() {
        if (Build.VERSION.SDK_INT > 27) {
            return null;
        }
        try {
            Method declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", String.class, ClassLoader.class, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Exception unused) {
            return null;
        }
    }
}
