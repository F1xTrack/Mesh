package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p022ob.C3037Wl;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.El */
/* loaded from: classes2.dex */
public class C2588El extends C3037Wl {

    /* renamed from: h */
    public String f21136h;

    /* renamed from: i */
    public final int f21137i;

    /* renamed from: j */
    public Integer f21138j;

    /* renamed from: k */
    public final boolean f21139k;

    /* renamed from: l */
    public final b f21140l;

    /* renamed from: m */
    public final Float f21141m;

    /* renamed from: n */
    public final Float f21142n;

    /* renamed from: o */
    public final Float f21143o;

    /* renamed from: p */
    public final String f21144p;

    /* renamed from: q */
    public final Boolean f21145q;

    /* renamed from: r */
    public final Boolean f21146r;

    /* renamed from: s */
    public Integer f21147s;

    /* renamed from: com.yandex.metrica.impl.ob.El$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21148a;

        static {
            int[] iArr = new int[TextUtils.TruncateAt.values().length];
            f21148a = iArr;
            try {
                iArr[TextUtils.TruncateAt.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21148a[TextUtils.TruncateAt.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21148a[TextUtils.TruncateAt.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21148a[TextUtils.TruncateAt.MARQUEE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.El$b */
    public enum b {
        START("START"),
        END("END"),
        MIDDLE("MIDDLE"),
        MARQUEE("MARQUEE"),
        NONE("NONE"),
        UNKNOWN(GrsBaseInfo.CountryCodeSource.UNKNOWN);


        /* renamed from: a */
        final String f21156a;

        b(String str) {
            this.f21156a = str;
        }
    }

    public C2588El(String str, String str2, C3037Wl.b bVar, int i, boolean z, C3037Wl.a aVar, String str3, Float f, Float f2, Float f3, String str4, Boolean bool, Boolean bool2, boolean z2, int i2, b bVar2) {
        super(str, str2, null, i, z, C3037Wl.c.VIEW, aVar);
        this.f21136h = str3;
        this.f21137i = i2;
        this.f21140l = bVar2;
        this.f21139k = z2;
        this.f21141m = f;
        this.f21142n = f2;
        this.f21143o = f3;
        this.f21144p = str4;
        this.f21145q = bool;
        this.f21146r = bool2;
    }

    @Override // com.yandex.metrica.impl.p022ob.C3037Wl
    /* renamed from: a */
    public boolean mo14049a() {
        return true;
    }

    @Override // com.yandex.metrica.impl.p022ob.C3037Wl
    public String toString() {
        return "TextViewElement{mText='" + this.f21136h + "', mVisibleTextLength=" + this.f21137i + ", mOriginalTextLength=" + this.f21138j + ", mIsVisible=" + this.f21139k + ", mTextShorteningType=" + this.f21140l + ", mSizePx=" + this.f21141m + ", mSizeDp=" + this.f21142n + ", mSizeSp=" + this.f21143o + ", mColor='" + this.f21144p + "', mIsBold=" + this.f21145q + ", mIsItalic=" + this.f21146r + ", mRelativeTextSize=" + this.f21147s + ", mClassName='" + this.f22707a + "', mId='" + this.f22708b + "', mParseFilterReason=" + this.f22709c + ", mDepth=" + this.f22710d + ", mListItem=" + this.f22711e + ", mViewType=" + this.f22712f + ", mClassType=" + this.f22713g + '}';
    }

    @Override // com.yandex.metrica.impl.p022ob.C3037Wl
    /* renamed from: a */
    public C3037Wl.b mo14047a(C3163bl c3163bl) {
        C3037Wl.b bVar = this.f22709c;
        return bVar == null ? c3163bl.m15694a(this.f21136h) : bVar;
    }

    @Override // com.yandex.metrica.impl.p022ob.C3037Wl
    /* renamed from: a */
    public JSONArray mo14048a(C2738Kl c2738Kl) {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            String strSubstring = this.f21136h;
            if (strSubstring.length() > c2738Kl.f21603l) {
                this.f21138j = Integer.valueOf(this.f21136h.length());
                strSubstring = this.f21136h.substring(0, c2738Kl.f21603l);
            }
            jSONObject.put("t", "TEXT");
            jSONObject.put("vl", strSubstring);
            jSONObject.put("i", m14046a(c2738Kl, strSubstring));
            jSONArray.put(jSONObject);
        } catch (Throwable unused) {
        }
        return jSONArray;
    }

    /* renamed from: a */
    private JSONObject m14046a(C2738Kl c2738Kl, String str) {
        int length;
        JSONObject jSONObject = new JSONObject();
        try {
            if (c2738Kl.f21592a) {
                jSONObject.putOpt("sp", this.f21141m).putOpt("sd", this.f21142n).putOpt("ss", this.f21143o);
            }
            if (c2738Kl.f21593b) {
                jSONObject.put("rts", this.f21147s);
            }
            if (c2738Kl.f21595d) {
                jSONObject.putOpt("c", this.f21144p).putOpt("ib", this.f21145q).putOpt("ii", this.f21146r);
            }
            if (c2738Kl.f21594c) {
                jSONObject.put("vtl", this.f21137i).put("iv", this.f21139k).put("tst", this.f21140l.f21156a);
            }
            Integer num = this.f21138j;
            if (num != null) {
                length = num.intValue();
            } else {
                length = this.f21136h.length();
            }
            if (c2738Kl.f21598g) {
                jSONObject.put("tl", str.length()).put("otl", length);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
