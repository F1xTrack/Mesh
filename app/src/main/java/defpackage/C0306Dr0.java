package defpackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Dr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0306Dr0 {
    public static final Charset b = Charset.forName("UTF-8");
    public final HT a;

    public C0306Dr0(HT ht) {
        this.a = ht;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    public static ArrayList b(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                C1304Qm0 c1304Qm0 = AbstractC5509kT0.a;
                JSONObject jSONObject = new JSONObject(string);
                String string2 = jSONObject.getString("rolloutId");
                String string3 = jSONObject.getString("parameterKey");
                String string4 = jSONObject.getString("parameterValue");
                String string5 = jSONObject.getString("variantId");
                long j = jSONObject.getLong("templateVersion");
                if (string4.length() > 256) {
                    string4 = string4.substring(0, 256);
                }
                arrayList.add(new C7450ue(string2, string3, string4, string5, j));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(AbstractC5509kT0.a.v(list.get(i))));
            } catch (JSONException unused) {
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            file.getAbsolutePath();
        }
    }

    public static void g(File file, String str) {
        if (file.exists() && file.delete()) {
            file.getAbsolutePath();
        }
    }

    public final Map c(String str, boolean z) throws Throwable {
        FileInputStream fileInputStream;
        Throwable th;
        HT ht = this.a;
        File fileJ = z ? ht.j(str, "internal-keys") : ht.j(str, "keys");
        if (!fileJ.exists() || fileJ.length() == 0) {
            g(fileJ, "The file has a length of zero for session: " + str);
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(fileJ);
                try {
                    HashMap mapA = a(AbstractC1717Vu.p(fileInputStream));
                    AbstractC1717Vu.d(fileInputStream);
                    return mapA;
                } catch (Exception unused) {
                    fileInputStream2 = fileInputStream;
                    f(fileJ);
                    AbstractC1717Vu.d(fileInputStream2);
                    return Collections.emptyMap();
                } catch (Throwable th2) {
                    th = th2;
                    AbstractC1717Vu.d(fileInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                fileInputStream = fileInputStream2;
                th = th3;
            }
        } catch (Exception unused2) {
        }
    }

    public final String d(String str) {
        FileInputStream fileInputStream;
        File fileJ = this.a.j(str, "user-data");
        FileInputStream fileInputStream2 = null;
        if (!fileJ.exists() || fileJ.length() == 0) {
            f(fileJ);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(fileJ);
        } catch (Exception unused) {
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
            AbstractC1717Vu.d(fileInputStream2);
            throw th;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(AbstractC1717Vu.p(fileInputStream));
                String strOptString = jSONObject.isNull("userId") ? null : jSONObject.optString("userId", null);
                AbstractC1717Vu.d(fileInputStream);
                return strOptString;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                AbstractC1717Vu.d(fileInputStream2);
                throw th;
            }
        } catch (Exception unused2) {
            f(fileJ);
            AbstractC1717Vu.d(fileInputStream);
            return null;
        }
    }

    public final void h(Map map, String str, boolean z) {
        HT ht = this.a;
        File fileJ = z ? ht.j(str, "internal-keys") : ht.j(str, "keys");
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String string = new JSONObject(map).toString();
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileJ), b));
                try {
                    bufferedWriter2.write(string);
                    bufferedWriter2.flush();
                    AbstractC1717Vu.d(bufferedWriter2);
                } catch (Exception unused) {
                    bufferedWriter = bufferedWriter2;
                    f(fileJ);
                    AbstractC1717Vu.d(bufferedWriter);
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    AbstractC1717Vu.d(bufferedWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused2) {
        }
    }

    public final void i(String str, List list) {
        BufferedWriter bufferedWriter;
        Throwable th;
        File fileJ = this.a.j(str, "rollouts-state");
        if (list.isEmpty()) {
            g(fileJ, "Rollout state is empty for session: " + str);
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                String strE = e(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileJ), b));
                try {
                    bufferedWriter.write(strE);
                    bufferedWriter.flush();
                    AbstractC1717Vu.d(bufferedWriter);
                } catch (Exception unused) {
                    bufferedWriter2 = bufferedWriter;
                    f(fileJ);
                    AbstractC1717Vu.d(bufferedWriter2);
                } catch (Throwable th2) {
                    th = th2;
                    AbstractC1717Vu.d(bufferedWriter);
                    throw th;
                }
            } catch (Exception unused2) {
            }
        } catch (Throwable th3) {
            bufferedWriter = bufferedWriter2;
            th = th3;
        }
    }

    public final void j(String str, String str2) {
        String string;
        BufferedWriter bufferedWriter;
        File fileJ = this.a.j(str, "user-data");
        BufferedWriter bufferedWriter2 = null;
        try {
            C0228Cr0 c0228Cr0 = new C0228Cr0();
            c0228Cr0.put("userId", str2);
            string = c0228Cr0.toString();
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileJ), b));
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(string);
            bufferedWriter.flush();
            AbstractC1717Vu.d(bufferedWriter);
        } catch (Exception unused2) {
            bufferedWriter2 = bufferedWriter;
            AbstractC1717Vu.d(bufferedWriter2);
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            AbstractC1717Vu.d(bufferedWriter2);
            throw th;
        }
    }
}
