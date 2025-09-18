package p000;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class Y02 {
    /* renamed from: a */
    public static Uri m9202a(File file, File file2) throws C11502w60 {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return Uri.fromFile(file2);
        }
        throw new C11502w60("Failed to overwrite the file: " + file2.getAbsolutePath(), null);
    }

    /* renamed from: b */
    public static File m9203b(C1339VH c1339vh) throws C11502w60 {
        try {
            File file = (File) c1339vh.f12486b;
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
            throw new C11502w60("Failed to create temp file.", e);
        }
    }

    /* renamed from: c */
    public static void m9204c(File file, C1339VH c1339vh) {
        try {
            try {
                c1339vh.getClass();
                File file2 = (File) c1339vh.f12486b;
                if (file2 != null) {
                    Objects.requireNonNull(file2);
                    m9202a(file, file2);
                }
            } catch (IOException unused) {
                throw new C11502w60("Failed to write to OutputStream.", null);
            }
        } finally {
            file.delete();
        }
    }

    /* renamed from: d */
    public abstract void mo2415d(int i, String str);

    /* renamed from: f */
    public abstract void mo2417f(Exception exc);

    /* renamed from: h */
    public abstract void mo2419h(String str);

    /* renamed from: g */
    public void mo2418g(MN0 mn0, C0551Ik c0551Ik) {
    }

    /* renamed from: i */
    public void mo2420i(InterfaceC7443Cm1 interfaceC7443Cm1, HS0 hs0) {
    }

    /* renamed from: e */
    public void mo2416e(MN0 mn0, int i, String str) {
    }
}
