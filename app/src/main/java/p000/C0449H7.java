package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: H7 */
/* loaded from: classes.dex */
public final class C0449H7 extends AbstractC10012kS1 {

    /* renamed from: a */
    public final /* synthetic */ int f4133a;

    public /* synthetic */ C0449H7(int i) {
        this.f4133a = i;
    }

    /* renamed from: e */
    public static C0719LP m3311e(C9591hA0 c9591hA0) {
        String strM18758p = c9591hA0.m18758p();
        strM18758p.getClass();
        String strM18758p2 = c9591hA0.m18758p();
        strM18758p2.getClass();
        return new C0719LP(strM18758p, strM18758p2, c9591hA0.m18757o(), c9591hA0.m18757o(), Arrays.copyOfRange(c9591hA0.f28293a, c9591hA0.f28294b, c9591hA0.f28295c));
    }

    @Override // p000.AbstractC10012kS1
    /* renamed from: c */
    public final C7660Gr0 mo3312c(C7816Jr0 c7816Jr0, ByteBuffer byteBuffer) {
        switch (this.f4133a) {
            case 0:
                if (byteBuffer.get() == 116) {
                    C0683Kq c0683Kq = new C0683Kq(byteBuffer.array(), byteBuffer.limit());
                    int i = 12;
                    c0683Kq.m4763w(12);
                    int iM4749i = (c0683Kq.m4749i() + c0683Kq.m4752l(12)) - 4;
                    c0683Kq.m4763w(44);
                    c0683Kq.m4764x(c0683Kq.m4752l(12));
                    c0683Kq.m4763w(16);
                    ArrayList arrayList = new ArrayList();
                    while (c0683Kq.m4749i() < iM4749i) {
                        c0683Kq.m4763w(48);
                        int iM4752l = c0683Kq.m4752l(8);
                        c0683Kq.m4763w(4);
                        int iM4749i2 = c0683Kq.m4749i() + c0683Kq.m4752l(i);
                        String str = null;
                        String str2 = null;
                        while (c0683Kq.m4749i() < iM4749i2) {
                            int iM4752l2 = c0683Kq.m4752l(8);
                            int iM4752l3 = c0683Kq.m4752l(8);
                            int iM4749i3 = c0683Kq.m4749i() + iM4752l3;
                            if (iM4752l2 == 2) {
                                int iM4752l4 = c0683Kq.m4752l(16);
                                c0683Kq.m4763w(8);
                                if (iM4752l4 == 3) {
                                    while (c0683Kq.m4749i() < iM4749i3) {
                                        int iM4752l5 = c0683Kq.m4752l(8);
                                        Charset charset = AbstractC7227yr.f46509a;
                                        byte[] bArr = new byte[iM4752l5];
                                        c0683Kq.m4755o(iM4752l5, bArr);
                                        String str3 = new String(bArr, charset);
                                        int iM4752l6 = c0683Kq.m4752l(8);
                                        for (int i2 = 0; i2 < iM4752l6; i2++) {
                                            c0683Kq.m4764x(c0683Kq.m4752l(8));
                                        }
                                        str = str3;
                                    }
                                }
                            } else if (iM4752l2 == 21) {
                                Charset charset2 = AbstractC7227yr.f46509a;
                                byte[] bArr2 = new byte[iM4752l3];
                                c0683Kq.m4755o(iM4752l3, bArr2);
                                str2 = new String(bArr2, charset2);
                            }
                            c0683Kq.m4760t(iM4749i3 * 8);
                        }
                        c0683Kq.m4760t(iM4749i2 * 8);
                        if (str != null && str2 != null) {
                            arrayList.add(new C0386G7(iM4752l, str.concat(str2)));
                        }
                        i = 12;
                    }
                    if (!arrayList.isEmpty()) {
                        return new C7660Gr0(arrayList);
                    }
                }
                return null;
            default:
                return new C7660Gr0(m3311e(new C9591hA0(byteBuffer.array(), byteBuffer.limit())));
        }
    }
}
