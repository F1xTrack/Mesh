package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: aj1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2189aj1 implements InterfaceC6777r61 {
    public static final Size g = new Size(1280, 720);
    public static final Range h = new Range(1, 60);
    public final String a;
    public final EnumC8011xa1 b;
    public final C1903Ye c;
    public final Size d;
    public final CM e;
    public final Range f;

    public C2189aj1(String str, EnumC8011xa1 enumC8011xa1, C1903Ye c1903Ye, Size size, CM cm, Range range) {
        this.a = str;
        this.b = enumC8011xa1;
        this.c = c1903Ye;
        this.d = size;
        this.e = cm;
        this.f = range;
    }

    @Override // defpackage.InterfaceC6777r61, javax.inject.Provider
    public final Object get() {
        Integer num;
        Range range = Z61.p;
        Range range2 = this.f;
        int iIntValue = !Objects.equals(range2, range) ? ((Integer) h.clamp((Integer) range2.getUpper())).intValue() : 30;
        Integer numValueOf = Integer.valueOf(iIntValue);
        boolean zEquals = Objects.equals(range2, range);
        Object obj = range2;
        if (!zEquals) {
            obj = "<UNSPECIFIED>";
        }
        String.format("Default resolved frame rate: %dfps. [Expected operating range: %s]", numValueOf, obj);
        AbstractC0759Jm0.f("VidEncCfgDefaultRslvr");
        AbstractC0759Jm0.f("VidEncCfgDefaultRslvr");
        Range range3 = this.c.c;
        AbstractC0759Jm0.f("VidEncCfgDefaultRslvr");
        CM cm = this.e;
        int i = cm.b;
        Size size = this.d;
        int width = size.getWidth();
        Size size2 = g;
        int iC = AbstractC1605Ui1.c(14000000, i, 8, iIntValue, 30, width, size2.getWidth(), size.getHeight(), size2.getHeight(), range3);
        HashMap map = FM.e;
        String str = this.a;
        Map map2 = (Map) map.get(str);
        int iIntValue2 = (map2 == null || (num = (Integer) map2.get(cm)) == null) ? -1 : num.intValue();
        C1747We c1747WeA = AbstractC1605Ui1.a(iIntValue2, str);
        C1666Vd c1666VdD = C1669Ve.d();
        c1666VdD.a = str;
        EnumC8011xa1 enumC8011xa1 = this.b;
        if (enumC8011xa1 == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        c1666VdD.c = enumC8011xa1;
        c1666VdD.d = size;
        c1666VdD.i = Integer.valueOf(iC);
        c1666VdD.g = Integer.valueOf(iIntValue);
        c1666VdD.b = Integer.valueOf(iIntValue2);
        c1666VdD.f = c1747WeA;
        return c1666VdD.a();
    }
}
