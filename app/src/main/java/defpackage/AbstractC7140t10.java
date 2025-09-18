package defpackage;

import java.util.ArrayList;
import java.util.TreeMap;

/* renamed from: t10 */
/* loaded from: classes.dex */
public abstract class AbstractC7140t10 {
    public static final C4403il a = new C4403il(10);

    public static boolean a(String str, C6371p c6371p, C6371p c6371p2, boolean z, HT ht) throws C0441Fk0, C0254Da {
        if (z && c6371p2.b()) {
            e(str, c6371p, c6371p2, ht);
            return true;
        }
        if (!AbstractC6192o22.c(c6371p2.b, c6371p2.c, c6371p2.d, 1, 1)) {
            return false;
        }
        if (z) {
            throw new C0254Da(AbstractC8235ym.v("Extension singletons in transformed extension language tag: ", str), 10);
        }
        b(str, c6371p2, c6371p, ht);
        return true;
    }

    public static void b(String str, C6371p c6371p, C6371p c6371p2, HT ht) throws C0441Fk0, C0254Da {
        if (!c6371p2.a()) {
            throw new C0254Da("Extension sequence expected.", 10);
        }
        char cCharAt = c6371p.toString().charAt(0);
        if (cCharAt == 'u') {
            if (!c6371p2.a()) {
                throw new C0254Da("Extension sequence expected.", 10);
            }
            C6371p c6371pE = c6371p2.e();
            if (((ArrayList) ht.b) != null || ((TreeMap) ht.c) != null) {
                throw new C0254Da(AbstractC8235ym.k("Duplicate unicode extension sequence in [", str, "]"), 10);
            }
            while (AbstractC6192o22.c(c6371pE.b, c6371pE.c, c6371pE.d, 3, 8)) {
                if (((ArrayList) ht.b) == null) {
                    ht.b = new ArrayList();
                }
                ((ArrayList) ht.b).add(c6371pE.toString());
                if (!c6371p2.a()) {
                    return;
                } else {
                    c6371pE = c6371p2.e();
                }
            }
            if (c6371pE.c()) {
                if (((TreeMap) ht.c) == null) {
                    ht.c = new TreeMap();
                }
                do {
                    String string = c6371pE.toString();
                    ArrayList arrayList = new ArrayList();
                    ((TreeMap) ht.c).put(string, arrayList);
                    if (!c6371p2.a()) {
                        return;
                    }
                    c6371pE = c6371p2.e();
                    while (AbstractC6192o22.c(c6371pE.b, c6371pE.c, c6371pE.d, 3, 8)) {
                        arrayList.add(c6371pE.toString());
                        if (!c6371p2.a()) {
                            return;
                        } else {
                            c6371pE = c6371p2.e();
                        }
                    }
                } while (c6371pE.c());
            }
            if (!AbstractC6192o22.c(c6371pE.b, c6371pE.c, c6371pE.d, 1, 1)) {
                throw new C0254Da("Malformed sequence expected.", 10);
            }
            b(str, c6371pE, c6371p2, ht);
            return;
        }
        if (cCharAt == 't') {
            if (!c6371p2.a()) {
                throw new C0254Da("Extension sequence expected.", 10);
            }
            C6371p c6371pE2 = c6371p2.e();
            if (c6371pE2.d()) {
                c(str, c6371p2, c6371pE2, true, ht);
                return;
            } else {
                if (!c6371pE2.b()) {
                    throw new C0254Da(AbstractC7209tN0.x("Unexpected token [", c6371pE2.toString(), "] in transformed extension sequence [", str, "]"), 10);
                }
                e(str, c6371p2, c6371pE2, ht);
                return;
            }
        }
        if (cCharAt == 'x') {
            if (!c6371p2.a()) {
                throw new C0254Da("Extension sequence expected.", 10);
            }
            C6371p c6371pE3 = c6371p2.e();
            if (((ArrayList) ht.g) == null) {
                ht.g = new ArrayList();
            }
            while (AbstractC6192o22.c(c6371pE3.b, c6371pE3.c, c6371pE3.d, 1, 8)) {
                ((ArrayList) ht.g).add(c6371pE3.toString());
                if (!c6371p2.a()) {
                    return;
                } else {
                    c6371pE3 = c6371p2.e();
                }
            }
            throw new C0254Da("Tokens are not expected after pu extension.", 10);
        }
        if (!c6371p2.a()) {
            throw new C0254Da("Extension sequence expected.", 10);
        }
        C6371p c6371pE4 = c6371p2.e();
        if (((TreeMap) ht.f) == null) {
            ht.f = new TreeMap();
        }
        ArrayList arrayList2 = new ArrayList();
        ((TreeMap) ht.f).put(new Character(cCharAt), arrayList2);
        while (AbstractC6192o22.c(c6371pE4.b, c6371pE4.c, c6371pE4.d, 2, 8)) {
            arrayList2.add(c6371pE4.toString());
            if (!c6371p2.a()) {
                return;
            } else {
                c6371pE4 = c6371p2.e();
            }
        }
        if (!AbstractC6192o22.c(c6371pE4.b, c6371pE4.c, c6371pE4.d, 1, 1)) {
            throw new C0254Da("Malformed sequence expected.", 10);
        }
        b(str, c6371pE4, c6371p2, ht);
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x00c6 A[Catch: Fk0 -> 0x0194, LOOP:4: B:157:0x00c4->B:158:0x00c6, LOOP_END, TryCatch #0 {Fk0 -> 0x0194, blocks: (B:110:0x000e, B:112:0x0014, B:113:0x001b, B:115:0x001f, B:116:0x002f, B:119:0x003c, B:121:0x0046, B:124:0x004d, B:126:0x0054, B:129:0x005e, B:131:0x0075, B:130:0x006a, B:132:0x0078, B:135:0x0085, B:136:0x0089, B:138:0x0098, B:163:0x00e5, B:166:0x00ec, B:168:0x00fb, B:170:0x0100, B:172:0x010a, B:175:0x0113, B:176:0x0137, B:177:0x0138, B:179:0x0142, B:181:0x0148, B:185:0x0167, B:188:0x016e, B:182:0x0153, B:183:0x015c, B:184:0x015d, B:141:0x009f, B:147:0x00aa, B:155:0x00bc, B:156:0x00bf, B:158:0x00c6, B:159:0x00d4, B:162:0x00e1, B:189:0x0174, B:190:0x0193), top: B:193:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00e1 A[Catch: Fk0 -> 0x0194, TryCatch #0 {Fk0 -> 0x0194, blocks: (B:110:0x000e, B:112:0x0014, B:113:0x001b, B:115:0x001f, B:116:0x002f, B:119:0x003c, B:121:0x0046, B:124:0x004d, B:126:0x0054, B:129:0x005e, B:131:0x0075, B:130:0x006a, B:132:0x0078, B:135:0x0085, B:136:0x0089, B:138:0x0098, B:163:0x00e5, B:166:0x00ec, B:168:0x00fb, B:170:0x0100, B:172:0x010a, B:175:0x0113, B:176:0x0137, B:177:0x0138, B:179:0x0142, B:181:0x0148, B:185:0x0167, B:188:0x016e, B:182:0x0153, B:183:0x015c, B:184:0x015d, B:141:0x009f, B:147:0x00aa, B:155:0x00bc, B:156:0x00bf, B:158:0x00c6, B:159:0x00d4, B:162:0x00e1, B:189:0x0174, B:190:0x0193), top: B:193:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(java.lang.String r10, defpackage.C6371p r11, defpackage.C6371p r12, boolean r13, defpackage.HT r14) throws defpackage.C0254Da {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7140t10.c(java.lang.String, p, p, boolean, HT):void");
    }

    public static HT d(String str) throws C0254Da {
        String lowerCase = str.toLowerCase();
        C6371p c6371p = new C6371p(3);
        c6371p.c = 0;
        c6371p.d = -1;
        c6371p.b = lowerCase;
        HT ht = new HT();
        try {
            if (c6371p.a()) {
                c(lowerCase, c6371p, c6371p.e(), false, ht);
                return ht;
            }
            throw new C0254Da("Language subtag not found: " + lowerCase, 10);
        } catch (C0441Fk0 unused) {
            throw new C0254Da(AbstractC8235ym.v("Locale Identifier subtag iteration failed: ", lowerCase), 10);
        }
    }

    public static void e(String str, C6371p c6371p, C6371p c6371p2, HT ht) throws C0441Fk0, C0254Da {
        if (c6371p2.b()) {
            TreeMap treeMap = (TreeMap) ht.e;
            if (treeMap != null) {
                throw new C0254Da(AbstractC8235ym.k("Duplicate transformed extension sequence in [", str, "]"), 10);
            }
            if (treeMap == null) {
                ht.e = new TreeMap();
            }
            do {
                String string = c6371p2.toString();
                ArrayList arrayList = new ArrayList();
                ((TreeMap) ht.e).put(string, arrayList);
                if (!c6371p.a()) {
                    throw new C0254Da(AbstractC8235ym.v("Malformated transformed key in : ", str), 10);
                }
                c6371p2 = c6371p.e();
                while (AbstractC6192o22.c(c6371p2.b, c6371p2.c, c6371p2.d, 3, 8)) {
                    arrayList.add(c6371p2.toString());
                    if (!c6371p.a()) {
                        return;
                    } else {
                        c6371p2 = c6371p.e();
                    }
                }
            } while (c6371p2.b());
        }
        if (!AbstractC6192o22.c(c6371p2.b, c6371p2.c, c6371p2.d, 1, 1)) {
            throw new C0254Da("Malformed extension sequence.", 10);
        }
        b(str, c6371p2, c6371p, ht);
    }
}
