package defpackage;

import android.media.MediaFormat;
import com.google.android.gms.common.Scopes;

/* renamed from: rc */
/* loaded from: classes.dex */
public final class C6871rc implements InterfaceC3953gO {
    public final String a;
    public final int b;
    public final EnumC8011xa1 c;
    public final int d;
    public final int e;
    public final int f;

    public C6871rc(String str, int i, EnumC8011xa1 enumC8011xa1, int i2, int i3, int i4) {
        this.a = str;
        this.b = i;
        this.c = enumC8011xa1;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    @Override // defpackage.InterfaceC3953gO
    public final MediaFormat a() {
        String str = this.a;
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(str, this.e, this.f);
        mediaFormatCreateAudioFormat.setInteger("bitrate", this.d);
        int i = this.b;
        if (i != -1) {
            if (str.equals("audio/mp4a-latm")) {
                mediaFormatCreateAudioFormat.setInteger("aac-profile", i);
            } else {
                mediaFormatCreateAudioFormat.setInteger(Scopes.PROFILE, i);
            }
        }
        return mediaFormatCreateAudioFormat;
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
        if (!(obj instanceof C6871rc)) {
            return false;
        }
        C6871rc c6871rc = (C6871rc) obj;
        return this.a.equals(c6871rc.a) && this.b == c6871rc.b && this.c.equals(c6871rc.c) && this.d == c6871rc.d && this.e == c6871rc.e && this.f == c6871rc.f;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioEncoderConfig{mimeType=");
        sb.append(this.a);
        sb.append(", profile=");
        sb.append(this.b);
        sb.append(", inputTimebase=");
        sb.append(this.c);
        sb.append(", bitrate=");
        sb.append(this.d);
        sb.append(", sampleRate=");
        sb.append(this.e);
        sb.append(", channelCount=");
        return AbstractC1705Vq.j(sb, this.f, "}");
    }
}
