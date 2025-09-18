package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: oK0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC6246oK0 implements Callable {
    public final ZC a;
    public final Uri b;
    public final long c;
    public final /* synthetic */ C6818rK0 d;

    public CallableC6246oK0(C6818rK0 c6818rK0, ZC zc, Uri uri, long j) {
        this.d = c6818rK0;
        this.a = zc;
        this.b = uri;
        this.c = j * 1000;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        C6818rK0 c6818rK0 = this.d;
        ArrayList arrayList = new ArrayList();
        try {
            C6412pC c6412pCB = YY1.b(this.a, this.b);
            int size = c6412pCB.m.size();
            int i2 = 0;
            while (i2 < size) {
                MA0 ma0B = c6412pCB.b(i2);
                int i3 = 0;
                while (i3 < ma0B.c.size()) {
                    C3889g3 c3889g3 = (C3889g3) ma0B.c.get(i3);
                    int i4 = c3889g3.b;
                    List list = c3889g3.c;
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
                            AbstractC6458pR0 abstractC6458pR0 = (AbstractC6458pR0) list.get(i5);
                            C6666qX c6666qX = abstractC6458pR0.a;
                            c6818rK0.getClass();
                            if (C6818rK0.T(c6666qX)) {
                                i = i2;
                                if (abstractC6458pR0.c <= this.c) {
                                    break;
                                }
                                arrayList.add(C6818rK0.M(c6666qX, i5));
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
            AbstractC6864rZ1.e("ReactExoplayerView", "error in getVideoTrackInfoFromManifest:" + e.getMessage());
        }
        return null;
    }
}
