package defpackage;

import android.os.Build;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: a12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2055a12 {
    public static boolean a(String str) {
        HashSet hashSet = new HashSet();
        for (EnumC0993Mm1 enumC0993Mm1 : EnumC0993Mm1.values()) {
            hashSet.add(enumC0993Mm1);
        }
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            EnumC0993Mm1 enumC0993Mm12 = (EnumC0993Mm1) it.next();
            if (enumC0993Mm12.a.equals(str)) {
                hashSet2.add(enumC0993Mm12);
            }
        }
        if (hashSet2.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            EnumC0993Mm1 enumC0993Mm13 = (EnumC0993Mm1) it2.next();
            int i = enumC0993Mm13.c;
            if ((i != -1 && Build.VERSION.SDK_INT >= i) || enumC0993Mm13.a()) {
                return true;
            }
        }
        return false;
    }

    public static void b(File file) throws C3971gU {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            if (!file.delete()) {
                String absolutePath = file.getAbsolutePath();
                C6353ou c6353ou = new C6353ou(file.getAbsolutePath());
                C3971gU c3971gU = new C3971gU(absolutePath);
                c3971gU.initCause(c6353ou);
                throw c3971gU;
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new C3971gU(file.getAbsolutePath());
        }
    }

    public static void c(File file, File file2) {
        file.getClass();
        file2.delete();
        if (file.renameTo(file2)) {
            return;
        }
        Throwable fileNotFoundException = !file2.exists() ? file.getParentFile().exists() ? !file.exists() ? new FileNotFoundException(file.getAbsolutePath()) : null : new C4162hU(file.getAbsolutePath()) : new C6353ou(file2.getAbsolutePath());
        C4353iU c4353iU = new C4353iU("Unknown error renaming " + file.getAbsolutePath() + " to " + file2.getAbsolutePath());
        c4353iU.initCause(fileNotFoundException);
        throw c4353iU;
    }
}
