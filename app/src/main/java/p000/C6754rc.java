package p000;

import android.media.MediaFormat;
import com.google.android.gms.common.Scopes;

/* renamed from: rc */
/* loaded from: classes.dex */
public final class C6754rc implements InterfaceC4113gO {

    /* renamed from: a */
    public final String f41750a;

    /* renamed from: b */
    public final int f41751b;

    /* renamed from: c */
    public final EnumC11690xa1 f41752c;

    /* renamed from: d */
    public final int f41753d;

    /* renamed from: e */
    public final int f41754e;

    /* renamed from: f */
    public final int f41755f;

    public C6754rc(String str, int i, EnumC11690xa1 enumC11690xa1, int i2, int i3, int i4) {
        this.f41750a = str;
        this.f41751b = i;
        this.f41752c = enumC11690xa1;
        this.f41753d = i2;
        this.f41754e = i3;
        this.f41755f = i4;
    }

    @Override // p000.InterfaceC4113gO
    /* renamed from: a */
    public final MediaFormat mo8526a() {
        String str = this.f41750a;
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(str, this.f41754e, this.f41755f);
        mediaFormatCreateAudioFormat.setInteger("bitrate", this.f41753d);
        int i = this.f41751b;
        if (i != -1) {
            if (str.equals("audio/mp4a-latm")) {
                mediaFormatCreateAudioFormat.setInteger("aac-profile", i);
            } else {
                mediaFormatCreateAudioFormat.setInteger(Scopes.PROFILE, i);
            }
        }
        return mediaFormatCreateAudioFormat;
    }

    @Override // p000.InterfaceC4113gO
    /* renamed from: b */
    public final EnumC11690xa1 mo8527b() {
        return this.f41752c;
    }

    @Override // p000.InterfaceC4113gO
    /* renamed from: c */
    public final String mo8528c() {
        return this.f41750a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6754rc)) {
            return false;
        }
        C6754rc c6754rc = (C6754rc) obj;
        return this.f41750a.equals(c6754rc.f41750a) && this.f41751b == c6754rc.f41751b && this.f41752c.equals(c6754rc.f41752c) && this.f41753d == c6754rc.f41753d && this.f41754e == c6754rc.f41754e && this.f41755f == c6754rc.f41755f;
    }

    public final int hashCode() {
        return ((((((((((this.f41750a.hashCode() ^ 1000003) * 1000003) ^ this.f41751b) * 1000003) ^ this.f41752c.hashCode()) * 1000003) ^ this.f41753d) * 1000003) ^ this.f41754e) * 1000003) ^ this.f41755f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioEncoderConfig{mimeType=");
        sb.append(this.f41750a);
        sb.append(", profile=");
        sb.append(this.f41751b);
        sb.append(", inputTimebase=");
        sb.append(this.f41752c);
        sb.append(", bitrate=");
        sb.append(this.f41753d);
        sb.append(", sampleRate=");
        sb.append(this.f41754e);
        sb.append(", channelCount=");
        return AbstractC1374Vq.m8591j(sb, this.f41755f, "}");
    }
}
