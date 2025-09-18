package defpackage;

import android.icu.util.ULocale;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: Ok0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1142Ok0 implements Y40 {
    public ULocale a;
    public ULocale.Builder b = null;
    public boolean c = false;

    public C1142Ok0(ULocale uLocale) {
        this.a = uLocale;
    }

    @Override // defpackage.Y40
    public final ArrayList a() {
        h();
        C1723Vw c1723Vw = AbstractC1440Sf1.a;
        String str = c1723Vw.containsKey("collation") ? (String) c1723Vw.get("collation") : "collation";
        ArrayList arrayList = new ArrayList();
        String keywordValue = this.a.getKeywordValue(str);
        if (keywordValue != null && !keywordValue.isEmpty()) {
            Collections.addAll(arrayList, keywordValue.split("-|_"));
        }
        return arrayList;
    }

    @Override // defpackage.Y40
    public final String b() {
        h();
        return this.a.toLanguageTag();
    }

    @Override // defpackage.Y40
    public final Object c() {
        h();
        ULocale.Builder builderF = AbstractC0909Lk0.f();
        builderF.setLocale(this.a);
        builderF.clearExtensions();
        return builderF.build();
    }

    @Override // defpackage.Y40
    public final Y40 d() {
        h();
        return new C1142Ok0(this.a);
    }

    @Override // defpackage.Y40
    public final String e() {
        h();
        ULocale.Builder builderF = AbstractC0909Lk0.f();
        builderF.setLocale(this.a);
        builderF.clearExtensions();
        return builderF.build().toLanguageTag();
    }

    @Override // defpackage.Y40
    public final void f(String str, ArrayList arrayList) throws C0254Da {
        h();
        if (this.b == null) {
            this.b = AbstractC0909Lk0.f().setLocale(this.a);
        }
        try {
            this.b.setUnicodeLocaleKeyword(str, TextUtils.join("-", arrayList));
            this.c = true;
        } catch (RuntimeException e) {
            throw new C0254Da(e.getMessage(), 10);
        }
    }

    @Override // defpackage.Y40
    public final Object g() {
        h();
        return this.a;
    }

    public final void h() {
        if (this.c) {
            try {
                this.a = this.b.build();
                this.c = false;
            } catch (RuntimeException e) {
                throw new C0254Da(e.getMessage(), 10);
            }
        }
    }

    @Override // defpackage.Y40
    /* renamed from: a */
    public final HashMap mo2a() {
        h();
        HashMap map = new HashMap();
        Iterator keywords = this.a.getKeywords();
        if (keywords != null) {
            while (keywords.hasNext()) {
                String str = (String) keywords.next();
                C1723Vw c1723Vw = AbstractC1440Sf1.b;
                map.put(c1723Vw.containsKey(str) ? (String) c1723Vw.get(str) : str, this.a.getKeywordValue(str));
            }
        }
        return map;
    }
}
