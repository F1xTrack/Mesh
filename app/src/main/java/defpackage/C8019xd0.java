package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* renamed from: xd0 */
/* loaded from: classes2.dex */
public final class C8019xd0 implements InterfaceC5261jA0 {
    public final /* synthetic */ int a;

    static {
        int i = DR.b;
    }

    public /* synthetic */ C8019xd0(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC5261jA0
    public final Object a(C5780lu c5780lu, DR dr) {
        switch (this.a) {
            case 0:
                return new C8399zd0(c5780lu);
            case 1:
                return new C0030Ad0(c5780lu);
            case 2:
                return new C0186Cd0(c5780lu, dr);
            case 3:
                return new C0576Hd0(c5780lu, dr);
            case 4:
                return new C0498Gd0(c5780lu);
            case 5:
                return new QE0(c5780lu, dr);
            case 6:
                return new OE0(c5780lu, dr);
            case 7:
                return new NE0(c5780lu, dr);
            case 8:
                return new TE0(c5780lu, dr);
            case 9:
                return new VE0(c5780lu, dr);
            case 10:
                return new XE0(c5780lu, dr);
            case 11:
                return new C2289bF0(c5780lu, dr);
            case 12:
                return new C3355dF0(c5780lu, dr);
            case 13:
                return new C3927gF0(c5780lu, dr);
            case 14:
                return new C4309iF0(c5780lu, dr);
            case 15:
                return new C5849mF0(c5780lu, dr);
            case 16:
                return new C6231oF0(c5780lu, dr);
            case 17:
                return new C6613qF0(c5780lu, dr);
            case 18:
                return new C7376uF0(c5780lu, dr);
            case 19:
                return new C7185tF0(c5780lu);
            case 20:
                return new C7567vF0(c5780lu);
            case 21:
                return new AF0(c5780lu, dr);
            case 22:
                return new C8137yF0(c5780lu, dr);
            case 23:
                return new CF0(c5780lu, dr);
            case 24:
                return new FF0(c5780lu, dr);
            case 25:
                return new GF0(c5780lu, dr);
            case 26:
                return new IF0(c5780lu, dr);
            case 27:
                return new MF0(c5780lu);
            default:
                return new NF0(c5780lu, dr);
        }
    }

    public final K0 b(ByteArrayInputStream byteArrayInputStream, DR dr) throws IOException {
        K0 k0;
        try {
            int i = byteArrayInputStream.read();
            if (i == -1) {
                k0 = null;
            } else {
                if ((i & 128) != 0) {
                    i &= 127;
                    int i2 = 7;
                    while (true) {
                        if (i2 >= 32) {
                            while (i2 < 64) {
                                int i3 = byteArrayInputStream.read();
                                if (i3 == -1) {
                                    throw Y90.a();
                                }
                                if ((i3 & 128) != 0) {
                                    i2 += 7;
                                }
                            }
                            throw new Y90("CodedInputStream encountered a malformed varint.");
                        }
                        int i4 = byteArrayInputStream.read();
                        if (i4 == -1) {
                            throw Y90.a();
                        }
                        i |= (i4 & 127) << i2;
                        if ((i4 & 128) == 0) {
                            break;
                        }
                        i2 += 7;
                    }
                }
                C5780lu c5780lu = new C5780lu(new I0(byteArrayInputStream, i));
                K0 k02 = (K0) a(c5780lu, dr);
                try {
                    c5780lu.a(0);
                    k0 = k02;
                } catch (Y90 e) {
                    e.a = k02;
                    throw e;
                }
            }
            if (k0 == null || k0.e()) {
                return k0;
            }
            Y90 y90 = new Y90(new C7074sg().getMessage());
            y90.a = k0;
            throw y90;
        } catch (IOException e2) {
            throw new Y90(e2.getMessage());
        }
    }
}
