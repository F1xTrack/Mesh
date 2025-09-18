package p000;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;

/* renamed from: z80, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11887z80 {

    /* renamed from: a */
    public final C11633x80 f46643a;

    public C11887z80(C11633x80 c11633x80) {
        this.f46643a = c11633x80;
    }

    /* renamed from: a */
    public static C11887z80 m26311a(InputConfiguration inputConfiguration) {
        if (inputConfiguration == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new C11887z80(new C11760y80(inputConfiguration)) : new C11887z80(new C11633x80(inputConfiguration));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11887z80)) {
            return false;
        }
        return this.f46643a.equals(((C11887z80) obj).f46643a);
    }

    public final int hashCode() {
        return this.f46643a.hashCode();
    }

    public final String toString() {
        return this.f46643a.toString();
    }
}
