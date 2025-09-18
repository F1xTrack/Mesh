package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class VN1 extends EE1 {
    private static final VN1 zzb;
    private int zzd;
    private int zzf;
    private YE1 zze = LH1.d;
    private String zzg = "";

    static {
        VN1 vn1 = new VN1();
        zzb = vn1;
        EE1.i(VN1.class, vn1);
    }

    public static void n(VN1 vn1, List list) {
        YE1 ye1 = vn1.zze;
        if (!((HB1) ye1).a) {
            int size = ye1.size();
            vn1.zze = ye1.c(size == 0 ? 10 : size + size);
        }
        List list2 = vn1.zze;
        Charset charset = AbstractC3356dF1.a;
        list.getClass();
        if (list instanceof FF1) {
            List listM = ((FF1) list).m();
            FF1 ff1 = (FF1) list2;
            int size2 = list2.size();
            for (Object obj : listM) {
                if (obj == null) {
                    String strG = AbstractC8235ym.g(ff1.size() - size2, "Element at index ", " is null.");
                    int size3 = ff1.size();
                    while (true) {
                        size3--;
                        if (size3 < size2) {
                            throw new NullPointerException(strG);
                        }
                        ff1.remove(size3);
                    }
                } else if (obj instanceof C8129yC1) {
                    ff1.U((C8129yC1) obj);
                } else {
                    ff1.add((String) obj);
                }
            }
            return;
        }
        if (list instanceof FH1) {
            list2.addAll(list);
            return;
        }
        if (list2 instanceof ArrayList) {
            ((ArrayList) list2).ensureCapacity(list.size() + list2.size());
        }
        int size4 = list2.size();
        for (Object obj2 : list) {
            if (obj2 == null) {
                String strG2 = AbstractC8235ym.g(list2.size() - size4, "Element at index ", " is null.");
                int size5 = list2.size();
                while (true) {
                    size5--;
                    if (size5 < size4) {
                        throw new NullPointerException(strG2);
                    }
                    list2.remove(size5);
                }
            } else {
                list2.add(obj2);
            }
        }
    }

    public static /* synthetic */ void o(VN1 vn1, int i) {
        vn1.zzd |= 1;
        vn1.zzf = i;
    }

    public static /* synthetic */ void p(VN1 vn1, String str) {
        str.getClass();
        vn1.zzd |= 2;
        vn1.zzg = str;
    }

    public static QN1 q() {
        return (QN1) zzb.d();
    }

    @Override // defpackage.EE1
    public final Object m(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NH1(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new VN1();
        }
        if (i2 == 4) {
            return new QN1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
