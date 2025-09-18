package androidx.media;

import java.util.Arrays;
import p000.AbstractC11153tN0;

/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    public int f16330a = 0;

    /* renamed from: b */
    public int f16331b = 0;

    /* renamed from: c */
    public int f16332c = 0;

    /* renamed from: d */
    public int f16333d = -1;

    public final boolean equals(Object obj) {
        int i;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f16331b == audioAttributesImplBase.f16331b) {
            int i2 = this.f16332c;
            int i3 = audioAttributesImplBase.f16332c;
            int i4 = audioAttributesImplBase.f16333d;
            if (i4 == -1) {
                int i5 = audioAttributesImplBase.f16330a;
                int i6 = AudioAttributesCompat.f16326b;
                if ((i3 & 1) != 1) {
                    if ((i3 & 4) != 4) {
                        switch (i5) {
                            case 2:
                                i = 0;
                                break;
                            case 3:
                                i = 8;
                                break;
                            case 4:
                                i = 4;
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i = 5;
                                break;
                            case 6:
                                i = 2;
                                break;
                            case 11:
                                i = 10;
                                break;
                            case 12:
                            default:
                                i = 3;
                                break;
                            case 13:
                                i = 1;
                                break;
                        }
                    } else {
                        i = 6;
                    }
                } else {
                    i = 7;
                }
            } else {
                i = i4;
            }
            if (i == 6) {
                i3 |= 4;
            } else if (i == 7) {
                i3 |= 1;
            }
            if (i2 == (i3 & 273) && this.f16330a == audioAttributesImplBase.f16330a && this.f16333d == i4) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f16331b), Integer.valueOf(this.f16332c), Integer.valueOf(this.f16330a), Integer.valueOf(this.f16333d)});
    }

    public final String toString() {
        String strM24909u;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f16333d != -1) {
            sb.append(" stream=");
            sb.append(this.f16333d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.f16330a;
        int i2 = AudioAttributesCompat.f16326b;
        switch (i) {
            case 0:
                strM24909u = "USAGE_UNKNOWN";
                break;
            case 1:
                strM24909u = "USAGE_MEDIA";
                break;
            case 2:
                strM24909u = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strM24909u = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strM24909u = "USAGE_ALARM";
                break;
            case 5:
                strM24909u = "USAGE_NOTIFICATION";
                break;
            case 6:
                strM24909u = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strM24909u = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strM24909u = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strM24909u = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strM24909u = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strM24909u = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strM24909u = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strM24909u = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strM24909u = "USAGE_GAME";
                break;
            case 15:
            default:
                strM24909u = AbstractC11153tN0.m24909u(i, "unknown usage ");
                break;
            case 16:
                strM24909u = "USAGE_ASSISTANT";
                break;
        }
        sb.append(strM24909u);
        sb.append(" content=");
        sb.append(this.f16331b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f16332c).toUpperCase());
        return sb.toString();
    }
}
