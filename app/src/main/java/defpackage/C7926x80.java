package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import java.util.Objects;

/* renamed from: x80, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7926x80 {
    public final InputConfiguration a;

    public C7926x80(InputConfiguration inputConfiguration) {
        this.a = inputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7926x80)) {
            return false;
        }
        return Objects.equals(this.a, ((C7926x80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
