package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: tb1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7252tb1 {
    public final C6329om a;
    public final C0390Et0 b = new C0390Et0(0);
    public final boolean c;
    public final ExecutorC5715lY0 d;
    public boolean e;
    public C0365El f;
    public boolean g;

    public C7252tb1(C6329om c6329om, C0527Gn c0527Gn, ExecutorC5715lY0 executorC5715lY0) {
        this.a = c6329om;
        this.d = executorC5715lY0;
        this.c = AbstractC3884g12.b(new B7(5, c0527Gn));
        c6329om.a(new InterfaceC6138nm() { // from class: sb1
            @Override // defpackage.InterfaceC6138nm
            public final boolean c(TotalCaptureResult totalCaptureResult) {
                C7252tb1 c7252tb1 = this.a;
                if (c7252tb1.f != null) {
                    Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
                    if ((num != null && num.intValue() == 2) == c7252tb1.g) {
                        c7252tb1.f.b(null);
                        c7252tb1.f = null;
                    }
                }
                return false;
            }
        });
    }

    public static void b(C0390Et0 c0390Et0, Integer num) {
        if (DV1.c()) {
            c0390Et0.j(num);
        } else {
            c0390Et0.k(num);
        }
    }

    public final void a(C0365El c0365El, boolean z) {
        if (!this.c) {
            if (c0365El != null) {
                c0365El.d(new IllegalStateException("No flash unit"));
                return;
            }
            return;
        }
        boolean z2 = this.e;
        C0390Et0 c0390Et0 = this.b;
        if (!z2) {
            b(c0390Et0, 0);
            if (c0365El != null) {
                c0365El.d(new C1774Wn("Camera is not active."));
                return;
            }
            return;
        }
        this.g = z;
        this.a.c(z);
        b(c0390Et0, Integer.valueOf(z ? 1 : 0));
        C0365El c0365El2 = this.f;
        if (c0365El2 != null) {
            c0365El2.d(new C1774Wn("There is a new enableTorch being set"));
        }
        this.f = c0365El;
    }
}
