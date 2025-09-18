package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: wF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7756wF implements ZR {
    public static final int[] e = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final C4332iN f = new C4332iN(new C6799rE(12));
    public static final C4332iN g = new C4332iN(new C6799rE(13));
    public C3769fQ0 a;
    public int d;
    public C0162Bv0 c = new C0162Bv0(12);
    public boolean b = true;

    @Override // defpackage.ZR
    public final synchronized WR[] a(Uri uri, Map map) {
        WR[] wrArr;
        try {
            int[] iArr = e;
            ArrayList arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            int iB = X02.b((list == null || list.isEmpty()) ? null : (String) list.get(0));
            if (iB != -1) {
                b(iB, arrayList);
            }
            int iC = X02.c(uri);
            if (iC != -1 && iC != iB) {
                b(iC, arrayList);
            }
            for (int i = 0; i < 21; i++) {
                int i2 = iArr[i];
                if (i2 != iB && i2 != iC) {
                    b(i2, arrayList);
                }
            }
            wrArr = new WR[arrayList.size()];
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                WR c3901g61 = (WR) arrayList.get(i3);
                if (this.b && !(c3901g61.b() instanceof KY) && !(c3901g61.b() instanceof C2024Zs0) && !(c3901g61.b() instanceof C4382id1) && !(c3901g61.b() instanceof C4195hf) && !(c3901g61.b() instanceof C7481uo0)) {
                    c3901g61 = new C3901g61(c3901g61, this.c);
                }
                wrArr[i3] = c3901g61;
            }
        } catch (Throwable th) {
            throw th;
        }
        return wrArr;
    }

    public final void b(int i, ArrayList arrayList) {
        switch (i) {
            case 0:
                arrayList.add(new C7330u1());
                break;
            case 1:
                arrayList.add(new C7712w1());
                break;
            case 2:
                arrayList.add(new C6956s3());
                break;
            case 3:
                arrayList.add(new Q3());
                break;
            case 4:
                WR wrW = f.w(0);
                if (wrW == null) {
                    arrayList.add(new RV());
                    break;
                } else {
                    arrayList.add(wrW);
                    break;
                }
            case 5:
                arrayList.add(new BW());
                break;
            case 6:
                arrayList.add(new C7481uo0(this.c, this.b ? 0 : 2));
                break;
            case 7:
                arrayList.add(new C1868Xs0());
                break;
            case 8:
                C0162Bv0 c0162Bv0 = this.c;
                int i2 = this.b ? 0 : 32;
                N70 n70 = P70.b;
                arrayList.add(new KY(c0162Bv0, i2, null, null, C3769fQ0.e, null));
                arrayList.add(new C2024Zs0(this.c, this.b ? 0 : 16));
                break;
            case 9:
                arrayList.add(new C4250hx0());
                break;
            case 10:
                arrayList.add(new C4312iG0());
                break;
            case 11:
                if (this.a == null) {
                    N70 n702 = P70.b;
                    this.a = C3769fQ0.e;
                }
                arrayList.add(new C4382id1(1, !this.b ? 1 : 0, this.c, new C0724Ja1(0L), new C1204Pf(i, this.a, 6)));
                break;
            case 12:
                C8237ym1 c8237ym1 = new C8237ym1();
                c8237ym1.c = 0;
                c8237ym1.d = -1L;
                c8237ym1.f = -1;
                c8237ym1.g = -1L;
                arrayList.add(c8237ym1);
                break;
            case 14:
                arrayList.add(new C5660lG(this.d));
                break;
            case 15:
                WR wrW2 = g.w(new Object[0]);
                if (wrW2 != null) {
                    arrayList.add(wrW2);
                    break;
                }
                break;
            case 16:
                arrayList.add(new C4195hf(!this.b ? 1 : 0, this.c));
                break;
            case 17:
                arrayList.add(new C0434Fi(1));
                break;
            case 18:
                arrayList.add(new C5735lf(2));
                break;
            case 19:
                arrayList.add(new C0434Fi(0));
                break;
            case 20:
                arrayList.add(new C5735lf(1));
                break;
            case 21:
                arrayList.add(new C5735lf(0));
                break;
        }
    }
}
