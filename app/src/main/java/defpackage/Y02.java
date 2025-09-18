package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class Y02 {
    public static Uri a(File file, File file2) throws C7730w60 {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return Uri.fromFile(file2);
        }
        throw new C7730w60("Failed to overwrite the file: " + file2.getAbsolutePath(), null);
    }

    public static File b(VH vh) throws C7730w60 {
        try {
            File file = (File) vh.b;
            if (file == null) {
                return File.createTempFile("CameraX", ".tmp");
            }
            String parent = file.getParent();
            StringBuilder sb = new StringBuilder("CameraX");
            sb.append(UUID.randomUUID().toString());
            String name = file.getName();
            int iLastIndexOf = name.lastIndexOf(46);
            sb.append(iLastIndexOf >= 0 ? name.substring(iLastIndexOf) : "");
            return new File(parent, sb.toString());
        } catch (IOException e) {
            throw new C7730w60("Failed to create temp file.", e);
        }
    }

    public static void c(File file, VH vh) {
        try {
            try {
                vh.getClass();
                File file2 = (File) vh.b;
                if (file2 != null) {
                    Objects.requireNonNull(file2);
                    a(file, file2);
                }
            } catch (IOException unused) {
                throw new C7730w60("Failed to write to OutputStream.", null);
            }
        } finally {
            file.delete();
        }
    }

    public abstract void d(int i, String str);

    public abstract void f(Exception exc);

    public abstract void h(String str);

    public void g(MN0 mn0, C0674Ik c0674Ik) {
    }

    public void i(InterfaceC0214Cm1 interfaceC0214Cm1, HS0 hs0) {
    }

    public void e(MN0 mn0, int i, String str) {
    }
}
