package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class DM1 extends EE1 {
    private static final UE1 zzb = new C7761wG1(3);
    private static final DM1 zzd;
    private int zze;
    private int zzg;
    private C2120aM1 zzj;
    private boolean zzk;
    private boolean zzl;
    private String zzf = "";
    private SE1 zzh = IE1.d;
    private YE1 zzi = LH1.d;

    static {
        DM1 dm1 = new DM1();
        zzd = dm1;
        EE1.i(DM1.class, dm1);
    }

    public static DM1 n(byte[] bArr, BD1 bd1) {
        return (DM1) EE1.f(zzd, bArr, bd1);
    }

    public static void o(DM1 dm1, VN1 vn1) {
        YE1 ye1 = dm1.zzi;
        if (!((HB1) ye1).a) {
            int size = ye1.size();
            dm1.zzi = ye1.c(size == 0 ? 10 : size + size);
        }
        dm1.zzi.add(vn1);
    }

    public static /* synthetic */ void p(DM1 dm1, C2120aM1 c2120aM1) {
        dm1.zzj = c2120aM1;
        dm1.zze |= 4;
    }

    public static /* synthetic */ void q(DM1 dm1, boolean z) {
        dm1.zze |= 8;
        dm1.zzk = z;
    }

    public static /* synthetic */ void r(DM1 dm1) {
        dm1.zze |= 16;
        dm1.zzl = false;
    }

    public static void s(DM1 dm1, List list) {
        List list2 = dm1.zzh;
        if (!((HB1) list2).a) {
            int size = list2.size();
            int i = size == 0 ? 10 : size + size;
            IE1 ie1 = (IE1) list2;
            if (i < ie1.c) {
                throw new IllegalArgumentException();
            }
            dm1.zzh = new IE1(Arrays.copyOf(ie1.b, i), ie1.c, true);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((IE1) dm1.zzh).d(((EnumC6635qM1) it.next()).a);
        }
    }

    public static /* synthetic */ void t(DM1 dm1, int i) {
        dm1.zzg = i - 1;
        dm1.zze |= 2;
    }

    public static C7779wM1 u() {
        return (C7779wM1) zzd.d();
    }

    @Override // defpackage.EE1
    public final Object m(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NH1(zzd, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zze", "zzf", "zzg", C7204tL1.e, "zzh", C7204tL1.d, "zzi", VN1.class, "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new DM1();
        }
        if (i2 == 4) {
            return new C7779wM1(zzd);
        }
        if (i2 != 5) {
            return null;
        }
        return zzd;
    }
}
