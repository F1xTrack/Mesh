package defpackage;

import com.huawei.hms.rn.push.constants.Core;

/* loaded from: classes.dex */
public abstract class RQ1 {
    public static C1696Vn a(C1696Vn c1696Vn) {
        if (c1696Vn == null) {
            return new C1696Vn(null, new C1306Qn(), new C1306Qn(), new C1306Qn(), new C1306Qn(), new C1306Qn(), null, null, false, EnumC4256hz0.c, null, false, EnumC6870rb1.c, EnumC1608Uj1.c, null, 1.0f, false, new C1306Qn());
        }
        String str = c1696Vn.a;
        WQ1 wq1 = c1696Vn.b;
        WQ1 wq12 = c1696Vn.c;
        WQ1 wq13 = c1696Vn.d;
        WQ1 wq14 = c1696Vn.e;
        WQ1 wq15 = c1696Vn.f;
        Integer num = c1696Vn.g;
        Integer num2 = c1696Vn.h;
        boolean z = c1696Vn.i;
        EnumC4256hz0 enumC4256hz0 = c1696Vn.j;
        C3840fo c3840fo = c1696Vn.k;
        boolean z2 = c1696Vn.l;
        EnumC6870rb1 enumC6870rb1 = c1696Vn.m;
        Double d = c1696Vn.o;
        float f = c1696Vn.p;
        boolean z3 = c1696Vn.q;
        WQ1 wq16 = c1696Vn.r;
        O90.f(wq1, "preview");
        O90.f(wq12, "photo");
        O90.f(wq13, "video");
        O90.f(wq14, "frameProcessor");
        O90.f(wq15, "codeScanner");
        O90.f(enumC4256hz0, "outputOrientation");
        O90.f(enumC6870rb1, "torch");
        EnumC1608Uj1 enumC1608Uj1 = c1696Vn.n;
        O90.f(enumC1608Uj1, "videoStabilizationMode");
        O90.f(wq16, "audio");
        return new C1696Vn(str, wq1, wq12, wq13, wq14, wq15, num, num2, z, enumC4256hz0, c3840fo, z2, enumC6870rb1, enumC1608Uj1, d, f, z3, wq16);
    }

    public static final OS0 b(Throwable th) {
        O90.f(th, Core.Event.Result.EXCEPTION);
        return new OS0(th);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C1150On c(defpackage.C1696Vn r11, defpackage.C1696Vn r12) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RQ1.c(Vn, Vn):On");
    }

    public static final void d(Object obj) {
        if (obj instanceof OS0) {
            throw ((OS0) obj).a;
        }
    }
}
