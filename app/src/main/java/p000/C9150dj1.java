package p000;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* renamed from: dj1 */
/* loaded from: classes.dex */
public final class C9150dj1 implements InterfaceC8889bj1 {

    /* renamed from: a */
    public final InterfaceC8889bj1 f26228a;

    /* renamed from: b */
    public final Range f26229b;

    /* renamed from: c */
    public final Range f26230c;

    /* renamed from: d */
    public final HashSet f26231d;

    public C9150dj1(InterfaceC8889bj1 interfaceC8889bj1) {
        HashSet hashSet = new HashSet();
        this.f26231d = hashSet;
        this.f26228a = interfaceC8889bj1;
        int iMo10489B = interfaceC8889bj1.mo10489B();
        this.f26229b = Range.create(Integer.valueOf(iMo10489B), Integer.valueOf(((int) Math.ceil(4096.0d / iMo10489B)) * iMo10489B));
        int iMo10491E0 = interfaceC8889bj1.mo10491E0();
        this.f26230c = Range.create(Integer.valueOf(iMo10491E0), Integer.valueOf(((int) Math.ceil(2160.0d / iMo10491E0)) * iMo10491E0));
        List list = MediaCodecInfoReportIncorrectInfoQuirk.f16046a;
        hashSet.addAll(MediaCodecInfoReportIncorrectInfoQuirk.f16046a.contains(Build.MODEL.toLowerCase(Locale.US)) ? Collections.singleton(new Size(1920, 1080)) : Collections.emptySet());
    }

    /* renamed from: a */
    public static InterfaceC8889bj1 m17731a(InterfaceC8889bj1 interfaceC8889bj1, Size size) {
        if (!(interfaceC8889bj1 instanceof C9150dj1)) {
            if (AbstractC6941uJ.f43644a.m17864z0(MediaCodecInfoReportIncorrectInfoQuirk.class) != null) {
                interfaceC8889bj1 = new C9150dj1(interfaceC8889bj1);
            } else if (size != null && !interfaceC8889bj1.mo10497u(size.getWidth(), size.getHeight())) {
                Range rangeMo10492F0 = interfaceC8889bj1.mo10492F0();
                Range rangeMo10495R0 = interfaceC8889bj1.mo10495R0();
                size.toString();
                Objects.toString(rangeMo10492F0);
                Objects.toString(rangeMo10495R0);
                AbstractC7806Jm0.m4412f("VideoEncoderInfoWrapper");
                interfaceC8889bj1 = new C9150dj1(interfaceC8889bj1);
            }
        }
        if (size != null && (interfaceC8889bj1 instanceof C9150dj1)) {
            ((C9150dj1) interfaceC8889bj1).f26231d.add(size);
        }
        return interfaceC8889bj1;
    }

    @Override // p000.InterfaceC8889bj1
    /* renamed from: B */
    public final int mo10489B() {
        return this.f26228a.mo10489B();
    }

    @Override // p000.InterfaceC8889bj1
    /* renamed from: D0 */
    public final Range mo10490D0(int i) {
        Integer numValueOf = Integer.valueOf(i);
        Range range = this.f26229b;
        boolean zContains = range.contains((Range) numValueOf);
        InterfaceC8889bj1 interfaceC8889bj1 = this.f26228a;
        AbstractC9104dM1.m17545d("Not supported width: " + i + " which is not in " + range + " or can not be divided by alignment " + interfaceC8889bj1.mo10489B(), zContains && i % interfaceC8889bj1.mo10489B() == 0);
        return this.f26230c;
    }

    @Override // p000.InterfaceC8889bj1
    /* renamed from: E0 */
    public final int mo10491E0() {
        return this.f26228a.mo10491E0();
    }

    @Override // p000.InterfaceC8889bj1
    /* renamed from: F0 */
    public final Range mo10492F0() {
        return this.f26229b;
    }

    @Override // p000.InterfaceC8889bj1
    /* renamed from: G */
    public final Range mo10493G() {
        return this.f26228a.mo10493G();
    }

    @Override // p000.InterfaceC8889bj1
    /* renamed from: K0 */
    public final boolean mo10494K0(int i, int i2) {
        InterfaceC8889bj1 interfaceC8889bj1 = this.f26228a;
        if (interfaceC8889bj1.mo10494K0(i, i2)) {
            return true;
        }
        Iterator it = this.f26231d.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getWidth() == i && size.getHeight() == i2) {
                return true;
            }
        }
        if (this.f26229b.contains((Range) Integer.valueOf(i))) {
            if (this.f26230c.contains((Range) Integer.valueOf(i2)) && i % interfaceC8889bj1.mo10489B() == 0 && i2 % interfaceC8889bj1.mo10491E0() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC8889bj1
    /* renamed from: R0 */
    public final Range mo10495R0() {
        return this.f26230c;
    }

    @Override // p000.InterfaceC8889bj1
    /* renamed from: U */
    public final boolean mo10496U() {
        return this.f26228a.mo10496U();
    }

    @Override // p000.InterfaceC8889bj1
    /* renamed from: u */
    public final /* synthetic */ boolean mo10497u(int i, int i2) {
        return F91.m2529l(this, i, i2);
    }

    @Override // p000.InterfaceC8889bj1
    /* renamed from: y0 */
    public final Range mo10498y0(int i) {
        Integer numValueOf = Integer.valueOf(i);
        Range range = this.f26230c;
        boolean zContains = range.contains((Range) numValueOf);
        InterfaceC8889bj1 interfaceC8889bj1 = this.f26228a;
        AbstractC9104dM1.m17545d("Not supported height: " + i + " which is not in " + range + " or can not be divided by alignment " + interfaceC8889bj1.mo10491E0(), zContains && i % interfaceC8889bj1.mo10491E0() == 0);
        return this.f26229b;
    }
}
