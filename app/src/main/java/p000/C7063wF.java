package p000;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: wF */
/* loaded from: classes.dex */
public final class C7063wF implements InterfaceC1601ZR {

    /* renamed from: e */
    public static final int[] f44725e = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: f */
    public static final C4238iN f44726f = new C4238iN(new C6730rE(12));

    /* renamed from: g */
    public static final C4238iN f44727g = new C4238iN(new C6730rE(13));

    /* renamed from: a */
    public C9367fQ0 f44728a;

    /* renamed from: d */
    public int f44731d;

    /* renamed from: c */
    public C7408Bv0 f44730c = new C7408Bv0(12);

    /* renamed from: b */
    public boolean f44729b = true;

    @Override // p000.InterfaceC1601ZR
    /* renamed from: a */
    public final synchronized InterfaceC1412WR[] mo3133a(Uri uri, Map map) {
        InterfaceC1412WR[] interfaceC1412WRArr;
        try {
            int[] iArr = f44725e;
            ArrayList arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            int iM8907b = X02.m8907b((list == null || list.isEmpty()) ? null : (String) list.get(0));
            if (iM8907b != -1) {
                m25577b(iM8907b, arrayList);
            }
            int iM8908c = X02.m8908c(uri);
            if (iM8908c != -1 && iM8908c != iM8907b) {
                m25577b(iM8908c, arrayList);
            }
            for (int i = 0; i < 21; i++) {
                int i2 = iArr[i];
                if (i2 != iM8907b && i2 != iM8908c) {
                    m25577b(i2, arrayList);
                }
            }
            interfaceC1412WRArr = new InterfaceC1412WR[arrayList.size()];
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                InterfaceC1412WR c9456g61 = (InterfaceC1412WR) arrayList.get(i3);
                if (this.f44729b && !(c9456g61.mo737b() instanceof C0665KY) && !(c9456g61.mo737b() instanceof C8650Zs0) && !(c9456g61.mo737b() instanceof C9778id1) && !(c9456g61.mo737b() instanceof C4193hf) && !(c9456g61.mo737b() instanceof C11335uo0)) {
                    c9456g61 = new C9456g61(c9456g61, this.f44730c);
                }
                interfaceC1412WRArr[i3] = c9456g61;
            }
        } catch (Throwable th) {
            throw th;
        }
        return interfaceC1412WRArr;
    }

    /* renamed from: b */
    public final void m25577b(int i, ArrayList arrayList) {
        switch (i) {
            case 0:
                arrayList.add(new C6923u1());
                break;
            case 1:
                arrayList.add(new C7049w1());
                break;
            case 2:
                arrayList.add(new C6799s3());
                break;
            case 3:
                arrayList.add(new C1011Q3());
                break;
            case 4:
                InterfaceC1412WR interfaceC1412WRM19018w = f44726f.m19018w(0);
                if (interfaceC1412WRM19018w == null) {
                    arrayList.add(new C1101RV());
                    break;
                } else {
                    arrayList.add(interfaceC1412WRM19018w);
                    break;
                }
            case 5:
                arrayList.add(new C0096BW());
                break;
            case 6:
                arrayList.add(new C11335uo0(this.f44730c, this.f44729b ? 0 : 2));
                break;
            case 7:
                arrayList.add(new C8546Xs0());
                break;
            case 8:
                C7408Bv0 c7408Bv0 = this.f44730c;
                int i2 = this.f44729b ? 0 : 32;
                N70 n70 = P70.f8867b;
                arrayList.add(new C0665KY(c7408Bv0, i2, null, null, C9367fQ0.f27184e, null));
                arrayList.add(new C8650Zs0(this.f44730c, this.f44729b ? 0 : 16));
                break;
            case 9:
                arrayList.add(new C9689hx0());
                break;
            case 10:
                arrayList.add(new C9731iG0());
                break;
            case 11:
                if (this.f44728a == null) {
                    N70 n702 = P70.f8867b;
                    this.f44728a = C9367fQ0.f27184e;
                }
                arrayList.add(new C9778id1(1, !this.f44729b ? 1 : 0, this.f44730c, new C7783Ja1(0L), new C0986Pf(i, this.f44728a, 6)));
                break;
            case 12:
                C11841ym1 c11841ym1 = new C11841ym1();
                c11841ym1.f46447c = 0;
                c11841ym1.f46448d = -1L;
                c11841ym1.f46450f = -1;
                c11841ym1.f46451g = -1L;
                arrayList.add(c11841ym1);
                break;
            case 14:
                arrayList.add(new C6352lG(this.f44731d));
                break;
            case 15:
                InterfaceC1412WR interfaceC1412WRM19018w2 = f44727g.m19018w(new Object[0]);
                if (interfaceC1412WRM19018w2 != null) {
                    arrayList.add(interfaceC1412WRM19018w2);
                    break;
                }
                break;
            case 16:
                arrayList.add(new C4193hf(!this.f44729b ? 1 : 0, this.f44730c));
                break;
            case 17:
                arrayList.add(new C0360Fi(1));
                break;
            case 18:
                arrayList.add(new C6377lf(2));
                break;
            case 19:
                arrayList.add(new C0360Fi(0));
                break;
            case 20:
                arrayList.add(new C6377lf(1));
                break;
            case 21:
                arrayList.add(new C6377lf(0));
                break;
        }
    }
}
