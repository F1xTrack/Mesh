package p000;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: oK0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC10507oK0 implements Callable {

    /* renamed from: a */
    public final InterfaceC1586ZC f38954a;

    /* renamed from: b */
    public final Uri f38955b;

    /* renamed from: c */
    public final long f38956c;

    /* renamed from: d */
    public final /* synthetic */ C10891rK0 f38957d;

    public CallableC10507oK0(C10891rK0 c10891rK0, InterfaceC1586ZC interfaceC1586ZC, Uri uri, long j) {
        this.f38957d = c10891rK0;
        this.f38954a = interfaceC1586ZC;
        this.f38955b = uri;
        this.f38956c = j * 1000;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        C10891rK0 c10891rK0 = this.f38957d;
        ArrayList arrayList = new ArrayList();
        try {
            C6602pC c6602pCM9309b = YY1.m9309b(this.f38954a, this.f38955b);
            int size = c6602pCM9309b.f39909m.size();
            int i2 = 0;
            while (i2 < size) {
                MA0 ma0M23640b = c6602pCM9309b.m23640b(i2);
                int i3 = 0;
                while (i3 < ma0M23640b.f7015c.size()) {
                    C4092g3 c4092g3 = (C4092g3) ma0M23640b.f7015c.get(i3);
                    int i4 = c4092g3.f27534b;
                    List list = c4092g3.f27535c;
                    if (i4 != 2) {
                        i = i2;
                    } else {
                        int i5 = 0;
                        boolean z = false;
                        while (true) {
                            if (i5 >= list.size()) {
                                i = i2;
                                break;
                            }
                            AbstractC10649pR0 abstractC10649pR0 = (AbstractC10649pR0) list.get(i5);
                            C6686qX c6686qX = abstractC10649pR0.f40076a;
                            c10891rK0.getClass();
                            if (C10891rK0.m24291T(c6686qX)) {
                                i = i2;
                                if (abstractC10649pR0.f40078c <= this.f38956c) {
                                    break;
                                }
                                arrayList.add(C10891rK0.m24289M(c6686qX, i5));
                                z = true;
                            } else {
                                i = i2;
                            }
                            i5++;
                            i2 = i;
                        }
                        if (z) {
                            return arrayList;
                        }
                    }
                    i3++;
                    i2 = i;
                }
                i2++;
            }
        } catch (Exception e) {
            AbstractC10922rZ1.m24431e("ReactExoplayerView", "error in getVideoTrackInfoFromManifest:" + e.getMessage());
        }
        return null;
    }
}
