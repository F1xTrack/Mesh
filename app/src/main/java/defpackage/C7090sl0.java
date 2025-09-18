package defpackage;

import java.util.logging.Level;

/* renamed from: sl0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7090sl0 implements InterfaceC7472ul0 {
    public static final boolean a;

    static {
        boolean z;
        try {
            Class.forName("android.util.Log");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
    }

    @Override // defpackage.InterfaceC7472ul0
    public final void A(Level level, String str, Throwable th) {
        if (level != Level.OFF) {
            level.intValue();
        }
    }

    @Override // defpackage.InterfaceC7472ul0
    public final void a(Level level, String str) {
        if (level != Level.OFF) {
            level.intValue();
        }
    }
}
