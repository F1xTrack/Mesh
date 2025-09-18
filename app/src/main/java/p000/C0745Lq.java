package p000;

import android.text.SpannableStringBuilder;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;

/* renamed from: Lq */
/* loaded from: classes.dex */
public final class C0745Lq extends AbstractC0934Oq {

    /* renamed from: h */
    public final C9591hA0 f6884h = new C9591hA0();

    /* renamed from: i */
    public final C0683Kq f6885i = new C0683Kq();

    /* renamed from: j */
    public int f6886j = -1;

    /* renamed from: k */
    public final int f6887k;

    /* renamed from: l */
    public final C0620Jq[] f6888l;

    /* renamed from: m */
    public C0620Jq f6889m;

    /* renamed from: n */
    public List f6890n;

    /* renamed from: o */
    public List f6891o;

    /* renamed from: p */
    public C0683Kq f6892p;

    /* renamed from: q */
    public int f6893q;

    public C0745Lq(int i, List list) {
        this.f6887k = i == -1 ? 1 : i;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b = ((byte[]) list.get(0))[0];
        }
        this.f6888l = new C0620Jq[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f6888l[i2] = new C0620Jq();
        }
        this.f6889m = this.f6888l[0];
    }

    @Override // p000.AbstractC0934Oq
    /* renamed from: f */
    public final C0997Pq mo3600f() {
        List list = this.f6890n;
        this.f6891o = list;
        list.getClass();
        return new C0997Pq(list);
    }

    @Override // p000.AbstractC0934Oq, p000.InterfaceC1335VD
    public final void flush() {
        super.flush();
        this.f6890n = null;
        this.f6891o = null;
        this.f6893q = 0;
        this.f6889m = this.f6888l[0];
        m5116l();
        this.f6892p = null;
    }

    @Override // p000.AbstractC0934Oq
    /* renamed from: g */
    public final void mo3601g(C0808Mq c0808Mq) {
        ByteBuffer byteBuffer = c0808Mq.f14798e;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C9591hA0 c9591hA0 = this.f6884h;
        c9591hA0.m18739E(iLimit, bArrArray);
        while (c9591hA0.m18743a() >= 3) {
            int iM18763u = c9591hA0.m18763u();
            int i = iM18763u & 3;
            boolean z = (iM18763u & 4) == 4;
            byte bM18763u = (byte) c9591hA0.m18763u();
            byte bM18763u2 = (byte) c9591hA0.m18763u();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        m5114j();
                        int i2 = (bM18763u & 192) >> 6;
                        int i3 = this.f6886j;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            m5116l();
                            AbstractC10872rA1.m24175h("Sequence number discontinuity. previous=" + this.f6886j + " current=" + i2);
                        }
                        this.f6886j = i2;
                        int i4 = bM18763u & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        C0683Kq c0683Kq = new C0683Kq(i2, i4);
                        this.f6892p = c0683Kq;
                        c0683Kq.f6328e = 1;
                        c0683Kq.f6325b[0] = bM18763u2;
                    } else {
                        YN1.m9278c(i == 2);
                        C0683Kq c0683Kq2 = this.f6892p;
                        if (c0683Kq2 == null) {
                            AbstractC10872rA1.m24171d("Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = c0683Kq2.f6325b;
                            int i5 = c0683Kq2.f6328e;
                            int i6 = i5 + 1;
                            c0683Kq2.f6328e = i6;
                            bArr[i5] = bM18763u;
                            c0683Kq2.f6328e = i5 + 2;
                            bArr[i6] = bM18763u2;
                        }
                    }
                    C0683Kq c0683Kq3 = this.f6892p;
                    if (c0683Kq3.f6328e == (c0683Kq3.f6327d * 2) - 1) {
                        m5114j();
                    }
                }
            }
        }
    }

    @Override // p000.AbstractC0934Oq
    /* renamed from: i */
    public final boolean mo3603i() {
        return this.f6890n != this.f6891o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: j */
    public final void m5114j() {
        int i;
        boolean z;
        int i2;
        int i3;
        char c;
        C0683Kq c0683Kq = this.f6892p;
        if (c0683Kq == null) {
            return;
        }
        int i4 = 2;
        boolean z2 = true;
        if (c0683Kq.f6328e != (c0683Kq.f6327d * 2) - 1) {
            AbstractC10872rA1.m24170c("DtvCcPacket ended prematurely; size is " + ((this.f6892p.f6327d * 2) - 1) + ", but current index is " + this.f6892p.f6328e + " (sequence number " + this.f6892p.f6326c + ");");
        }
        C0683Kq c0683Kq2 = this.f6892p;
        byte[] bArr = c0683Kq2.f6325b;
        int i5 = c0683Kq2.f6328e;
        C0683Kq c0683Kq3 = this.f6885i;
        c0683Kq3.m4758r(i5, bArr);
        boolean z3 = false;
        while (true) {
            if (c0683Kq3.m4743c() > 0) {
                int i6 = 3;
                int iM4752l = c0683Kq3.m4752l(3);
                int iM4752l2 = c0683Kq3.m4752l(5);
                int i7 = 7;
                if (iM4752l == 7) {
                    c0683Kq3.m4763w(i4);
                    iM4752l = c0683Kq3.m4752l(6);
                    if (iM4752l < 7) {
                        AbstractC0852NX.m5767p("Invalid extended service number: ", iM4752l);
                    }
                }
                if (iM4752l2 == 0) {
                    if (iM4752l != 0) {
                        AbstractC10872rA1.m24175h("serviceNumber is non-zero (" + iM4752l + ") when blockSize is 0");
                    }
                } else if (iM4752l != this.f6887k) {
                    c0683Kq3.m4764x(iM4752l2);
                } else {
                    int iM4750j = (iM4752l2 * 8) + c0683Kq3.m4750j();
                    while (c0683Kq3.m4750j() < iM4750j) {
                        int iM4752l3 = c0683Kq3.m4752l(8);
                        if (iM4752l3 != 16) {
                            if (iM4752l3 <= 31) {
                                if (iM4752l3 != 0) {
                                    if (iM4752l3 == i6) {
                                        this.f6890n = m5115k();
                                    } else if (iM4752l3 != 8) {
                                        switch (iM4752l3) {
                                            case 12:
                                                m5116l();
                                                break;
                                            case 13:
                                                this.f6889m.m4448a('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (iM4752l3 < 17 || iM4752l3 > 23) {
                                                    if (iM4752l3 < 24 || iM4752l3 > 31) {
                                                        AbstractC0852NX.m5767p("Invalid C0 command: ", iM4752l3);
                                                        break;
                                                    } else {
                                                        AbstractC10872rA1.m24175h("Currently unsupported COMMAND_P16 Command: " + iM4752l3);
                                                        c0683Kq3.m4763w(16);
                                                        break;
                                                    }
                                                } else {
                                                    AbstractC10872rA1.m24175h("Currently unsupported COMMAND_EXT1 Command: " + iM4752l3);
                                                    c0683Kq3.m4763w(8);
                                                    break;
                                                }
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder = this.f6889m.f5730b;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i3 = i4;
                                i = i6;
                                i2 = i7;
                            } else if (iM4752l3 <= 127) {
                                if (iM4752l3 == 127) {
                                    this.f6889m.m4448a((char) 9835);
                                } else {
                                    this.f6889m.m4448a((char) (iM4752l3 & KotlinVersion.MAX_COMPONENT_VALUE));
                                }
                                i3 = i4;
                                i = i6;
                                i2 = i7;
                                z3 = true;
                            } else {
                                if (iM4752l3 <= 159) {
                                    C0620Jq[] c0620JqArr = this.f6888l;
                                    switch (iM4752l3) {
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
                                            int i8 = iM4752l3 - 128;
                                            if (this.f6893q != i8) {
                                                this.f6893q = i8;
                                                this.f6889m = c0620JqArr[i8];
                                                break;
                                            }
                                            break;
                                        case ModuleDescriptor.MODULE_VERSION /* 136 */:
                                            i = i6;
                                            z = true;
                                            for (int i9 = 1; i9 <= 8; i9++) {
                                                if (c0683Kq3.m4751k()) {
                                                    C0620Jq c0620Jq = c0620JqArr[8 - i9];
                                                    c0620Jq.f5729a.clear();
                                                    c0620Jq.f5730b.clear();
                                                    c0620Jq.f5743o = -1;
                                                    c0620Jq.f5744p = -1;
                                                    c0620Jq.f5745q = -1;
                                                    c0620Jq.f5747s = -1;
                                                    c0620Jq.f5749u = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            i = i6;
                                            for (int i10 = 1; i10 <= 8; i10++) {
                                                if (c0683Kq3.m4751k()) {
                                                    c0620JqArr[8 - i10].f5732d = true;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 138:
                                            i = i6;
                                            for (int i11 = 1; i11 <= 8; i11++) {
                                                if (c0683Kq3.m4751k()) {
                                                    c0620JqArr[8 - i11].f5732d = false;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 139:
                                            i = i6;
                                            for (int i12 = 1; i12 <= 8; i12++) {
                                                if (c0683Kq3.m4751k()) {
                                                    c0620JqArr[8 - i12].f5732d = !r1.f5732d;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 140:
                                            i = i6;
                                            for (int i13 = 1; i13 <= 8; i13++) {
                                                if (c0683Kq3.m4751k()) {
                                                    c0620JqArr[8 - i13].m4450d();
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 141:
                                            i = i6;
                                            c0683Kq3.m4763w(8);
                                            z = true;
                                            break;
                                        case 142:
                                            i = i6;
                                            z = true;
                                            break;
                                        case 143:
                                            i = i6;
                                            m5116l();
                                            z = true;
                                            break;
                                        case 144:
                                            if (!this.f6889m.f5731c) {
                                                c0683Kq3.m4763w(16);
                                                i = 3;
                                                z = true;
                                                break;
                                            } else {
                                                c0683Kq3.m4752l(4);
                                                c0683Kq3.m4752l(2);
                                                c0683Kq3.m4752l(2);
                                                boolean zM4751k = c0683Kq3.m4751k();
                                                boolean zM4751k2 = c0683Kq3.m4751k();
                                                i = 3;
                                                c0683Kq3.m4752l(3);
                                                c0683Kq3.m4752l(3);
                                                this.f6889m.m4451e(zM4751k, zM4751k2);
                                                z = true;
                                            }
                                        case 145:
                                            if (this.f6889m.f5731c) {
                                                int iM4447c = C0620Jq.m4447c(c0683Kq3.m4752l(2), c0683Kq3.m4752l(2), c0683Kq3.m4752l(2), c0683Kq3.m4752l(2));
                                                int iM4447c2 = C0620Jq.m4447c(c0683Kq3.m4752l(2), c0683Kq3.m4752l(2), c0683Kq3.m4752l(2), c0683Kq3.m4752l(2));
                                                c0683Kq3.m4763w(2);
                                                C0620Jq.m4447c(c0683Kq3.m4752l(2), c0683Kq3.m4752l(2), c0683Kq3.m4752l(2), 0);
                                                this.f6889m.m4452f(iM4447c, iM4447c2);
                                            } else {
                                                c0683Kq3.m4763w(24);
                                            }
                                            i = 3;
                                            z = true;
                                            break;
                                        case 146:
                                            if (this.f6889m.f5731c) {
                                                c0683Kq3.m4763w(4);
                                                int iM4752l4 = c0683Kq3.m4752l(4);
                                                c0683Kq3.m4763w(2);
                                                c0683Kq3.m4752l(6);
                                                C0620Jq c0620Jq2 = this.f6889m;
                                                if (c0620Jq2.f5749u != iM4752l4) {
                                                    c0620Jq2.m4448a('\n');
                                                }
                                                c0620Jq2.f5749u = iM4752l4;
                                            } else {
                                                c0683Kq3.m4763w(16);
                                            }
                                            i = 3;
                                            z = true;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            AbstractC0852NX.m5767p("Invalid C1 command: ", iM4752l3);
                                            i = i6;
                                            z = true;
                                            break;
                                        case 151:
                                            if (this.f6889m.f5731c) {
                                                int iM4447c3 = C0620Jq.m4447c(c0683Kq3.m4752l(2), c0683Kq3.m4752l(2), c0683Kq3.m4752l(2), c0683Kq3.m4752l(2));
                                                c0683Kq3.m4752l(2);
                                                C0620Jq.m4447c(c0683Kq3.m4752l(2), c0683Kq3.m4752l(2), c0683Kq3.m4752l(2), 0);
                                                c0683Kq3.m4751k();
                                                c0683Kq3.m4751k();
                                                c0683Kq3.m4752l(2);
                                                c0683Kq3.m4752l(2);
                                                int iM4752l5 = c0683Kq3.m4752l(2);
                                                c0683Kq3.m4763w(8);
                                                C0620Jq c0620Jq3 = this.f6889m;
                                                c0620Jq3.f5742n = iM4447c3;
                                                c0620Jq3.f5739k = iM4752l5;
                                            } else {
                                                c0683Kq3.m4763w(32);
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
                                            int i14 = iM4752l3 - 152;
                                            C0620Jq c0620Jq4 = c0620JqArr[i14];
                                            c0683Kq3.m4763w(i4);
                                            boolean zM4751k3 = c0683Kq3.m4751k();
                                            c0683Kq3.m4763w(i4);
                                            int iM4752l6 = c0683Kq3.m4752l(i6);
                                            boolean zM4751k4 = c0683Kq3.m4751k();
                                            int iM4752l7 = c0683Kq3.m4752l(i7);
                                            int iM4752l8 = c0683Kq3.m4752l(8);
                                            int iM4752l9 = c0683Kq3.m4752l(4);
                                            int iM4752l10 = c0683Kq3.m4752l(4);
                                            c0683Kq3.m4763w(i4);
                                            c0683Kq3.m4763w(6);
                                            c0683Kq3.m4763w(i4);
                                            int iM4752l11 = c0683Kq3.m4752l(i6);
                                            int iM4752l12 = c0683Kq3.m4752l(i6);
                                            c0620Jq4.f5731c = true;
                                            c0620Jq4.f5732d = zM4751k3;
                                            c0620Jq4.f5733e = iM4752l6;
                                            c0620Jq4.f5734f = zM4751k4;
                                            c0620Jq4.f5735g = iM4752l7;
                                            c0620Jq4.f5736h = iM4752l8;
                                            c0620Jq4.f5737i = iM4752l9;
                                            int i15 = iM4752l10 + 1;
                                            if (c0620Jq4.f5738j != i15) {
                                                c0620Jq4.f5738j = i15;
                                                while (true) {
                                                    ArrayList arrayList = c0620Jq4.f5729a;
                                                    if (arrayList.size() >= c0620Jq4.f5738j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (iM4752l11 != 0 && c0620Jq4.f5740l != iM4752l11) {
                                                c0620Jq4.f5740l = iM4752l11;
                                                int i16 = iM4752l11 - 1;
                                                int i17 = C0620Jq.f5720B[i16];
                                                boolean z4 = C0620Jq.f5719A[i16];
                                                int i18 = C0620Jq.f5727y[i16];
                                                int i19 = C0620Jq.f5728z[i16];
                                                int i20 = C0620Jq.f5726x[i16];
                                                c0620Jq4.f5742n = i17;
                                                c0620Jq4.f5739k = i20;
                                            }
                                            if (iM4752l12 != 0 && c0620Jq4.f5741m != iM4752l12) {
                                                c0620Jq4.f5741m = iM4752l12;
                                                int i21 = iM4752l12 - 1;
                                                int i22 = C0620Jq.f5722D[i21];
                                                int i23 = C0620Jq.f5721C[i21];
                                                c0620Jq4.m4451e(false, false);
                                                c0620Jq4.m4452f(C0620Jq.f5724v, C0620Jq.f5723E[i21]);
                                            }
                                            if (this.f6893q != i14) {
                                                this.f6893q = i14;
                                                this.f6889m = c0620JqArr[i14];
                                            }
                                            i = 3;
                                            z = true;
                                            break;
                                    }
                                } else {
                                    i = i6;
                                    z = true;
                                    if (iM4752l3 <= 255) {
                                        this.f6889m.m4448a((char) (iM4752l3 & KotlinVersion.MAX_COMPONENT_VALUE));
                                    } else {
                                        AbstractC0852NX.m5767p("Invalid base command: ", iM4752l3);
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
                            int iM4752l13 = c0683Kq3.m4752l(8);
                            if (iM4752l13 <= 31) {
                                i2 = 7;
                                if (iM4752l13 > 7) {
                                    if (iM4752l13 <= 15) {
                                        c0683Kq3.m4763w(8);
                                    } else if (iM4752l13 <= 23) {
                                        c0683Kq3.m4763w(16);
                                    } else if (iM4752l13 <= 31) {
                                        c0683Kq3.m4763w(24);
                                    }
                                }
                            } else {
                                i2 = 7;
                                if (iM4752l13 <= 127) {
                                    if (iM4752l13 == 32) {
                                        this.f6889m.m4448a(' ');
                                    } else if (iM4752l13 == 33) {
                                        this.f6889m.m4448a((char) 160);
                                    } else if (iM4752l13 == 37) {
                                        this.f6889m.m4448a((char) 8230);
                                    } else if (iM4752l13 == 42) {
                                        this.f6889m.m4448a((char) 352);
                                    } else if (iM4752l13 == 44) {
                                        this.f6889m.m4448a((char) 338);
                                    } else if (iM4752l13 == 63) {
                                        this.f6889m.m4448a((char) 376);
                                    } else if (iM4752l13 == 57) {
                                        this.f6889m.m4448a((char) 8482);
                                    } else if (iM4752l13 == 58) {
                                        this.f6889m.m4448a((char) 353);
                                    } else if (iM4752l13 == 60) {
                                        this.f6889m.m4448a((char) 339);
                                    } else if (iM4752l13 != 61) {
                                        switch (iM4752l13) {
                                            case 48:
                                                this.f6889m.m4448a((char) 9608);
                                                break;
                                            case 49:
                                                this.f6889m.m4448a((char) 8216);
                                                break;
                                            case 50:
                                                this.f6889m.m4448a((char) 8217);
                                                break;
                                            case 51:
                                                this.f6889m.m4448a((char) 8220);
                                                break;
                                            case 52:
                                                this.f6889m.m4448a((char) 8221);
                                                break;
                                            case 53:
                                                this.f6889m.m4448a((char) 8226);
                                                break;
                                            default:
                                                switch (iM4752l13) {
                                                    case 118:
                                                        this.f6889m.m4448a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.f6889m.m4448a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.f6889m.m4448a((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.f6889m.m4448a((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.f6889m.m4448a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.f6889m.m4448a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.f6889m.m4448a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.f6889m.m4448a((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.f6889m.m4448a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.f6889m.m4448a((char) 9484);
                                                        break;
                                                    default:
                                                        AbstractC0852NX.m5767p("Invalid G2 character: ", iM4752l13);
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.f6889m.m4448a((char) 8480);
                                    }
                                    z3 = true;
                                } else {
                                    if (iM4752l13 > 159) {
                                        i3 = 2;
                                        c = 6;
                                        if (iM4752l13 <= 255) {
                                            if (iM4752l13 == 160) {
                                                this.f6889m.m4448a((char) 13252);
                                            } else {
                                                AbstractC0852NX.m5767p("Invalid G3 character: ", iM4752l13);
                                                this.f6889m.m4448a('_');
                                            }
                                            z3 = true;
                                        } else {
                                            AbstractC0852NX.m5767p("Invalid extended command: ", iM4752l13);
                                        }
                                    } else if (iM4752l13 <= 135) {
                                        c0683Kq3.m4763w(32);
                                    } else if (iM4752l13 <= 143) {
                                        c0683Kq3.m4763w(40);
                                    } else if (iM4752l13 <= 159) {
                                        i3 = 2;
                                        c0683Kq3.m4763w(2);
                                        c = 6;
                                        c0683Kq3.m4763w(c0683Kq3.m4752l(6) * 8);
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
            this.f6890n = m5115k();
        }
        this.f6892p = null;
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
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List m5115k() {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0745Lq.m5115k():java.util.List");
    }

    /* renamed from: l */
    public final void m5116l() {
        for (int i = 0; i < 8; i++) {
            this.f6888l[i].m4450d();
        }
    }
}
