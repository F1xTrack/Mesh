package p000;

import android.util.Range;
import android.util.Size;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: aj1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8761aj1 implements InterfaceC10864r61 {

    /* renamed from: g */
    public static final Size f15652g = new Size(1280, 720);

    /* renamed from: h */
    public static final Range f15653h = new Range(1, 60);

    /* renamed from: a */
    public final String f15654a;

    /* renamed from: b */
    public final EnumC11690xa1 f15655b;

    /* renamed from: c */
    public final C1551Ye f15656c;

    /* renamed from: d */
    public final Size f15657d;

    /* renamed from: e */
    public final C0149CM f15658e;

    /* renamed from: f */
    public final Range f15659f;

    public C8761aj1(String str, EnumC11690xa1 enumC11690xa1, C1551Ye c1551Ye, Size size, C0149CM c0149cm, Range range) {
        this.f15654a = str;
        this.f15655b = enumC11690xa1;
        this.f15656c = c1551Ye;
        this.f15657d = size;
        this.f15658e = c0149cm;
        this.f15659f = range;
    }

    @Override // p000.InterfaceC10864r61, javax.inject.Provider
    public final Object get() {
        Integer num;
        Range range = Z61.f14736p;
        Range range2 = this.f15659f;
        int iIntValue = !Objects.equals(range2, range) ? ((Integer) f15653h.clamp((Integer) range2.getUpper())).intValue() : 30;
        Integer numValueOf = Integer.valueOf(iIntValue);
        boolean zEquals = Objects.equals(range2, range);
        Object obj = range2;
        if (!zEquals) {
            obj = "<UNSPECIFIED>";
        }
        String.format("Default resolved frame rate: %dfps. [Expected operating range: %s]", numValueOf, obj);
        AbstractC7806Jm0.m4412f("VidEncCfgDefaultRslvr");
        AbstractC7806Jm0.m4412f("VidEncCfgDefaultRslvr");
        Range range3 = this.f15656c.f14411c;
        AbstractC7806Jm0.m4412f("VidEncCfgDefaultRslvr");
        C0149CM c0149cm = this.f15658e;
        int i = c0149cm.f1337b;
        Size size = this.f15657d;
        int width = size.getWidth();
        Size size2 = f15652g;
        int iM8127c = AbstractC8371Ui1.m8127c(14000000, i, 8, iIntValue, 30, width, size2.getWidth(), size.getHeight(), size2.getHeight(), range3);
        HashMap map = AbstractC0338FM.f3170e;
        String str = this.f15654a;
        Map map2 = (Map) map.get(str);
        int iIntValue2 = (map2 == null || (num = (Integer) map2.get(c0149cm)) == null) ? -1 : num.intValue();
        C1425We c1425WeM8125a = AbstractC8371Ui1.m8125a(iIntValue2, str);
        C1361Vd c1361VdM8525d = C1362Ve.m8525d();
        c1361VdM8525d.f12660a = str;
        EnumC11690xa1 enumC11690xa1 = this.f15655b;
        if (enumC11690xa1 == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        c1361VdM8525d.f12662c = enumC11690xa1;
        c1361VdM8525d.f12663d = size;
        c1361VdM8525d.f12668i = Integer.valueOf(iM8127c);
        c1361VdM8525d.f12666g = Integer.valueOf(iIntValue);
        c1361VdM8525d.f12661b = Integer.valueOf(iIntValue2);
        c1361VdM8525d.f12665f = c1425WeM8125a;
        return c1361VdM8525d.m8516a();
    }
}
