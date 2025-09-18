package p000;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: Ik */
/* loaded from: classes2.dex */
public class C0551Ik implements Serializable, Comparable {

    /* renamed from: d */
    public static final C0551Ik f5116d = new C0551Ik(new byte[0]);

    /* renamed from: a */
    public final byte[] f5117a;

    /* renamed from: b */
    public transient int f5118b;

    /* renamed from: c */
    public transient String f5119c;

    public C0551Ik(byte[] bArr) {
        O90.m5968f(bArr, "data");
        this.f5117a = bArr;
    }

    /* renamed from: a */
    public String mo3981a() {
        byte[] bArr = AbstractC3900d.f25749a;
        byte[] bArr2 = this.f5117a;
        O90.m5968f(bArr2, "<this>");
        O90.m5968f(bArr, "map");
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr2[i];
            int i3 = i + 2;
            byte b2 = bArr2[i + 1];
            i += 3;
            byte b3 = bArr2[i3];
            bArr3[i2] = bArr[(b & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr3[i2 + 2] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr[b3 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b4 = bArr2[i];
            bArr3[i2] = bArr[(b4 & 255) >> 2];
            bArr3[i2 + 1] = bArr[(b4 & 3) << 4];
            bArr3[i2 + 2] = 61;
            bArr3[i2 + 3] = 61;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b5 = bArr2[i];
            byte b6 = bArr2[i5];
            bArr3[i2] = bArr[(b5 & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i2 + 2] = bArr[(b6 & 15) << 2];
            bArr3[i2 + 3] = 61;
        }
        return new String(bArr3, AbstractC7038vr.f44561a);
    }

    /* renamed from: b */
    public C0551Ik mo3982b(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f5117a, 0, mo3983c());
        byte[] bArrDigest = messageDigest.digest();
        O90.m5965c(bArrDigest);
        return new C0551Ik(bArrDigest);
    }

    /* renamed from: c */
    public int mo3983c() {
        return this.f5117a.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compareTo(java.lang.Object r10) {
        /*
            r9 = this;
            Ik r10 = (p000.C0551Ik) r10
            java.lang.String r0 = "other"
            p000.O90.m5968f(r10, r0)
            int r0 = r9.mo3983c()
            int r1 = r10.mo3983c()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L15:
            r5 = 1
            r6 = -1
            if (r4 >= r2) goto L30
            byte r7 = r9.mo3986f(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.mo3986f(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L2a
            int r4 = r4 + 1
            goto L15
        L2a:
            if (r7 >= r8) goto L2e
        L2c:
            r3 = r6
            goto L36
        L2e:
            r3 = r5
            goto L36
        L30:
            if (r0 != r1) goto L33
            goto L36
        L33:
            if (r0 >= r1) goto L2e
            goto L2c
        L36:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0551Ik.compareTo(java.lang.Object):int");
    }

    /* renamed from: d */
    public String mo3984d() {
        byte[] bArr = this.f5117a;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = AbstractC1141S8.f10591a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: e */
    public byte[] mo3985e() {
        return this.f5117a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0551Ik) {
            C0551Ik c0551Ik = (C0551Ik) obj;
            int iMo3983c = c0551Ik.mo3983c();
            byte[] bArr = this.f5117a;
            if (iMo3983c == bArr.length && c0551Ik.mo3987g(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public byte mo3986f(int i) {
        return this.f5117a[i];
    }

    /* renamed from: g */
    public boolean mo3987g(int i, byte[] bArr, int i2, int i3) {
        O90.m5968f(bArr, "other");
        if (i >= 0) {
            byte[] bArr2 = this.f5117a;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && AbstractC1240Ti.m7728a(bArr2, i, i2, bArr, i3)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public boolean mo3988h(C0551Ik c0551Ik, int i) {
        O90.m5968f(c0551Ik, "other");
        return c0551Ik.mo3987g(0, this.f5117a, 0, i);
    }

    public int hashCode() {
        int i = this.f5118b;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f5117a);
        this.f5118b = iHashCode;
        return iHashCode;
    }

    /* renamed from: i */
    public C0551Ik mo3989i() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f5117a;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                O90.m5967e(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new C0551Ik(bArrCopyOf);
            }
            i++;
        }
    }

    /* renamed from: j */
    public byte[] mo3990j() {
        byte[] bArr = this.f5117a;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        O90.m5967e(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    /* renamed from: k */
    public final String m3991k() {
        String str = this.f5119c;
        if (str != null) {
            return str;
        }
        byte[] bArrMo3985e = mo3985e();
        O90.m5968f(bArrMo3985e, "<this>");
        String str2 = new String(bArrMo3985e, AbstractC7038vr.f44561a);
        this.f5119c = str2;
        return str2;
    }

    /* renamed from: l */
    public void mo3992l(C6507nj c6507nj, int i) {
        O90.m5968f(c6507nj, "buffer");
        c6507nj.m23194q0(this.f5117a, 0, i);
    }

    public String toString() {
        byte b;
        int i;
        byte[] bArr = this.f5117a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                break;
            }
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                int i5 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (127 <= b2 && b2 < 160))) || b2 == 65533) {
                    break;
                }
                i3 += b2 < 65536 ? 1 : 2;
                i2++;
                while (true) {
                    i4 = i5;
                    if (i2 < length && (b = bArr[i2]) >= 0) {
                        i2++;
                        i5 = i4 + 1;
                        if (i4 == 64) {
                            break loop0;
                        }
                        if ((b != 10 && b != 13 && ((b >= 0 && b < 32) || (127 <= b && b < 160))) || b == 65533) {
                            break loop0;
                        }
                        i3 += b < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b2 >> 5) == -2) {
                int i6 = i2 + 1;
                if (length > i6) {
                    byte b3 = bArr[i6];
                    if ((b3 & 192) == 128) {
                        int i7 = (b3 ^ 3968) ^ (b2 << 6);
                        if (i7 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i7 != 10 && i7 != 13 && ((i7 >= 0 && i7 < 32) || (127 <= i7 && i7 < 160))) || i7 == 65533) {
                                break;
                            }
                            i3 += i7 < 65536 ? 1 : 2;
                            i2 += 2;
                            i4 = i;
                        } else if (i4 != 64) {
                            break;
                        }
                    } else if (i4 != 64) {
                        break;
                    }
                } else if (i4 != 64) {
                    break;
                }
            } else if ((b2 >> 4) == -2) {
                int i8 = i2 + 2;
                if (length > i8) {
                    byte b4 = bArr[i2 + 1];
                    if ((b4 & 192) == 128) {
                        byte b5 = bArr[i8];
                        if ((b5 & 192) == 128) {
                            int i9 = ((b5 ^ (-123008)) ^ (b4 << 6)) ^ (b2 << 12);
                            if (i9 < 2048) {
                                if (i4 != 64) {
                                    break;
                                }
                            } else if (55296 > i9 || i9 >= 57344) {
                                i = i4 + 1;
                                if (i4 == 64) {
                                    break;
                                }
                                if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && i9 < 32) || (127 <= i9 && i9 < 160))) || i9 == 65533) {
                                    break;
                                }
                                i3 += i9 < 65536 ? 1 : 2;
                                i2 += 3;
                                i4 = i;
                            } else if (i4 != 64) {
                                break;
                            }
                        } else if (i4 != 64) {
                            break;
                        }
                    } else if (i4 != 64) {
                        break;
                    }
                } else if (i4 != 64) {
                    break;
                }
            } else if ((b2 >> 3) == -2) {
                int i10 = i2 + 3;
                if (length > i10) {
                    byte b6 = bArr[i2 + 1];
                    if ((b6 & 192) == 128) {
                        byte b7 = bArr[i2 + 2];
                        if ((b7 & 192) == 128) {
                            byte b8 = bArr[i10];
                            if ((b8 & 192) == 128) {
                                int i11 = (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b2 << 18);
                                if (i11 > 1114111) {
                                    if (i4 != 64) {
                                        break;
                                    }
                                } else if (55296 > i11 || i11 >= 57344) {
                                    if (i11 >= 65536) {
                                        i = i4 + 1;
                                        if (i4 == 64) {
                                            break;
                                        }
                                        if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                                            break;
                                        }
                                        i3 += i11 < 65536 ? 1 : 2;
                                        i2 += 4;
                                        i4 = i;
                                    } else if (i4 != 64) {
                                        break;
                                    }
                                } else if (i4 != 64) {
                                    break;
                                }
                            } else if (i4 != 64) {
                                break;
                            }
                        } else if (i4 != 64) {
                            break;
                        }
                    } else if (i4 != 64) {
                        break;
                    }
                } else if (i4 != 64) {
                    break;
                }
            } else if (i4 != 64) {
                break;
            }
        }
        i3 = -1;
        if (i3 == -1) {
            if (bArr.length <= 64) {
                return "[hex=" + mo3984d() + ']';
            }
            StringBuilder sb = new StringBuilder("[size=");
            sb.append(bArr.length);
            sb.append(" hex=");
            if (64 > bArr.length) {
                throw new IllegalArgumentException(AbstractC7222ym.m26235l(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
            }
            sb.append((64 == bArr.length ? this : new C0551Ik(AbstractC0576J8.m4182i(bArr, 0, 64))).mo3984d());
            sb.append("…]");
            return sb.toString();
        }
        String strM3991k = m3991k();
        String strSubstring = strM3991k.substring(0, i3);
        O90.m5967e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        String strM1554m = D51.m1554m(D51.m1554m(D51.m1554m(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
        if (i3 >= strM3991k.length()) {
            return "[text=" + strM1554m + ']';
        }
        return "[size=" + bArr.length + " text=" + strM1554m + "…]";
    }
}
