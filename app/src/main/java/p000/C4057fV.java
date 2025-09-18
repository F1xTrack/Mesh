package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* renamed from: fV */
/* loaded from: classes.dex */
public final class C4057fV {

    /* renamed from: a */
    public final String f27218a;

    /* renamed from: b */
    public final String f27219b;

    /* renamed from: c */
    public final String f27220c;

    /* renamed from: d */
    public final String f27221d;

    /* renamed from: e */
    public final String f27222e;

    /* renamed from: f */
    public final String f27223f;

    /* renamed from: g */
    public final String f27224g;

    public C4057fV(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f27219b = str;
        this.f27218a = str2;
        this.f27220c = str3;
        this.f27221d = str4;
        this.f27222e = str5;
        this.f27223f = str6;
        this.f27224g = str7;
    }

    /* renamed from: a */
    public static C4057fV m18249a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new C4057fV(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4057fV)) {
            return false;
        }
        C4057fV c4057fV = (C4057fV) obj;
        return Objects.equal(this.f27219b, c4057fV.f27219b) && Objects.equal(this.f27218a, c4057fV.f27218a) && Objects.equal(this.f27220c, c4057fV.f27220c) && Objects.equal(this.f27221d, c4057fV.f27221d) && Objects.equal(this.f27222e, c4057fV.f27222e) && Objects.equal(this.f27223f, c4057fV.f27223f) && Objects.equal(this.f27224g, c4057fV.f27224g);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f27219b, this.f27218a, this.f27220c, this.f27221d, this.f27222e, this.f27223f, this.f27224g);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f27219b).add("apiKey", this.f27218a).add("databaseUrl", this.f27220c).add("gcmSenderId", this.f27222e).add("storageBucket", this.f27223f).add("projectId", this.f27224g).toString();
    }
}
