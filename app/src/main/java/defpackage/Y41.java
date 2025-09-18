package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.huawei.hms.rn.push.constants.NotificationConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Y41 {
    public static final ReentrantLock c = new ReentrantLock();
    public static Y41 d;
    public final ReentrantLock a = new ReentrantLock();
    public final SharedPreferences b;

    public Y41(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static Y41 a(Context context) {
        Preconditions.checkNotNull(context);
        ReentrantLock reentrantLock = c;
        reentrantLock.lock();
        try {
            if (d == null) {
                d = new Y41(context.getApplicationContext());
            }
            Y41 y41 = d;
            reentrantLock.unlock();
            return y41;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String h(String str, String str2) {
        return AbstractC1705Vq.h(str, StringUtils.PROCESS_POSTFIX_DELIMITER, str2);
    }

    public final GoogleSignInAccount b() {
        String strE;
        String strE2 = e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strE2) || (strE = e(h("googleSignInAccount", strE2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m0(strE);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final GoogleSignInOptions c() {
        String strE;
        String strE2 = e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strE2) || (strE = e(h("googleSignInOptions", strE2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.i0(strE);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void d(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) throws JSONException {
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        g("defaultGoogleSignInAccount", googleSignInAccount.i);
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        String str = googleSignInAccount.i;
        String strH = h("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.b;
            if (str2 != null) {
                jSONObject.put(NotificationConstants.ID, str2);
            }
            String str3 = googleSignInAccount.c;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.d;
            if (str4 != null) {
                jSONObject.put(Scopes.EMAIL, str4);
            }
            String str5 = googleSignInAccount.e;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.k;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.l;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.g;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.h);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = googleSignInAccount.j;
            Scope[] scopeArr = (Scope[]) arrayList.toArray(new Scope[arrayList.size()]);
            Arrays.sort(scopeArr, C2209aq0.c);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.getScopeUri());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            g(strH, jSONObject.toString());
            String strH2 = h("googleSignInOptions", str);
            String str9 = googleSignInOptions.h;
            String str10 = googleSignInOptions.g;
            ArrayList arrayList2 = googleSignInOptions.b;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(arrayList2, GoogleSignInOptions.o);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((Scope) it.next()).getScopeUri());
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.c;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.d);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.e);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                g(strH2, jSONObject2.toString());
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final String e(String str) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            return this.b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void f(String str) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            this.b.edit().remove(str).apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void g(String str, String str2) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            this.b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }
}
