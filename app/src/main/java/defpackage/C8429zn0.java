package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: zn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8429zn0 {
    public static final HashMap c = new HashMap();
    public final U0 a;
    public final List b;

    public C8429zn0(String str, List list) throws C0254Da {
        Iterator it;
        C1237Pq c1237Pq;
        O90.g(str, "format");
        this.b = list;
        C1237Pq c1237Pq2 = new C1237Pq(list);
        char[] charArray = str.toCharArray();
        O90.b(charArray, "(this as java.lang.String).toCharArray()");
        int length = charArray.length;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            char c2 = '{';
            if (i >= length) {
                ArrayList arrayList = new ArrayList();
                char[] charArray2 = str.toCharArray();
                O90.b(charArray2, "(this as java.lang.String).toCharArray()");
                int length2 = charArray2.length;
                String str2 = "";
                int i2 = 0;
                boolean z4 = false;
                while (i2 < length2) {
                    char c3 = charArray2[i2];
                    if ('\\' != c3 || z4) {
                        if (('[' == c3 || c2 == c3) && !z4) {
                            if (str2.length() > 0) {
                                arrayList.add(str2);
                            }
                            str2 = "";
                        }
                        str2 = str2 + c3;
                        if ((']' == c3 || '}' == c3) && !z4) {
                            arrayList.add(str2);
                            str2 = "";
                        }
                        z4 = false;
                    } else {
                        str2 = str2 + c3;
                        z4 = true;
                    }
                    i2++;
                    c2 = '{';
                }
                if (str2.length() != 0) {
                    arrayList.add(str2);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String str3 = (String) it2.next();
                    if (D51.o(str3, "[", false)) {
                        int length3 = str3.length();
                        it = it2;
                        String str4 = "";
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length3) {
                                c1237Pq = c1237Pq2;
                                break;
                            }
                            int i4 = length3;
                            char cCharAt = str3.charAt(i3);
                            c1237Pq = c1237Pq2;
                            if (cCharAt != '[') {
                                if (cCharAt == ']' && !D51.i(str4, "\\")) {
                                    arrayList2.add(str4 + cCharAt);
                                    break;
                                }
                                if ((cCharAt == '0' || cCharAt == '9') && (AbstractC7538v51.p(str4, "A", false) || AbstractC7538v51.p(str4, "a", false) || AbstractC7538v51.p(str4, "-", false) || AbstractC7538v51.p(str4, "_", false))) {
                                    arrayList2.add(str4.concat("]"));
                                    str4 = "[" + cCharAt;
                                } else if ((cCharAt == 'A' || cCharAt == 'a') && (AbstractC7538v51.p(str4, "0", false) || AbstractC7538v51.p(str4, "9", false) || AbstractC7538v51.p(str4, "-", false) || AbstractC7538v51.p(str4, "_", false))) {
                                    arrayList2.add(str4.concat("]"));
                                    str4 = "[" + cCharAt;
                                } else if ((cCharAt == '-' || cCharAt == '_') && (AbstractC7538v51.p(str4, "0", false) || AbstractC7538v51.p(str4, "9", false) || AbstractC7538v51.p(str4, "A", false) || AbstractC7538v51.p(str4, "a", false))) {
                                    arrayList2.add(str4.concat("]"));
                                    str4 = "[" + cCharAt;
                                } else {
                                    str4 = str4 + cCharAt;
                                }
                            } else {
                                str4 = str4 + cCharAt;
                            }
                            i3++;
                            length3 = i4;
                            c1237Pq2 = c1237Pq;
                        }
                    } else {
                        it = it2;
                        c1237Pq = c1237Pq2;
                        arrayList2.add(str3);
                    }
                    it2 = it;
                    c1237Pq2 = c1237Pq;
                }
                C1237Pq c1237Pq3 = c1237Pq2;
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    String strL = (String) it3.next();
                    if (D51.o(strL, "[", false)) {
                        if (AbstractC7538v51.p(strL, "0", false) || AbstractC7538v51.p(strL, "9", false)) {
                            StringBuilder sb = new StringBuilder("[");
                            char[] charArray3 = D51.m(D51.m(strL, "[", ""), "]", "").toCharArray();
                            O90.b(charArray3, "(this as java.lang.String).toCharArray()");
                            strL = AbstractC1705Vq.l(sb, AbstractC8069xu.H(J8.A(charArray3), "", null, null, null, 62), "]");
                        } else if (AbstractC7538v51.p(strL, "a", false) || AbstractC7538v51.p(strL, "A", false)) {
                            StringBuilder sb2 = new StringBuilder("[");
                            char[] charArray4 = D51.m(D51.m(strL, "[", ""), "]", "").toCharArray();
                            O90.b(charArray4, "(this as java.lang.String).toCharArray()");
                            strL = AbstractC1705Vq.l(sb2, AbstractC8069xu.H(J8.A(charArray4), "", null, null, null, 62), "]");
                        } else {
                            StringBuilder sb3 = new StringBuilder("[");
                            char[] charArray5 = D51.m(D51.m(D51.m(D51.m(strL, "[", ""), "]", ""), "_", "A"), "-", "a").toCharArray();
                            O90.b(charArray5, "(this as java.lang.String).toCharArray()");
                            sb3.append(AbstractC8069xu.H(J8.A(charArray5), "", null, null, null, 62));
                            sb3.append("]");
                            strL = D51.m(D51.m(sb3.toString(), "A", "_"), "a", "-");
                        }
                    }
                    arrayList3.add(strL);
                }
                this.a = c1237Pq3.a(AbstractC8069xu.H(arrayList3, "", null, null, null, 62), false, false, null);
                return;
            }
            char c4 = charArray[i];
            if ('\\' == c4) {
                z = !z;
            } else {
                if ('[' == c4) {
                    if (z2) {
                        throw new C0254Da(2);
                    }
                    z2 = !z;
                }
                if (']' == c4 && !z) {
                    z2 = false;
                }
                if ('{' == c4) {
                    if (z3) {
                        throw new C0254Da(2);
                    }
                    z3 = !z;
                }
                if ('}' == c4 && !z) {
                    z3 = false;
                }
                z = false;
            }
            i++;
        }
    }

    public static boolean c(U0 u0) {
        if (u0 instanceof SM) {
            return true;
        }
        if (u0 instanceof C3443di1) {
            return ((C3443di1) u0).c instanceof C2186ai1;
        }
        if (u0 instanceof OV) {
            return false;
        }
        return c(u0.m1());
    }

    public C8049xn0 a(C7295tq c7295tq) {
        AbstractC6080nS1 abstractC6080nS1;
        C8073xv0 c8073xv0E1;
        C1204Pf c1204PfB = b(c7295tq);
        C7669vn0 c7669vn0 = new C7669vn0();
        boolean zJ = c1204PfB.j();
        int i = c1204PfB.b;
        C7295tq c7295tq2 = (C7295tq) c1204PfB.c;
        boolean z = i < c7295tq2.b;
        Character chO = c1204PfB.o();
        int i2 = c7295tq.b;
        U0 u0 = this.a;
        String strT = "";
        String strT2 = strT;
        int i3 = 0;
        while (chO != null) {
            C8073xv0 c8073xv0D1 = u0.d1(chO.charValue());
            if (c8073xv0D1 != null) {
                if (z) {
                    c7669vn0.push(u0.e1());
                }
                StringBuilder sbO = AbstractC8235ym.o(strT);
                Character ch = c8073xv0D1.b;
                sbO.append(ch != null ? ch : "");
                String string = sbO.toString();
                StringBuilder sbO2 = AbstractC8235ym.o(strT2);
                Object obj = c8073xv0D1.d;
                if (obj == null) {
                    obj = "";
                }
                sbO2.append(obj);
                strT2 = sbO2.toString();
                boolean z2 = c8073xv0D1.c;
                U0 u02 = c8073xv0D1.a;
                if (z2) {
                    zJ = c1204PfB.j();
                    z = c1204PfB.b < c7295tq2.b;
                    chO = c1204PfB.o();
                    i3++;
                } else {
                    if (zJ && ch != null) {
                        i2++;
                    }
                    i3--;
                }
                u0 = u02;
                strT = string;
            } else {
                if (z) {
                    i2--;
                }
                zJ = c1204PfB.j();
                z = c1204PfB.b < c7295tq2.b;
                i3--;
                chO = c1204PfB.o();
            }
        }
        while (true) {
            abstractC6080nS1 = c7295tq.c;
            if (!(abstractC6080nS1 instanceof C7104sq ? ((C7104sq) abstractC6080nS1).a : false) || !zJ || (c8073xv0E1 = u0.e1()) == null) {
                break;
            }
            StringBuilder sbO3 = AbstractC8235ym.o(strT);
            Character ch2 = c8073xv0E1.b;
            sbO3.append(ch2 != null ? ch2 : "");
            strT = sbO3.toString();
            StringBuilder sbO4 = AbstractC8235ym.o(strT2);
            Object obj2 = c8073xv0E1.d;
            if (obj2 == null) {
                obj2 = "";
            }
            sbO4.append(obj2);
            strT2 = sbO4.toString();
            if (ch2 != null) {
                i2++;
            }
            u0 = c8073xv0E1.a;
        }
        while (true) {
            if (!(abstractC6080nS1 instanceof C6913rq ? ((C6913rq) abstractC6080nS1).a : false) || c7669vn0.empty()) {
                break;
            }
            Object objPop = c7669vn0.pop();
            O90.b(objPop, "autocompletionStack.pop()");
            C8073xv0 c8073xv0 = (C8073xv0) objPop;
            int length = strT.length();
            Character ch3 = c8073xv0.b;
            if (length == i2) {
                if (ch3 != null) {
                    if (ch3.charValue() == AbstractC7538v51.D(strT)) {
                        strT = AbstractC7538v51.t(strT);
                        i2--;
                    }
                }
                Character ch4 = c8073xv0.d;
                if (ch4 != null) {
                    if (ch4.charValue() == AbstractC7538v51.D(strT2)) {
                        strT2 = AbstractC7538v51.t(strT2);
                    }
                }
            } else if (ch3 != null) {
                i2--;
            }
        }
        return new C8049xn0(new C7295tq(strT, i2, abstractC6080nS1), strT2, i3, c(u0));
    }

    public C1204Pf b(C7295tq c7295tq) {
        return new C1204Pf(3, c7295tq);
    }

    public final int d() {
        int i = 0;
        for (U0 u0 = this.a; u0 != null && !(u0 instanceof SM); u0 = (U0) u0.b) {
            if ((u0 instanceof OV) || (u0 instanceof C3604eZ) || (u0 instanceof C3443di1) || (u0 instanceof C0639Hy0)) {
                i++;
            }
        }
        return i;
    }

    public final int e() {
        int i = 0;
        for (U0 u0 = this.a; u0 != null && !(u0 instanceof SM); u0 = (U0) u0.b) {
            if ((u0 instanceof OV) || (u0 instanceof C3443di1) || (u0 instanceof C0639Hy0)) {
                i++;
            }
        }
        return i;
    }
}
