package defpackage;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* loaded from: classes.dex */
public final class NB0 {
    public final String a;
    public final MB0 b;
    public final Object c;

    static {
        if (AbstractC0277Dh1.a < 31) {
            new NB0("");
        } else {
            new NB0(MB0.b, "");
        }
    }

    public NB0(String str) {
        YN1.f(AbstractC0277Dh1.a < 31);
        this.a = str;
        this.b = null;
        this.c = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NB0)) {
            return false;
        }
        NB0 nb0 = (NB0) obj;
        return Objects.equals(this.a, nb0.a) && Objects.equals(this.b, nb0.b) && Objects.equals(this.c, nb0.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public NB0(LogSessionId logSessionId, String str) {
        this(new MB0(logSessionId), str);
    }

    public NB0(MB0 mb0, String str) {
        this.b = mb0;
        this.a = str;
        this.c = new Object();
    }
}
