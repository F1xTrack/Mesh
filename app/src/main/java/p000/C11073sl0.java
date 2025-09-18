package p000;

import java.util.logging.Level;

/* renamed from: sl0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11073sl0 implements InterfaceC11329ul0 {

    /* renamed from: a */
    public static final boolean f42584a;

    static {
        boolean z;
        try {
            Class.forName("android.util.Log");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f42584a = z;
    }

    @Override // p000.InterfaceC11329ul0
    /* renamed from: A */
    public final void mo7639A(Level level, String str, Throwable th) {
        if (level != Level.OFF) {
            level.intValue();
        }
    }

    @Override // p000.InterfaceC11329ul0
    /* renamed from: a */
    public final void mo7643a(Level level, String str) {
        if (level != Level.OFF) {
            level.intValue();
        }
    }
}
