package defpackage;

import io.appmetrica.analytics.impl.C4473c9;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import javax.security.auth.x500.X500Principal;

/* renamed from: j21, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5236j21 {
    public static final C0350Eg h = new C0350Eg(20);
    public static final C0350Eg i = new C0350Eg(21);
    public final int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final Serializable f;
    public Object g;

    public C5236j21(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f = name;
        this.a = name.length();
    }

    public int a(int i2) {
        int i3;
        int i4;
        int i5 = i2 + 1;
        int i6 = this.a;
        String str = (String) this.f;
        if (i5 >= i6) {
            throw new IllegalStateException("Malformed DN: " + str);
        }
        char[] cArr = (char[]) this.g;
        char c = cArr[i2];
        if (c >= '0' && c <= '9') {
            i3 = c - '0';
        } else if (c >= 'a' && c <= 'f') {
            i3 = c - 'W';
        } else {
            if (c < 'A' || c > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i3 = c - '7';
        }
        char c2 = cArr[i5];
        if (c2 >= '0' && c2 <= '9') {
            i4 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i4 = c2 - 'W';
        } else {
            if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i4 = c2 - '7';
        }
        return (i3 << 4) + i4;
    }

    public void b(float f, int i2) {
        C4269i21 c4269i21;
        int i3 = this.b;
        ArrayList arrayList = (ArrayList) this.f;
        if (i3 != 1) {
            Collections.sort(arrayList, h);
            this.b = 1;
        }
        int i4 = this.e;
        C4269i21[] c4269i21Arr = (C4269i21[]) this.g;
        if (i4 > 0) {
            int i5 = i4 - 1;
            this.e = i5;
            c4269i21 = c4269i21Arr[i5];
        } else {
            c4269i21 = new C4269i21();
        }
        int i6 = this.c;
        this.c = i6 + 1;
        c4269i21.a = i6;
        c4269i21.b = i2;
        c4269i21.c = f;
        arrayList.add(c4269i21);
        this.d += i2;
        while (true) {
            int i7 = this.d;
            int i8 = this.a;
            if (i7 <= i8) {
                return;
            }
            int i9 = i7 - i8;
            C4269i21 c4269i212 = (C4269i21) arrayList.get(0);
            int i10 = c4269i212.b;
            if (i10 <= i9) {
                this.d -= i10;
                arrayList.remove(0);
                int i11 = this.e;
                if (i11 < 5) {
                    this.e = i11 + 1;
                    c4269i21Arr[i11] = c4269i212;
                }
            } else {
                c4269i212.b = i10 - i9;
                this.d -= i9;
            }
        }
    }

    public char c() {
        int i2;
        int i3 = this.b + 1;
        this.b = i3;
        int i4 = this.a;
        if (i3 == i4) {
            throw new IllegalStateException("Unexpected end of DN: " + ((String) this.f));
        }
        char c = ((char[]) this.g)[i3];
        if (c != ' ' && c != '%' && c != '\\' && c != '_' && c != '\"' && c != '#') {
            switch (c) {
                default:
                    switch (c) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            int iA = a(i3);
                            this.b++;
                            if (iA >= 128) {
                                if (iA >= 192 && iA <= 247) {
                                    if (iA <= 223) {
                                        iA &= 31;
                                        i2 = 1;
                                    } else if (iA <= 239) {
                                        iA &= 15;
                                        i2 = 2;
                                    } else {
                                        iA &= 7;
                                        i2 = 3;
                                    }
                                    for (int i5 = 0; i5 < i2; i5++) {
                                        int i6 = this.b;
                                        int i7 = i6 + 1;
                                        this.b = i7;
                                        if (i7 != i4 && ((char[]) this.g)[i7] == '\\') {
                                            int i8 = i6 + 2;
                                            this.b = i8;
                                            int iA2 = a(i8);
                                            this.b++;
                                            if ((iA2 & 192) == 128) {
                                                iA = (iA << 6) + (iA2 & 63);
                                            }
                                        }
                                    }
                                }
                                return '?';
                            }
                            return (char) iA;
                    }
                case C4473c9.M /* 42 */:
                case '+':
                case ',':
                    return c;
            }
        }
        return c;
    }

    public String d() {
        int i2;
        int i3;
        int i4;
        char c;
        char c2;
        char c3;
        int i5;
        char c4;
        char c5;
        while (true) {
            i2 = this.b;
            i3 = this.a;
            if (i2 >= i3 || ((char[]) this.g)[i2] != ' ') {
                break;
            }
            this.b = i2 + 1;
        }
        if (i2 == i3) {
            return null;
        }
        this.c = i2;
        this.b = i2 + 1;
        while (true) {
            i4 = this.b;
            if (i4 >= i3 || (c5 = ((char[]) this.g)[i4]) == '=' || c5 == ' ') {
                break;
            }
            this.b = i4 + 1;
        }
        String str = (String) this.f;
        if (i4 >= i3) {
            throw new IllegalStateException("Unexpected end of DN: " + str);
        }
        this.d = i4;
        if (((char[]) this.g)[i4] == ' ') {
            while (true) {
                i5 = this.b;
                if (i5 >= i3 || (c4 = ((char[]) this.g)[i5]) == '=' || c4 != ' ') {
                    break;
                }
                this.b = i5 + 1;
            }
            if (((char[]) this.g)[i5] != '=' || i5 == i3) {
                throw new IllegalStateException("Unexpected end of DN: " + str);
            }
        }
        this.b++;
        while (true) {
            int i6 = this.b;
            if (i6 >= i3 || ((char[]) this.g)[i6] != ' ') {
                break;
            }
            this.b = i6 + 1;
        }
        int i7 = this.d;
        int i8 = this.c;
        if (i7 - i8 > 4) {
            char[] cArr = (char[]) this.g;
            if (cArr[i8 + 3] == '.' && (((c = cArr[i8]) == 'O' || c == 'o') && (((c2 = cArr[i8 + 1]) == 'I' || c2 == 'i') && ((c3 = cArr[i8 + 2]) == 'D' || c3 == 'd')))) {
                this.c = i8 + 4;
            }
        }
        char[] cArr2 = (char[]) this.g;
        int i9 = this.c;
        return new String(cArr2, i9, i7 - i9);
    }

    public float e() {
        int i2 = this.b;
        ArrayList arrayList = (ArrayList) this.f;
        if (i2 != 0) {
            Collections.sort(arrayList, i);
            this.b = 0;
        }
        float f = 0.5f * this.d;
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            C4269i21 c4269i21 = (C4269i21) arrayList.get(i4);
            i3 += c4269i21.b;
            if (i3 >= f) {
                return c4269i21.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((C4269i21) AbstractC8235ym.e(1, arrayList)).c;
    }

    public C5236j21(int i2) {
        this.a = i2;
        this.g = new C4269i21[5];
        this.f = new ArrayList();
        this.b = -1;
    }
}
