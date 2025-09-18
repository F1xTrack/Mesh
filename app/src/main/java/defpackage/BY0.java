package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class BY0 implements CY0 {
    public final List a;
    public final C0293Dn b;
    public final ExecutorC5715lY0 c;
    public final int d;
    public C8306z80 e = null;

    public BY0(int i, ArrayList arrayList, ExecutorC5715lY0 executorC5715lY0, C0293Dn c0293Dn) {
        this.d = i;
        this.a = Collections.unmodifiableList(new ArrayList(arrayList));
        this.b = c0293Dn;
        this.c = executorC5715lY0;
    }

    @Override // defpackage.CY0
    public final Object a() {
        return null;
    }

    @Override // defpackage.CY0
    public final C8306z80 b() {
        return this.e;
    }

    @Override // defpackage.CY0
    public final Executor c() {
        return this.c;
    }

    @Override // defpackage.CY0
    public final int d() {
        return this.d;
    }

    @Override // defpackage.CY0
    public final CameraCaptureSession.StateCallback e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BY0) {
            BY0 by0 = (BY0) obj;
            if (Objects.equals(this.e, by0.e) && this.d == by0.d) {
                List list = this.a;
                int size = list.size();
                List list2 = by0.a;
                if (size == list2.size()) {
                    for (int i = 0; i < list.size(); i++) {
                        if (!((C1808Wy0) list.get(i)).equals(list2.get(i))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.CY0
    public final List f() {
        return this.a;
    }

    @Override // defpackage.CY0
    public final void h(C8306z80 c8306z80) {
        if (this.d == 1) {
            throw new UnsupportedOperationException("Method not supported for high speed session types");
        }
        this.e = c8306z80;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 31;
        int i = (iHashCode << 5) - iHashCode;
        C8306z80 c8306z80 = this.e;
        int iHashCode2 = (c8306z80 == null ? 0 : c8306z80.a.hashCode()) ^ i;
        return this.d ^ ((iHashCode2 << 5) - iHashCode2);
    }

    @Override // defpackage.CY0
    public final void g(CaptureRequest captureRequest) {
    }
}
