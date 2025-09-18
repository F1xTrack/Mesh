package p000;

import android.content.Context;

/* renamed from: hG1 */
/* loaded from: classes.dex */
public final class C9604hG1 implements InterfaceC0653KM, InterfaceC10378nJ1, InterfaceC8348Tx0 {

    /* renamed from: a */
    public final /* synthetic */ int f28365a;

    public /* synthetic */ C9604hG1(int i) {
        this.f28365a = i;
    }

    /* renamed from: c */
    public static boolean m18792c(byte[] bArr, int i, int i2) {
        int iM9701a;
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            iM9701a = 0;
        } else {
            while (i < i2) {
                int i3 = i + 1;
                iM9701a = bArr[i];
                if (iM9701a < 0) {
                    if (iM9701a >= -32) {
                        if (iM9701a >= -16) {
                            if (i3 < i2 - 2) {
                                int i4 = i + 2;
                                byte b = bArr[i3];
                                if (b <= -65) {
                                    if ((((b + 112) + (iM9701a << 28)) >> 30) == 0) {
                                        int i5 = i + 3;
                                        if (bArr[i4] <= -65) {
                                            i += 4;
                                            if (bArr[i5] > -65) {
                                            }
                                        }
                                    }
                                }
                                iM9701a = -1;
                                break;
                            }
                            iM9701a = AbstractC8711aK1.m9701a(bArr, i3, i2);
                            break;
                        }
                        if (i3 < i2 - 1) {
                            int i6 = i + 2;
                            byte b2 = bArr[i3];
                            if (b2 <= -65 && ((iM9701a != -32 || b2 >= -96) && (iM9701a != -19 || b2 < -96))) {
                                i += 3;
                                if (bArr[i6] > -65) {
                                }
                            }
                            iM9701a = -1;
                            break;
                        }
                        iM9701a = AbstractC8711aK1.m9701a(bArr, i3, i2);
                        break;
                    }
                    if (i3 >= i2) {
                        break;
                    }
                    if (iM9701a >= -62) {
                        i += 2;
                        if (bArr[i3] > -65) {
                        }
                    }
                    iM9701a = -1;
                    break;
                }
                i = i3;
            }
            iM9701a = 0;
        }
        return iM9701a == 0;
    }

    @Override // p000.InterfaceC0653KM
    /* renamed from: a */
    public int mo4617a(Context context, String str, boolean z) {
        return C0778MM.m5343d(context, str, z);
    }

    @Override // p000.InterfaceC0653KM
    /* renamed from: b */
    public int mo4618b(Context context, String str) {
        return C0778MM.m5341a(context, str);
    }

    @Override // p000.InterfaceC10378nJ1
    public Object zza() {
        switch (this.f28365a) {
            case 1:
                PW1.f9104b.get();
                Long l = (Long) UW1.f11850R.m8754a();
                l.getClass();
                return l;
            default:
                C11688xZ1.f45679b.get();
                Boolean bool = (Boolean) BZ1.f910a.m8754a();
                bool.getClass();
                return bool;
        }
    }

    @Override // p000.InterfaceC8348Tx0
    public void onFailure(Exception exc) {
    }
}
