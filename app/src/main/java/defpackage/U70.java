package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class U70 extends I70 {
    @Override // defpackage.I70
    public final I70 c(Object obj) {
        obj.getClass();
        a(obj);
        return this;
    }

    public final V70 h() {
        int i = this.b;
        if (i == 0) {
            int i2 = V70.c;
            return C5691lQ0.j;
        }
        if (i != 1) {
            V70 v70T = V70.t(i, this.a);
            this.b = v70T.size();
            this.c = true;
            return v70T;
        }
        Object obj = this.a[0];
        Objects.requireNonNull(obj);
        int i3 = V70.c;
        return new Y11(obj);
    }
}
