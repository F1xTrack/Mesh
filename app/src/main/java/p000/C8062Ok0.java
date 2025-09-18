package p000;

import android.icu.util.ULocale;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: Ok0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8062Ok0 implements Y40 {

    /* renamed from: a */
    public ULocale f8591a;

    /* renamed from: b */
    public ULocale.Builder f8592b = null;

    /* renamed from: c */
    public boolean f8593c = false;

    public C8062Ok0(ULocale uLocale) {
        this.f8591a = uLocale;
    }

    @Override // p000.Y40
    /* renamed from: a */
    public final ArrayList mo5819a() {
        m6128h();
        C1380Vw c1380Vw = AbstractC8261Sf1.f10892a;
        String str = c1380Vw.containsKey("collation") ? (String) c1380Vw.get("collation") : "collation";
        ArrayList arrayList = new ArrayList();
        String keywordValue = this.f8591a.getKeywordValue(str);
        if (keywordValue != null && !keywordValue.isEmpty()) {
            Collections.addAll(arrayList, keywordValue.split("-|_"));
        }
        return arrayList;
    }

    @Override // p000.Y40
    /* renamed from: b */
    public final String mo5821b() {
        m6128h();
        return this.f8591a.toLanguageTag();
    }

    @Override // p000.Y40
    /* renamed from: c */
    public final Object mo5822c() {
        m6128h();
        ULocale.Builder builderM5076f = AbstractC7906Lk0.m5076f();
        builderM5076f.setLocale(this.f8591a);
        builderM5076f.clearExtensions();
        return builderM5076f.build();
    }

    @Override // p000.Y40
    /* renamed from: d */
    public final Y40 mo5823d() {
        m6128h();
        return new C8062Ok0(this.f8591a);
    }

    @Override // p000.Y40
    /* renamed from: e */
    public final String mo5824e() {
        m6128h();
        ULocale.Builder builderM5076f = AbstractC7906Lk0.m5076f();
        builderM5076f.setLocale(this.f8591a);
        builderM5076f.clearExtensions();
        return builderM5076f.build().toLanguageTag();
    }

    @Override // p000.Y40
    /* renamed from: f */
    public final void mo5825f(String str, ArrayList arrayList) throws C0226Da {
        m6128h();
        if (this.f8592b == null) {
            this.f8592b = AbstractC7906Lk0.m5076f().setLocale(this.f8591a);
        }
        try {
            this.f8592b.setUnicodeLocaleKeyword(str, TextUtils.join("-", arrayList));
            this.f8593c = true;
        } catch (RuntimeException e) {
            throw new C0226Da(e.getMessage(), 10);
        }
    }

    @Override // p000.Y40
    /* renamed from: g */
    public final Object mo5826g() {
        m6128h();
        return this.f8591a;
    }

    /* renamed from: h */
    public final void m6128h() {
        if (this.f8593c) {
            try {
                this.f8591a = this.f8592b.build();
                this.f8593c = false;
            } catch (RuntimeException e) {
                throw new C0226Da(e.getMessage(), 10);
            }
        }
    }

    @Override // p000.Y40
    /* renamed from: a */
    public final HashMap mo5820a() {
        m6128h();
        HashMap map = new HashMap();
        Iterator keywords = this.f8591a.getKeywords();
        if (keywords != null) {
            while (keywords.hasNext()) {
                String str = (String) keywords.next();
                C1380Vw c1380Vw = AbstractC8261Sf1.f10893b;
                map.put(c1380Vw.containsKey(str) ? (String) c1380Vw.get(str) : str, this.f8591a.getKeywordValue(str));
            }
        }
        return map;
    }
}
