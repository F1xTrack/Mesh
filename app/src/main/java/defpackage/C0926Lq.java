package defpackage;

import android.text.SpannableStringBuilder;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;

/* renamed from: Lq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0926Lq extends AbstractC1159Oq {
    public final C4103hA0 h = new C4103hA0();
    public final C0848Kq i = new C0848Kq();
    public int j = -1;
    public final int k;
    public final C0770Jq[] l;
    public C0770Jq m;
    public List n;
    public List o;
    public C0848Kq p;
    public int q;

    public C0926Lq(int i, List list) {
        this.k = i == -1 ? 1 : i;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b = ((byte[]) list.get(0))[0];
        }
        this.l = new C0770Jq[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.l[i2] = new C0770Jq();
        }
        this.m = this.l[0];
    }

    @Override // defpackage.AbstractC1159Oq
    public final C1237Pq f() {
        List list = this.n;
        this.o = list;
        list.getClass();
        return new C1237Pq(list);
    }

    @Override // defpackage.AbstractC1159Oq, defpackage.VD
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.q = 0;
        this.m = this.l[0];
        l();
        this.p = null;
    }

    @Override // defpackage.AbstractC1159Oq
    public final void g(C1003Mq c1003Mq) {
        ByteBuffer byteBuffer = c1003Mq.e;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C4103hA0 c4103hA0 = this.h;
        c4103hA0.E(iLimit, bArrArray);
        while (c4103hA0.a() >= 3) {
            int iU = c4103hA0.u();
            int i = iU & 3;
            boolean z = (iU & 4) == 4;
            byte bU = (byte) c4103hA0.u();
            byte bU2 = (byte) c4103hA0.u();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        j();
                        int i2 = (bU & 192) >> 6;
                        int i3 = this.j;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            l();
                            AbstractC6789rA1.h("Sequence number discontinuity. previous=" + this.j + " current=" + i2);
                        }
                        this.j = i2;
                        int i4 = bU & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        C0848Kq c0848Kq = new C0848Kq(i2, i4);
                        this.p = c0848Kq;
                        c0848Kq.e = 1;
                        c0848Kq.b[0] = bU2;
                    } else {
                        YN1.c(i == 2);
                        C0848Kq c0848Kq2 = this.p;
                        if (c0848Kq2 == null) {
                            AbstractC6789rA1.d("Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = c0848Kq2.b;
                            int i5 = c0848Kq2.e;
                            int i6 = i5 + 1;
                            c0848Kq2.e = i6;
                            bArr[i5] = bU;
                            c0848Kq2.e = i5 + 2;
                            bArr[i6] = bU2;
                        }
                    }
                    C0848Kq c0848Kq3 = this.p;
                    if (c0848Kq3.e == (c0848Kq3.d * 2) - 1) {
                        j();
                    }
                }
            }
        }
    }

    @Override // defpackage.AbstractC1159Oq
    public final boolean i() {
        return this.n != this.o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void j() {
        int i;
        boolean z;
        int i2;
        int i3;
        char c;
        C0848Kq c0848Kq = this.p;
        if (c0848Kq == null) {
            return;
        }
        int i4 = 2;
        boolean z2 = true;
        if (c0848Kq.e != (c0848Kq.d * 2) - 1) {
            AbstractC6789rA1.c("DtvCcPacket ended prematurely; size is " + ((this.p.d * 2) - 1) + ", but current index is " + this.p.e + " (sequence number " + this.p.c + ");");
        }
        C0848Kq c0848Kq2 = this.p;
        byte[] bArr = c0848Kq2.b;
        int i5 = c0848Kq2.e;
        C0848Kq c0848Kq3 = this.i;
        c0848Kq3.r(i5, bArr);
        boolean z3 = false;
        while (true) {
            if (c0848Kq3.c() > 0) {
                int i6 = 3;
                int iL = c0848Kq3.l(3);
                int iL2 = c0848Kq3.l(5);
                int i7 = 7;
                if (iL == 7) {
                    c0848Kq3.w(i4);
                    iL = c0848Kq3.l(6);
                    if (iL < 7) {
                        NX.p("Invalid extended service number: ", iL);
                    }
                }
                if (iL2 == 0) {
                    if (iL != 0) {
                        AbstractC6789rA1.h("serviceNumber is non-zero (" + iL + ") when blockSize is 0");
                    }
                } else if (iL != this.k) {
                    c0848Kq3.x(iL2);
                } else {
                    int iJ = (iL2 * 8) + c0848Kq3.j();
                    while (c0848Kq3.j() < iJ) {
                        int iL3 = c0848Kq3.l(8);
                        if (iL3 != 16) {
                            if (iL3 <= 31) {
                                if (iL3 != 0) {
                                    if (iL3 == i6) {
                                        this.n = k();
                                    } else if (iL3 != 8) {
                                        switch (iL3) {
                                            case 12:
                                                l();
                                                break;
                                            case 13:
                                                this.m.a('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (iL3 < 17 || iL3 > 23) {
                                                    if (iL3 < 24 || iL3 > 31) {
                                                        NX.p("Invalid C0 command: ", iL3);
                                                        break;
                                                    } else {
                                                        AbstractC6789rA1.h("Currently unsupported COMMAND_P16 Command: " + iL3);
                                                        c0848Kq3.w(16);
                                                        break;
                                                    }
                                                } else {
                                                    AbstractC6789rA1.h("Currently unsupported COMMAND_EXT1 Command: " + iL3);
                                                    c0848Kq3.w(8);
                                                    break;
                                                }
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder = this.m.b;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i3 = i4;
                                i = i6;
                                i2 = i7;
                            } else if (iL3 <= 127) {
                                if (iL3 == 127) {
                                    this.m.a((char) 9835);
                                } else {
                                    this.m.a((char) (iL3 & KotlinVersion.MAX_COMPONENT_VALUE));
                                }
                                i3 = i4;
                                i = i6;
                                i2 = i7;
                                z3 = true;
                            } else {
                                if (iL3 <= 159) {
                                    C0770Jq[] c0770JqArr = this.l;
                                    switch (iL3) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            i = i6;
                                            z = true;
                                            int i8 = iL3 - 128;
                                            if (this.q != i8) {
                                                this.q = i8;
                                                this.m = c0770JqArr[i8];
                                                break;
                                            }
                                            break;
                                        case ModuleDescriptor.MODULE_VERSION /* 136 */:
                                            i = i6;
                                            z = true;
                                            for (int i9 = 1; i9 <= 8; i9++) {
                                                if (c0848Kq3.k()) {
                                                    C0770Jq c0770Jq = c0770JqArr[8 - i9];
                                                    c0770Jq.a.clear();
                                                    c0770Jq.b.clear();
                                                    c0770Jq.o = -1;
                                                    c0770Jq.p = -1;
                                                    c0770Jq.q = -1;
                                                    c0770Jq.s = -1;
                                                    c0770Jq.u = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            i = i6;
                                            for (int i10 = 1; i10 <= 8; i10++) {
                                                if (c0848Kq3.k()) {
                                                    c0770JqArr[8 - i10].d = true;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 138:
                                            i = i6;
                                            for (int i11 = 1; i11 <= 8; i11++) {
                                                if (c0848Kq3.k()) {
                                                    c0770JqArr[8 - i11].d = false;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 139:
                                            i = i6;
                                            for (int i12 = 1; i12 <= 8; i12++) {
                                                if (c0848Kq3.k()) {
                                                    c0770JqArr[8 - i12].d = !r1.d;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 140:
                                            i = i6;
                                            for (int i13 = 1; i13 <= 8; i13++) {
                                                if (c0848Kq3.k()) {
                                                    c0770JqArr[8 - i13].d();
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 141:
                                            i = i6;
                                            c0848Kq3.w(8);
                                            z = true;
                                            break;
                                        case 142:
                                            i = i6;
                                            z = true;
                                            break;
                                        case 143:
                                            i = i6;
                                            l();
                                            z = true;
                                            break;
                                        case 144:
                                            if (!this.m.c) {
                                                c0848Kq3.w(16);
                                                i = 3;
                                                z = true;
                                                break;
                                            } else {
                                                c0848Kq3.l(4);
                                                c0848Kq3.l(2);
                                                c0848Kq3.l(2);
                                                boolean zK = c0848Kq3.k();
                                                boolean zK2 = c0848Kq3.k();
                                                i = 3;
                                                c0848Kq3.l(3);
                                                c0848Kq3.l(3);
                                                this.m.e(zK, zK2);
                                                z = true;
                                            }
                                        case 145:
                                            if (this.m.c) {
                                                int iC = C0770Jq.c(c0848Kq3.l(2), c0848Kq3.l(2), c0848Kq3.l(2), c0848Kq3.l(2));
                                                int iC2 = C0770Jq.c(c0848Kq3.l(2), c0848Kq3.l(2), c0848Kq3.l(2), c0848Kq3.l(2));
                                                c0848Kq3.w(2);
                                                C0770Jq.c(c0848Kq3.l(2), c0848Kq3.l(2), c0848Kq3.l(2), 0);
                                                this.m.f(iC, iC2);
                                            } else {
                                                c0848Kq3.w(24);
                                            }
                                            i = 3;
                                            z = true;
                                            break;
                                        case 146:
                                            if (this.m.c) {
                                                c0848Kq3.w(4);
                                                int iL4 = c0848Kq3.l(4);
                                                c0848Kq3.w(2);
                                                c0848Kq3.l(6);
                                                C0770Jq c0770Jq2 = this.m;
                                                if (c0770Jq2.u != iL4) {
                                                    c0770Jq2.a('\n');
                                                }
                                                c0770Jq2.u = iL4;
                                            } else {
                                                c0848Kq3.w(16);
                                            }
                                            i = 3;
                                            z = true;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            NX.p("Invalid C1 command: ", iL3);
                                            i = i6;
                                            z = true;
                                            break;
                                        case 151:
                                            if (this.m.c) {
                                                int iC3 = C0770Jq.c(c0848Kq3.l(2), c0848Kq3.l(2), c0848Kq3.l(2), c0848Kq3.l(2));
                                                c0848Kq3.l(2);
                                                C0770Jq.c(c0848Kq3.l(2), c0848Kq3.l(2), c0848Kq3.l(2), 0);
                                                c0848Kq3.k();
                                                c0848Kq3.k();
                                                c0848Kq3.l(2);
                                                c0848Kq3.l(2);
                                                int iL5 = c0848Kq3.l(2);
                                                c0848Kq3.w(8);
                                                C0770Jq c0770Jq3 = this.m;
                                                c0770Jq3.n = iC3;
                                                c0770Jq3.k = iL5;
                                            } else {
                                                c0848Kq3.w(32);
                                            }
                                            i = 3;
                                            z = true;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i14 = iL3 - 152;
                                            C0770Jq c0770Jq4 = c0770JqArr[i14];
                                            c0848Kq3.w(i4);
                                            boolean zK3 = c0848Kq3.k();
                                            c0848Kq3.w(i4);
                                            int iL6 = c0848Kq3.l(i6);
                                            boolean zK4 = c0848Kq3.k();
                                            int iL7 = c0848Kq3.l(i7);
                                            int iL8 = c0848Kq3.l(8);
                                            int iL9 = c0848Kq3.l(4);
                                            int iL10 = c0848Kq3.l(4);
                                            c0848Kq3.w(i4);
                                            c0848Kq3.w(6);
                                            c0848Kq3.w(i4);
                                            int iL11 = c0848Kq3.l(i6);
                                            int iL12 = c0848Kq3.l(i6);
                                            c0770Jq4.c = true;
                                            c0770Jq4.d = zK3;
                                            c0770Jq4.e = iL6;
                                            c0770Jq4.f = zK4;
                                            c0770Jq4.g = iL7;
                                            c0770Jq4.h = iL8;
                                            c0770Jq4.i = iL9;
                                            int i15 = iL10 + 1;
                                            if (c0770Jq4.j != i15) {
                                                c0770Jq4.j = i15;
                                                while (true) {
                                                    ArrayList arrayList = c0770Jq4.a;
                                                    if (arrayList.size() >= c0770Jq4.j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (iL11 != 0 && c0770Jq4.l != iL11) {
                                                c0770Jq4.l = iL11;
                                                int i16 = iL11 - 1;
                                                int i17 = C0770Jq.B[i16];
                                                boolean z4 = C0770Jq.A[i16];
                                                int i18 = C0770Jq.y[i16];
                                                int i19 = C0770Jq.z[i16];
                                                int i20 = C0770Jq.x[i16];
                                                c0770Jq4.n = i17;
                                                c0770Jq4.k = i20;
                                            }
                                            if (iL12 != 0 && c0770Jq4.m != iL12) {
                                                c0770Jq4.m = iL12;
                                                int i21 = iL12 - 1;
                                                int i22 = C0770Jq.D[i21];
                                                int i23 = C0770Jq.C[i21];
                                                c0770Jq4.e(false, false);
                                                c0770Jq4.f(C0770Jq.v, C0770Jq.E[i21]);
                                            }
                                            if (this.q != i14) {
                                                this.q = i14;
                                                this.m = c0770JqArr[i14];
                                            }
                                            i = 3;
                                            z = true;
                                            break;
                                    }
                                } else {
                                    i = i6;
                                    z = true;
                                    if (iL3 <= 255) {
                                        this.m.a((char) (iL3 & KotlinVersion.MAX_COMPONENT_VALUE));
                                    } else {
                                        NX.p("Invalid base command: ", iL3);
                                        i3 = 2;
                                        i2 = 7;
                                    }
                                }
                                z3 = z;
                                i3 = 2;
                                i2 = 7;
                            }
                            z = true;
                        } else {
                            i = i6;
                            z = true;
                            int iL13 = c0848Kq3.l(8);
                            if (iL13 <= 31) {
                                i2 = 7;
                                if (iL13 > 7) {
                                    if (iL13 <= 15) {
                                        c0848Kq3.w(8);
                                    } else if (iL13 <= 23) {
                                        c0848Kq3.w(16);
                                    } else if (iL13 <= 31) {
                                        c0848Kq3.w(24);
                                    }
                                }
                            } else {
                                i2 = 7;
                                if (iL13 <= 127) {
                                    if (iL13 == 32) {
                                        this.m.a(' ');
                                    } else if (iL13 == 33) {
                                        this.m.a((char) 160);
                                    } else if (iL13 == 37) {
                                        this.m.a((char) 8230);
                                    } else if (iL13 == 42) {
                                        this.m.a((char) 352);
                                    } else if (iL13 == 44) {
                                        this.m.a((char) 338);
                                    } else if (iL13 == 63) {
                                        this.m.a((char) 376);
                                    } else if (iL13 == 57) {
                                        this.m.a((char) 8482);
                                    } else if (iL13 == 58) {
                                        this.m.a((char) 353);
                                    } else if (iL13 == 60) {
                                        this.m.a((char) 339);
                                    } else if (iL13 != 61) {
                                        switch (iL13) {
                                            case 48:
                                                this.m.a((char) 9608);
                                                break;
                                            case 49:
                                                this.m.a((char) 8216);
                                                break;
                                            case 50:
                                                this.m.a((char) 8217);
                                                break;
                                            case 51:
                                                this.m.a((char) 8220);
                                                break;
                                            case 52:
                                                this.m.a((char) 8221);
                                                break;
                                            case 53:
                                                this.m.a((char) 8226);
                                                break;
                                            default:
                                                switch (iL13) {
                                                    case 118:
                                                        this.m.a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.m.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.m.a((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.m.a((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.m.a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.m.a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.m.a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.m.a((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.m.a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.m.a((char) 9484);
                                                        break;
                                                    default:
                                                        NX.p("Invalid G2 character: ", iL13);
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.m.a((char) 8480);
                                    }
                                    z3 = true;
                                } else {
                                    if (iL13 > 159) {
                                        i3 = 2;
                                        c = 6;
                                        if (iL13 <= 255) {
                                            if (iL13 == 160) {
                                                this.m.a((char) 13252);
                                            } else {
                                                NX.p("Invalid G3 character: ", iL13);
                                                this.m.a('_');
                                            }
                                            z3 = true;
                                        } else {
                                            NX.p("Invalid extended command: ", iL13);
                                        }
                                    } else if (iL13 <= 135) {
                                        c0848Kq3.w(32);
                                    } else if (iL13 <= 143) {
                                        c0848Kq3.w(40);
                                    } else if (iL13 <= 159) {
                                        i3 = 2;
                                        c0848Kq3.w(2);
                                        c = 6;
                                        c0848Kq3.w(c0848Kq3.l(6) * 8);
                                    }
                                    i6 = i;
                                    i4 = i3;
                                    z2 = z;
                                    i7 = i2;
                                }
                            }
                            i3 = 2;
                        }
                        c = 6;
                        i6 = i;
                        i4 = i3;
                        z2 = z;
                        i7 = i2;
                    }
                }
            }
        }
        if (z3) {
            this.n = k();
        }
        this.p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List k() {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0926Lq.k():java.util.List");
    }

    public final void l() {
        for (int i = 0; i < 8; i++) {
            this.l[i].d();
        }
    }
}
