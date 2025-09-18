package defpackage;

import android.media.MediaFormat;
import android.util.Size;
import com.google.android.gms.common.Scopes;

/* renamed from: Ve, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1669Ve implements InterfaceC3953gO {
    public final String a;
    public final int b;
    public final EnumC8011xa1 c;
    public final Size d;
    public final int e;
    public final C1747We f;
    public final int g;
    public final int h;
    public final int i;

    public C1669Ve(String str, int i, EnumC8011xa1 enumC8011xa1, Size size, int i2, C1747We c1747We, int i3, int i4, int i5) {
        this.a = str;
        this.b = i;
        this.c = enumC8011xa1;
        this.d = size;
        this.e = i2;
        this.f = c1747We;
        this.g = i3;
        this.h = i4;
        this.i = i5;
    }

    public static C1666Vd d() {
        C1666Vd c1666Vd = new C1666Vd();
        c1666Vd.b = -1;
        c1666Vd.h = 1;
        c1666Vd.e = 2130708361;
        c1666Vd.f = C1747We.d;
        return c1666Vd;
    }

    @Override // defpackage.InterfaceC3953gO
    public final MediaFormat a() {
        Size size = this.d;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.a, size.getWidth(), size.getHeight());
        mediaFormatCreateVideoFormat.setInteger("color-format", this.e);
        mediaFormatCreateVideoFormat.setInteger("bitrate", this.i);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", this.g);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", this.h);
        int i = this.b;
        if (i != -1) {
            mediaFormatCreateVideoFormat.setInteger(Scopes.PROFILE, i);
        }
        C1747We c1747We = this.f;
        int i2 = c1747We.a;
        if (i2 != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-standard", i2);
        }
        int i3 = c1747We.b;
        if (i3 != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-transfer", i3);
        }
        int i4 = c1747We.c;
        if (i4 != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-range", i4);
        }
        return mediaFormatCreateVideoFormat;
    }

    @Override // defpackage.InterfaceC3953gO
    public final EnumC8011xa1 b() {
        return this.c;
    }

    @Override // defpackage.InterfaceC3953gO
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1669Ve)) {
            return false;
        }
        C1669Ve c1669Ve = (C1669Ve) obj;
        return this.a.equals(c1669Ve.a) && this.b == c1669Ve.b && this.c.equals(c1669Ve.c) && this.d.equals(c1669Ve.d) && this.e == c1669Ve.e && this.f.equals(c1669Ve.f) && this.g == c1669Ve.g && this.h == c1669Ve.h && this.i == c1669Ve.i;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderConfig{mimeType=");
        sb.append(this.a);
        sb.append(", profile=");
        sb.append(this.b);
        sb.append(", inputTimebase=");
        sb.append(this.c);
        sb.append(", resolution=");
        sb.append(this.d);
        sb.append(", colorFormat=");
        sb.append(this.e);
        sb.append(", dataSpace=");
        sb.append(this.f);
        sb.append(", frameRate=");
        sb.append(this.g);
        sb.append(", IFrameInterval=");
        sb.append(this.h);
        sb.append(", bitrate=");
        return AbstractC1705Vq.j(sb, this.i, "}");
    }
}
