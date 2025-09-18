package p000;

import io.appmetrica.analytics.impl.C5043c9;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import javax.security.auth.x500.X500Principal;

/* renamed from: j21, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9830j21 {

    /* renamed from: h */
    public static final C0295Eg f34855h = new C0295Eg(20);

    /* renamed from: i */
    public static final C0295Eg f34856i = new C0295Eg(21);

    /* renamed from: a */
    public final int f34857a;

    /* renamed from: b */
    public int f34858b;

    /* renamed from: c */
    public int f34859c;

    /* renamed from: d */
    public int f34860d;

    /* renamed from: e */
    public int f34861e;

    /* renamed from: f */
    public final Serializable f34862f;

    /* renamed from: g */
    public Object f34863g;

    public C9830j21(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f34862f = name;
        this.f34857a = name.length();
    }

    /* renamed from: a */
    public int m21961a(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        int i5 = this.f34857a;
        String str = (String) this.f34862f;
        if (i4 >= i5) {
            throw new IllegalStateException("Malformed DN: " + str);
        }
        char[] cArr = (char[]) this.f34863g;
        char c = cArr[i];
        if (c >= '0' && c <= '9') {
            i2 = c - '0';
        } else if (c >= 'a' && c <= 'f') {
            i2 = c - 'W';
        } else {
            if (c < 'A' || c > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i2 = c - '7';
        }
        char c2 = cArr[i4];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 'W';
        } else {
            if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i3 = c2 - '7';
        }
        return (i2 << 4) + i3;
    }

    /* renamed from: b */
    public void m21962b(float f, int i) {
        C9702i21 c9702i21;
        int i2 = this.f34858b;
        ArrayList arrayList = (ArrayList) this.f34862f;
        if (i2 != 1) {
            Collections.sort(arrayList, f34855h);
            this.f34858b = 1;
        }
        int i3 = this.f34861e;
        C9702i21[] c9702i21Arr = (C9702i21[]) this.f34863g;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.f34861e = i4;
            c9702i21 = c9702i21Arr[i4];
        } else {
            c9702i21 = new C9702i21();
        }
        int i5 = this.f34859c;
        this.f34859c = i5 + 1;
        c9702i21.f28778a = i5;
        c9702i21.f28779b = i;
        c9702i21.f28780c = f;
        arrayList.add(c9702i21);
        this.f34860d += i;
        while (true) {
            int i6 = this.f34860d;
            int i7 = this.f34857a;
            if (i6 <= i7) {
                return;
            }
            int i8 = i6 - i7;
            C9702i21 c9702i212 = (C9702i21) arrayList.get(0);
            int i9 = c9702i212.f28779b;
            if (i9 <= i8) {
                this.f34860d -= i9;
                arrayList.remove(0);
                int i10 = this.f34861e;
                if (i10 < 5) {
                    this.f34861e = i10 + 1;
                    c9702i21Arr[i10] = c9702i212;
                }
            } else {
                c9702i212.f28779b = i9 - i8;
                this.f34860d -= i8;
            }
        }
    }

    /* renamed from: c */
    public char m21963c() {
        int i;
        int i2 = this.f34858b + 1;
        this.f34858b = i2;
        int i3 = this.f34857a;
        if (i2 == i3) {
            throw new IllegalStateException("Unexpected end of DN: " + ((String) this.f34862f));
        }
        char c = ((char[]) this.f34863g)[i2];
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
                            int iM21961a = m21961a(i2);
                            this.f34858b++;
                            if (iM21961a >= 128) {
                                if (iM21961a >= 192 && iM21961a <= 247) {
                                    if (iM21961a <= 223) {
                                        iM21961a &= 31;
                                        i = 1;
                                    } else if (iM21961a <= 239) {
                                        iM21961a &= 15;
                                        i = 2;
                                    } else {
                                        iM21961a &= 7;
                                        i = 3;
                                    }
                                    for (int i4 = 0; i4 < i; i4++) {
                                        int i5 = this.f34858b;
                                        int i6 = i5 + 1;
                                        this.f34858b = i6;
                                        if (i6 != i3 && ((char[]) this.f34863g)[i6] == '\\') {
                                            int i7 = i5 + 2;
                                            this.f34858b = i7;
                                            int iM21961a2 = m21961a(i7);
                                            this.f34858b++;
                                            if ((iM21961a2 & 192) == 128) {
                                                iM21961a = (iM21961a << 6) + (iM21961a2 & 63);
                                            }
                                        }
                                    }
                                }
                                return '?';
                            }
                            return (char) iM21961a;
                    }
                case C5043c9.f31377M /* 42 */:
                case '+':
                case ',':
                    return c;
            }
        }
        return c;
    }

    /* renamed from: d */
    public String m21964d() {
        int i;
        int i2;
        int i3;
        char c;
        char c2;
        char c3;
        int i4;
        char c4;
        char c5;
        while (true) {
            i = this.f34858b;
            i2 = this.f34857a;
            if (i >= i2 || ((char[]) this.f34863g)[i] != ' ') {
                break;
            }
            this.f34858b = i + 1;
        }
        if (i == i2) {
            return null;
        }
        this.f34859c = i;
        this.f34858b = i + 1;
        while (true) {
            i3 = this.f34858b;
            if (i3 >= i2 || (c5 = ((char[]) this.f34863g)[i3]) == '=' || c5 == ' ') {
                break;
            }
            this.f34858b = i3 + 1;
        }
        String str = (String) this.f34862f;
        if (i3 >= i2) {
            throw new IllegalStateException("Unexpected end of DN: " + str);
        }
        this.f34860d = i3;
        if (((char[]) this.f34863g)[i3] == ' ') {
            while (true) {
                i4 = this.f34858b;
                if (i4 >= i2 || (c4 = ((char[]) this.f34863g)[i4]) == '=' || c4 != ' ') {
                    break;
                }
                this.f34858b = i4 + 1;
            }
            if (((char[]) this.f34863g)[i4] != '=' || i4 == i2) {
                throw new IllegalStateException("Unexpected end of DN: " + str);
            }
        }
        this.f34858b++;
        while (true) {
            int i5 = this.f34858b;
            if (i5 >= i2 || ((char[]) this.f34863g)[i5] != ' ') {
                break;
            }
            this.f34858b = i5 + 1;
        }
        int i6 = this.f34860d;
        int i7 = this.f34859c;
        if (i6 - i7 > 4) {
            char[] cArr = (char[]) this.f34863g;
            if (cArr[i7 + 3] == '.' && (((c = cArr[i7]) == 'O' || c == 'o') && (((c2 = cArr[i7 + 1]) == 'I' || c2 == 'i') && ((c3 = cArr[i7 + 2]) == 'D' || c3 == 'd')))) {
                this.f34859c = i7 + 4;
            }
        }
        char[] cArr2 = (char[]) this.f34863g;
        int i8 = this.f34859c;
        return new String(cArr2, i8, i6 - i8);
    }

    /* renamed from: e */
    public float m21965e() {
        int i = this.f34858b;
        ArrayList arrayList = (ArrayList) this.f34862f;
        if (i != 0) {
            Collections.sort(arrayList, f34856i);
            this.f34858b = 0;
        }
        float f = 0.5f * this.f34860d;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C9702i21 c9702i21 = (C9702i21) arrayList.get(i3);
            i2 += c9702i21.f28779b;
            if (i2 >= f) {
                return c9702i21.f28780c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((C9702i21) AbstractC7222ym.m26228e(1, arrayList)).f28780c;
    }

    public C9830j21(int i) {
        this.f34857a = i;
        this.f34863g = new C9702i21[5];
        this.f34862f = new ArrayList();
        this.f34858b = -1;
    }
}
