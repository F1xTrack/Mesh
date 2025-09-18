package p000;

import java.io.File;
import java.io.IOException;
import org.json.JSONObject;

/* renamed from: du */
/* loaded from: classes2.dex */
public final class C3956du {

    /* renamed from: a */
    public String f26382a;

    /* JADX WARN: Removed duplicated region for block: B:488:0x036a A[Catch: IOException -> 0x0366, TryCatch #22 {IOException -> 0x0366, blocks: (B:484:0x0362, B:488:0x036a, B:490:0x036f), top: B:588:0x0362 }] */
    /* JADX WARN: Removed duplicated region for block: B:490:0x036f A[Catch: IOException -> 0x0366, TRY_LEAVE, TryCatch #22 {IOException -> 0x0366, blocks: (B:484:0x0362, B:488:0x036a, B:490:0x036f), top: B:588:0x0362 }] */
    /* JADX WARN: Removed duplicated region for block: B:559:0x046a A[Catch: IOException -> 0x0466, TryCatch #23 {IOException -> 0x0466, blocks: (B:555:0x0462, B:559:0x046a, B:561:0x046f, B:563:0x0474), top: B:590:0x0462 }] */
    /* JADX WARN: Removed duplicated region for block: B:561:0x046f A[Catch: IOException -> 0x0466, TryCatch #23 {IOException -> 0x0466, blocks: (B:555:0x0462, B:559:0x046a, B:561:0x046f, B:563:0x0474), top: B:590:0x0462 }] */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0474 A[Catch: IOException -> 0x0466, TRY_LEAVE, TryCatch #23 {IOException -> 0x0466, blocks: (B:555:0x0462, B:559:0x046a, B:561:0x046f, B:563:0x0474), top: B:590:0x0462 }] */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0362 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0462 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m17769a(org.json.JSONObject r29, java.lang.String r30, p000.C1377Vt r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 1151
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3956du.m17769a(org.json.JSONObject, java.lang.String, Vt, java.lang.String):void");
    }

    /* renamed from: b */
    public final JSONObject m17770b() {
        String strOptString = m17772d().optString("currentPackage", null);
        if (strOptString == null) {
            return null;
        }
        try {
            return AbstractC8985cT1.m10709f(AbstractC8985cT1.m10704a(AbstractC8985cT1.m10704a(AbstractC8985cT1.m10704a(this.f26382a, "CodePush"), strOptString), "app.json"));
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final String m17771c() {
        String strOptString = m17772d().optString("currentPackage", null);
        if (strOptString == null) {
            return null;
        }
        return AbstractC8985cT1.m10704a(AbstractC8985cT1.m10704a(this.f26382a, "CodePush"), strOptString);
    }

    /* renamed from: d */
    public final JSONObject m17772d() {
        String strM10704a = AbstractC8985cT1.m10704a(AbstractC8985cT1.m10704a(this.f26382a, "CodePush"), "codepush.json");
        if (!new File(strM10704a).exists()) {
            return new JSONObject();
        }
        try {
            return AbstractC8985cT1.m10709f(strM10704a);
        } catch (IOException e) {
            throw new C3894cu("Error getting current package info", e);
        }
    }

    /* renamed from: e */
    public final void m17773e(JSONObject jSONObject, boolean z) throws Throwable {
        String strOptString = jSONObject.optString("packageHash", null);
        JSONObject jSONObjectM17772d = m17772d();
        String strOptString2 = jSONObjectM17772d.optString("currentPackage", null);
        if (strOptString == null || !strOptString.equals(strOptString2)) {
            if (z) {
                String strM17771c = m17771c();
                if (strM17771c != null) {
                    Z02.m9450b(strM17771c);
                }
            } else {
                String strOptString3 = m17772d().optString("previousPackage", null);
                if (strOptString3 != null && !strOptString3.equals(strOptString)) {
                    Z02.m9450b(AbstractC8985cT1.m10704a(AbstractC8985cT1.m10704a(this.f26382a, "CodePush"), strOptString3));
                }
                AbstractC8985cT1.m10712i("previousPackage", jSONObjectM17772d.optString("currentPackage", null), jSONObjectM17772d);
            }
            AbstractC8985cT1.m10712i("currentPackage", strOptString, jSONObjectM17772d);
            try {
                AbstractC8985cT1.m10713j(jSONObjectM17772d, AbstractC8985cT1.m10704a(AbstractC8985cT1.m10704a(this.f26382a, "CodePush"), "codepush.json"));
            } catch (IOException e) {
                throw new C3894cu("Error updating current package info", e);
            }
        }
    }
}
