package p000;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class Y90 extends IOException {

    /* renamed from: a */
    public AbstractC0631K0 f14178a;

    public Y90(String str) {
        super(str);
        this.f14178a = null;
    }

    /* renamed from: a */
    public static Y90 m9227a() {
        return new Y90("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
