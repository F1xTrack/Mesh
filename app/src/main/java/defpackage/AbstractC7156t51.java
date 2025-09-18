package defpackage;

import java.util.regex.Pattern;

/* renamed from: t51, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC7156t51 {
    public static final Object a;

    static {
        Pattern.compile("\\s+");
        Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        try {
            Class<?> clsLoadClass = Thread.currentThread().getContextClassLoader().loadClass("java.text.Normalizer$Form");
            a = clsLoadClass.getField("NFD").get(null);
            Thread.currentThread().getContextClassLoader().loadClass("java.text.Normalizer").getMethod("normalize", CharSequence.class, clsLoadClass);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException unused) {
        }
        try {
            Thread.currentThread().getContextClassLoader().loadClass("sun.text.Normalizer").getMethod("decompose", String.class, Boolean.TYPE, Integer.TYPE);
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
        }
    }
}
