package defpackage;

/* loaded from: classes.dex */
public final class JG1 {
    public static final FG1 a(Object obj, Object obj2) {
        FG1 fg1E = (FG1) obj;
        FG1 fg1 = (FG1) obj2;
        if (!fg1.isEmpty()) {
            if (!fg1E.a) {
                fg1E = fg1E.e();
            }
            fg1E.l();
            if (!fg1.isEmpty()) {
                fg1E.putAll(fg1);
            }
        }
        return fg1E;
    }
}
