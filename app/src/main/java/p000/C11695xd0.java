package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* renamed from: xd0 */
/* loaded from: classes2.dex */
public final class C11695xd0 implements InterfaceC9847jA0 {

    /* renamed from: a */
    public final /* synthetic */ int f45718a;

    static {
        int i = C0217DR.f2015b;
    }

    public /* synthetic */ C11695xd0(int i) {
        this.f45718a = i;
    }

    @Override // p000.InterfaceC9847jA0
    /* renamed from: a */
    public final Object mo21982a(C6392lu c6392lu, C0217DR c0217dr) {
        switch (this.f45718a) {
            case 0:
                return new C11949zd0(c6392lu);
            case 1:
                return new C7320Ad0(c6392lu);
            case 2:
                return new C7424Cd0(c6392lu, c0217dr);
            case 3:
                return new C7684Hd0(c6392lu, c0217dr);
            case 4:
                return new C7632Gd0(c6392lu);
            case 5:
                return new QE0(c6392lu, c0217dr);
            case 6:
                return new OE0(c6392lu, c0217dr);
            case 7:
                return new NE0(c6392lu, c0217dr);
            case 8:
                return new TE0(c6392lu, c0217dr);
            case 9:
                return new VE0(c6392lu, c0217dr);
            case 10:
                return new XE0(c6392lu, c0217dr);
            case 11:
                return new C8828bF0(c6392lu, c0217dr);
            case 12:
                return new C9089dF0(c6392lu, c0217dr);
            case 13:
                return new C9473gF0(c6392lu, c0217dr);
            case 14:
                return new C9729iF0(c6392lu, c0217dr);
            case 15:
                return new C10241mF0(c6392lu, c0217dr);
            case 16:
                return new C10497oF0(c6392lu, c0217dr);
            case 17:
                return new C10753qF0(c6392lu, c0217dr);
            case 18:
                return new C11265uF0(c6392lu, c0217dr);
            case 19:
                return new C11137tF0(c6392lu);
            case 20:
                return new C11393vF0(c6392lu);
            case 21:
                return new AF0(c6392lu, c0217dr);
            case 22:
                return new C11774yF0(c6392lu, c0217dr);
            case 23:
                return new CF0(c6392lu, c0217dr);
            case 24:
                return new FF0(c6392lu, c0217dr);
            case 25:
                return new GF0(c6392lu, c0217dr);
            case 26:
                return new IF0(c6392lu, c0217dr);
            case 27:
                return new MF0(c6392lu);
            default:
                return new NF0(c6392lu, c0217dr);
        }
    }

    /* renamed from: b */
    public final AbstractC0631K0 m25925b(ByteArrayInputStream byteArrayInputStream, C0217DR c0217dr) throws IOException {
        AbstractC0631K0 abstractC0631K0;
        try {
            int i = byteArrayInputStream.read();
            if (i == -1) {
                abstractC0631K0 = null;
            } else {
                if ((i & 128) != 0) {
                    i &= 127;
                    int i2 = 7;
                    while (true) {
                        if (i2 >= 32) {
                            while (i2 < 64) {
                                int i3 = byteArrayInputStream.read();
                                if (i3 == -1) {
                                    throw Y90.m9227a();
                                }
                                if ((i3 & 128) != 0) {
                                    i2 += 7;
                                }
                            }
                            throw new Y90("CodedInputStream encountered a malformed varint.");
                        }
                        int i4 = byteArrayInputStream.read();
                        if (i4 == -1) {
                            throw Y90.m9227a();
                        }
                        i |= (i4 & 127) << i2;
                        if ((i4 & 128) == 0) {
                            break;
                        }
                        i2 += 7;
                    }
                }
                C6392lu c6392lu = new C6392lu(new C0505I0(byteArrayInputStream, i));
                AbstractC0631K0 abstractC0631K02 = (AbstractC0631K0) mo21982a(c6392lu, c0217dr);
                try {
                    c6392lu.m22573a(0);
                    abstractC0631K0 = abstractC0631K02;
                } catch (Y90 e) {
                    e.f14178a = abstractC0631K02;
                    throw e;
                }
            }
            if (abstractC0631K0 == null || abstractC0631K0.mo131e()) {
                return abstractC0631K0;
            }
            Y90 y90 = new Y90(new C6838sg().getMessage());
            y90.f14178a = abstractC0631K0;
            throw y90;
        } catch (IOException e2) {
            throw new Y90(e2.getMessage());
        }
    }
}
