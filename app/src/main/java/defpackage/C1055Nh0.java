package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* renamed from: Nh0 */
/* loaded from: classes2.dex */
public final class C1055Nh0 {
    public final boolean a;
    public final List b;

    public C1055Nh0(boolean z) {
        this.b = Collections.synchronizedList(new ArrayList());
        this.a = z;
    }

    public CameraCaptureSession.CaptureCallback a(CameraCaptureSession.CaptureCallback captureCallback) {
        if (!this.a) {
            return captureCallback;
        }
        C5947mm c5947mm = new C5947mm(3);
        List list = this.b;
        C0599Hl c0599Hl = (C0599Hl) c5947mm.b;
        list.add(c0599Hl);
        c0599Hl.b.d(new RunnableC1313Qp0(this, c5947mm, c0599Hl, 6), QR1.a());
        return new C0446Fm(Arrays.asList(c5947mm, captureCallback));
    }

    public InterfaceFutureC0750Jj0 b() {
        List list = this.b;
        if (list.isEmpty()) {
            return F70.c;
        }
        C8227yj0 c8227yj0Q = AbstractC1500Sz1.q(new ArrayList(list));
        C0680Im c0680Im = new C0680Im(7);
        return AbstractC1500Sz1.l(AbstractC1500Sz1.r(c8227yj0Q, new C0136Bm1(20, c0680Im), QR1.a()));
    }

    public void c() {
        LinkedList linkedList = new LinkedList(this.b);
        while (!linkedList.isEmpty()) {
            InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0 = (InterfaceFutureC0750Jj0) linkedList.poll();
            Objects.requireNonNull(interfaceFutureC0750Jj0);
            interfaceFutureC0750Jj0.cancel(true);
        }
    }

    public C1055Nh0(List list, boolean z) {
        this.b = list;
        this.a = z;
    }
}
