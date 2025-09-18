package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: zn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C11969zn0 {

    /* renamed from: c */
    public static final HashMap f47005c = new HashMap();

    /* renamed from: a */
    public final AbstractC1259U0 f47006a;

    /* renamed from: b */
    public final List f47007b;

    public C11969zn0(String str, List list) throws C0226Da {
        Iterator it;
        C0997Pq c0997Pq;
        O90.m5969g(str, "format");
        this.f47007b = list;
        C0997Pq c0997Pq2 = new C0997Pq(list);
        char[] charArray = str.toCharArray();
        O90.m5964b(charArray, "(this as java.lang.String).toCharArray()");
        int length = charArray.length;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            char c = '{';
            if (i >= length) {
                ArrayList arrayList = new ArrayList();
                char[] charArray2 = str.toCharArray();
                O90.m5964b(charArray2, "(this as java.lang.String).toCharArray()");
                int length2 = charArray2.length;
                String str2 = "";
                int i2 = 0;
                boolean z4 = false;
                while (i2 < length2) {
                    char c2 = charArray2[i2];
                    if ('\\' != c2 || z4) {
                        if (('[' == c2 || c == c2) && !z4) {
                            if (str2.length() > 0) {
                                arrayList.add(str2);
                            }
                            str2 = "";
                        }
                        str2 = str2 + c2;
                        if ((']' == c2 || '}' == c2) && !z4) {
                            arrayList.add(str2);
                            str2 = "";
                        }
                        z4 = false;
                    } else {
                        str2 = str2 + c2;
                        z4 = true;
                    }
                    i2++;
                    c = '{';
                }
                if (str2.length() != 0) {
                    arrayList.add(str2);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String str3 = (String) it2.next();
                    if (D51.m1556o(str3, "[", false)) {
                        int length3 = str3.length();
                        it = it2;
                        String str4 = "";
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length3) {
                                c0997Pq = c0997Pq2;
                                break;
                            }
                            int i4 = length3;
                            char cCharAt = str3.charAt(i3);
                            c0997Pq = c0997Pq2;
                            if (cCharAt != '[') {
                                if (cCharAt == ']' && !D51.m1550i(str4, "\\")) {
                                    arrayList2.add(str4 + cCharAt);
                                    break;
                                }
                                if ((cCharAt == '0' || cCharAt == '9') && (AbstractC11374v51.m25351p(str4, "A", false) || AbstractC11374v51.m25351p(str4, "a", false) || AbstractC11374v51.m25351p(str4, "-", false) || AbstractC11374v51.m25351p(str4, "_", false))) {
                                    arrayList2.add(str4.concat("]"));
                                    str4 = "[" + cCharAt;
                                } else if ((cCharAt == 'A' || cCharAt == 'a') && (AbstractC11374v51.m25351p(str4, "0", false) || AbstractC11374v51.m25351p(str4, "9", false) || AbstractC11374v51.m25351p(str4, "-", false) || AbstractC11374v51.m25351p(str4, "_", false))) {
                                    arrayList2.add(str4.concat("]"));
                                    str4 = "[" + cCharAt;
                                } else if ((cCharAt == '-' || cCharAt == '_') && (AbstractC11374v51.m25351p(str4, "0", false) || AbstractC11374v51.m25351p(str4, "9", false) || AbstractC11374v51.m25351p(str4, "A", false) || AbstractC11374v51.m25351p(str4, "a", false))) {
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
                            c0997Pq2 = c0997Pq;
                        }
                    } else {
                        it = it2;
                        c0997Pq = c0997Pq2;
                        arrayList2.add(str3);
                    }
                    it2 = it;
                    c0997Pq2 = c0997Pq;
                }
                C0997Pq c0997Pq3 = c0997Pq2;
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    String strM8593l = (String) it3.next();
                    if (D51.m1556o(strM8593l, "[", false)) {
                        if (AbstractC11374v51.m25351p(strM8593l, "0", false) || AbstractC11374v51.m25351p(strM8593l, "9", false)) {
                            StringBuilder sb = new StringBuilder("[");
                            char[] charArray3 = D51.m1554m(D51.m1554m(strM8593l, "[", ""), "]", "").toCharArray();
                            O90.m5964b(charArray3, "(this as java.lang.String).toCharArray()");
                            strM8593l = AbstractC1374Vq.m8593l(sb, AbstractC7167xu.m25962H(AbstractC0576J8.m4170A(charArray3), "", null, null, null, 62), "]");
                        } else if (AbstractC11374v51.m25351p(strM8593l, "a", false) || AbstractC11374v51.m25351p(strM8593l, "A", false)) {
                            StringBuilder sb2 = new StringBuilder("[");
                            char[] charArray4 = D51.m1554m(D51.m1554m(strM8593l, "[", ""), "]", "").toCharArray();
                            O90.m5964b(charArray4, "(this as java.lang.String).toCharArray()");
                            strM8593l = AbstractC1374Vq.m8593l(sb2, AbstractC7167xu.m25962H(AbstractC0576J8.m4170A(charArray4), "", null, null, null, 62), "]");
                        } else {
                            StringBuilder sb3 = new StringBuilder("[");
                            char[] charArray5 = D51.m1554m(D51.m1554m(D51.m1554m(D51.m1554m(strM8593l, "[", ""), "]", ""), "_", "A"), "-", "a").toCharArray();
                            O90.m5964b(charArray5, "(this as java.lang.String).toCharArray()");
                            sb3.append(AbstractC7167xu.m25962H(AbstractC0576J8.m4170A(charArray5), "", null, null, null, 62));
                            sb3.append("]");
                            strM8593l = D51.m1554m(D51.m1554m(sb3.toString(), "A", "_"), "a", "-");
                        }
                    }
                    arrayList3.add(strM8593l);
                }
                this.f47006a = c0997Pq3.m6434a(AbstractC7167xu.m25962H(arrayList3, "", null, null, null, 62), false, false, null);
                return;
            }
            char c3 = charArray[i];
            if ('\\' == c3) {
                z = !z;
            } else {
                if ('[' == c3) {
                    if (z2) {
                        throw new C0226Da(2);
                    }
                    z2 = !z;
                }
                if (']' == c3 && !z) {
                    z2 = false;
                }
                if ('{' == c3) {
                    if (z3) {
                        throw new C0226Da(2);
                    }
                    z3 = !z;
                }
                if ('}' == c3 && !z) {
                    z3 = false;
                }
                z = false;
            }
            i++;
        }
    }

    /* renamed from: c */
    public static boolean m26549c(AbstractC1259U0 abstractC1259U0) {
        if (abstractC1259U0 instanceof C1155SM) {
            return true;
        }
        if (abstractC1259U0 instanceof C9148di1) {
            return ((C9148di1) abstractC1259U0).f26223c instanceof C8759ai1;
        }
        if (abstractC1259U0 instanceof C0913OV) {
            return false;
        }
        return m26549c(abstractC1259U0.mo7844m1());
    }

    /* renamed from: a */
    public C11715xn0 mo10446a(C6911tq c6911tq) {
        AbstractC10396nS1 abstractC10396nS1;
        C11731xv0 c11731xv0Mo6078e1;
        C0986Pf c0986PfMo10447b = mo10447b(c6911tq);
        C11461vn0 c11461vn0 = new C11461vn0();
        boolean zMo6399j = c0986PfMo10447b.mo6399j();
        int i = c0986PfMo10447b.f9216b;
        C6911tq c6911tq2 = (C6911tq) c0986PfMo10447b.f9217c;
        boolean z = i < c6911tq2.f43354b;
        Character chM6402o = c0986PfMo10447b.m6402o();
        int i2 = c6911tq.f43354b;
        AbstractC1259U0 abstractC1259U0 = this.f47006a;
        String strM25355t = "";
        String strM25355t2 = strM25355t;
        int i3 = 0;
        while (chM6402o != null) {
            C11731xv0 c11731xv0Mo3655d1 = abstractC1259U0.mo3655d1(chM6402o.charValue());
            if (c11731xv0Mo3655d1 != null) {
                if (z) {
                    c11461vn0.push(abstractC1259U0.mo6078e1());
                }
                StringBuilder sbM26238o = AbstractC7222ym.m26238o(strM25355t);
                Character ch = c11731xv0Mo3655d1.f45898b;
                sbM26238o.append(ch != null ? ch : "");
                String string = sbM26238o.toString();
                StringBuilder sbM26238o2 = AbstractC7222ym.m26238o(strM25355t2);
                Object obj = c11731xv0Mo3655d1.f45900d;
                if (obj == null) {
                    obj = "";
                }
                sbM26238o2.append(obj);
                strM25355t2 = sbM26238o2.toString();
                boolean z2 = c11731xv0Mo3655d1.f45899c;
                AbstractC1259U0 abstractC1259U02 = c11731xv0Mo3655d1.f45897a;
                if (z2) {
                    zMo6399j = c0986PfMo10447b.mo6399j();
                    z = c0986PfMo10447b.f9216b < c6911tq2.f43354b;
                    chM6402o = c0986PfMo10447b.m6402o();
                    i3++;
                } else {
                    if (zMo6399j && ch != null) {
                        i2++;
                    }
                    i3--;
                }
                abstractC1259U0 = abstractC1259U02;
                strM25355t = string;
            } else {
                if (z) {
                    i2--;
                }
                zMo6399j = c0986PfMo10447b.mo6399j();
                z = c0986PfMo10447b.f9216b < c6911tq2.f43354b;
                i3--;
                chM6402o = c0986PfMo10447b.m6402o();
            }
        }
        while (true) {
            abstractC10396nS1 = c6911tq.f43355c;
            if (!(abstractC10396nS1 instanceof C6848sq ? ((C6848sq) abstractC10396nS1).f42634a : false) || !zMo6399j || (c11731xv0Mo6078e1 = abstractC1259U0.mo6078e1()) == null) {
                break;
            }
            StringBuilder sbM26238o3 = AbstractC7222ym.m26238o(strM25355t);
            Character ch2 = c11731xv0Mo6078e1.f45898b;
            sbM26238o3.append(ch2 != null ? ch2 : "");
            strM25355t = sbM26238o3.toString();
            StringBuilder sbM26238o4 = AbstractC7222ym.m26238o(strM25355t2);
            Object obj2 = c11731xv0Mo6078e1.f45900d;
            if (obj2 == null) {
                obj2 = "";
            }
            sbM26238o4.append(obj2);
            strM25355t2 = sbM26238o4.toString();
            if (ch2 != null) {
                i2++;
            }
            abstractC1259U0 = c11731xv0Mo6078e1.f45897a;
        }
        while (true) {
            if (!(abstractC10396nS1 instanceof C6768rq ? ((C6768rq) abstractC10396nS1).f41926a : false) || c11461vn0.empty()) {
                break;
            }
            Object objPop = c11461vn0.pop();
            O90.m5964b(objPop, "autocompletionStack.pop()");
            C11731xv0 c11731xv0 = (C11731xv0) objPop;
            int length = strM25355t.length();
            Character ch3 = c11731xv0.f45898b;
            if (length == i2) {
                if (ch3 != null) {
                    if (ch3.charValue() == AbstractC11374v51.m25329D(strM25355t)) {
                        strM25355t = AbstractC11374v51.m25355t(strM25355t);
                        i2--;
                    }
                }
                Character ch4 = c11731xv0.f45900d;
                if (ch4 != null) {
                    if (ch4.charValue() == AbstractC11374v51.m25329D(strM25355t2)) {
                        strM25355t2 = AbstractC11374v51.m25355t(strM25355t2);
                    }
                }
            } else if (ch3 != null) {
                i2--;
            }
        }
        return new C11715xn0(new C6911tq(strM25355t, i2, abstractC10396nS1), strM25355t2, i3, m26549c(abstractC1259U0));
    }

    /* renamed from: b */
    public C0986Pf mo10447b(C6911tq c6911tq) {
        return new C0986Pf(3, c6911tq);
    }

    /* renamed from: d */
    public final int m26550d() {
        int i = 0;
        for (AbstractC1259U0 abstractC1259U0 = this.f47006a; abstractC1259U0 != null && !(abstractC1259U0 instanceof C1155SM); abstractC1259U0 = (AbstractC1259U0) abstractC1259U0.f11615b) {
            if ((abstractC1259U0 instanceof C0913OV) || (abstractC1259U0 instanceof C3998eZ) || (abstractC1259U0 instanceof C9148di1) || (abstractC1259U0 instanceof C7726Hy0)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: e */
    public final int m26551e() {
        int i = 0;
        for (AbstractC1259U0 abstractC1259U0 = this.f47006a; abstractC1259U0 != null && !(abstractC1259U0 instanceof C1155SM); abstractC1259U0 = (AbstractC1259U0) abstractC1259U0.f11615b) {
            if ((abstractC1259U0 instanceof C0913OV) || (abstractC1259U0 instanceof C9148di1) || (abstractC1259U0 instanceof C7726Hy0)) {
                i++;
            }
        }
        return i;
    }
}
