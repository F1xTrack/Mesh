package p000;

import java.util.ArrayList;
import java.util.TreeMap;

/* renamed from: t10 */
/* loaded from: classes.dex */
public abstract class AbstractC11106t10 {

    /* renamed from: a */
    public static final C4262il f42765a = new C4262il(10);

    /* renamed from: a */
    public static boolean m24826a(String str, C6589p c6589p, C6589p c6589p2, boolean z, C0471HT c0471ht) throws C7594Fk0, C0226Da {
        if (z && c6589p2.m23585b()) {
            m24830e(str, c6589p, c6589p2, c0471ht);
            return true;
        }
        if (!AbstractC10471o22.m23323c(c6589p2.f39424b, c6589p2.f39425c, c6589p2.f39426d, 1, 1)) {
            return false;
        }
        if (z) {
            throw new C0226Da(AbstractC7222ym.m26245v("Extension singletons in transformed extension language tag: ", str), 10);
        }
        m24827b(str, c6589p2, c6589p, c0471ht);
        return true;
    }

    /* renamed from: b */
    public static void m24827b(String str, C6589p c6589p, C6589p c6589p2, C0471HT c0471ht) throws C7594Fk0, C0226Da {
        if (!c6589p2.m23584a()) {
            throw new C0226Da("Extension sequence expected.", 10);
        }
        char cCharAt = c6589p.toString().charAt(0);
        if (cCharAt == 'u') {
            if (!c6589p2.m23584a()) {
                throw new C0226Da("Extension sequence expected.", 10);
            }
            C6589p c6589pM23588e = c6589p2.m23588e();
            if (((ArrayList) c0471ht.f4310b) != null || ((TreeMap) c0471ht.f4311c) != null) {
                throw new C0226Da(AbstractC7222ym.m26234k("Duplicate unicode extension sequence in [", str, "]"), 10);
            }
            while (AbstractC10471o22.m23323c(c6589pM23588e.f39424b, c6589pM23588e.f39425c, c6589pM23588e.f39426d, 3, 8)) {
                if (((ArrayList) c0471ht.f4310b) == null) {
                    c0471ht.f4310b = new ArrayList();
                }
                ((ArrayList) c0471ht.f4310b).add(c6589pM23588e.toString());
                if (!c6589p2.m23584a()) {
                    return;
                } else {
                    c6589pM23588e = c6589p2.m23588e();
                }
            }
            if (c6589pM23588e.m23586c()) {
                if (((TreeMap) c0471ht.f4311c) == null) {
                    c0471ht.f4311c = new TreeMap();
                }
                do {
                    String string = c6589pM23588e.toString();
                    ArrayList arrayList = new ArrayList();
                    ((TreeMap) c0471ht.f4311c).put(string, arrayList);
                    if (!c6589p2.m23584a()) {
                        return;
                    }
                    c6589pM23588e = c6589p2.m23588e();
                    while (AbstractC10471o22.m23323c(c6589pM23588e.f39424b, c6589pM23588e.f39425c, c6589pM23588e.f39426d, 3, 8)) {
                        arrayList.add(c6589pM23588e.toString());
                        if (!c6589p2.m23584a()) {
                            return;
                        } else {
                            c6589pM23588e = c6589p2.m23588e();
                        }
                    }
                } while (c6589pM23588e.m23586c());
            }
            if (!AbstractC10471o22.m23323c(c6589pM23588e.f39424b, c6589pM23588e.f39425c, c6589pM23588e.f39426d, 1, 1)) {
                throw new C0226Da("Malformed sequence expected.", 10);
            }
            m24827b(str, c6589pM23588e, c6589p2, c0471ht);
            return;
        }
        if (cCharAt == 't') {
            if (!c6589p2.m23584a()) {
                throw new C0226Da("Extension sequence expected.", 10);
            }
            C6589p c6589pM23588e2 = c6589p2.m23588e();
            if (c6589pM23588e2.m23587d()) {
                m24828c(str, c6589p2, c6589pM23588e2, true, c0471ht);
                return;
            } else {
                if (!c6589pM23588e2.m23585b()) {
                    throw new C0226Da(AbstractC11153tN0.m24912x("Unexpected token [", c6589pM23588e2.toString(), "] in transformed extension sequence [", str, "]"), 10);
                }
                m24830e(str, c6589p2, c6589pM23588e2, c0471ht);
                return;
            }
        }
        if (cCharAt == 'x') {
            if (!c6589p2.m23584a()) {
                throw new C0226Da("Extension sequence expected.", 10);
            }
            C6589p c6589pM23588e3 = c6589p2.m23588e();
            if (((ArrayList) c0471ht.f4315g) == null) {
                c0471ht.f4315g = new ArrayList();
            }
            while (AbstractC10471o22.m23323c(c6589pM23588e3.f39424b, c6589pM23588e3.f39425c, c6589pM23588e3.f39426d, 1, 8)) {
                ((ArrayList) c0471ht.f4315g).add(c6589pM23588e3.toString());
                if (!c6589p2.m23584a()) {
                    return;
                } else {
                    c6589pM23588e3 = c6589p2.m23588e();
                }
            }
            throw new C0226Da("Tokens are not expected after pu extension.", 10);
        }
        if (!c6589p2.m23584a()) {
            throw new C0226Da("Extension sequence expected.", 10);
        }
        C6589p c6589pM23588e4 = c6589p2.m23588e();
        if (((TreeMap) c0471ht.f4314f) == null) {
            c0471ht.f4314f = new TreeMap();
        }
        ArrayList arrayList2 = new ArrayList();
        ((TreeMap) c0471ht.f4314f).put(new Character(cCharAt), arrayList2);
        while (AbstractC10471o22.m23323c(c6589pM23588e4.f39424b, c6589pM23588e4.f39425c, c6589pM23588e4.f39426d, 2, 8)) {
            arrayList2.add(c6589pM23588e4.toString());
            if (!c6589p2.m23584a()) {
                return;
            } else {
                c6589pM23588e4 = c6589p2.m23588e();
            }
        }
        if (!AbstractC10471o22.m23323c(c6589pM23588e4.f39424b, c6589pM23588e4.f39425c, c6589pM23588e4.f39426d, 1, 1)) {
            throw new C0226Da("Malformed sequence expected.", 10);
        }
        m24827b(str, c6589pM23588e4, c6589p2, c0471ht);
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x00c6 A[Catch: Fk0 -> 0x0194, LOOP:4: B:157:0x00c4->B:158:0x00c6, LOOP_END, TryCatch #0 {Fk0 -> 0x0194, blocks: (B:110:0x000e, B:112:0x0014, B:113:0x001b, B:115:0x001f, B:116:0x002f, B:119:0x003c, B:121:0x0046, B:124:0x004d, B:126:0x0054, B:129:0x005e, B:131:0x0075, B:130:0x006a, B:132:0x0078, B:135:0x0085, B:136:0x0089, B:138:0x0098, B:163:0x00e5, B:166:0x00ec, B:168:0x00fb, B:170:0x0100, B:172:0x010a, B:175:0x0113, B:176:0x0137, B:177:0x0138, B:179:0x0142, B:181:0x0148, B:185:0x0167, B:188:0x016e, B:182:0x0153, B:183:0x015c, B:184:0x015d, B:141:0x009f, B:147:0x00aa, B:155:0x00bc, B:156:0x00bf, B:158:0x00c6, B:159:0x00d4, B:162:0x00e1, B:189:0x0174, B:190:0x0193), top: B:193:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00e1 A[Catch: Fk0 -> 0x0194, TryCatch #0 {Fk0 -> 0x0194, blocks: (B:110:0x000e, B:112:0x0014, B:113:0x001b, B:115:0x001f, B:116:0x002f, B:119:0x003c, B:121:0x0046, B:124:0x004d, B:126:0x0054, B:129:0x005e, B:131:0x0075, B:130:0x006a, B:132:0x0078, B:135:0x0085, B:136:0x0089, B:138:0x0098, B:163:0x00e5, B:166:0x00ec, B:168:0x00fb, B:170:0x0100, B:172:0x010a, B:175:0x0113, B:176:0x0137, B:177:0x0138, B:179:0x0142, B:181:0x0148, B:185:0x0167, B:188:0x016e, B:182:0x0153, B:183:0x015c, B:184:0x015d, B:141:0x009f, B:147:0x00aa, B:155:0x00bc, B:156:0x00bf, B:158:0x00c6, B:159:0x00d4, B:162:0x00e1, B:189:0x0174, B:190:0x0193), top: B:193:0x000e }] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m24828c(java.lang.String r10, p000.C6589p r11, p000.C6589p r12, boolean r13, p000.C0471HT r14) throws p000.C0226Da {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC11106t10.m24828c(java.lang.String, p, p, boolean, HT):void");
    }

    /* renamed from: d */
    public static C0471HT m24829d(String str) throws C0226Da {
        String lowerCase = str.toLowerCase();
        C6589p c6589p = new C6589p(3);
        c6589p.f39425c = 0;
        c6589p.f39426d = -1;
        c6589p.f39424b = lowerCase;
        C0471HT c0471ht = new C0471HT();
        try {
            if (c6589p.m23584a()) {
                m24828c(lowerCase, c6589p, c6589p.m23588e(), false, c0471ht);
                return c0471ht;
            }
            throw new C0226Da("Language subtag not found: " + lowerCase, 10);
        } catch (C7594Fk0 unused) {
            throw new C0226Da(AbstractC7222ym.m26245v("Locale Identifier subtag iteration failed: ", lowerCase), 10);
        }
    }

    /* renamed from: e */
    public static void m24830e(String str, C6589p c6589p, C6589p c6589p2, C0471HT c0471ht) throws C7594Fk0, C0226Da {
        if (c6589p2.m23585b()) {
            TreeMap treeMap = (TreeMap) c0471ht.f4313e;
            if (treeMap != null) {
                throw new C0226Da(AbstractC7222ym.m26234k("Duplicate transformed extension sequence in [", str, "]"), 10);
            }
            if (treeMap == null) {
                c0471ht.f4313e = new TreeMap();
            }
            do {
                String string = c6589p2.toString();
                ArrayList arrayList = new ArrayList();
                ((TreeMap) c0471ht.f4313e).put(string, arrayList);
                if (!c6589p.m23584a()) {
                    throw new C0226Da(AbstractC7222ym.m26245v("Malformated transformed key in : ", str), 10);
                }
                c6589p2 = c6589p.m23588e();
                while (AbstractC10471o22.m23323c(c6589p2.f39424b, c6589p2.f39425c, c6589p2.f39426d, 3, 8)) {
                    arrayList.add(c6589p2.toString());
                    if (!c6589p.m23584a()) {
                        return;
                    } else {
                        c6589p2 = c6589p.m23588e();
                    }
                }
            } while (c6589p2.m23585b());
        }
        if (!AbstractC10471o22.m23323c(c6589p2.f39424b, c6589p2.f39425c, c6589p2.f39426d, 1, 1)) {
            throw new C0226Da("Malformed extension sequence.", 10);
        }
        m24827b(str, c6589p2, c6589p, c0471ht);
    }
}
