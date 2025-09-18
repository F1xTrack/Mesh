package com.yandex.metrica.impl.ob;

import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.tracer.base.ucum.UcumUtils;

/* loaded from: classes2.dex */
public class Wl {
    public final String a;
    public final String b;
    public final b c;
    public final int d;
    public final boolean e;
    public final c f;
    public final a g;

    public enum a {
        LIST("LIST"),
        LABEL("LABEL"),
        BUTTON("BUTTON"),
        CONTAINER("CONTAINER"),
        TOOLBAR("TOOLBAR"),
        INPUT("INPUT"),
        IMAGE("IMAGE"),
        WEBVIEW("WEBVIEW"),
        OTHER("OTHER");

        private final String a;

        a(String str) {
            this.a = str;
        }
    }

    public enum b {
        TEXT_TOO_LONG("TEXT_TOO_LONG"),
        REGEXP_NOT_MATCHED("REGEXP_NOT_MATCHED"),
        IRRELEVANT_CLASS("IRRELEVANT_CLASS"),
        BAD_REGEXP_MATCHED("BAD_REGEXP_MATCHED"),
        EQUALS("EQUALS"),
        CONTAINS("CONTAINS");

        private final String a;

        b(String str) {
            this.a = str;
        }
    }

    public enum c {
        VIEW_CONTAINER("VIEW_CONTAINER"),
        VIEW("VIEW");

        private final String a;

        c(String str) {
            this.a = str;
        }
    }

    public Wl(String str, String str2, b bVar, int i, boolean z, c cVar, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = bVar;
        this.d = i;
        this.e = z;
        this.f = cVar;
        this.g = aVar;
    }

    public JSONArray a(Kl kl) {
        return null;
    }

    public String toString() {
        return "UiElement{mClassName='" + this.a + "', mId='" + this.b + "', mParseFilterReason=" + this.c + ", mDepth=" + this.d + ", mListItem=" + this.e + ", mViewType=" + this.f + ", mClassType=" + this.g + '}';
    }

    public boolean a() {
        return false;
    }

    public b a(C2661bl c2661bl) {
        return this.c;
    }

    public JSONObject a(Kl kl, b bVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", this.f.a);
            if (bVar == null) {
                jSONObject.put("cnt", a(kl));
            }
            if (kl.e) {
                JSONObject jSONObjectPut = new JSONObject().put("ct", this.g.a).put("cn", this.a).put("rid", this.b).put(UcumUtils.UCUM_DAYS, this.d).put("lc", this.e).put("if", bVar != null);
                if (bVar != null) {
                    jSONObjectPut.put("fr", bVar.a);
                }
                jSONObject.put("i", jSONObjectPut);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
