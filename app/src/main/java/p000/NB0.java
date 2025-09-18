package p000;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* loaded from: classes.dex */
public final class NB0 {

    /* renamed from: a */
    public final String f7538a;

    /* renamed from: b */
    public final MB0 f7539b;

    /* renamed from: c */
    public final Object f7540c;

    static {
        if (AbstractC7485Dh1.f2166a < 31) {
            new NB0("");
        } else {
            new NB0(MB0.f7031b, "");
        }
    }

    public NB0(String str) {
        YN1.m9281f(AbstractC7485Dh1.f2166a < 31);
        this.f7538a = str;
        this.f7539b = null;
        this.f7540c = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NB0)) {
            return false;
        }
        NB0 nb0 = (NB0) obj;
        return Objects.equals(this.f7538a, nb0.f7538a) && Objects.equals(this.f7539b, nb0.f7539b) && Objects.equals(this.f7540c, nb0.f7540c);
    }

    public final int hashCode() {
        return Objects.hash(this.f7538a, this.f7539b, this.f7540c);
    }

    public NB0(LogSessionId logSessionId, String str) {
        this(new MB0(logSessionId), str);
    }

    public NB0(MB0 mb0, String str) {
        this.f7539b = mb0;
        this.f7538a = str;
        this.f7540c = new Object();
    }
}
