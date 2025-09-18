package p000;

import android.util.Pair;
import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* renamed from: PR */
/* loaded from: classes.dex */
public final class C0972PR implements InterfaceC10298mh1 {

    /* renamed from: b */
    public final QQ0 f9070b;

    /* renamed from: c */
    public final G10 f9071c;

    /* renamed from: d */
    public final C7978Mu0 f9072d;

    public C0972PR(InterfaceC7331Ai1 interfaceC7331Ai1) {
        this.f9070b = new QQ0(interfaceC7331Ai1);
        this.f9071c = new G10(24, interfaceC7331Ai1);
        this.f9072d = new C7978Mu0(19, interfaceC7331Ai1);
    }

    @Override // p000.InterfaceC10298mh1
    /* renamed from: a */
    public final InterfaceC6854sw mo6364a(EnumC10170lh1 enumC10170lh1, int i) {
        C7612Ft0 c7612Ft0M2813c;
        int iOrdinal = enumC10170lh1.ordinal();
        if (iOrdinal == 0) {
            QQ0 qq0 = this.f9070b;
            C9327f60 c9327f60 = new C9327f60(1);
            List listMo291a = ((InterfaceC7331Ai1) qq0.f9619a).mo291a();
            C0480Hc c0480Hc = Y60.f14166H0;
            C7612Ft0 c7612Ft0 = c9327f60.f27076b;
            c7612Ft0.m2815e(c0480Hc, listMo291a);
            c7612Ft0.m2815e(InterfaceC9914jh1.f35331b1, Boolean.TRUE);
            c7612Ft0M2813c = C7612Ft0.m2813c(c9327f60.m18190e());
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        return null;
                    }
                    throw new IllegalArgumentException("Should not go here. VideoCapture is supported by recording the preview stream when Extension is enabled.");
                }
                C7978Mu0 c7978Mu0 = this.f9072d;
                C9327f60 c9327f602 = new C9327f60(0);
                Size[] sizeArrMo296f = ((InterfaceC7331Ai1) c7978Mu0.f7393b).mo296f();
                ArrayList arrayList = new ArrayList();
                if (sizeArrMo296f.length > 0) {
                    arrayList.add(new Pair(35, sizeArrMo296f));
                }
                c9327f602.f27076b.m2815e(Y60.f14166H0, arrayList);
                C10351n60 c10351n60M18189b = c9327f602.m18189b();
                List<Pair> listM8931d = X60.m8931d(c10351n60M18189b);
                if (listM8931d != null) {
                    for (Pair pair : listM8931d) {
                        int iIntValue = ((Integer) pair.first).intValue();
                        Size[] sizeArr = (Size[]) pair.second;
                        if (iIntValue == 35 && sizeArr != null && sizeArr.length > 0) {
                            c7612Ft0M2813c = C7612Ft0.m2813c(c10351n60M18189b);
                        }
                    }
                }
                throw new IllegalArgumentException("ImageAnalysis is not supported when Extension is enabled on this device. Check ExtensionsManager.isImageAnalysisSupported before binding the ImageAnalysis use case.");
            }
            G10 g10 = this.f9071c;
            C9327f60 c9327f603 = new C9327f60(2);
            List listMo292b = ((InterfaceC7331Ai1) g10.f3531b).mo292b();
            C0480Hc c0480Hc2 = Y60.f14166H0;
            C7612Ft0 c7612Ft02 = c9327f603.f27076b;
            c7612Ft02.m2815e(c0480Hc2, listMo292b);
            c7612Ft02.m2815e(InterfaceC9914jh1.f35331b1, Boolean.TRUE);
            c7612Ft0M2813c = C7612Ft0.m2813c(c9327f603.m18191f());
        }
        c7612Ft0M2813c.m2815e(InterfaceC9914jh1.f35330a1, Boolean.TRUE);
        return C7882Ky0.m4786a(c7612Ft0M2813c);
    }
}
