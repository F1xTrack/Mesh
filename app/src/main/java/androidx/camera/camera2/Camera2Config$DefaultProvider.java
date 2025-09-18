package androidx.camera.camera2;

import p000.C0480Hc;
import p000.C1686an;
import p000.C1807bn;
import p000.C7288zp;
import p000.C7612Ft0;
import p000.C7621Fx1;
import p000.C7882Ky0;
import p000.InterfaceC7225yp;

/* loaded from: classes.dex */
public final class Camera2Config$DefaultProvider implements InterfaceC7225yp {
    @Override // p000.InterfaceC7225yp
    public C7288zp getCameraXConfig() {
        C1686an c1686an = new C1686an();
        C1807bn c1807bn = new C1807bn();
        C1686an c1686an2 = new C1686an();
        C7621Fx1 c7621Fx1 = new C7621Fx1(7);
        C0480Hc c0480Hc = C7288zp.f47013b;
        C7612Ft0 c7612Ft0 = (C7612Ft0) c7621Fx1.f3494a;
        c7612Ft0.m2815e(c0480Hc, c1686an);
        c7612Ft0.m2815e(C7288zp.f47014c, c1807bn);
        c7612Ft0.m2815e(C7288zp.f47015d, c1686an2);
        return new C7288zp(C7882Ky0.m4786a(c7612Ft0));
    }
}
