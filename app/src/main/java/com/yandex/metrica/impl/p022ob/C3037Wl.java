package com.yandex.metrica.impl.p022ob;

import org.json.JSONArray;
import org.json.JSONObject;
import ru.p031ok.tracer.base.ucum.UcumUtils;

/* renamed from: com.yandex.metrica.impl.ob.Wl */
/* loaded from: classes2.dex */
public class C3037Wl {

    /* renamed from: a */
    public final String f22707a;

    /* renamed from: b */
    public final String f22708b;

    /* renamed from: c */
    public final b f22709c;

    /* renamed from: d */
    public final int f22710d;

    /* renamed from: e */
    public final boolean f22711e;

    /* renamed from: f */
    public final c f22712f;

    /* renamed from: g */
    public final a f22713g;

    /* renamed from: com.yandex.metrica.impl.ob.Wl$a */
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


        /* renamed from: a */
        private final String f22724a;

        a(String str) {
            this.f22724a = str;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Wl$b */
    public enum b {
        TEXT_TOO_LONG("TEXT_TOO_LONG"),
        REGEXP_NOT_MATCHED("REGEXP_NOT_MATCHED"),
        IRRELEVANT_CLASS("IRRELEVANT_CLASS"),
        BAD_REGEXP_MATCHED("BAD_REGEXP_MATCHED"),
        EQUALS("EQUALS"),
        CONTAINS("CONTAINS");


        /* renamed from: a */
        private final String f22732a;

        b(String str) {
            this.f22732a = str;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Wl$c */
    public enum c {
        VIEW_CONTAINER("VIEW_CONTAINER"),
        VIEW("VIEW");


        /* renamed from: a */
        private final String f22736a;

        c(String str) {
            this.f22736a = str;
        }
    }

    public C3037Wl(String str, String str2, b bVar, int i, boolean z, c cVar, a aVar) {
        this.f22707a = str;
        this.f22708b = str2;
        this.f22709c = bVar;
        this.f22710d = i;
        this.f22711e = z;
        this.f22712f = cVar;
        this.f22713g = aVar;
    }

    /* renamed from: a */
    public JSONArray mo14048a(C2738Kl c2738Kl) {
        return null;
    }

    public String toString() {
        return "UiElement{mClassName='" + this.f22707a + "', mId='" + this.f22708b + "', mParseFilterReason=" + this.f22709c + ", mDepth=" + this.f22710d + ", mListItem=" + this.f22711e + ", mViewType=" + this.f22712f + ", mClassType=" + this.f22713g + '}';
    }

    /* renamed from: a */
    public boolean mo14049a() {
        return false;
    }

    /* renamed from: a */
    public b mo14047a(C3163bl c3163bl) {
        return this.f22709c;
    }

    /* renamed from: a */
    public JSONObject m15399a(C2738Kl c2738Kl, b bVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", this.f22712f.f22736a);
            if (bVar == null) {
                jSONObject.put("cnt", mo14048a(c2738Kl));
            }
            if (c2738Kl.f21596e) {
                JSONObject jSONObjectPut = new JSONObject().put("ct", this.f22713g.f22724a).put("cn", this.f22707a).put("rid", this.f22708b).put(UcumUtils.UCUM_DAYS, this.f22710d).put("lc", this.f22711e).put("if", bVar != null);
                if (bVar != null) {
                    jSONObjectPut.put("fr", bVar.f22732a);
                }
                jSONObject.put("i", jSONObjectPut);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
