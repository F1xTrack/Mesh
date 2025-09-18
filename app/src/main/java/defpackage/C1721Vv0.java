package defpackage;

import android.net.Uri;
import com.vk.push.common.messaging.ClickActionType;

/* renamed from: Vv0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1721Vv0 {
    public final String a;
    public final String b;
    public final String c;
    public final Uri d;
    public final String e;
    public final String f;
    public final String g;
    public final ClickActionType h;

    public C1721Vv0(String str, String str2, String str3, Uri uri, String str4, String str5, String str6, ClickActionType clickActionType) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = uri;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = clickActionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1721Vv0)) {
            return false;
        }
        C1721Vv0 c1721Vv0 = (C1721Vv0) obj;
        return O90.a(this.a, c1721Vv0.a) && O90.a(this.b, c1721Vv0.b) && O90.a(this.c, c1721Vv0.c) && O90.a(this.d, c1721Vv0.d) && O90.a(this.e, c1721Vv0.e) && O90.a(this.f, c1721Vv0.f) && O90.a(this.g, c1721Vv0.g) && this.h == c1721Vv0.h;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Uri uri = this.d;
        int iHashCode4 = (iHashCode3 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ClickActionType clickActionType = this.h;
        return iHashCode7 + (clickActionType != null ? clickActionType.hashCode() : 0);
    }

    public final String toString() {
        return "Notification(title=" + this.a + ", body=" + this.b + ", channelId=" + this.c + ", imageUrl=" + this.d + ", color=" + this.e + ", icon=" + this.f + ", clickAction=" + this.g + ", clickActionType=" + this.h + ')';
    }
}
