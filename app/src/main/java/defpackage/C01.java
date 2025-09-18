package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class C01 {
    public ArrayList a;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C01)) {
            return false;
        }
        return O90.a(this.a, ((C01) obj).a);
    }
}
