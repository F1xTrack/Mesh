package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes.dex */
public abstract class TP1 {
    public static Field a(Class cls, Class cls2, String str) throws NoSuchFieldException, SecurityException {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException unused) {
            for (Field field : cls.getDeclaredFields()) {
                if (field.getType() == cls2) {
                    field.setAccessible(true);
                    return field;
                }
            }
            return null;
        }
    }

    public static String b(D40 d40) {
        O90.f(d40, "url");
        C0674Ik c0674Ik = C0674Ik.d;
        return TE.D(d40.h).b("MD5").d();
    }

    public static int c(C8351zN0 c8351zN0) throws IOException {
        try {
            long jX = c8351zN0.x();
            String strW = c8351zN0.W(Long.MAX_VALUE);
            if (jX >= 0 && jX <= 2147483647L && strW.length() <= 0) {
                return (int) jX;
            }
            throw new IOException("expected an int but was \"" + jX + strW + '\"');
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    public static Set d(K20 k20) {
        int size = k20.size();
        TreeSet treeSet = null;
        for (int i = 0; i < size; i++) {
            if ("Vary".equalsIgnoreCase(k20.d(i))) {
                String strQ = k20.q(i);
                if (treeSet == null) {
                    Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                    O90.e(comparator, "CASE_INSENSITIVE_ORDER");
                    treeSet = new TreeSet(comparator);
                }
                Iterator it = AbstractC7538v51.P(strQ, new char[]{','}).iterator();
                while (it.hasNext()) {
                    treeSet.add(AbstractC7538v51.Y((String) it.next()).toString());
                }
            }
        }
        return treeSet == null ? SN.a : treeSet;
    }
}
