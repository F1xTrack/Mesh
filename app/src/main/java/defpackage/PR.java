package defpackage;

import android.util.Pair;
import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class PR implements InterfaceC5934mh1 {
    public final QQ0 b;
    public final G10 c;
    public final C1016Mu0 d;

    public PR(InterfaceC0046Ai1 interfaceC0046Ai1) {
        this.b = new QQ0(interfaceC0046Ai1);
        this.c = new G10(24, interfaceC0046Ai1);
        this.d = new C1016Mu0(19, interfaceC0046Ai1);
    }

    @Override // defpackage.InterfaceC5934mh1
    public final InterfaceC7122sw a(EnumC5743lh1 enumC5743lh1, int i) {
        C0468Ft0 c0468Ft0C;
        int iOrdinal = enumC5743lh1.ordinal();
        if (iOrdinal == 0) {
            QQ0 qq0 = this.b;
            C3709f60 c3709f60 = new C3709f60(1);
            List listA = ((InterfaceC0046Ai1) qq0.a).a();
            C0572Hc c0572Hc = Y60.H0;
            C0468Ft0 c0468Ft0 = c3709f60.b;
            c0468Ft0.e(c0572Hc, listA);
            c0468Ft0.e(InterfaceC5361jh1.b1, Boolean.TRUE);
            c0468Ft0C = C0468Ft0.c(c3709f60.e());
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        return null;
                    }
                    throw new IllegalArgumentException("Should not go here. VideoCapture is supported by recording the preview stream when Extension is enabled.");
                }
                C1016Mu0 c1016Mu0 = this.d;
                C3709f60 c3709f602 = new C3709f60(0);
                Size[] sizeArrF = ((InterfaceC0046Ai1) c1016Mu0.b).f();
                ArrayList arrayList = new ArrayList();
                if (sizeArrF.length > 0) {
                    arrayList.add(new Pair(35, sizeArrF));
                }
                c3709f602.b.e(Y60.H0, arrayList);
                C6013n60 c6013n60B = c3709f602.b();
                List<Pair> listD = X60.d(c6013n60B);
                if (listD != null) {
                    for (Pair pair : listD) {
                        int iIntValue = ((Integer) pair.first).intValue();
                        Size[] sizeArr = (Size[]) pair.second;
                        if (iIntValue == 35 && sizeArr != null && sizeArr.length > 0) {
                            c0468Ft0C = C0468Ft0.c(c6013n60B);
                        }
                    }
                }
                throw new IllegalArgumentException("ImageAnalysis is not supported when Extension is enabled on this device. Check ExtensionsManager.isImageAnalysisSupported before binding the ImageAnalysis use case.");
            }
            G10 g10 = this.c;
            C3709f60 c3709f603 = new C3709f60(2);
            List listB = ((InterfaceC0046Ai1) g10.b).b();
            C0572Hc c0572Hc2 = Y60.H0;
            C0468Ft0 c0468Ft02 = c3709f603.b;
            c0468Ft02.e(c0572Hc2, listB);
            c0468Ft02.e(InterfaceC5361jh1.b1, Boolean.TRUE);
            c0468Ft0C = C0468Ft0.c(c3709f603.f());
        }
        c0468Ft0C.e(InterfaceC5361jh1.a1, Boolean.TRUE);
        return C0873Ky0.a(c0468Ft0C);
    }
}
