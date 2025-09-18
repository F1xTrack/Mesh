package p000;

import android.net.Uri;
import com.p019vk.push.common.messaging.ClickActionType;

/* renamed from: Vv0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8448Vv0 {

    /* renamed from: a */
    public final String f12862a;

    /* renamed from: b */
    public final String f12863b;

    /* renamed from: c */
    public final String f12864c;

    /* renamed from: d */
    public final Uri f12865d;

    /* renamed from: e */
    public final String f12866e;

    /* renamed from: f */
    public final String f12867f;

    /* renamed from: g */
    public final String f12868g;

    /* renamed from: h */
    public final ClickActionType f12869h;

    public C8448Vv0(String str, String str2, String str3, Uri uri, String str4, String str5, String str6, ClickActionType clickActionType) {
        this.f12862a = str;
        this.f12863b = str2;
        this.f12864c = str3;
        this.f12865d = uri;
        this.f12866e = str4;
        this.f12867f = str5;
        this.f12868g = str6;
        this.f12869h = clickActionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8448Vv0)) {
            return false;
        }
        C8448Vv0 c8448Vv0 = (C8448Vv0) obj;
        return O90.m5963a(this.f12862a, c8448Vv0.f12862a) && O90.m5963a(this.f12863b, c8448Vv0.f12863b) && O90.m5963a(this.f12864c, c8448Vv0.f12864c) && O90.m5963a(this.f12865d, c8448Vv0.f12865d) && O90.m5963a(this.f12866e, c8448Vv0.f12866e) && O90.m5963a(this.f12867f, c8448Vv0.f12867f) && O90.m5963a(this.f12868g, c8448Vv0.f12868g) && this.f12869h == c8448Vv0.f12869h;
    }

    public final int hashCode() {
        String str = this.f12862a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f12863b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f12864c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Uri uri = this.f12865d;
        int iHashCode4 = (iHashCode3 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str4 = this.f12866e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f12867f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f12868g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ClickActionType clickActionType = this.f12869h;
        return iHashCode7 + (clickActionType != null ? clickActionType.hashCode() : 0);
    }

    public final String toString() {
        return "Notification(title=" + this.f12862a + ", body=" + this.f12863b + ", channelId=" + this.f12864c + ", imageUrl=" + this.f12865d + ", color=" + this.f12866e + ", icon=" + this.f12867f + ", clickAction=" + this.f12868g + ", clickActionType=" + this.f12869h + ')';
    }
}
