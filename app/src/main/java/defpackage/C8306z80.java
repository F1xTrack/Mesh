package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;

/* renamed from: z80, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8306z80 {
    public final C7926x80 a;

    public C8306z80(C7926x80 c7926x80) {
        this.a = c7926x80;
    }

    public static C8306z80 a(InputConfiguration inputConfiguration) {
        if (inputConfiguration == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new C8306z80(new C8116y80(inputConfiguration)) : new C8306z80(new C7926x80(inputConfiguration));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8306z80)) {
            return false;
        }
        return this.a.equals(((C8306z80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
