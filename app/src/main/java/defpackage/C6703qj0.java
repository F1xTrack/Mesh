package defpackage;

import java.util.Arrays;

/* renamed from: qj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6703qj0 implements InterfaceC3813ff {
    public final C3769fQ0 a;
    public final int b;

    public C6703qj0(int i, C3769fQ0 c3769fQ0) {
        this.b = i;
        this.a = c3769fQ0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static C6703qj0 b(int i, C4103hA0 c4103hA0) {
        String str;
        InterfaceC3813ff cif;
        int i2;
        int i3 = 4;
        AbstractC3588eT1.b(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i4 = c4103hA0.c;
        int i5 = 0;
        int i6 = -2;
        int i7 = 0;
        while (c4103hA0.a() > 8) {
            int i8 = c4103hA0.i();
            int i9 = c4103hA0.b + c4103hA0.i();
            c4103hA0.F(i9);
            if (i8 != 1414744396) {
                C3326d51 c3326d51 = null;
                switch (i8) {
                    case 1718776947:
                        if (i6 == 2) {
                            c4103hA0.H(i3);
                            int i10 = c4103hA0.i();
                            int i11 = c4103hA0.i();
                            c4103hA0.H(i3);
                            int i12 = c4103hA0.i();
                            switch (i12) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str == null) {
                                NX.p("Ignoring track with unsupported compression ", i12);
                            } else {
                                C6475pX c6475pX = new C6475pX();
                                c6475pX.r = i10;
                                c6475pX.s = i11;
                                c6475pX.l = AbstractC1865Xr0.n(str);
                                c3326d51 = new C3326d51(new C6666qX(c6475pX));
                            }
                        } else if (i6 == 1) {
                            int iN = c4103hA0.n();
                            String str2 = iN != 1 ? iN != 85 ? iN != 255 ? iN != 8192 ? iN != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str2 == null) {
                                NX.p("Ignoring track with unsupported format tag ", iN);
                            } else {
                                int iN2 = c4103hA0.n();
                                int i13 = c4103hA0.i();
                                c4103hA0.H(6);
                                int iA = AbstractC0277Dh1.A(c4103hA0.n());
                                int iN3 = c4103hA0.a() > 0 ? c4103hA0.n() : i5;
                                byte[] bArr = new byte[iN3];
                                c4103hA0.e(bArr, i5, iN3);
                                C6475pX c6475pX2 = new C6475pX();
                                c6475pX2.l = AbstractC1865Xr0.n(str2);
                                c6475pX2.z = iN2;
                                c6475pX2.A = i13;
                                if ("audio/raw".equals(str2) && iA != 0) {
                                    c6475pX2.B = iA;
                                }
                                if ("audio/mp4a-latm".equals(str2) && iN3 > 0) {
                                    c6475pX2.o = P70.B(bArr);
                                }
                                c3326d51 = new C3326d51(new C6666qX(c6475pX2));
                            }
                        } else {
                            AbstractC6789rA1.h("Ignoring strf box for unsupported track type: " + AbstractC0277Dh1.G(i6));
                        }
                        cif = c3326d51;
                        break;
                    case 1751742049:
                        int i14 = c4103hA0.i();
                        c4103hA0.H(8);
                        int i15 = c4103hA0.i();
                        int i16 = c4103hA0.i();
                        c4103hA0.H(i3);
                        c4103hA0.i();
                        c4103hA0.H(12);
                        cif = new Cif(i14, i15, i16);
                        break;
                    case 1752331379:
                        int i17 = c4103hA0.i();
                        c4103hA0.H(12);
                        c4103hA0.i();
                        int i18 = c4103hA0.i();
                        int i19 = c4103hA0.i();
                        c4103hA0.H(i3);
                        int i20 = c4103hA0.i();
                        int i21 = c4103hA0.i();
                        c4103hA0.H(8);
                        cif = new C5353jf(i17, i18, i19, i20, i21);
                        break;
                    case 1852994675:
                        cif = new C3898g51(c4103hA0.s(c4103hA0.a(), AbstractC8250yr.c));
                        break;
                    default:
                        cif = c3326d51;
                        break;
                }
            } else {
                cif = b(c4103hA0.i(), c4103hA0);
            }
            if (cif != null) {
                if (cif.getType() == 1752331379) {
                    int i22 = ((C5353jf) cif).a;
                    if (i22 == 1935960438) {
                        i6 = 2;
                    } else if (i22 != 1935963489) {
                        if (i22 != 1937012852) {
                            AbstractC6789rA1.h("Found unsupported streamType fourCC: " + Integer.toHexString(i22));
                            i2 = -1;
                        } else {
                            i2 = 3;
                        }
                        i6 = i2;
                    } else {
                        i6 = 1;
                    }
                }
                int i23 = i7 + 1;
                if (objArrCopyOf.length < i23) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, I70.f(objArrCopyOf.length, i23));
                }
                objArrCopyOf[i7] = cif;
                i7 = i23;
            }
            c4103hA0.G(i9);
            c4103hA0.F(i4);
            i3 = 4;
            i5 = 0;
        }
        return new C6703qj0(i, P70.s(i7, objArrCopyOf));
    }

    public final InterfaceC3813ff a(Class cls) {
        N70 n70ListIterator = this.a.listIterator(0);
        while (n70ListIterator.hasNext()) {
            InterfaceC3813ff interfaceC3813ff = (InterfaceC3813ff) n70ListIterator.next();
            if (interfaceC3813ff.getClass() == cls) {
                return interfaceC3813ff;
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC3813ff
    public final int getType() {
        return this.b;
    }
}
