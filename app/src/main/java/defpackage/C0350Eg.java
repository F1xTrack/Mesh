package defpackage;

import android.net.wifi.ScanResult;
import android.util.Size;
import android.view.View;
import com.my.tracker.obfuscated.e0;
import com.swmansion.reanimated.layoutReanimation.SharedTransitionManager;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: Eg */
/* loaded from: classes.dex */
public final /* synthetic */ class C0350Eg implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ C0350Eg(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean z;
        switch (this.a) {
            case 0:
                return ((C6666qX) obj2).i - ((C6666qX) obj).i;
            case 1:
                C0896Lg c0896Lg = (C0896Lg) obj;
                C0896Lg c0896Lg2 = (C0896Lg) obj2;
                int iCompare = Integer.compare(c0896Lg.c, c0896Lg2.c);
                return iCompare != 0 ? iCompare : c0896Lg.b.compareTo(c0896Lg2.b);
            case 2:
                return Integer.compare(((C0692Iq) obj2).b, ((C0692Iq) obj).b);
            case 3:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 4:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 5:
                String name = ((File) obj).getName();
                int i = XA.f;
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
                return Integer.compare(((QG) ((List) obj).get(0)).f, ((QG) ((List) obj2).get(0)).f);
            case 8:
                return ((PG) Collections.max((List) obj)).compareTo((PG) Collections.max((List) obj2));
            case 9:
                List list = (List) obj;
                List list2 = (List) obj2;
                return C3670ev.f(ZG.c((ZG) Collections.max(list, new C0350Eg(11)), (ZG) Collections.max(list2, new C0350Eg(11)))).a(list.size(), list2.size()).b((ZG) Collections.max(list, new C0350Eg(12)), (ZG) Collections.max(list2, new C0350Eg(12)), new C0350Eg(12)).e();
            case 10:
                return ((WG) ((List) obj).get(0)).compareTo((WG) ((List) obj2).get(0));
            case 11:
                return ZG.c((ZG) obj, (ZG) obj2);
            case 12:
                ZG zg = (ZG) obj;
                ZG zg2 = (ZG) obj2;
                AbstractC1028My0 abstractC1028My0A = (zg.e && zg.h) ? C2103aH.k : C2103aH.k.a();
                C3670ev c3670ev = AbstractC4052gv.a;
                zg.f.getClass();
                return c3670ev.b(Integer.valueOf(zg.k), Integer.valueOf(zg2.k), abstractC1028My0A).b(Integer.valueOf(zg.j), Integer.valueOf(zg2.j), abstractC1028My0A).e();
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
                boolean z2 = r00.G;
                if ((z2 && r002.G) || ((z = r00.H) && r002.H)) {
                    return Integer.signum(r002.F - r00.F);
                }
                if (z2) {
                    return -1;
                }
                if (!r002.G) {
                    if (z) {
                        return -1;
                    }
                    if (!r002.H) {
                        return 0;
                    }
                }
                return 1;
            case 15:
                AbstractC5371jl abstractC5371jl = (AbstractC5371jl) obj;
                AbstractC5371jl abstractC5371jl2 = (AbstractC5371jl) obj2;
                long j = abstractC5371jl.f;
                long j2 = abstractC5371jl2.f;
                return j - j2 == 0 ? abstractC5371jl.compareTo(abstractC5371jl2) : j < j2 ? -1 : 1;
            case 16:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
            case 17:
                return ((C0572Hc) obj).a.compareTo(((C0572Hc) obj2).a);
            case 18:
                return ((C1117Oc) ((AbstractC7741wA) obj)).a.compareTo(((C1117Oc) ((AbstractC7741wA) obj2)).a);
            case 19:
                return SharedTransitionManager.lambda$sortViewsByTags$0((View) obj, (View) obj2);
            case 20:
                return ((C4269i21) obj).a - ((C4269i21) obj2).a;
            case 21:
                return Float.compare(((C4269i21) obj).c, ((C4269i21) obj2).c);
            case 22:
                Z21 z21 = (Z21) obj;
                Z21 z212 = (Z21) obj2;
                int iCompare2 = Integer.compare(z212.b, z21.b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompareTo = z21.c.compareTo(z212.c);
                return iCompareTo != 0 ? iCompareTo : z21.d.compareTo(z212.d);
            case 23:
                Z21 z213 = (Z21) obj;
                Z21 z214 = (Z21) obj2;
                int iCompare3 = Integer.compare(z214.a, z213.a);
                if (iCompare3 != 0) {
                    return iCompare3;
                }
                int iCompareTo2 = z214.c.compareTo(z213.c);
                return iCompareTo2 != 0 ? iCompareTo2 : z214.d.compareTo(z213.d);
            case 24:
                return Integer.compare(((C5379jn1) obj).a.b, ((C5379jn1) obj2).a.b);
            case 25:
                return Long.compare(((C4411in1) obj).b, ((C4411in1) obj2).b);
            default:
                return e0.a((ScanResult) obj, (ScanResult) obj2);
        }
    }
}
