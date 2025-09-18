package defpackage;

import android.content.Context;

/* renamed from: hG1 */
/* loaded from: classes.dex */
public final class C4122hG1 implements KM, InterfaceC6053nJ1, InterfaceC1571Tx0 {
    public final /* synthetic */ int a;

    public /* synthetic */ C4122hG1(int i) {
        this.a = i;
    }

    public static boolean c(byte[] bArr, int i, int i2) {
        int iA;
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            iA = 0;
        } else {
            while (i < i2) {
                int i3 = i + 1;
                iA = bArr[i];
                if (iA < 0) {
                    if (iA >= -32) {
                        if (iA >= -16) {
                            if (i3 < i2 - 2) {
                                int i4 = i + 2;
                                byte b = bArr[i3];
                                if (b <= -65) {
                                    if ((((b + 112) + (iA << 28)) >> 30) == 0) {
                                        int i5 = i + 3;
                                        if (bArr[i4] <= -65) {
                                            i += 4;
                                            if (bArr[i5] > -65) {
                                            }
                                        }
                                    }
                                }
                                iA = -1;
                                break;
                            }
                            iA = AbstractC2114aK1.a(bArr, i3, i2);
                            break;
                        }
                        if (i3 < i2 - 1) {
                            int i6 = i + 2;
                            byte b2 = bArr[i3];
                            if (b2 <= -65 && ((iA != -32 || b2 >= -96) && (iA != -19 || b2 < -96))) {
                                i += 3;
                                if (bArr[i6] > -65) {
                                }
                            }
                            iA = -1;
                            break;
                        }
                        iA = AbstractC2114aK1.a(bArr, i3, i2);
                        break;
                    }
                    if (i3 >= i2) {
                        break;
                    }
                    if (iA >= -62) {
                        i += 2;
                        if (bArr[i3] > -65) {
                        }
                    }
                    iA = -1;
                    break;
                }
                i = i3;
            }
            iA = 0;
        }
        return iA == 0;
    }

    @Override // defpackage.KM
    public int a(Context context, String str, boolean z) {
        return MM.d(context, str, z);
    }

    @Override // defpackage.KM
    public int b(Context context, String str) {
        return MM.a(context, str);
    }

    @Override // defpackage.InterfaceC6053nJ1
    public Object zza() {
        switch (this.a) {
            case 1:
                PW1.b.get();
                Long l = (Long) UW1.R.a();
                l.getClass();
                return l;
            default:
                C8008xZ1.b.get();
                Boolean bool = (Boolean) BZ1.a.a();
                bool.getClass();
                return bool;
        }
    }

    @Override // defpackage.InterfaceC1571Tx0
    public void onFailure(Exception exc) {
    }
}
