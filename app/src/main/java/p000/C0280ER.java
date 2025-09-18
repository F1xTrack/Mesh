package p000;

import java.util.Collections;

/* renamed from: ER */
/* loaded from: classes.dex */
public final class C0280ER {

    /* renamed from: a */
    public static volatile C0280ER f2698a;

    /* renamed from: b */
    public static final C0280ER f2699b;

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        C0280ER c0280er = new C0280ER();
        Collections.emptyMap();
        f2699b = c0280er;
    }

    /* renamed from: a */
    public static C0280ER m2269a() {
        C0280ER c0280er = f2698a;
        if (c0280er == null) {
            synchronized (C0280ER.class) {
                try {
                    c0280er = f2698a;
                    if (c0280er == null) {
                        Class cls = AbstractC0028AR.f191a;
                        if (cls != null) {
                            try {
                                c0280er = (C0280ER) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                            f2698a = c0280er;
                        } else {
                            c0280er = f2699b;
                            f2698a = c0280er;
                        }
                    }
                } finally {
                }
            }
        }
        return c0280er;
    }
}
