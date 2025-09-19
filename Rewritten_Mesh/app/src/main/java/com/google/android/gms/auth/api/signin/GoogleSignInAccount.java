package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C10857r31;

@SafeParcelable.Class(creator = "GoogleSignInAccountCreator")
@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C10857r31(16);

    /* renamed from: n */
    public static final Clock f18005n = DefaultClock.getInstance();

    /* renamed from: a */
    public final int f18006a;

    /* renamed from: b */
    public final String f18007b;

    /* renamed from: c */
    public final String f18008c;

    /* renamed from: d */
    public final String f18009d;

    /* renamed from: e */
    public final String f18010e;

    /* renamed from: f */
    public final Uri f18011f;

    /* renamed from: g */
    public String f18012g;

    /* renamed from: h */
    public final long f18013h;

    /* renamed from: i */
    public final String f18014i;

    /* renamed from: j */
    public final ArrayList f18015j;

    /* renamed from: k */
    public final String f18016k;

    /* renamed from: l */
    public final String f18017l;

    /* renamed from: m */
    public final HashSet f18018m = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.f18006a = i;
        this.f18007b = str;
        this.f18008c = str2;
        this.f18009d = str3;
        this.f18010e = str4;
        this.f18011f = uri;
        this.f18012g = str5;
        this.f18013h = j;
        this.f18014i = str6;
        this.f18015j = arrayList;
        this.f18016k = str7;
        this.f18017l = str8;
    }

    /* renamed from: m0 */
    public static GoogleSignInAccount m11102m0(String str) throws JSONException, NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, jSONObject.optString(NotificationConstants.f19487ID), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has(Scopes.EMAIL) ? jSONObject.optString(Scopes.EMAIL) : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, uri, null, j, Preconditions.checkNotEmpty(jSONObject.getString("obfuscatedIdentifier")), new ArrayList((Collection) Preconditions.checkNotNull(hashSet)), jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null);
        googleSignInAccount.f18012g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f18014i.equals(this.f18014i) && googleSignInAccount.m11103i0().equals(m11103i0());
    }

    public final int hashCode() {
        return ((this.f18014i.hashCode() + 527) * 31) + m11103i0().hashCode();
    }

    /* renamed from: i0 */
    public final HashSet m11103i0() {
        HashSet hashSet = new HashSet(this.f18015j);
        hashSet.addAll(this.f18018m);
        return hashSet;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f18006a);
        SafeParcelWriter.writeString(parcel, 2, this.f18007b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f18008c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f18009d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f18010e, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f18011f, i, false);
        SafeParcelWriter.writeString(parcel, 7, this.f18012g, false);
        SafeParcelWriter.writeLong(parcel, 8, this.f18013h);
        SafeParcelWriter.writeString(parcel, 9, this.f18014i, false);
        SafeParcelWriter.writeTypedList(parcel, 10, this.f18015j, false);
        SafeParcelWriter.writeString(parcel, 11, this.f18016k, false);
        SafeParcelWriter.writeString(parcel, 12, this.f18017l, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
