package com.facebook.hermes.intl;

import android.icu.util.Currency;
import android.os.Build;
import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p000.A50;
import p000.AbstractC10471o22;
import p000.AbstractC11234u10;
import p000.AbstractC7858Km0;
import p000.AbstractC9080dA1;
import p000.B50;
import p000.C0226Da;
import p000.C50;
import p000.C6937uF;
import p000.C7314Aa0;
import p000.C7366Ba0;
import p000.CJ1;
import p000.D50;
import p000.E50;
import p000.EnumC11627x50;
import p000.EnumC11754y50;
import p000.EnumC11881z50;
import p000.InterfaceC0965PK;
import p000.N90;
import p000.T71;
import p000.Y40;

@InterfaceC0965PK
/* loaded from: classes.dex */
public class NumberFormat {

    /* renamed from: v */
    public static final String[] f17824v = {"acre", "bit", "byte", "celsius", "centimeter", LocalNotification.Repeat.Type.DAY, "degree", "fahrenheit", "fluid-ounce", "foot", "gallon", "gigabit", "gigabyte", "gram", "hectare", LocalNotification.Repeat.Type.HOUR, "inch", "kilobit", "kilobyte", "kilogram", "kilometer", "liter", "megabit", "megabyte", "meter", "mile", "mile-scandinavian", "milliliter", "millimeter", "millisecond", LocalNotification.Repeat.Type.MINUTE, "month", "ounce", "percent", "petabyte", "pound", "second", "stone", "terabit", "terabyte", LocalNotification.Repeat.Type.WEEK, "yard", "year"};

    /* renamed from: a */
    public final C50 f17825a;

    /* renamed from: b */
    public final String f17826b;

    /* renamed from: c */
    public final EnumC11754y50 f17827c;

    /* renamed from: d */
    public final EnumC11881z50 f17828d;

    /* renamed from: e */
    public final String f17829e;

    /* renamed from: f */
    public final D50 f17830f;

    /* renamed from: g */
    public final boolean f17831g;

    /* renamed from: h */
    public final int f17832h;

    /* renamed from: i */
    public final int f17833i;

    /* renamed from: j */
    public final int f17834j;

    /* renamed from: k */
    public final int f17835k;

    /* renamed from: l */
    public final int f17836l;

    /* renamed from: m */
    public final int f17837m;

    /* renamed from: n */
    public final B50 f17838n;

    /* renamed from: o */
    public final E50 f17839o;

    /* renamed from: p */
    public final boolean f17840p;

    /* renamed from: q */
    public final String f17841q;

    /* renamed from: r */
    public final A50 f17842r;

    /* renamed from: s */
    public final EnumC11627x50 f17843s;

    /* renamed from: t */
    public final Y40 f17844t;

    /* renamed from: u */
    public final Y40 f17845u;

    @InterfaceC0965PK
    public NumberFormat(List<String> list, Map<String, Object> map) throws C0226Da {
        int iIndexOf;
        Double d;
        Double d2;
        A50 a50;
        int defaultFractionDigits;
        this.f17826b = null;
        this.f17827c = EnumC11754y50.f46084a;
        this.f17828d = EnumC11881z50.f46630a;
        this.f17829e = null;
        this.f17831g = true;
        this.f17832h = -1;
        this.f17833i = -1;
        this.f17834j = -1;
        this.f17835k = -1;
        this.f17836l = -1;
        this.f17838n = B50.f560a;
        this.f17841q = null;
        this.f17842r = null;
        this.f17844t = null;
        this.f17845u = null;
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            this.f17839o = new C6937uF();
        } else {
            this.f17839o = new T71();
        }
        HashMap map2 = new HashMap();
        Map<String, Object> map3 = map;
        map2.put("localeMatcher", CJ1.m1142b(map3, "localeMatcher", 2, AbstractC7858Km0.f6280b, "best fit"));
        C7366Ba0 c7366Ba0 = AbstractC9080dA1.f25853a;
        Object objM1142b = CJ1.m1142b(map3, "numberingSystem", 2, c7366Ba0, c7366Ba0);
        if (!(objM1142b instanceof C7366Ba0)) {
            String str = (String) objM1142b;
            if (!AbstractC10471o22.m23323c(str, 0, str.length() - 1, 3, 8)) {
                throw new C0226Da("Invalid numbering system !", 10);
            }
        }
        map2.put("nu", objM1142b);
        HashMap mapM5578a = N90.m5578a(list, map2, Collections.singletonList("nu"));
        Y40 y40 = (Y40) mapM5578a.get(CommonUrlParts.LOCALE);
        this.f17844t = y40;
        this.f17845u = y40.mo5823d();
        Object objM17501a = AbstractC9080dA1.m17501a("nu", mapM5578a);
        if (objM17501a instanceof C7314Aa0) {
            this.f17840p = true;
            this.f17841q = this.f17839o.mo2018g(this.f17844t);
        } else {
            this.f17840p = false;
            this.f17841q = (String) objM17501a;
        }
        this.f17825a = (C50) CJ1.m1145e(C50.class, (String) CJ1.m1142b(map3, "style", 2, new String[]{"decimal", "percent", "currency", "unit"}, "decimal"));
        Object objM1142b2 = CJ1.m1142b(map3, "currency", 2, c7366Ba0, c7366Ba0);
        boolean z = objM1142b2 instanceof C7366Ba0;
        C50 c50 = C50.f1188c;
        if (z) {
            if (this.f17825a == c50) {
                throw new C0226Da("Expected currency style !", 10);
            }
        } else if (!m10900a((String) objM1142b2).matches("^[A-Z][A-Z][A-Z]$")) {
            throw new C0226Da("Malformed currency code !", 10);
        }
        Object objM1142b3 = CJ1.m1142b(map3, "currencyDisplay", 2, new String[]{"symbol", "narrowSymbol", "code", "name"}, "symbol");
        Object objM1142b4 = CJ1.m1142b(map3, "currencySign", 2, new String[]{"accounting", "standard"}, "standard");
        Object objM1142b5 = CJ1.m1142b(map3, "unit", 2, c7366Ba0, c7366Ba0);
        boolean z2 = objM1142b5 instanceof C7366Ba0;
        C50 c502 = C50.f1189d;
        if (!z2) {
            String str2 = (String) objM1142b5;
            String[] strArr = f17824v;
            if (Arrays.binarySearch(strArr, str2) < 0 && ((iIndexOf = str2.indexOf("-per-")) < 0 || str2.indexOf("-per-", iIndexOf + 1) >= 0 || Arrays.binarySearch(strArr, str2.substring(0, iIndexOf)) < 0 || Arrays.binarySearch(strArr, str2.substring(iIndexOf + 5)) < 0)) {
                throw new C0226Da("Malformed unit identifier !", 10);
            }
        } else if (this.f17825a == c502) {
            throw new C0226Da("Expected unit !", 10);
        }
        Object objM1142b6 = CJ1.m1142b(map3, "unitDisplay", 2, new String[]{"long", "short", "narrow"}, "short");
        C50 c503 = this.f17825a;
        if (c503 == c50) {
            this.f17826b = m10900a((String) objM1142b2);
            this.f17827c = (EnumC11754y50) CJ1.m1145e(EnumC11754y50.class, (String) objM1142b3);
            this.f17828d = (EnumC11881z50) CJ1.m1145e(EnumC11881z50.class, (String) objM1142b4);
        } else if (c503 == c502) {
            this.f17829e = (String) objM1142b5;
            this.f17830f = (D50) CJ1.m1145e(D50.class, (String) objM1142b6);
        }
        if (this.f17825a == c50) {
            if (i >= 24) {
                try {
                    defaultFractionDigits = Currency.getInstance(this.f17826b).getDefaultFractionDigits();
                } catch (IllegalArgumentException unused) {
                    throw new C0226Da("Invalid currency code !", 10);
                }
            } else {
                try {
                    defaultFractionDigits = java.util.Currency.getInstance(this.f17826b).getDefaultFractionDigits();
                } catch (IllegalArgumentException unused2) {
                    throw new C0226Da("Invalid currency code !", 10);
                }
            }
            double d3 = defaultFractionDigits;
            d = new Double(d3);
            d2 = new Double(d3);
        } else {
            d = new Double(ConfigValue.DOUBLE_DEFAULT_VALUE);
            d2 = this.f17825a == C50.f1187b ? new Double(ConfigValue.DOUBLE_DEFAULT_VALUE) : new Double(3.0d);
        }
        this.f17842r = (A50) CJ1.m1145e(A50.class, (String) CJ1.m1142b(map3, "notation", 2, new String[]{"standard", "scientific", "engineering", "compact"}, "standard"));
        Object objM1141a = CJ1.m1141a("minimumIntegerDigits", AbstractC9080dA1.m17501a("minimumIntegerDigits", map3), new Double(1.0d), new Double(21.0d), new Double(1.0d));
        Object objM17501a2 = AbstractC9080dA1.m17501a("minimumFractionDigits", map3);
        Object objM17501a3 = AbstractC9080dA1.m17501a("maximumFractionDigits", map3);
        Object objM17501a4 = AbstractC9080dA1.m17501a("minimumSignificantDigits", map3);
        Object objM17501a5 = AbstractC9080dA1.m17501a("maximumSignificantDigits", map3);
        this.f17832h = (int) Math.floor(((Double) objM1141a).doubleValue());
        boolean z3 = objM17501a4 instanceof C7366Ba0;
        A50 a502 = A50.f70c;
        if (!z3 || !(objM17501a5 instanceof C7366Ba0)) {
            a50 = a502;
            this.f17837m = 1;
            Object objM1141a2 = CJ1.m1141a("minimumSignificantDigits", objM17501a4, new Double(1.0d), new Double(21.0d), new Double(1.0d));
            Object objM1141a3 = CJ1.m1141a("maximumSignificantDigits", objM17501a5, objM1141a2, new Double(21.0d), new Double(21.0d));
            this.f17835k = (int) Math.floor(((Double) objM1141a2).doubleValue());
            this.f17836l = (int) Math.floor(((Double) objM1141a3).doubleValue());
        } else if ((objM17501a2 instanceof C7366Ba0) && (objM17501a3 instanceof C7366Ba0)) {
            A50 a503 = this.f17842r;
            if (a503 == a502) {
                this.f17837m = 3;
            } else if (a503 == A50.f69b) {
                this.f17837m = 2;
                this.f17834j = 5;
            } else {
                this.f17837m = 2;
                this.f17833i = (int) Math.floor(d.doubleValue());
                this.f17834j = (int) Math.floor(d2.doubleValue());
            }
            a50 = a502;
        } else {
            this.f17837m = 2;
            a50 = a502;
            Object objM1141a4 = CJ1.m1141a("minimumFractionDigits", objM17501a2, new Double(ConfigValue.DOUBLE_DEFAULT_VALUE), new Double(20.0d), c7366Ba0);
            Object objM1141a5 = CJ1.m1141a("maximumFractionDigits", objM17501a3, new Double(ConfigValue.DOUBLE_DEFAULT_VALUE), new Double(20.0d), c7366Ba0);
            if (objM1141a4 instanceof C7366Ba0) {
                objM1141a4 = new Double(Math.min(d.doubleValue(), ((Double) objM1141a5).doubleValue()));
            } else if (objM1141a5 instanceof C7366Ba0) {
                objM1141a5 = new Double(Math.max(d2.doubleValue(), ((Double) objM1141a4).doubleValue()));
            } else if (((Double) objM1141a4).doubleValue() > ((Double) objM1141a5).doubleValue()) {
                throw new C0226Da("minimumFractionDigits is greater than maximumFractionDigits", 10);
            }
            this.f17833i = (int) Math.floor(((Double) objM1141a4).doubleValue());
            this.f17834j = (int) Math.floor(((Double) objM1141a5).doubleValue());
        }
        Object objM1142b7 = CJ1.m1142b(map3, "compactDisplay", 2, new String[]{"short", "long"}, "short");
        if (this.f17842r == a50) {
            this.f17843s = (EnumC11627x50) CJ1.m1145e(EnumC11627x50.class, (String) objM1142b7);
        }
        this.f17831g = ((Boolean) CJ1.m1142b(map3, "useGrouping", 1, c7366Ba0, new Boolean(true))).booleanValue();
        this.f17838n = (B50) CJ1.m1145e(B50.class, (String) CJ1.m1142b(map3, "signDisplay", 2, new String[]{"auto", "never", "always", "exceptZero"}, "auto"));
        this.f17839o.mo2025t(this.f17844t, this.f17840p ? "" : this.f17841q, this.f17825a, this.f17828d, this.f17842r, this.f17843s).mo2021n(this.f17826b, this.f17827c).mo2026u(this.f17831g).mo2023q(this.f17832h).mo2022p(this.f17837m, this.f17835k, this.f17836l).mo2015a(this.f17837m, this.f17833i, this.f17834j).mo2019i(this.f17838n).mo2024s(this.f17829e, this.f17830f);
    }

    /* renamed from: a */
    public static String m10900a(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 'a' || cCharAt > 'z') {
                sb.append(cCharAt);
            } else {
                sb.append((char) (cCharAt - ' '));
            }
        }
        return sb.toString();
    }

    @InterfaceC0965PK
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) throws C0226Da {
        String str = (String) CJ1.m1142b(map, "localeMatcher", 2, AbstractC7858Km0.f6280b, "best fit");
        String[] strArr = new String[list.size()];
        return (Build.VERSION.SDK_INT < 24 || !str.equals("best fit")) ? Arrays.asList(AbstractC11234u10.m25077g((String[]) list.toArray(strArr))) : Arrays.asList(AbstractC11234u10.m25074d((String[]) list.toArray(strArr)));
    }

    @InterfaceC0965PK
    public String format(double d) throws C0226Da {
        return this.f17839o.mo2017e(d);
    }

    @InterfaceC0965PK
    public List<Map<String, String>> formatToParts(double d) throws C0226Da {
        ArrayList arrayList = new ArrayList();
        E50 e50 = this.f17839o;
        AttributedCharacterIterator attributedCharacterIteratorMo2016b = e50.mo2016b(d);
        StringBuilder sb = new StringBuilder();
        for (char cFirst = attributedCharacterIteratorMo2016b.first(); cFirst != 65535; cFirst = attributedCharacterIteratorMo2016b.next()) {
            sb.append(cFirst);
            if (attributedCharacterIteratorMo2016b.getIndex() + 1 == attributedCharacterIteratorMo2016b.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = attributedCharacterIteratorMo2016b.getAttributes().keySet().iterator();
                String strMo2020m = it.hasNext() ? e50.mo2020m(it.next(), d) : "literal";
                String string = sb.toString();
                sb.setLength(0);
                HashMap map = new HashMap();
                map.put("type", strMo2020m);
                map.put("value", string);
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    @InterfaceC0965PK
    public Map<String, Object> resolvedOptions() throws C0226Da {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(CommonUrlParts.LOCALE, this.f17845u.mo5821b());
        linkedHashMap.put("numberingSystem", this.f17841q);
        linkedHashMap.put("style", this.f17825a.toString());
        C50 c50 = this.f17825a;
        if (c50 == C50.f1188c) {
            linkedHashMap.put("currency", this.f17826b);
            linkedHashMap.put("currencyDisplay", this.f17827c.toString());
            linkedHashMap.put("currencySign", this.f17828d.toString());
        } else if (c50 == C50.f1189d) {
            linkedHashMap.put("unit", this.f17829e);
            linkedHashMap.put("unitDisplay", this.f17830f.toString());
        }
        int i = this.f17832h;
        if (i != -1) {
            linkedHashMap.put("minimumIntegerDigits", Integer.valueOf(i));
        }
        int i2 = this.f17837m;
        if (i2 == 1) {
            int i3 = this.f17836l;
            if (i3 != -1) {
                linkedHashMap.put("minimumSignificantDigits", Integer.valueOf(i3));
            }
            int i4 = this.f17835k;
            if (i4 != -1) {
                linkedHashMap.put("maximumSignificantDigits", Integer.valueOf(i4));
            }
        } else if (i2 == 2) {
            int i5 = this.f17833i;
            if (i5 != -1) {
                linkedHashMap.put("minimumFractionDigits", Integer.valueOf(i5));
            }
            int i6 = this.f17834j;
            if (i6 != -1) {
                linkedHashMap.put("maximumFractionDigits", Integer.valueOf(i6));
            }
        }
        linkedHashMap.put("useGrouping", Boolean.valueOf(this.f17831g));
        linkedHashMap.put("notation", this.f17842r.toString());
        if (this.f17842r == A50.f70c) {
            linkedHashMap.put("compactDisplay", this.f17843s.toString());
        }
        linkedHashMap.put("signDisplay", this.f17838n.toString());
        return linkedHashMap;
    }
}
