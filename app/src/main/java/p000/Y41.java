package p000;

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
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
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

    /* renamed from: c */
    public static final ReentrantLock f14140c = new ReentrantLock();

    /* renamed from: d */
    public static Y41 f14141d;

    /* renamed from: a */
    public final ReentrantLock f14142a = new ReentrantLock();

    /* renamed from: b */
    public final SharedPreferences f14143b;

    public Y41(Context context) {
        this.f14143b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: a */
    public static Y41 m9209a(Context context) {
        Preconditions.checkNotNull(context);
        ReentrantLock reentrantLock = f14140c;
        reentrantLock.lock();
        try {
            if (f14141d == null) {
                f14141d = new Y41(context.getApplicationContext());
            }
            Y41 y41 = f14141d;
            reentrantLock.unlock();
            return y41;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: h */
    public static final String m9210h(String str, String str2) {
        return AbstractC1374Vq.m8589h(str, StringUtils.PROCESS_POSTFIX_DELIMITER, str2);
    }

    /* renamed from: b */
    public final GoogleSignInAccount m9211b() {
        String strM9214e;
        String strM9214e2 = m9214e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strM9214e2) || (strM9214e = m9214e(m9210h("googleSignInAccount", strM9214e2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m11102m0(strM9214e);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final GoogleSignInOptions m9212c() {
        String strM9214e;
        String strM9214e2 = m9214e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strM9214e2) || (strM9214e = m9214e(m9210h("googleSignInOptions", strM9214e2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.m11104i0(strM9214e);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public final void m9213d(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) throws JSONException {
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        m9216g("defaultGoogleSignInAccount", googleSignInAccount.f18014i);
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        String str = googleSignInAccount.f18014i;
        String strM9210h = m9210h("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f18007b;
            if (str2 != null) {
                jSONObject.put(NotificationConstants.f19487ID, str2);
            }
            String str3 = googleSignInAccount.f18008c;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.f18009d;
            if (str4 != null) {
                jSONObject.put(Scopes.EMAIL, str4);
            }
            String str5 = googleSignInAccount.f18010e;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.f18016k;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.f18017l;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f18011f;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.f18012g;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.f18013h);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = googleSignInAccount.f18015j;
            Scope[] scopeArr = (Scope[]) arrayList.toArray(new Scope[arrayList.size()]);
            Arrays.sort(scopeArr, C8774aq0.f16614c);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.getScopeUri());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            m9216g(strM9210h, jSONObject.toString());
            String strM9210h2 = m9210h("googleSignInOptions", str);
            String str9 = googleSignInOptions.f18031h;
            String str10 = googleSignInOptions.f18030g;
            ArrayList arrayList2 = googleSignInOptions.f18025b;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(arrayList2, GoogleSignInOptions.f18023o);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((Scope) it.next()).getScopeUri());
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.f18026c;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.f18027d);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f18029f);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f18028e);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                m9216g(strM9210h2, jSONObject2.toString());
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: e */
    public final String m9214e(String str) {
        ReentrantLock reentrantLock = this.f14142a;
        reentrantLock.lock();
        try {
            return this.f14143b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: f */
    public final void m9215f(String str) {
        ReentrantLock reentrantLock = this.f14142a;
        reentrantLock.lock();
        try {
            this.f14143b.edit().remove(str).apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: g */
    public final void m9216g(String str, String str2) {
        ReentrantLock reentrantLock = this.f14142a;
        reentrantLock.lock();
        try {
            this.f14143b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }
}
