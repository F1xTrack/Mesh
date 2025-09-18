package defpackage;

import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WA {
    public static final C1304Qm0 a;

    static {
        C6109nc0 c6109nc0 = new C6109nc0();
        C6678qb c6678qb = C6678qb.a;
        c6109nc0.a(TA.class, c6678qb);
        c6109nc0.a(C0728Jc.class, c6678qb);
        C7822wb c7822wb = C7822wb.a;
        c6109nc0.a(SA.class, c7822wb);
        c6109nc0.a(C1429Sc.class, c7822wb);
        C7250tb c7250tb = C7250tb.a;
        c6109nc0.a(AA.class, c7250tb);
        c6109nc0.a(C1507Tc.class, c7250tb);
        C7441ub c7441ub = C7441ub.a;
        c6109nc0.a(AbstractC8311zA.class, c7441ub);
        c6109nc0.a(AbstractC1585Uc.class, c7441ub);
        C0958Mb c0958Mb = C0958Mb.a;
        c6109nc0.a(RA.class, c0958Mb);
        c6109nc0.a(C7065sd.class, c0958Mb);
        C0881Lb c0881Lb = C0881Lb.a;
        c6109nc0.a(QA.class, c0881Lb);
        c6109nc0.a(C6874rd.class, c0881Lb);
        C7632vb c7632vb = C7632vb.a;
        c6109nc0.a(BA.class, c7632vb);
        c6109nc0.a(C1741Wc.class, c7632vb);
        C0491Gb c0491Gb = C0491Gb.a;
        c6109nc0.a(PA.class, c0491Gb);
        c6109nc0.a(C1897Yc.class, c0491Gb);
        C8012xb c8012xb = C8012xb.a;
        c6109nc0.a(JA.class, c8012xb);
        c6109nc0.a(C1975Zc.class, c8012xb);
        C8392zb c8392zb = C8392zb.a;
        c6109nc0.a(HA.class, c8392zb);
        c6109nc0.a(C2169ad.class, c8392zb);
        C0179Cb c0179Cb = C0179Cb.a;
        c6109nc0.a(GA.class, c0179Cb);
        c6109nc0.a(C3616ed.class, c0179Cb);
        C0257Db c0257Db = C0257Db.a;
        c6109nc0.a(FA.class, c0257Db);
        c6109nc0.a(C3998gd.class, c0257Db);
        C0023Ab c0023Ab = C0023Ab.a;
        c6109nc0.a(DA.class, c0023Ab);
        c6109nc0.a(C2550cd.class, c0023Ab);
        C6296ob c6296ob = C6296ob.a;
        c6109nc0.a(AbstractC7551vA.class, c6296ob);
        c6109nc0.a(C0961Mc.class, c6296ob);
        C6105nb c6105nb = C6105nb.a;
        c6109nc0.a(AbstractC7360uA.class, c6105nb);
        c6109nc0.a(C1039Nc.class, c6105nb);
        C0101Bb c0101Bb = C0101Bb.a;
        c6109nc0.a(EA.class, c0101Bb);
        c6109nc0.a(C3426dd.class, c0101Bb);
        C8202yb c8202yb = C8202yb.a;
        c6109nc0.a(CA.class, c8202yb);
        c6109nc0.a(C2360bd.class, c8202yb);
        C6487pb c6487pb = C6487pb.a;
        c6109nc0.a(AbstractC7741wA.class, c6487pb);
        c6109nc0.a(C1117Oc.class, c6487pb);
        C0335Eb c0335Eb = C0335Eb.a;
        c6109nc0.a(IA.class, c0335Eb);
        c6109nc0.a(C4380id.class, c0335Eb);
        C0413Fb c0413Fb = C0413Fb.a;
        c6109nc0.a(KA.class, c0413Fb);
        c6109nc0.a(C5538kd.class, c0413Fb);
        C0569Hb c0569Hb = C0569Hb.a;
        c6109nc0.a(LA.class, c0569Hb);
        c6109nc0.a(C5729ld.class, c0569Hb);
        C0803Kb c0803Kb = C0803Kb.a;
        c6109nc0.a(OA.class, c0803Kb);
        c6109nc0.a(C6493pd.class, c0803Kb);
        C0647Ib c0647Ib = C0647Ib.a;
        c6109nc0.a(NA.class, c0647Ib);
        c6109nc0.a(C6111nd.class, c0647Ib);
        C0725Jb c0725Jb = C0725Jb.a;
        c6109nc0.a(MA.class, c0725Jb);
        c6109nc0.a(C6302od.class, c0725Jb);
        C6868rb c6868rb = C6868rb.a;
        c6109nc0.a(AbstractC8121yA.class, c6868rb);
        c6109nc0.a(C1195Pc.class, c6868rb);
        C7059sb c7059sb = C7059sb.a;
        c6109nc0.a(AbstractC7931xA.class, c7059sb);
        c6109nc0.a(C1273Qc.class, c7059sb);
        c6109nc0.d = true;
        a = new C1304Qm0(22, c6109nc0);
    }

    public static C3998gd a(JsonReader jsonReader) throws IOException {
        C3807fd c3807fd = new C3807fd();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    c3807fd.d = jsonReader.nextLong();
                    c3807fd.f = (byte) (c3807fd.f | 2);
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null symbol");
                    }
                    c3807fd.b = strNextString;
                    break;
                case "pc":
                    c3807fd.a = jsonReader.nextLong();
                    c3807fd.f = (byte) (c3807fd.f | 1);
                    break;
                case "file":
                    c3807fd.c = jsonReader.nextString();
                    break;
                case "importance":
                    c3807fd.e = jsonReader.nextInt();
                    c3807fd.f = (byte) (c3807fd.f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c3807fd.a();
    }

    public static C1117Oc b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    throw new NullPointerException("Null key");
                }
            } else if (strNextName.equals("value")) {
                strNextString2 = jsonReader.nextString();
                if (strNextString2 == null) {
                    throw new NullPointerException("Null value");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (strNextString != null && strNextString2 != null) {
            return new C1117Oc(strNextString, strNextString2);
        }
        StringBuilder sb = new StringBuilder();
        if (strNextString == null) {
            sb.append(" key");
        }
        if (strNextString2 == null) {
            sb.append(" value");
        }
        throw new IllegalStateException(AbstractC1705Vq.k(sb, "Missing required properties:"));
    }

    public static C0961Mc c(JsonReader jsonReader) throws IOException {
        C0884Lc c0884Lc = new C0884Lc();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    c0884Lc.i = d(jsonReader, new C4403il(13));
                    break;
                case "pid":
                    c0884Lc.a = jsonReader.nextInt();
                    c0884Lc.j = (byte) (c0884Lc.j | 1);
                    break;
                case "pss":
                    c0884Lc.e = jsonReader.nextLong();
                    c0884Lc.j = (byte) (c0884Lc.j | 8);
                    break;
                case "rss":
                    c0884Lc.f = jsonReader.nextLong();
                    c0884Lc.j = (byte) (c0884Lc.j | 16);
                    break;
                case "timestamp":
                    c0884Lc.g = jsonReader.nextLong();
                    c0884Lc.j = (byte) (c0884Lc.j | 32);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    c0884Lc.b = strNextString;
                    break;
                case "reasonCode":
                    c0884Lc.c = jsonReader.nextInt();
                    c0884Lc.j = (byte) (c0884Lc.j | 2);
                    break;
                case "traceFile":
                    c0884Lc.h = jsonReader.nextString();
                    break;
                case "importance":
                    c0884Lc.d = jsonReader.nextInt();
                    c0884Lc.j = (byte) (c0884Lc.j | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c0884Lc.a();
    }

    public static List d(JsonReader jsonReader, VA va) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(va.c(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C1897Yc e(android.util.JsonReader r27) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.WA.e(android.util.JsonReader):Yc");
    }

    public static C2550cd f(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        int iNextInt = 0;
        String str = null;
        String strNextString = null;
        List list = null;
        C2550cd c2550cdF = null;
        byte b = 0;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    List listD = d(jsonReader, new C4403il(18));
                    if (listD == null) {
                        throw new NullPointerException("Null frames");
                    }
                    list = listD;
                    break;
                case "reason":
                    strNextString = jsonReader.nextString();
                    break;
                case "type":
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        throw new NullPointerException("Null type");
                    }
                    str = strNextString2;
                    break;
                case "causedBy":
                    c2550cdF = f(jsonReader);
                    break;
                case "overflowCount":
                    iNextInt = jsonReader.nextInt();
                    b = (byte) (b | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (b == 1 && str != null && list != null) {
            return new C2550cd(str, strNextString, list, c2550cdF, iNextInt);
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            sb.append(" type");
        }
        if (list == null) {
            sb.append(" frames");
        }
        if ((b & 1) == 0) {
            sb.append(" overflowCount");
        }
        throw new IllegalStateException(AbstractC1705Vq.k(sb, "Missing required properties:"));
    }

    public static C4380id g(JsonReader jsonReader) throws IOException {
        C4189hd c4189hd = new C4189hd();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    c4189hd.b = jsonReader.nextInt();
                    c4189hd.e = (byte) (c4189hd.e | 1);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    c4189hd.a = strNextString;
                    break;
                case "defaultProcess":
                    c4189hd.d = jsonReader.nextBoolean();
                    c4189hd.e = (byte) (c4189hd.e | 4);
                    break;
                case "importance":
                    c4189hd.c = jsonReader.nextInt();
                    c4189hd.e = (byte) (c4189hd.e | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c4189hd.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0037  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C0728Jc h(android.util.JsonReader r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.WA.h(android.util.JsonReader):Jc");
    }

    public static C0728Jc i(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                C0728Jc c0728JcH = h(jsonReader);
                jsonReader.close();
                return c0728JcH;
            } finally {
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
