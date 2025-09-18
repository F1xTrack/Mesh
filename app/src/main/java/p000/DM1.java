package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class DM1 extends EE1 {
    private static final UE1 zzb = new C11523wG1(3);
    private static final DM1 zzd;
    private int zze;
    private int zzg;
    private C8715aM1 zzj;
    private boolean zzk;
    private boolean zzl;
    private String zzf = "";
    private SE1 zzh = IE1.f4847d;
    private YE1 zzi = LH1.f6595d;

    static {
        DM1 dm1 = new DM1();
        zzd = dm1;
        EE1.m2094i(DM1.class, dm1);
    }

    /* renamed from: n */
    public static DM1 m1657n(byte[] bArr, BD1 bd1) {
        return (DM1) EE1.m2092f(zzd, bArr, bd1);
    }

    /* renamed from: o */
    public static void m1658o(DM1 dm1, VN1 vn1) {
        YE1 ye1 = dm1.zzi;
        if (!((HB1) ye1).f4162a) {
            int size = ye1.size();
            dm1.zzi = ye1.mo137c(size == 0 ? 10 : size + size);
        }
        dm1.zzi.add(vn1);
    }

    /* renamed from: p */
    public static /* synthetic */ void m1659p(DM1 dm1, C8715aM1 c8715aM1) {
        dm1.zzj = c8715aM1;
        dm1.zze |= 4;
    }

    /* renamed from: q */
    public static /* synthetic */ void m1660q(DM1 dm1, boolean z) {
        dm1.zze |= 8;
        dm1.zzk = z;
    }

    /* renamed from: r */
    public static /* synthetic */ void m1661r(DM1 dm1) {
        dm1.zze |= 16;
        dm1.zzl = false;
    }

    /* renamed from: s */
    public static void m1662s(DM1 dm1, List list) {
        List list2 = dm1.zzh;
        if (!((HB1) list2).f4162a) {
            int size = list2.size();
            int i = size == 0 ? 10 : size + size;
            IE1 ie1 = (IE1) list2;
            if (i < ie1.f4849c) {
                throw new IllegalArgumentException();
            }
            dm1.zzh = new IE1(Arrays.copyOf(ie1.f4848b, i), ie1.f4849c, true);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((IE1) dm1.zzh).m3789d(((EnumC10768qM1) it.next()).f40840a);
        }
    }

    /* renamed from: t */
    public static /* synthetic */ void m1663t(DM1 dm1, int i) {
        dm1.zzg = i - 1;
        dm1.zze |= 2;
    }

    /* renamed from: u */
    public static C11535wM1 m1664u() {
        return (C11535wM1) zzd.m2095d();
    }

    @Override // p000.EE1
    /* renamed from: m */
    public final Object mo1649m(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NH1(zzd, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zze", "zzf", "zzg", C11150tL1.f43026e, "zzh", C11150tL1.f43025d, "zzi", VN1.class, "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new DM1();
        }
        if (i2 == 4) {
            return new C11535wM1(zzd);
        }
        if (i2 != 5) {
            return null;
        }
        return zzd;
    }
}
