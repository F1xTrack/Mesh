package p000;

import android.os.Build;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: a12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8671a12 {
    /* renamed from: a */
    public static boolean m9662a(String str) {
        HashSet hashSet = new HashSet();
        for (EnumC7963Mm1 enumC7963Mm1 : EnumC7963Mm1.values()) {
            hashSet.add(enumC7963Mm1);
        }
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            EnumC7963Mm1 enumC7963Mm12 = (EnumC7963Mm1) it.next();
            if (enumC7963Mm12.f7341a.equals(str)) {
                hashSet2.add(enumC7963Mm12);
            }
        }
        if (hashSet2.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            EnumC7963Mm1 enumC7963Mm13 = (EnumC7963Mm1) it2.next();
            int i = enumC7963Mm13.f7343c;
            if ((i != -1 && Build.VERSION.SDK_INT >= i) || enumC7963Mm13.m5435a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static void m9663b(File file) throws C4119gU {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            if (!file.delete()) {
                String absolutePath = file.getAbsolutePath();
                C6583ou c6583ou = new C6583ou(file.getAbsolutePath());
                C4119gU c4119gU = new C4119gU(absolutePath);
                c4119gU.initCause(c6583ou);
                throw c4119gU;
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new C4119gU(file.getAbsolutePath());
        }
    }

    /* renamed from: c */
    public static void m9664c(File file, File file2) {
        file.getClass();
        file2.delete();
        if (file.renameTo(file2)) {
            return;
        }
        Throwable fileNotFoundException = !file2.exists() ? file.getParentFile().exists() ? !file.exists() ? new FileNotFoundException(file.getAbsolutePath()) : null : new C4182hU(file.getAbsolutePath()) : new C6583ou(file2.getAbsolutePath());
        C4245iU c4245iU = new C4245iU("Unknown error renaming " + file.getAbsolutePath() + " to " + file2.getAbsolutePath());
        c4245iU.initCause(fileNotFoundException);
        throw c4245iU;
    }
}
