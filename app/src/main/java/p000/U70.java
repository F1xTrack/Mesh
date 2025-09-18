package p000;

import java.util.Objects;

/* loaded from: classes.dex */
public final class U70 extends I70 {
    @Override // p000.I70
    /* renamed from: c */
    public final I70 mo3757c(Object obj) {
        obj.getClass();
        m3755a(obj);
        return this;
    }

    /* renamed from: h */
    public final V70 m7918h() {
        int i = this.f4701b;
        if (i == 0) {
            int i2 = V70.f12378c;
            return C10135lQ0.f37051j;
        }
        if (i != 1) {
            V70 v70M8307t = V70.m8307t(i, this.f4700a);
            this.f4701b = v70M8307t.size();
            this.f4702c = true;
            return v70M8307t;
        }
        Object obj = this.f4700a[0];
        Objects.requireNonNull(obj);
        int i3 = V70.f12378c;
        return new Y11(obj);
    }
}
