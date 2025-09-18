package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: tb1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11182tb1 {

    /* renamed from: a */
    public final C6573om f43158a;

    /* renamed from: b */
    public final C7560Et0 f43159b = new C7560Et0(0);

    /* renamed from: c */
    public final boolean f43160c;

    /* renamed from: d */
    public final ExecutorC10151lY0 f43161d;

    /* renamed from: e */
    public boolean f43162e;

    /* renamed from: f */
    public C0300El f43163f;

    /* renamed from: g */
    public boolean f43164g;

    public C11182tb1(C6573om c6573om, C0428Gn c0428Gn, ExecutorC10151lY0 executorC10151lY0) {
        this.f43158a = c6573om;
        this.f43161d = executorC10151lY0;
        this.f43160c = AbstractC9444g12.m18382b(new C0071B7(5, c0428Gn));
        c6573om.m23543a(new InterfaceC6510nm() { // from class: sb1
            @Override // p000.InterfaceC6510nm
            /* renamed from: c */
            public final boolean mo2326c(TotalCaptureResult totalCaptureResult) {
                C11182tb1 c11182tb1 = this.f42494a;
                if (c11182tb1.f43163f != null) {
                    Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
                    if ((num != null && num.intValue() == 2) == c11182tb1.f43164g) {
                        c11182tb1.f43163f.m2375b(null);
                        c11182tb1.f43163f = null;
                    }
                }
                return false;
            }
        });
    }

    /* renamed from: b */
    public static void m24944b(C7560Et0 c7560Et0, Integer num) {
        if (DV1.m1718c()) {
            c7560Et0.mo2439j(num);
        } else {
            c7560Et0.m2440k(num);
        }
    }

    /* renamed from: a */
    public final void m24945a(C0300El c0300El, boolean z) {
        if (!this.f43160c) {
            if (c0300El != null) {
                c0300El.m2377d(new IllegalStateException("No flash unit"));
                return;
            }
            return;
        }
        boolean z2 = this.f43162e;
        C7560Et0 c7560Et0 = this.f43159b;
        if (!z2) {
            m24944b(c7560Et0, 0);
            if (c0300El != null) {
                c0300El.m2377d(new C1434Wn("Camera is not active."));
                return;
            }
            return;
        }
        this.f43164g = z;
        this.f43158a.m23545c(z);
        m24944b(c7560Et0, Integer.valueOf(z ? 1 : 0));
        C0300El c0300El2 = this.f43163f;
        if (c0300El2 != null) {
            c0300El2.m2377d(new C1434Wn("There is a new enableTorch being set"));
        }
        this.f43163f = c0300El;
    }
}
