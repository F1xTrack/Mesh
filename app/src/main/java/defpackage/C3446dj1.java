package defpackage;

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
public final class C3446dj1 implements InterfaceC2380bj1 {
    public final InterfaceC2380bj1 a;
    public final Range b;
    public final Range c;
    public final HashSet d;

    public C3446dj1(InterfaceC2380bj1 interfaceC2380bj1) {
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.a = interfaceC2380bj1;
        int iB = interfaceC2380bj1.B();
        this.b = Range.create(Integer.valueOf(iB), Integer.valueOf(((int) Math.ceil(4096.0d / iB)) * iB));
        int iE0 = interfaceC2380bj1.E0();
        this.c = Range.create(Integer.valueOf(iE0), Integer.valueOf(((int) Math.ceil(2160.0d / iE0)) * iE0));
        List list = MediaCodecInfoReportIncorrectInfoQuirk.a;
        hashSet.addAll(MediaCodecInfoReportIncorrectInfoQuirk.a.contains(Build.MODEL.toLowerCase(Locale.US)) ? Collections.singleton(new Size(1920, 1080)) : Collections.emptySet());
    }

    public static InterfaceC2380bj1 a(InterfaceC2380bj1 interfaceC2380bj1, Size size) {
        if (!(interfaceC2380bj1 instanceof C3446dj1)) {
            if (AbstractC7387uJ.a.z0(MediaCodecInfoReportIncorrectInfoQuirk.class) != null) {
                interfaceC2380bj1 = new C3446dj1(interfaceC2380bj1);
            } else if (size != null && !interfaceC2380bj1.u(size.getWidth(), size.getHeight())) {
                Range rangeF0 = interfaceC2380bj1.F0();
                Range rangeR0 = interfaceC2380bj1.R0();
                size.toString();
                Objects.toString(rangeF0);
                Objects.toString(rangeR0);
                AbstractC0759Jm0.f("VideoEncoderInfoWrapper");
                interfaceC2380bj1 = new C3446dj1(interfaceC2380bj1);
            }
        }
        if (size != null && (interfaceC2380bj1 instanceof C3446dj1)) {
            ((C3446dj1) interfaceC2380bj1).d.add(size);
        }
        return interfaceC2380bj1;
    }

    @Override // defpackage.InterfaceC2380bj1
    public final int B() {
        return this.a.B();
    }

    @Override // defpackage.InterfaceC2380bj1
    public final Range D0(int i) {
        Integer numValueOf = Integer.valueOf(i);
        Range range = this.b;
        boolean zContains = range.contains((Range) numValueOf);
        InterfaceC2380bj1 interfaceC2380bj1 = this.a;
        AbstractC3377dM1.d("Not supported width: " + i + " which is not in " + range + " or can not be divided by alignment " + interfaceC2380bj1.B(), zContains && i % interfaceC2380bj1.B() == 0);
        return this.c;
    }

    @Override // defpackage.InterfaceC2380bj1
    public final int E0() {
        return this.a.E0();
    }

    @Override // defpackage.InterfaceC2380bj1
    public final Range F0() {
        return this.b;
    }

    @Override // defpackage.InterfaceC2380bj1
    public final Range G() {
        return this.a.G();
    }

    @Override // defpackage.InterfaceC2380bj1
    public final boolean K0(int i, int i2) {
        InterfaceC2380bj1 interfaceC2380bj1 = this.a;
        if (interfaceC2380bj1.K0(i, i2)) {
            return true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getWidth() == i && size.getHeight() == i2) {
                return true;
            }
        }
        if (this.b.contains((Range) Integer.valueOf(i))) {
            if (this.c.contains((Range) Integer.valueOf(i2)) && i % interfaceC2380bj1.B() == 0 && i2 % interfaceC2380bj1.E0() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC2380bj1
    public final Range R0() {
        return this.c;
    }

    @Override // defpackage.InterfaceC2380bj1
    public final boolean U() {
        return this.a.U();
    }

    @Override // defpackage.InterfaceC2380bj1
    public final /* synthetic */ boolean u(int i, int i2) {
        return F91.l(this, i, i2);
    }

    @Override // defpackage.InterfaceC2380bj1
    public final Range y0(int i) {
        Integer numValueOf = Integer.valueOf(i);
        Range range = this.c;
        boolean zContains = range.contains((Range) numValueOf);
        InterfaceC2380bj1 interfaceC2380bj1 = this.a;
        AbstractC3377dM1.d("Not supported height: " + i + " which is not in " + range + " or can not be divided by alignment " + interfaceC2380bj1.E0(), zContains && i % interfaceC2380bj1.E0() == 0);
        return this.b;
    }
}
