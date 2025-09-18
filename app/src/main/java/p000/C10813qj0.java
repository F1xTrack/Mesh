package p000;

import java.util.Arrays;

/* renamed from: qj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10813qj0 implements InterfaceC4067ff {

    /* renamed from: a */
    public final C9367fQ0 f41115a;

    /* renamed from: b */
    public final int f41116b;

    public C10813qj0(int i, C9367fQ0 c9367fQ0) {
        this.f41116b = i;
        this.f41115a = c9367fQ0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    public static C10813qj0 m24052b(int i, C9591hA0 c9591hA0) {
        String str;
        InterfaceC4067ff c4256if;
        int i2;
        int i3 = 4;
        AbstractC9246eT1.m17997b(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i4 = c9591hA0.f28295c;
        int i5 = 0;
        int i6 = -2;
        int i7 = 0;
        while (c9591hA0.m18743a() > 8) {
            int iM18751i = c9591hA0.m18751i();
            int iM18751i2 = c9591hA0.f28294b + c9591hA0.m18751i();
            c9591hA0.m18740F(iM18751i2);
            if (iM18751i != 1414744396) {
                C9070d51 c9070d51 = null;
                switch (iM18751i) {
                    case 1718776947:
                        if (i6 == 2) {
                            c9591hA0.m18742H(i3);
                            int iM18751i3 = c9591hA0.m18751i();
                            int iM18751i4 = c9591hA0.m18751i();
                            c9591hA0.m18742H(i3);
                            int iM18751i5 = c9591hA0.m18751i();
                            switch (iM18751i5) {
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
                                AbstractC0852NX.m5767p("Ignoring track with unsupported compression ", iM18751i5);
                            } else {
                                C6623pX c6623pX = new C6623pX();
                                c6623pX.f40167r = iM18751i3;
                                c6623pX.f40168s = iM18751i4;
                                c6623pX.f40161l = AbstractC8544Xr0.m9171n(str);
                                c9070d51 = new C9070d51(new C6686qX(c6623pX));
                            }
                        } else if (i6 == 1) {
                            int iM18756n = c9591hA0.m18756n();
                            String str2 = iM18756n != 1 ? iM18756n != 85 ? iM18756n != 255 ? iM18756n != 8192 ? iM18756n != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str2 == null) {
                                AbstractC0852NX.m5767p("Ignoring track with unsupported format tag ", iM18756n);
                            } else {
                                int iM18756n2 = c9591hA0.m18756n();
                                int iM18751i6 = c9591hA0.m18751i();
                                c9591hA0.m18742H(6);
                                int iM1786A = AbstractC7485Dh1.m1786A(c9591hA0.m18756n());
                                int iM18756n3 = c9591hA0.m18743a() > 0 ? c9591hA0.m18756n() : i5;
                                byte[] bArr = new byte[iM18756n3];
                                c9591hA0.m18747e(bArr, i5, iM18756n3);
                                C6623pX c6623pX2 = new C6623pX();
                                c6623pX2.f40161l = AbstractC8544Xr0.m9171n(str2);
                                c6623pX2.f40175z = iM18756n2;
                                c6623pX2.f40141A = iM18751i6;
                                if ("audio/raw".equals(str2) && iM1786A != 0) {
                                    c6623pX2.f40142B = iM1786A;
                                }
                                if ("audio/mp4a-latm".equals(str2) && iM18756n3 > 0) {
                                    c6623pX2.f40164o = P70.m6229B(bArr);
                                }
                                c9070d51 = new C9070d51(new C6686qX(c6623pX2));
                            }
                        } else {
                            AbstractC10872rA1.m24175h("Ignoring strf box for unsupported track type: " + AbstractC7485Dh1.m1792G(i6));
                        }
                        c4256if = c9070d51;
                        break;
                    case 1751742049:
                        int iM18751i7 = c9591hA0.m18751i();
                        c9591hA0.m18742H(8);
                        int iM18751i8 = c9591hA0.m18751i();
                        int iM18751i9 = c9591hA0.m18751i();
                        c9591hA0.m18742H(i3);
                        c9591hA0.m18751i();
                        c9591hA0.m18742H(12);
                        c4256if = new C4256if(iM18751i7, iM18751i8, iM18751i9);
                        break;
                    case 1752331379:
                        int iM18751i10 = c9591hA0.m18751i();
                        c9591hA0.m18742H(12);
                        c9591hA0.m18751i();
                        int iM18751i11 = c9591hA0.m18751i();
                        int iM18751i12 = c9591hA0.m18751i();
                        c9591hA0.m18742H(i3);
                        int iM18751i13 = c9591hA0.m18751i();
                        int iM18751i14 = c9591hA0.m18751i();
                        c9591hA0.m18742H(8);
                        c4256if = new C6251jf(iM18751i10, iM18751i11, iM18751i12, iM18751i13, iM18751i14);
                        break;
                    case 1852994675:
                        c4256if = new C9454g51(c9591hA0.m18761s(c9591hA0.m18743a(), AbstractC7227yr.f46511c));
                        break;
                    default:
                        c4256if = c9070d51;
                        break;
                }
            } else {
                c4256if = m24052b(c9591hA0.m18751i(), c9591hA0);
            }
            if (c4256if != null) {
                if (c4256if.getType() == 1752331379) {
                    int i8 = ((C6251jf) c4256if).f35305a;
                    if (i8 == 1935960438) {
                        i6 = 2;
                    } else if (i8 != 1935963489) {
                        if (i8 != 1937012852) {
                            AbstractC10872rA1.m24175h("Found unsupported streamType fourCC: " + Integer.toHexString(i8));
                            i2 = -1;
                        } else {
                            i2 = 3;
                        }
                        i6 = i2;
                    } else {
                        i6 = 1;
                    }
                }
                int i9 = i7 + 1;
                if (objArrCopyOf.length < i9) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, I70.m3754f(objArrCopyOf.length, i9));
                }
                objArrCopyOf[i7] = c4256if;
                i7 = i9;
            }
            c9591hA0.m18741G(iM18751i2);
            c9591hA0.m18740F(i4);
            i3 = 4;
            i5 = 0;
        }
        return new C10813qj0(i, P70.m6232s(i7, objArrCopyOf));
    }

    /* renamed from: a */
    public final InterfaceC4067ff m24053a(Class cls) {
        N70 n70ListIterator = this.f41115a.listIterator(0);
        while (n70ListIterator.hasNext()) {
            InterfaceC4067ff interfaceC4067ff = (InterfaceC4067ff) n70ListIterator.next();
            if (interfaceC4067ff.getClass() == cls) {
                return interfaceC4067ff;
            }
        }
        return null;
    }

    @Override // p000.InterfaceC4067ff
    public final int getType() {
        return this.f41116b;
    }
}
