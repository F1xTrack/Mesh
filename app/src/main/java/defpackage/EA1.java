package defpackage;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class EA1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ C0948Lx1 d;

    public /* synthetic */ EA1(C0948Lx1 c0948Lx1, String str, long j, int i) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = c0948Lx1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C0948Lx1 c0948Lx1 = this.d;
                c0948Lx1.v1();
                String str = this.b;
                Preconditions.checkNotEmpty(str);
                C7925x8 c7925x8 = c0948Lx1.d;
                Integer num = (Integer) c7925x8.getOrDefault(str, null);
                if (num == null) {
                    c0948Lx1.n().g.c(str, "Call to endAdUnitExposure for unknown ad unit id");
                    break;
                } else {
                    CU1 cu1C1 = c0948Lx1.x1().C1(false);
                    int iIntValue = num.intValue() - 1;
                    if (iIntValue != 0) {
                        c7925x8.put(str, Integer.valueOf(iIntValue));
                        break;
                    } else {
                        c7925x8.remove(str);
                        C7925x8 c7925x82 = c0948Lx1.c;
                        Long l = (Long) c7925x82.getOrDefault(str, null);
                        long j = this.c;
                        if (l == null) {
                            c0948Lx1.n().g.d("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = j - l.longValue();
                            c7925x82.remove(str);
                            c0948Lx1.C1(str, jLongValue, cu1C1);
                        }
                        if (c7925x8.isEmpty()) {
                            long j2 = c0948Lx1.e;
                            if (j2 != 0) {
                                c0948Lx1.B1(j - j2, cu1C1);
                                c0948Lx1.e = 0L;
                                break;
                            } else {
                                c0948Lx1.n().g.d("First ad exposure time was never set");
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                C0948Lx1 c0948Lx12 = this.d;
                c0948Lx12.v1();
                String str2 = this.b;
                Preconditions.checkNotEmpty(str2);
                C7925x8 c7925x83 = c0948Lx12.d;
                boolean zIsEmpty = c7925x83.isEmpty();
                long j3 = this.c;
                if (zIsEmpty) {
                    c0948Lx12.e = j3;
                }
                Integer num2 = (Integer) c7925x83.getOrDefault(str2, null);
                if (num2 == null) {
                    if (c7925x83.c < 100) {
                        c7925x83.put(str2, 1);
                        c0948Lx12.c.put(str2, Long.valueOf(j3));
                        break;
                    } else {
                        c0948Lx12.n().j.d("Too many ads visible");
                        break;
                    }
                } else {
                    c7925x83.put(str2, Integer.valueOf(num2.intValue() + 1));
                    break;
                }
        }
    }
}
