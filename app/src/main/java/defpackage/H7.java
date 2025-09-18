package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class H7 extends AbstractC5507kS1 {
    public final /* synthetic */ int a;

    public /* synthetic */ H7(int i) {
        this.a = i;
    }

    public static LP e(C4103hA0 c4103hA0) {
        String strP = c4103hA0.p();
        strP.getClass();
        String strP2 = c4103hA0.p();
        strP2.getClass();
        return new LP(strP, strP2, c4103hA0.o(), c4103hA0.o(), Arrays.copyOfRange(c4103hA0.a, c4103hA0.b, c4103hA0.c));
    }

    @Override // defpackage.AbstractC5507kS1
    public final C0540Gr0 c(C0774Jr0 c0774Jr0, ByteBuffer byteBuffer) {
        switch (this.a) {
            case 0:
                if (byteBuffer.get() == 116) {
                    C0848Kq c0848Kq = new C0848Kq(byteBuffer.array(), byteBuffer.limit());
                    int i = 12;
                    c0848Kq.w(12);
                    int i2 = (c0848Kq.i() + c0848Kq.l(12)) - 4;
                    c0848Kq.w(44);
                    c0848Kq.x(c0848Kq.l(12));
                    c0848Kq.w(16);
                    ArrayList arrayList = new ArrayList();
                    while (c0848Kq.i() < i2) {
                        c0848Kq.w(48);
                        int iL = c0848Kq.l(8);
                        c0848Kq.w(4);
                        int i3 = c0848Kq.i() + c0848Kq.l(i);
                        String str = null;
                        String str2 = null;
                        while (c0848Kq.i() < i3) {
                            int iL2 = c0848Kq.l(8);
                            int iL3 = c0848Kq.l(8);
                            int i4 = c0848Kq.i() + iL3;
                            if (iL2 == 2) {
                                int iL4 = c0848Kq.l(16);
                                c0848Kq.w(8);
                                if (iL4 == 3) {
                                    while (c0848Kq.i() < i4) {
                                        int iL5 = c0848Kq.l(8);
                                        Charset charset = AbstractC8250yr.a;
                                        byte[] bArr = new byte[iL5];
                                        c0848Kq.o(iL5, bArr);
                                        String str3 = new String(bArr, charset);
                                        int iL6 = c0848Kq.l(8);
                                        for (int i5 = 0; i5 < iL6; i5++) {
                                            c0848Kq.x(c0848Kq.l(8));
                                        }
                                        str = str3;
                                    }
                                }
                            } else if (iL2 == 21) {
                                Charset charset2 = AbstractC8250yr.a;
                                byte[] bArr2 = new byte[iL3];
                                c0848Kq.o(iL3, bArr2);
                                str2 = new String(bArr2, charset2);
                            }
                            c0848Kq.t(i4 * 8);
                        }
                        c0848Kq.t(i3 * 8);
                        if (str != null && str2 != null) {
                            arrayList.add(new G7(iL, str.concat(str2)));
                        }
                        i = 12;
                    }
                    if (!arrayList.isEmpty()) {
                        return new C0540Gr0(arrayList);
                    }
                }
                return null;
            default:
                return new C0540Gr0(e(new C4103hA0(byteBuffer.array(), byteBuffer.limit())));
        }
    }
}
