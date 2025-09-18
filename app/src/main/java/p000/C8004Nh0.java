package p000;

import android.hardware.camera2.CameraCaptureSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* renamed from: Nh0 */
/* loaded from: classes2.dex */
public final class C8004Nh0 {

    /* renamed from: a */
    public final boolean f7958a;

    /* renamed from: b */
    public final List f7959b;

    public C8004Nh0(boolean z) {
        this.f7959b = Collections.synchronizedList(new ArrayList());
        this.f7958a = z;
    }

    /* renamed from: a */
    public CameraCaptureSession.CaptureCallback m5814a(CameraCaptureSession.CaptureCallback captureCallback) {
        if (!this.f7958a) {
            return captureCallback;
        }
        C6447mm c6447mm = new C6447mm(3);
        List list = this.f7959b;
        C0489Hl c0489Hl = (C0489Hl) c6447mm.f37864b;
        list.add(c0489Hl);
        c0489Hl.f4484b.mo2494d(new RunnableC8176Qp0(this, c6447mm, c0489Hl, 6), QR1.m6703a());
        return new C0364Fm(Arrays.asList(c6447mm, captureCallback));
    }

    /* renamed from: b */
    public InterfaceFutureC7800Jj0 m5815b() {
        List list = this.f7959b;
        if (list.isEmpty()) {
            return F70.f3069c;
        }
        C11834yj0 c11834yj0M7494q = AbstractC8301Sz1.m7494q(new ArrayList(list));
        C0553Im c0553Im = new C0553Im(7);
        return AbstractC8301Sz1.m7489l(AbstractC8301Sz1.m7495r(c11834yj0M7494q, new C7391Bm1(20, c0553Im), QR1.m6703a()));
    }

    /* renamed from: c */
    public void m5816c() {
        LinkedList linkedList = new LinkedList(this.f7959b);
        while (!linkedList.isEmpty()) {
            InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0 = (InterfaceFutureC7800Jj0) linkedList.poll();
            Objects.requireNonNull(interfaceFutureC7800Jj0);
            interfaceFutureC7800Jj0.cancel(true);
        }
    }

    public C8004Nh0(List list, boolean z) {
        this.f7959b = list;
        this.f7958a = z;
    }
}
