package p000;

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
public final class C7504Dr0 {

    /* renamed from: b */
    public static final Charset f2278b = Charset.forName("UTF-8");

    /* renamed from: a */
    public final C0471HT f2279a;

    public C7504Dr0(C0471HT c0471ht) {
        this.f2279a = c0471ht;
    }

    /* renamed from: a */
    public static HashMap m1908a(String str) {
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

    /* renamed from: b */
    public static ArrayList m1909b(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                C8170Qm0 c8170Qm0 = AbstractC10013kT0.f36505a;
                JSONObject jSONObject = new JSONObject(string);
                String string2 = jSONObject.getString("rolloutId");
                String string3 = jSONObject.getString("parameterKey");
                String string4 = jSONObject.getString("parameterValue");
                String string5 = jSONObject.getString("variantId");
                long j = jSONObject.getLong("templateVersion");
                if (string4.length() > 256) {
                    string4 = string4.substring(0, 256);
                }
                arrayList.add(new C6962ue(string2, string3, string4, string5, j));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static String m1910e(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(AbstractC10013kT0.f36505a.m6779v(list.get(i))));
            } catch (JSONException unused) {
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    /* renamed from: f */
    public static void m1911f(File file) {
        if (file.exists() && file.delete()) {
            file.getAbsolutePath();
        }
    }

    /* renamed from: g */
    public static void m1912g(File file, String str) {
        if (file.exists() && file.delete()) {
            file.getAbsolutePath();
        }
    }

    /* renamed from: c */
    public final Map m1913c(String str, boolean z) throws Throwable {
        FileInputStream fileInputStream;
        Throwable th;
        C0471HT c0471ht = this.f2279a;
        File fileM3450j = z ? c0471ht.m3450j(str, "internal-keys") : c0471ht.m3450j(str, "keys");
        if (!fileM3450j.exists() || fileM3450j.length() == 0) {
            m1912g(fileM3450j, "The file has a length of zero for session: " + str);
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(fileM3450j);
                try {
                    HashMap mapM1908a = m1908a(AbstractC1378Vu.m8631p(fileInputStream));
                    AbstractC1378Vu.m8619d(fileInputStream);
                    return mapM1908a;
                } catch (Exception unused) {
                    fileInputStream2 = fileInputStream;
                    m1911f(fileM3450j);
                    AbstractC1378Vu.m8619d(fileInputStream2);
                    return Collections.emptyMap();
                } catch (Throwable th2) {
                    th = th2;
                    AbstractC1378Vu.m8619d(fileInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                fileInputStream = fileInputStream2;
                th = th3;
            }
        } catch (Exception unused2) {
        }
    }

    /* renamed from: d */
    public final String m1914d(String str) {
        FileInputStream fileInputStream;
        File fileM3450j = this.f2279a.m3450j(str, "user-data");
        FileInputStream fileInputStream2 = null;
        if (!fileM3450j.exists() || fileM3450j.length() == 0) {
            m1911f(fileM3450j);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(fileM3450j);
        } catch (Exception unused) {
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
            AbstractC1378Vu.m8619d(fileInputStream2);
            throw th;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(AbstractC1378Vu.m8631p(fileInputStream));
                String strOptString = jSONObject.isNull("userId") ? null : jSONObject.optString("userId", null);
                AbstractC1378Vu.m8619d(fileInputStream);
                return strOptString;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                AbstractC1378Vu.m8619d(fileInputStream2);
                throw th;
            }
        } catch (Exception unused2) {
            m1911f(fileM3450j);
            AbstractC1378Vu.m8619d(fileInputStream);
            return null;
        }
    }

    /* renamed from: h */
    public final void m1915h(Map map, String str, boolean z) {
        C0471HT c0471ht = this.f2279a;
        File fileM3450j = z ? c0471ht.m3450j(str, "internal-keys") : c0471ht.m3450j(str, "keys");
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String string = new JSONObject(map).toString();
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileM3450j), f2278b));
                try {
                    bufferedWriter2.write(string);
                    bufferedWriter2.flush();
                    AbstractC1378Vu.m8619d(bufferedWriter2);
                } catch (Exception unused) {
                    bufferedWriter = bufferedWriter2;
                    m1911f(fileM3450j);
                    AbstractC1378Vu.m8619d(bufferedWriter);
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    AbstractC1378Vu.m8619d(bufferedWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused2) {
        }
    }

    /* renamed from: i */
    public final void m1916i(String str, List list) {
        BufferedWriter bufferedWriter;
        Throwable th;
        File fileM3450j = this.f2279a.m3450j(str, "rollouts-state");
        if (list.isEmpty()) {
            m1912g(fileM3450j, "Rollout state is empty for session: " + str);
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                String strM1910e = m1910e(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileM3450j), f2278b));
                try {
                    bufferedWriter.write(strM1910e);
                    bufferedWriter.flush();
                    AbstractC1378Vu.m8619d(bufferedWriter);
                } catch (Exception unused) {
                    bufferedWriter2 = bufferedWriter;
                    m1911f(fileM3450j);
                    AbstractC1378Vu.m8619d(bufferedWriter2);
                } catch (Throwable th2) {
                    th = th2;
                    AbstractC1378Vu.m8619d(bufferedWriter);
                    throw th;
                }
            } catch (Exception unused2) {
            }
        } catch (Throwable th3) {
            bufferedWriter = bufferedWriter2;
            th = th3;
        }
    }

    /* renamed from: j */
    public final void m1917j(String str, String str2) {
        String string;
        BufferedWriter bufferedWriter;
        File fileM3450j = this.f2279a.m3450j(str, "user-data");
        BufferedWriter bufferedWriter2 = null;
        try {
            C7452Cr0 c7452Cr0 = new C7452Cr0();
            c7452Cr0.put("userId", str2);
            string = c7452Cr0.toString();
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileM3450j), f2278b));
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(string);
            bufferedWriter.flush();
            AbstractC1378Vu.m8619d(bufferedWriter);
        } catch (Exception unused2) {
            bufferedWriter2 = bufferedWriter;
            AbstractC1378Vu.m8619d(bufferedWriter2);
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            AbstractC1378Vu.m8619d(bufferedWriter2);
            throw th;
        }
    }
}
