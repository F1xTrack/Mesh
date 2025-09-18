package p000;

import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: WA */
/* loaded from: classes.dex */
public final class C1395WA {

    /* renamed from: a */
    public static final C8170Qm0 f13016a;

    static {
        C10415nc0 c10415nc0 = new C10415nc0();
        C6690qb c6690qb = C6690qb.f41031a;
        c10415nc0.mo884a(AbstractC1206TA.class, c6690qb);
        c10415nc0.mo884a(C0606Jc.class, c6690qb);
        C7085wb c7085wb = C7085wb.f44973a;
        c10415nc0.mo884a(AbstractC1143SA.class, c7085wb);
        c10415nc0.mo884a(C1171Sc.class, c7085wb);
        C6896tb c6896tb = C6896tb.f43147a;
        c10415nc0.mo884a(AbstractC0011AA.class, c6896tb);
        c10415nc0.mo884a(C1234Tc.class, c6896tb);
        C6959ub c6959ub = C6959ub.f43757a;
        c10415nc0.mo884a(AbstractC7247zA.class, c6959ub);
        c10415nc0.mo884a(AbstractC1297Uc.class, c6959ub);
        C0793Mb c0793Mb = C0793Mb.f7244a;
        c10415nc0.mo884a(AbstractC1080RA.class, c0793Mb);
        c10415nc0.mo884a(C6835sd.class, c0793Mb);
        C0730Lb c0730Lb = C0730Lb.f6741a;
        c10415nc0.mo884a(AbstractC1018QA.class, c0730Lb);
        c10415nc0.mo884a(C6755rd.class, c0730Lb);
        C7022vb c7022vb = C7022vb.f44419a;
        c10415nc0.mo884a(AbstractC0074BA.class, c7022vb);
        c10415nc0.mo884a(C1423Wc.class, c7022vb);
        C0416Gb c0416Gb = C0416Gb.f3808a;
        c10415nc0.mo884a(AbstractC0955PA.class, c0416Gb);
        c10415nc0.mo884a(C1549Yc.class, c0416Gb);
        C7148xb c7148xb = C7148xb.f45687a;
        c10415nc0.mo884a(AbstractC0578JA.class, c7148xb);
        c10415nc0.mo884a(C1612Zc.class, c7148xb);
        C7274zb c7274zb = C7274zb.f46878a;
        c10415nc0.mo884a(AbstractC0452HA.class, c7274zb);
        c10415nc0.mo884a(C1676ad.class, c7274zb);
        C0164Cb c0164Cb = C0164Cb.f1467a;
        c10415nc0.mo884a(AbstractC0389GA.class, c0164Cb);
        c10415nc0.mo884a(C4002ed.class, c0164Cb);
        C0227Db c0227Db = C0227Db.f2049a;
        c10415nc0.mo884a(AbstractC0326FA.class, c0227Db);
        c10415nc0.mo884a(C4128gd.class, c0227Db);
        C0038Ab c0038Ab = C0038Ab.f263a;
        c10415nc0.mo884a(AbstractC0200DA.class, c0038Ab);
        c10415nc0.mo884a(C1859cd.class, c0038Ab);
        C6562ob c6562ob = C6562ob.f39100a;
        c10415nc0.mo884a(AbstractC6995vA.class, c6562ob);
        c10415nc0.mo884a(C0794Mc.class, c6562ob);
        C6499nb c6499nb = C6499nb.f38385a;
        c10415nc0.mo884a(AbstractC6932uA.class, c6499nb);
        c10415nc0.mo884a(C0857Nc.class, c6499nb);
        C0101Bb c0101Bb = C0101Bb.f930a;
        c10415nc0.mo884a(AbstractC0263EA.class, c0101Bb);
        c10415nc0.mo884a(C3940dd.class, c0101Bb);
        C7211yb c7211yb = C7211yb.f46321a;
        c10415nc0.mo884a(AbstractC0137CA.class, c7211yb);
        c10415nc0.mo884a(C1797bd.class, c7211yb);
        C6627pb c6627pb = C6627pb.f40225a;
        c10415nc0.mo884a(AbstractC7058wA.class, c6627pb);
        c10415nc0.mo884a(C0920Oc.class, c6627pb);
        C0290Eb c0290Eb = C0290Eb.f2793a;
        c10415nc0.mo884a(AbstractC0515IA.class, c0290Eb);
        c10415nc0.mo884a(C4254id.class, c0290Eb);
        C0353Fb c0353Fb = C0353Fb.f3316a;
        c10415nc0.mo884a(AbstractC0641KA.class, c0353Fb);
        c10415nc0.mo884a(C6312kd.class, c0353Fb);
        C0479Hb c0479Hb = C0479Hb.f4356a;
        c10415nc0.mo884a(AbstractC0704LA.class, c0479Hb);
        c10415nc0.mo884a(C6375ld.class, c0479Hb);
        C0668Kb c0668Kb = C0668Kb.f6220a;
        c10415nc0.mo884a(AbstractC0892OA.class, c0668Kb);
        c10415nc0.mo884a(C6629pd.class, c0668Kb);
        C0542Ib c0542Ib = C0542Ib.f5023a;
        c10415nc0.mo884a(AbstractC0829NA.class, c0542Ib);
        c10415nc0.mo884a(C6501nd.class, c0542Ib);
        C0605Jb c0605Jb = C0605Jb.f5620a;
        c10415nc0.mo884a(AbstractC0766MA.class, c0605Jb);
        c10415nc0.mo884a(C6564od.class, c0605Jb);
        C6753rb c6753rb = C6753rb.f41738a;
        c10415nc0.mo884a(AbstractC7184yA.class, c6753rb);
        c10415nc0.mo884a(C0983Pc.class, c6753rb);
        C6833sb c6833sb = C6833sb.f42489a;
        c10415nc0.mo884a(AbstractC7121xA.class, c6833sb);
        c10415nc0.mo884a(C1046Qc.class, c6833sb);
        c10415nc0.f38409d = true;
        f13016a = new C8170Qm0(22, c10415nc0);
    }

    /* renamed from: a */
    public static C4128gd m8691a(JsonReader jsonReader) throws IOException {
        C4065fd c4065fd = new C4065fd();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    c4065fd.f27268d = jsonReader.nextLong();
                    c4065fd.f27270f = (byte) (c4065fd.f27270f | 2);
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null symbol");
                    }
                    c4065fd.f27266b = strNextString;
                    break;
                case "pc":
                    c4065fd.f27265a = jsonReader.nextLong();
                    c4065fd.f27270f = (byte) (c4065fd.f27270f | 1);
                    break;
                case "file":
                    c4065fd.f27267c = jsonReader.nextString();
                    break;
                case "importance":
                    c4065fd.f27269e = jsonReader.nextInt();
                    c4065fd.f27270f = (byte) (c4065fd.f27270f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c4065fd.m18262a();
    }

    /* renamed from: b */
    public static C0920Oc m8692b(JsonReader jsonReader) throws IOException {
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
            return new C0920Oc(strNextString, strNextString2);
        }
        StringBuilder sb = new StringBuilder();
        if (strNextString == null) {
            sb.append(" key");
        }
        if (strNextString2 == null) {
            sb.append(" value");
        }
        throw new IllegalStateException(AbstractC1374Vq.m8592k(sb, "Missing required properties:"));
    }

    /* renamed from: c */
    public static C0794Mc m8693c(JsonReader jsonReader) throws IOException {
        C0731Lc c0731Lc = new C0731Lc();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    c0731Lc.f6757i = m8694d(jsonReader, new C4262il(13));
                    break;
                case "pid":
                    c0731Lc.f6749a = jsonReader.nextInt();
                    c0731Lc.f6758j = (byte) (c0731Lc.f6758j | 1);
                    break;
                case "pss":
                    c0731Lc.f6753e = jsonReader.nextLong();
                    c0731Lc.f6758j = (byte) (c0731Lc.f6758j | 8);
                    break;
                case "rss":
                    c0731Lc.f6754f = jsonReader.nextLong();
                    c0731Lc.f6758j = (byte) (c0731Lc.f6758j | 16);
                    break;
                case "timestamp":
                    c0731Lc.f6755g = jsonReader.nextLong();
                    c0731Lc.f6758j = (byte) (c0731Lc.f6758j | 32);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    c0731Lc.f6750b = strNextString;
                    break;
                case "reasonCode":
                    c0731Lc.f6751c = jsonReader.nextInt();
                    c0731Lc.f6758j = (byte) (c0731Lc.f6758j | 2);
                    break;
                case "traceFile":
                    c0731Lc.f6756h = jsonReader.nextString();
                    break;
                case "importance":
                    c0731Lc.f6752d = jsonReader.nextInt();
                    c0731Lc.f6758j = (byte) (c0731Lc.f6758j | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c0731Lc.m5031a();
    }

    /* renamed from: d */
    public static List m8694d(JsonReader jsonReader, InterfaceC1332VA interfaceC1332VA) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(interfaceC1332VA.mo8320c(jsonReader));
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
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.C1549Yc m8695e(android.util.JsonReader r27) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1395WA.m8695e(android.util.JsonReader):Yc");
    }

    /* renamed from: f */
    public static C1859cd m8696f(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        int iNextInt = 0;
        String str = null;
        String strNextString = null;
        List list = null;
        C1859cd c1859cdM8696f = null;
        byte b = 0;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    List listM8694d = m8694d(jsonReader, new C4262il(18));
                    if (listM8694d == null) {
                        throw new NullPointerException("Null frames");
                    }
                    list = listM8694d;
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
                    c1859cdM8696f = m8696f(jsonReader);
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
            return new C1859cd(str, strNextString, list, c1859cdM8696f, iNextInt);
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
        throw new IllegalStateException(AbstractC1374Vq.m8592k(sb, "Missing required properties:"));
    }

    /* renamed from: g */
    public static C4254id m8697g(JsonReader jsonReader) throws IOException {
        C4191hd c4191hd = new C4191hd();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    c4191hd.f28483b = jsonReader.nextInt();
                    c4191hd.f28486e = (byte) (c4191hd.f28486e | 1);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    c4191hd.f28482a = strNextString;
                    break;
                case "defaultProcess":
                    c4191hd.f28485d = jsonReader.nextBoolean();
                    c4191hd.f28486e = (byte) (c4191hd.f28486e | 4);
                    break;
                case "importance":
                    c4191hd.f28484c = jsonReader.nextInt();
                    c4191hd.f28486e = (byte) (c4191hd.f28486e | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c4191hd.m18842a();
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
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.C0606Jc m8698h(android.util.JsonReader r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1395WA.m8698h(android.util.JsonReader):Jc");
    }

    /* renamed from: i */
    public static C0606Jc m8699i(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                C0606Jc c0606JcM8698h = m8698h(jsonReader);
                jsonReader.close();
                return c0606JcM8698h;
            } finally {
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
