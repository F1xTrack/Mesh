package p000;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class EA1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2520a;

    /* renamed from: b */
    public final /* synthetic */ String f2521b;

    /* renamed from: c */
    public final /* synthetic */ long f2522c;

    /* renamed from: d */
    public final /* synthetic */ C7933Lx1 f2523d;

    public /* synthetic */ EA1(C7933Lx1 c7933Lx1, String str, long j, int i) {
        this.f2520a = i;
        this.f2521b = str;
        this.f2522c = j;
        this.f2523d = c7933Lx1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2520a) {
            case 0:
                C7933Lx1 c7933Lx1 = this.f2523d;
                c7933Lx1.mo7681v1();
                String str = this.f2521b;
                Preconditions.checkNotEmpty(str);
                C7119x8 c7119x8 = c7933Lx1.f6943d;
                Integer num = (Integer) c7119x8.getOrDefault(str, null);
                if (num == null) {
                    c7933Lx1.mo6070n().f8378g.m24554c(str, "Call to endAdUnitExposure for unknown ad unit id");
                    break;
                } else {
                    CU1 cu1M4329C1 = c7933Lx1.m7683x1().m4329C1(false);
                    int iIntValue = num.intValue() - 1;
                    if (iIntValue != 0) {
                        c7119x8.put(str, Integer.valueOf(iIntValue));
                        break;
                    } else {
                        c7119x8.remove(str);
                        C7119x8 c7119x82 = c7933Lx1.f6942c;
                        Long l = (Long) c7119x82.getOrDefault(str, null);
                        long j = this.f2522c;
                        if (l == null) {
                            c7933Lx1.mo6070n().f8378g.m24555d("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = j - l.longValue();
                            c7119x82.remove(str);
                            c7933Lx1.m5163C1(str, jLongValue, cu1M4329C1);
                        }
                        if (c7119x8.isEmpty()) {
                            long j2 = c7933Lx1.f6944e;
                            if (j2 != 0) {
                                c7933Lx1.m5162B1(j - j2, cu1M4329C1);
                                c7933Lx1.f6944e = 0L;
                                break;
                            } else {
                                c7933Lx1.mo6070n().f8378g.m24555d("First ad exposure time was never set");
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                C7933Lx1 c7933Lx12 = this.f2523d;
                c7933Lx12.mo7681v1();
                String str2 = this.f2521b;
                Preconditions.checkNotEmpty(str2);
                C7119x8 c7119x83 = c7933Lx12.f6943d;
                boolean zIsEmpty = c7119x83.isEmpty();
                long j3 = this.f2522c;
                if (zIsEmpty) {
                    c7933Lx12.f6944e = j3;
                }
                Integer num2 = (Integer) c7119x83.getOrDefault(str2, null);
                if (num2 == null) {
                    if (c7119x83.f6450c < 100) {
                        c7119x83.put(str2, 1);
                        c7933Lx12.f6942c.put(str2, Long.valueOf(j3));
                        break;
                    } else {
                        c7933Lx12.mo6070n().f8381j.m24555d("Too many ads visible");
                        break;
                    }
                } else {
                    c7119x83.put(str2, Integer.valueOf(num2.intValue() + 1));
                    break;
                }
        }
    }
}
