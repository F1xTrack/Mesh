package defpackage;

import java.io.File;
import java.io.IOException;
import org.json.JSONObject;

/* renamed from: du */
/* loaded from: classes2.dex */
public final class C3476du {
    public String a;

    /* JADX WARN: Removed duplicated region for block: B:488:0x036a A[Catch: IOException -> 0x0366, TryCatch #22 {IOException -> 0x0366, blocks: (B:484:0x0362, B:488:0x036a, B:490:0x036f), top: B:588:0x0362 }] */
    /* JADX WARN: Removed duplicated region for block: B:490:0x036f A[Catch: IOException -> 0x0366, TRY_LEAVE, TryCatch #22 {IOException -> 0x0366, blocks: (B:484:0x0362, B:488:0x036a, B:490:0x036f), top: B:588:0x0362 }] */
    /* JADX WARN: Removed duplicated region for block: B:559:0x046a A[Catch: IOException -> 0x0466, TryCatch #23 {IOException -> 0x0466, blocks: (B:555:0x0462, B:559:0x046a, B:561:0x046f, B:563:0x0474), top: B:590:0x0462 }] */
    /* JADX WARN: Removed duplicated region for block: B:561:0x046f A[Catch: IOException -> 0x0466, TryCatch #23 {IOException -> 0x0466, blocks: (B:555:0x0462, B:559:0x046a, B:561:0x046f, B:563:0x0474), top: B:590:0x0462 }] */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0474 A[Catch: IOException -> 0x0466, TRY_LEAVE, TryCatch #23 {IOException -> 0x0466, blocks: (B:555:0x0462, B:559:0x046a, B:561:0x046f, B:563:0x0474), top: B:590:0x0462 }] */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0362 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0462 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(org.json.JSONObject r29, java.lang.String r30, defpackage.C1714Vt r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 1151
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3476du.a(org.json.JSONObject, java.lang.String, Vt, java.lang.String):void");
    }

    public final JSONObject b() {
        String strOptString = d().optString("currentPackage", null);
        if (strOptString == null) {
            return null;
        }
        try {
            return AbstractC2522cT1.f(AbstractC2522cT1.a(AbstractC2522cT1.a(AbstractC2522cT1.a(this.a, "CodePush"), strOptString), "app.json"));
        } catch (IOException unused) {
            return null;
        }
    }

    public final String c() {
        String strOptString = d().optString("currentPackage", null);
        if (strOptString == null) {
            return null;
        }
        return AbstractC2522cT1.a(AbstractC2522cT1.a(this.a, "CodePush"), strOptString);
    }

    public final JSONObject d() {
        String strA = AbstractC2522cT1.a(AbstractC2522cT1.a(this.a, "CodePush"), "codepush.json");
        if (!new File(strA).exists()) {
            return new JSONObject();
        }
        try {
            return AbstractC2522cT1.f(strA);
        } catch (IOException e) {
            throw new C3286cu("Error getting current package info", e);
        }
    }

    public final void e(JSONObject jSONObject, boolean z) throws Throwable {
        String strOptString = jSONObject.optString("packageHash", null);
        JSONObject jSONObjectD = d();
        String strOptString2 = jSONObjectD.optString("currentPackage", null);
        if (strOptString == null || !strOptString.equals(strOptString2)) {
            if (z) {
                String strC = c();
                if (strC != null) {
                    Z02.b(strC);
                }
            } else {
                String strOptString3 = d().optString("previousPackage", null);
                if (strOptString3 != null && !strOptString3.equals(strOptString)) {
                    Z02.b(AbstractC2522cT1.a(AbstractC2522cT1.a(this.a, "CodePush"), strOptString3));
                }
                AbstractC2522cT1.i("previousPackage", jSONObjectD.optString("currentPackage", null), jSONObjectD);
            }
            AbstractC2522cT1.i("currentPackage", strOptString, jSONObjectD);
            try {
                AbstractC2522cT1.j(jSONObjectD, AbstractC2522cT1.a(AbstractC2522cT1.a(this.a, "CodePush"), "codepush.json"));
            } catch (IOException e) {
                throw new C3286cu("Error updating current package info", e);
            }
        }
    }
}
