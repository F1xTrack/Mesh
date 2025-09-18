package com.p018my.tracker.personalize;

import android.text.TextUtils;
import com.p018my.tracker.obfuscated.AbstractC2391y2;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import p000.AbstractC7222ym;

/* renamed from: com.my.tracker.personalize.d */
/* loaded from: classes2.dex */
final class C2399d extends AbstractC2397b {
    /* renamed from: b */
    public static C2398c m13643b(JSONObject jSONObject) {
        String strM13642a = m13642a(jSONObject, "sku", "payload", "value", "discount_value", "price", "discount_price");
        if (strM13642a != null) {
            return new C2398c(null, strM13642a);
        }
        String strOptString = jSONObject.optString("sku");
        if (TextUtils.isEmpty(strOptString)) {
            return m13641a("Invalid value for key: ", "sku");
        }
        String strOptString2 = jSONObject.optString("payload");
        if (TextUtils.isEmpty(strOptString2)) {
            return m13641a("Invalid value for key: ", "payload");
        }
        return new C2398c(new PersonalizeItem(strOptString, strOptString2, jSONObject.optDouble("price"), jSONObject.optDouble("discount_price"), jSONObject.optInt("value"), jSONObject.optInt("discount_value")), null);
    }

    /* renamed from: c */
    public static C2398c m13644c(JSONObject jSONObject) {
        String str;
        StringBuilder sb;
        String strM13642a = m13642a(jSONObject, "offer_id", "subitems");
        if (strM13642a != null) {
            return new C2398c(null, strM13642a);
        }
        int iOptInt = jSONObject.optInt("offer_id");
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subitems");
        if (jSONArrayOptJSONArray == null) {
            return m13641a("No value for key: ", "subitems");
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            C2398c c2398cM13643b = m13643b(jSONArrayOptJSONArray.optJSONObject(i));
            String strM13639a = c2398cM13643b.m13639a();
            if (TextUtils.isEmpty(strM13639a)) {
                PersonalizeItem personalizeItem = (PersonalizeItem) c2398cM13643b.m13640b();
                if (personalizeItem == null) {
                    str = "Can't parse item " + i + " without errors";
                    arrayList2.add(str);
                    sb = new StringBuilder("PersonalizePlacementsParser: ");
                } else {
                    arrayList.add(personalizeItem);
                }
            } else {
                str = "Can't parse item " + i + " with errors: " + strM13639a;
                arrayList2.add(str);
                sb = new StringBuilder("PersonalizePlacementsParser: ");
            }
            sb.append(str);
            AbstractC2391y2.m13568a(sb.toString());
        }
        if (arrayList2.size() <= 0) {
            return new C2398c(new PersonalizeOffer(iOptInt, arrayList), null);
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) ", ");
            }
        }
        return new C2398c(null, sb2.toString());
    }

    /* renamed from: d */
    public static C2398c m13645d(JSONObject jSONObject) {
        String strM13642a = m13642a(jSONObject, "placement_id", "test_id", "group_id", "offer");
        if (strM13642a != null) {
            return new C2398c(null, strM13642a);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("offer");
        if (jSONObjectOptJSONObject == null) {
            return m13641a("Invalid value for key: ", "offer");
        }
        C2398c c2398cM13644c = m13644c(jSONObjectOptJSONObject);
        String strM13639a = c2398cM13644c.m13639a();
        if (strM13639a != null) {
            AbstractC2391y2.m13568a("PersonalizePlacementsParser: Can't parse offer's object with error: ".concat(strM13639a));
            return new C2398c(null, strM13639a);
        }
        PersonalizeOffer personalizeOffer = (PersonalizeOffer) c2398cM13644c.m13640b();
        if (personalizeOffer == null) {
            return m13641a("Can't parse offer's object without error from parser", null);
        }
        String strOptString = jSONObject.optString("placement_id");
        return TextUtils.isEmpty(strOptString) ? m13641a("Invalid value for key: ", "placement_id") : new C2398c(new PersonalizePlacement(strOptString, jSONObject.optInt("group_id"), jSONObject.optInt("test_id"), personalizeOffer), null);
    }

    @Override // com.p018my.tracker.personalize.AbstractC2397b
    /* renamed from: a */
    public C2398c mo13638a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("errors");
        ArrayList arrayList = new ArrayList();
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                arrayList.add(next + ": " + jSONObjectOptJSONObject.optString(next));
            }
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append((CharSequence) ", ");
                }
            }
            return new C2398c(null, sb.toString());
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
        if (jSONArrayOptJSONArray == null) {
            return m13641a("No value for key: ", "data");
        }
        if (jSONArrayOptJSONArray.length() == 0) {
            return m13641a("No placements in the list");
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            C2398c c2398cM13645d = m13645d(jSONArrayOptJSONArray.optJSONObject(i));
            String strM13639a = c2398cM13645d.m13639a();
            if (strM13639a != null) {
                AbstractC2391y2.m13568a("PersonalizePlacementsParser: Placement parsing error: ".concat(strM13639a));
            } else {
                PersonalizePlacement personalizePlacement = (PersonalizePlacement) c2398cM13645d.m13640b();
                if (personalizePlacement != null) {
                    arrayList2.add(personalizePlacement);
                }
            }
        }
        return arrayList2.isEmpty() ? m13641a("No placements in the list") : new C2398c(arrayList2, null);
    }

    /* renamed from: a */
    public static C2398c m13641a(String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
        }
        String string = sb.toString();
        AbstractC2391y2.m13568a("PersonalizePlacementsParser: " + string);
        return new C2398c(null, string);
    }

    /* renamed from: a */
    public static String m13642a(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            if (!jSONObject.has(str)) {
                String strM26245v = AbstractC7222ym.m26245v("No value for key: ", str);
                AbstractC2391y2.m13568a("PersonalizePlacementsParser: " + strM26245v);
                return strM26245v;
            }
        }
        return null;
    }
}
