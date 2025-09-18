package io.sentry.android.replay;

import p000.AbstractC7222ym;

/* renamed from: io.sentry.android.replay.u */
/* loaded from: classes2.dex */
public final class C5961u {

    /* renamed from: a */
    public final int f34031a;

    /* renamed from: b */
    public final int f34032b;

    /* renamed from: c */
    public final float f34033c;

    /* renamed from: d */
    public final float f34034d;

    /* renamed from: e */
    public final int f34035e;

    /* renamed from: f */
    public final int f34036f;

    public C5961u(int i, int i2, float f, float f2, int i3, int i4) {
        this.f34031a = i;
        this.f34032b = i2;
        this.f34033c = f;
        this.f34034d = f2;
        this.f34035e = i3;
        this.f34036f = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5961u)) {
            return false;
        }
        C5961u c5961u = (C5961u) obj;
        return this.f34031a == c5961u.f34031a && this.f34032b == c5961u.f34032b && Float.compare(this.f34033c, c5961u.f34033c) == 0 && Float.compare(this.f34034d, c5961u.f34034d) == 0 && this.f34035e == c5961u.f34035e && this.f34036f == c5961u.f34036f;
    }

    public final int hashCode() {
        return ((((Float.floatToIntBits(this.f34034d) + ((Float.floatToIntBits(this.f34033c) + (((this.f34031a * 31) + this.f34032b) * 31)) * 31)) * 31) + this.f34035e) * 31) + this.f34036f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenshotRecorderConfig(recordingWidth=");
        sb.append(this.f34031a);
        sb.append(", recordingHeight=");
        sb.append(this.f34032b);
        sb.append(", scaleFactorX=");
        sb.append(this.f34033c);
        sb.append(", scaleFactorY=");
        sb.append(this.f34034d);
        sb.append(", frameRate=");
        sb.append(this.f34035e);
        sb.append(", bitRate=");
        return AbstractC7222ym.m26235l(sb, this.f34036f, ')');
    }
}
