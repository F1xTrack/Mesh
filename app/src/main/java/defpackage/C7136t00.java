package defpackage;

/* renamed from: t00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7136t00 implements InterfaceC4294iA0 {
    static {
        if (CR.a == null) {
            synchronized (CR.class) {
                try {
                    if (CR.a == null) {
                        Class cls = AbstractC8362zR.a;
                        CR cr = null;
                        if (cls != null) {
                            try {
                                cr = (CR) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (cr == null) {
                            cr = CR.b;
                        }
                        CR.a = cr;
                    }
                } finally {
                }
            }
        }
    }
}
