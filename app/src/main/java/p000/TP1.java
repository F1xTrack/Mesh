package p000;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes.dex */
public abstract class TP1 {
    /* renamed from: a */
    public static Field m7689a(Class cls, Class cls2, String str) throws NoSuchFieldException, SecurityException {
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

    /* renamed from: b */
    public static String m7690b(D40 d40) {
        O90.m5968f(d40, "url");
        C0551Ik c0551Ik = C0551Ik.f5116d;
        return C1210TE.m7631D(d40.f1835h).mo3982b("MD5").mo3984d();
    }

    /* renamed from: c */
    public static int m7691c(C11917zN0 c11917zN0) throws IOException {
        try {
            long jM26392x = c11917zN0.m26392x();
            String strM26384W = c11917zN0.m26384W(Long.MAX_VALUE);
            if (jM26392x >= 0 && jM26392x <= 2147483647L && strM26384W.length() <= 0) {
                return (int) jM26392x;
            }
            throw new IOException("expected an int but was \"" + jM26392x + strM26384W + '\"');
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* renamed from: d */
    public static Set m7692d(K20 k20) {
        int size = k20.size();
        TreeSet treeSet = null;
        for (int i = 0; i < size; i++) {
            if ("Vary".equalsIgnoreCase(k20.m4525d(i))) {
                String strM4528q = k20.m4528q(i);
                if (treeSet == null) {
                    Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                    O90.m5967e(comparator, "CASE_INSENSITIVE_ORDER");
                    treeSet = new TreeSet(comparator);
                }
                Iterator it = AbstractC11374v51.m25341P(strM4528q, new char[]{','}).iterator();
                while (it.hasNext()) {
                    treeSet.add(AbstractC11374v51.m25350Y((String) it.next()).toString());
                }
            }
        }
        return treeSet == null ? C1156SN.f10705a : treeSet;
    }
}
