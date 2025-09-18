package p000;

/* loaded from: classes.dex */
public abstract class J12 {
    /* renamed from: a */
    public static int m4131a(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    /* renamed from: b */
    public static int m4132b(Object obj) {
        return m4131a(obj == null ? 0 : obj.hashCode());
    }

    /* renamed from: c */
    public static int m4133c(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }
}
