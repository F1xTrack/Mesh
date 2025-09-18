package p000;

import android.hardware.camera2.params.InputConfiguration;
import java.util.Objects;

/* renamed from: x80, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C11633x80 {

    /* renamed from: a */
    public final InputConfiguration f45419a;

    public C11633x80(InputConfiguration inputConfiguration) {
        this.f45419a = inputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11633x80)) {
            return false;
        }
        return Objects.equals(this.f45419a, ((C11633x80) obj).f45419a);
    }

    public final int hashCode() {
        return this.f45419a.hashCode();
    }

    public final String toString() {
        return this.f45419a.toString();
    }
}
