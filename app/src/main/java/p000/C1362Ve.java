package p000;

import android.media.MediaFormat;
import android.util.Size;
import com.google.android.gms.common.Scopes;

/* renamed from: Ve */
/* loaded from: classes.dex */
public final class C1362Ve implements InterfaceC4113gO {

    /* renamed from: a */
    public final String f12673a;

    /* renamed from: b */
    public final int f12674b;

    /* renamed from: c */
    public final EnumC11690xa1 f12675c;

    /* renamed from: d */
    public final Size f12676d;

    /* renamed from: e */
    public final int f12677e;

    /* renamed from: f */
    public final C1425We f12678f;

    /* renamed from: g */
    public final int f12679g;

    /* renamed from: h */
    public final int f12680h;

    /* renamed from: i */
    public final int f12681i;

    public C1362Ve(String str, int i, EnumC11690xa1 enumC11690xa1, Size size, int i2, C1425We c1425We, int i3, int i4, int i5) {
        this.f12673a = str;
        this.f12674b = i;
        this.f12675c = enumC11690xa1;
        this.f12676d = size;
        this.f12677e = i2;
        this.f12678f = c1425We;
        this.f12679g = i3;
        this.f12680h = i4;
        this.f12681i = i5;
    }

    /* renamed from: d */
    public static C1361Vd m8525d() {
        C1361Vd c1361Vd = new C1361Vd();
        c1361Vd.f12661b = -1;
        c1361Vd.f12667h = 1;
        c1361Vd.f12664e = 2130708361;
        c1361Vd.f12665f = C1425We.f13302d;
        return c1361Vd;
    }

    @Override // p000.InterfaceC4113gO
    /* renamed from: a */
    public final MediaFormat mo8526a() {
        Size size = this.f12676d;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.f12673a, size.getWidth(), size.getHeight());
        mediaFormatCreateVideoFormat.setInteger("color-format", this.f12677e);
        mediaFormatCreateVideoFormat.setInteger("bitrate", this.f12681i);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", this.f12679g);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", this.f12680h);
        int i = this.f12674b;
        if (i != -1) {
            mediaFormatCreateVideoFormat.setInteger(Scopes.PROFILE, i);
        }
        C1425We c1425We = this.f12678f;
        int i2 = c1425We.f13306a;
        if (i2 != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-standard", i2);
        }
        int i3 = c1425We.f13307b;
        if (i3 != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-transfer", i3);
        }
        int i4 = c1425We.f13308c;
        if (i4 != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-range", i4);
        }
        return mediaFormatCreateVideoFormat;
    }

    @Override // p000.InterfaceC4113gO
    /* renamed from: b */
    public final EnumC11690xa1 mo8527b() {
        return this.f12675c;
    }

    @Override // p000.InterfaceC4113gO
    /* renamed from: c */
    public final String mo8528c() {
        return this.f12673a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1362Ve)) {
            return false;
        }
        C1362Ve c1362Ve = (C1362Ve) obj;
        return this.f12673a.equals(c1362Ve.f12673a) && this.f12674b == c1362Ve.f12674b && this.f12675c.equals(c1362Ve.f12675c) && this.f12676d.equals(c1362Ve.f12676d) && this.f12677e == c1362Ve.f12677e && this.f12678f.equals(c1362Ve.f12678f) && this.f12679g == c1362Ve.f12679g && this.f12680h == c1362Ve.f12680h && this.f12681i == c1362Ve.f12681i;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f12673a.hashCode() ^ 1000003) * 1000003) ^ this.f12674b) * 1000003) ^ this.f12675c.hashCode()) * 1000003) ^ this.f12676d.hashCode()) * 1000003) ^ this.f12677e) * 1000003) ^ this.f12678f.hashCode()) * 1000003) ^ this.f12679g) * 1000003) ^ this.f12680h) * 1000003) ^ this.f12681i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderConfig{mimeType=");
        sb.append(this.f12673a);
        sb.append(", profile=");
        sb.append(this.f12674b);
        sb.append(", inputTimebase=");
        sb.append(this.f12675c);
        sb.append(", resolution=");
        sb.append(this.f12676d);
        sb.append(", colorFormat=");
        sb.append(this.f12677e);
        sb.append(", dataSpace=");
        sb.append(this.f12678f);
        sb.append(", frameRate=");
        sb.append(this.f12679g);
        sb.append(", IFrameInterval=");
        sb.append(this.f12680h);
        sb.append(", bitrate=");
        return AbstractC1374Vq.m8591j(sb, this.f12681i, "}");
    }
}
