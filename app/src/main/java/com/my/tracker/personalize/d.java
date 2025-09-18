package com.my.tracker.personalize;

import android.text.TextUtils;
import com.my.tracker.obfuscated.y2;
import defpackage.AbstractC8235ym;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class d extends b {
    public static c b(JSONObject jSONObject) {
        String strA = a(jSONObject, "sku", "payload", "value", "discount_value", "price", "discount_price");
        if (strA != null) {
            return new c(null, strA);
        }
        String strOptString = jSONObject.optString("sku");
        if (TextUtils.isEmpty(strOptString)) {
            return a("Invalid value for key: ", "sku");
        }
        String strOptString2 = jSONObject.optString("payload");
        if (TextUtils.isEmpty(strOptString2)) {
            return a("Invalid value for key: ", "payload");
        }
        return new c(new PersonalizeItem(strOptString, strOptString2, jSONObject.optDouble("price"), jSONObject.optDouble("discount_price"), jSONObject.optInt("value"), jSONObject.optInt("discount_value")), null);
    }

    public static c c(JSONObject jSONObject) {
        String str;
        StringBuilder sb;
        String strA = a(jSONObject, "offer_id", "subitems");
        if (strA != null) {
            return new c(null, strA);
        }
        int iOptInt = jSONObject.optInt("offer_id");
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subitems");
        if (jSONArrayOptJSONArray == null) {
            return a("No value for key: ", "subitems");
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            c cVarB = b(jSONArrayOptJSONArray.optJSONObject(i));
            String strA2 = cVarB.a();
            if (TextUtils.isEmpty(strA2)) {
                PersonalizeItem personalizeItem = (PersonalizeItem) cVarB.b();
                if (personalizeItem == null) {
                    str = "Can't parse item " + i + " without errors";
                    arrayList2.add(str);
                    sb = new StringBuilder("PersonalizePlacementsParser: ");
                } else {
                    arrayList.add(personalizeItem);
                }
            } else {
                str = "Can't parse item " + i + " with errors: " + strA2;
                arrayList2.add(str);
                sb = new StringBuilder("PersonalizePlacementsParser: ");
            }
            sb.append(str);
            y2.a(sb.toString());
        }
        if (arrayList2.size() <= 0) {
            return new c(new PersonalizeOffer(iOptInt, arrayList), null);
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
        return new c(null, sb2.toString());
    }

    public static c d(JSONObject jSONObject) {
        String strA = a(jSONObject, "placement_id", "test_id", "group_id", "offer");
        if (strA != null) {
            return new c(null, strA);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("offer");
        if (jSONObjectOptJSONObject == null) {
            return a("Invalid value for key: ", "offer");
        }
        c cVarC = c(jSONObjectOptJSONObject);
        String strA2 = cVarC.a();
        if (strA2 != null) {
            y2.a("PersonalizePlacementsParser: Can't parse offer's object with error: ".concat(strA2));
            return new c(null, strA2);
        }
        PersonalizeOffer personalizeOffer = (PersonalizeOffer) cVarC.b();
        if (personalizeOffer == null) {
            return a("Can't parse offer's object without error from parser", null);
        }
        String strOptString = jSONObject.optString("placement_id");
        return TextUtils.isEmpty(strOptString) ? a("Invalid value for key: ", "placement_id") : new c(new PersonalizePlacement(strOptString, jSONObject.optInt("group_id"), jSONObject.optInt("test_id"), personalizeOffer), null);
    }

    @Override // com.my.tracker.personalize.b
    public c a(JSONObject jSONObject) {
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
            return new c(null, sb.toString());
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
        if (jSONArrayOptJSONArray == null) {
            return a("No value for key: ", "data");
        }
        if (jSONArrayOptJSONArray.length() == 0) {
            return a("No placements in the list");
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            c cVarD = d(jSONArrayOptJSONArray.optJSONObject(i));
            String strA = cVarD.a();
            if (strA != null) {
                y2.a("PersonalizePlacementsParser: Placement parsing error: ".concat(strA));
            } else {
                PersonalizePlacement personalizePlacement = (PersonalizePlacement) cVarD.b();
                if (personalizePlacement != null) {
                    arrayList2.add(personalizePlacement);
                }
            }
        }
        return arrayList2.isEmpty() ? a("No placements in the list") : new c(arrayList2, null);
    }

    public static c a(String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
        }
        String string = sb.toString();
        y2.a("PersonalizePlacementsParser: " + string);
        return new c(null, string);
    }

    public static String a(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            if (!jSONObject.has(str)) {
                String strV = AbstractC8235ym.v("No value for key: ", str);
                y2.a("PersonalizePlacementsParser: " + strV);
                return strV;
            }
        }
        return null;
    }
}
