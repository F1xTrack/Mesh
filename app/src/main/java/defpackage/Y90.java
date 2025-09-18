package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class Y90 extends IOException {
    public K0 a;

    public Y90(String str) {
        super(str);
        this.a = null;
    }

    public static Y90 a() {
        return new Y90("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
