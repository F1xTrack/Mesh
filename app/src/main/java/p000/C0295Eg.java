package p000;

import android.net.wifi.ScanResult;
import android.util.Size;
import android.view.View;
import com.p018my.tracker.obfuscated.C2309e0;
import com.swmansion.reanimated.layoutReanimation.SharedTransitionManager;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: Eg */
/* loaded from: classes.dex */
public final /* synthetic */ class C0295Eg implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ int f2835a;

    public /* synthetic */ C0295Eg(int i) {
        this.f2835a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean z;
        switch (this.f2835a) {
            case 0:
                return ((C6686qX) obj2).f40970i - ((C6686qX) obj).f40970i;
            case 1:
                C0735Lg c0735Lg = (C0735Lg) obj;
                C0735Lg c0735Lg2 = (C0735Lg) obj2;
                int iCompare = Integer.compare(c0735Lg.f6794c, c0735Lg2.f6794c);
                return iCompare != 0 ? iCompare : c0735Lg.f6793b.compareTo(c0735Lg2.f6793b);
            case 2:
                return Integer.compare(((C0557Iq) obj2).f5168b, ((C0557Iq) obj).f5168b);
            case 3:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 4:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 5:
                String name = ((File) obj).getName();
                int i = C1458XA.f13585f;
                return name.substring(0, i).compareTo(((File) obj2).getName().substring(0, i));
            case 6:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 7:
                return Integer.compare(((C1024QG) ((List) obj).get(0)).f9552f, ((C1024QG) ((List) obj2).get(0)).f9552f);
            case 8:
                return ((C0961PG) Collections.max((List) obj)).compareTo((C0961PG) Collections.max((List) obj2));
            case 9:
                List list = (List) obj;
                List list2 = (List) obj2;
                return C4020ev.m18071f(C1590ZG.m9520c((C1590ZG) Collections.max(list, new C0295Eg(11)), (C1590ZG) Collections.max(list2, new C0295Eg(11)))).mo18072a(list.size(), list2.size()).mo18073b((C1590ZG) Collections.max(list, new C0295Eg(12)), (C1590ZG) Collections.max(list2, new C0295Eg(12)), new C0295Eg(12)).mo18076e();
            case 10:
                return ((C1401WG) ((List) obj).get(0)).compareTo((C1401WG) ((List) obj2).get(0));
            case 11:
                return C1590ZG.m9520c((C1590ZG) obj, (C1590ZG) obj2);
            case 12:
                C1590ZG c1590zg = (C1590ZG) obj;
                C1590ZG c1590zg2 = (C1590ZG) obj2;
                AbstractC7986My0 abstractC7986My0Mo371a = (c1590zg.f14826e && c1590zg.f14829h) ? C1654aH.f15413k : C1654aH.f15413k.mo371a();
                C4020ev c4020ev = AbstractC4146gv.f28081a;
                c1590zg.f14827f.getClass();
                return c4020ev.mo18073b(Integer.valueOf(c1590zg.f14832k), Integer.valueOf(c1590zg2.f14832k), abstractC7986My0Mo371a).mo18073b(Integer.valueOf(c1590zg.f14831j), Integer.valueOf(c1590zg2.f14831j), abstractC7986My0Mo371a).mo18076e();
            case 13:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    byte b = bArr[i2];
                    byte b2 = bArr2[i2];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 14:
                R00 r00 = (R00) obj;
                R00 r002 = (R00) obj2;
                boolean z2 = r00.f9897G;
                if ((z2 && r002.f9897G) || ((z = r00.f9898H) && r002.f9898H)) {
                    return Integer.signum(r002.f9896F - r00.f9896F);
                }
                if (z2) {
                    return -1;
                }
                if (!r002.f9897G) {
                    if (z) {
                        return -1;
                    }
                    if (!r002.f9898H) {
                        return 0;
                    }
                }
                return 1;
            case 15:
                AbstractC6257jl abstractC6257jl = (AbstractC6257jl) obj;
                AbstractC6257jl abstractC6257jl2 = (AbstractC6257jl) obj2;
                long j = abstractC6257jl.f35358f;
                long j2 = abstractC6257jl2.f35358f;
                return j - j2 == 0 ? abstractC6257jl.compareTo(abstractC6257jl2) : j < j2 ? -1 : 1;
            case 16:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
            case 17:
                return ((C0480Hc) obj).f4362a.compareTo(((C0480Hc) obj2).f4362a);
            case 18:
                return ((C0920Oc) ((AbstractC7058wA) obj)).f8517a.compareTo(((C0920Oc) ((AbstractC7058wA) obj2)).f8517a);
            case 19:
                return SharedTransitionManager.lambda$sortViewsByTags$0((View) obj, (View) obj2);
            case 20:
                return ((C9702i21) obj).f28778a - ((C9702i21) obj2).f28778a;
            case 21:
                return Float.compare(((C9702i21) obj).f28780c, ((C9702i21) obj2).f28780c);
            case 22:
                Z21 z21 = (Z21) obj;
                Z21 z212 = (Z21) obj2;
                int iCompare2 = Integer.compare(z212.f14670b, z21.f14670b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompareTo = z21.f14671c.compareTo(z212.f14671c);
                return iCompareTo != 0 ? iCompareTo : z21.f14672d.compareTo(z212.f14672d);
            case 23:
                Z21 z213 = (Z21) obj;
                Z21 z214 = (Z21) obj2;
                int iCompare3 = Integer.compare(z214.f14669a, z213.f14669a);
                if (iCompare3 != 0) {
                    return iCompare3;
                }
                int iCompareTo2 = z214.f14671c.compareTo(z213.f14671c);
                return iCompareTo2 != 0 ? iCompareTo2 : z214.f14672d.compareTo(z213.f14672d);
            case 24:
                return Integer.compare(((C9926jn1) obj).f35379a.f36696b, ((C9926jn1) obj2).f35379a.f36696b);
            case 25:
                return Long.compare(((C9798in1) obj).f29452b, ((C9798in1) obj2).f29452b);
            default:
                return C2309e0.m12880a((ScanResult) obj, (ScanResult) obj2);
        }
    }
}
