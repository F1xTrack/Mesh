package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C10857r31;
import p000.C8774aq0;
import p000.P10;

@SafeParcelable.Class(creator = "GoogleSignInOptionsCreator")
@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements Api.ApiOptions.Optional, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: k */
    public static final GoogleSignInOptions f18019k;

    /* renamed from: l */
    public static final Scope f18020l;

    /* renamed from: m */
    public static final Scope f18021m;

    /* renamed from: n */
    public static final Scope f18022n;

    /* renamed from: o */
    public static final C8774aq0 f18023o;

    /* renamed from: a */
    public final int f18024a;

    /* renamed from: b */
    public final ArrayList f18025b;

    /* renamed from: c */
    public final Account f18026c;

    /* renamed from: d */
    public final boolean f18027d;

    /* renamed from: e */
    public final boolean f18028e;

    /* renamed from: f */
    public final boolean f18029f;

    /* renamed from: g */
    public final String f18030g;

    /* renamed from: h */
    public final String f18031h;

    /* renamed from: i */
    public final ArrayList f18032i;

    /* renamed from: j */
    public final String f18033j;

    static {
        Scope scope = new Scope(Scopes.PROFILE);
        new Scope(Scopes.EMAIL);
        Scope scope2 = new Scope(Scopes.OPEN_ID);
        f18020l = scope2;
        Scope scope3 = new Scope(Scopes.GAMES_LITE);
        f18021m = scope3;
        f18022n = new Scope(Scopes.GAMES);
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(f18022n)) {
            Scope scope4 = f18021m;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        f18019k = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, map, null);
        HashSet hashSet2 = new HashSet();
        HashMap map2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(f18022n)) {
            Scope scope5 = f18021m;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, map2, null);
        CREATOR = new C10857r31(17);
        f18023o = new C8774aq0(27);
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, HashMap map, String str3) {
        this.f18024a = i;
        this.f18025b = arrayList;
        this.f18026c = account;
        this.f18027d = z;
        this.f18028e = z2;
        this.f18029f = z3;
        this.f18030g = str;
        this.f18031h = str2;
        this.f18032i = new ArrayList(map.values());
        this.f18033j = str3;
    }

    /* renamed from: i0 */
    public static GoogleSignInOptions m11104i0(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, AccountType.GOOGLE) : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    /* renamed from: m0 */
    public static HashMap m11105m0(ArrayList arrayList) {
        HashMap map = new HashMap();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                P10 p10 = (P10) it.next();
                map.put(Integer.valueOf(p10.f8778b), p10);
            }
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x004f A[Catch: ClassCastException -> 0x007b, TryCatch #0 {ClassCastException -> 0x007b, blocks: (B:48:0x0008, B:50:0x0018, B:53:0x0021, B:55:0x0030, B:58:0x003c, B:64:0x0049, B:66:0x004f, B:72:0x005d, B:74:0x0063, B:76:0x0069, B:78:0x006f, B:69:0x0056, B:62:0x0043), top: B:84:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0056 A[Catch: ClassCastException -> 0x007b, TryCatch #0 {ClassCastException -> 0x007b, blocks: (B:48:0x0008, B:50:0x0018, B:53:0x0021, B:55:0x0030, B:58:0x003c, B:64:0x0049, B:66:0x004f, B:72:0x005d, B:74:0x0063, B:76:0x0069, B:78:0x006f, B:69:0x0056, B:62:0x0043), top: B:84:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0079 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.f18030g
            java.util.ArrayList r1 = r8.f18025b
            r2 = 0
            if (r9 != 0) goto L8
            return r2
        L8:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r9 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r9     // Catch: java.lang.ClassCastException -> L7b
            java.util.ArrayList r3 = r9.f18025b     // Catch: java.lang.ClassCastException -> L7b
            java.lang.String r4 = r9.f18030g     // Catch: java.lang.ClassCastException -> L7b
            android.accounts.Account r5 = r9.f18026c     // Catch: java.lang.ClassCastException -> L7b
            java.util.ArrayList r6 = r8.f18032i     // Catch: java.lang.ClassCastException -> L7b
            boolean r6 = r6.isEmpty()     // Catch: java.lang.ClassCastException -> L7b
            if (r6 == 0) goto L7b
            java.util.ArrayList r6 = r9.f18032i     // Catch: java.lang.ClassCastException -> L7b
            boolean r6 = r6.isEmpty()     // Catch: java.lang.ClassCastException -> L7b
            if (r6 != 0) goto L21
            goto L7b
        L21:
            int r6 = r1.size()     // Catch: java.lang.ClassCastException -> L7b
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.ClassCastException -> L7b
            r7.<init>(r3)     // Catch: java.lang.ClassCastException -> L7b
            int r7 = r7.size()     // Catch: java.lang.ClassCastException -> L7b
            if (r6 != r7) goto L7b
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.ClassCastException -> L7b
            r6.<init>(r3)     // Catch: java.lang.ClassCastException -> L7b
            boolean r1 = r1.containsAll(r6)     // Catch: java.lang.ClassCastException -> L7b
            if (r1 != 0) goto L3c
            goto L7b
        L3c:
            android.accounts.Account r1 = r8.f18026c     // Catch: java.lang.ClassCastException -> L7b
            if (r1 != 0) goto L43
            if (r5 != 0) goto L7b
            goto L49
        L43:
            boolean r1 = r1.equals(r5)     // Catch: java.lang.ClassCastException -> L7b
            if (r1 == 0) goto L7b
        L49:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.ClassCastException -> L7b
            if (r1 == 0) goto L56
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.ClassCastException -> L7b
            if (r0 == 0) goto L7b
            goto L5d
        L56:
            boolean r0 = r0.equals(r4)     // Catch: java.lang.ClassCastException -> L7b
            if (r0 != 0) goto L5d
            goto L7b
        L5d:
            boolean r0 = r8.f18029f     // Catch: java.lang.ClassCastException -> L7b
            boolean r1 = r9.f18029f     // Catch: java.lang.ClassCastException -> L7b
            if (r0 != r1) goto L7b
            boolean r0 = r8.f18027d     // Catch: java.lang.ClassCastException -> L7b
            boolean r1 = r9.f18027d     // Catch: java.lang.ClassCastException -> L7b
            if (r0 != r1) goto L7b
            boolean r0 = r8.f18028e     // Catch: java.lang.ClassCastException -> L7b
            boolean r1 = r9.f18028e     // Catch: java.lang.ClassCastException -> L7b
            if (r0 != r1) goto L7b
            java.lang.String r0 = r8.f18033j     // Catch: java.lang.ClassCastException -> L7b
            java.lang.String r9 = r9.f18033j     // Catch: java.lang.ClassCastException -> L7b
            boolean r9 = android.text.TextUtils.equals(r0, r9)     // Catch: java.lang.ClassCastException -> L7b
            if (r9 == 0) goto L7b
            r9 = 1
            return r9
        L7b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f18025b;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) arrayList2.get(i)).getScopeUri());
        }
        Collections.sort(arrayList);
        int iHashCode = arrayList.hashCode() + (1 * 31);
        Account account = this.f18026c;
        int iHashCode2 = (iHashCode * 31) + (account == null ? 0 : account.hashCode());
        String str = this.f18030g;
        int iHashCode3 = (((((((iHashCode2 * 31) + (str == null ? 0 : str.hashCode())) * 31) + (this.f18029f ? 1 : 0)) * 31) + (this.f18027d ? 1 : 0)) * 31) + (this.f18028e ? 1 : 0);
        String str2 = this.f18033j;
        return (iHashCode3 * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f18024a);
        SafeParcelWriter.writeTypedList(parcel, 2, new ArrayList(this.f18025b), false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f18026c, i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f18027d);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f18028e);
        SafeParcelWriter.writeBoolean(parcel, 6, this.f18029f);
        SafeParcelWriter.writeString(parcel, 7, this.f18030g, false);
        SafeParcelWriter.writeString(parcel, 8, this.f18031h, false);
        SafeParcelWriter.writeTypedList(parcel, 9, this.f18032i, false);
        SafeParcelWriter.writeString(parcel, 10, this.f18033j, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
