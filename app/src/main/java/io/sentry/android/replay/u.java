package io.sentry.android.replay;

import defpackage.AbstractC8235ym;

/* loaded from: classes2.dex */
public final class u {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final int e;
    public final int f;

    public u(int i, int i2, float f, float f2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i3;
        this.f = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.a == uVar.a && this.b == uVar.b && Float.compare(this.c, uVar.c) == 0 && Float.compare(this.d, uVar.d) == 0 && this.e == uVar.e && this.f == uVar.f;
    }

    public final int hashCode() {
        return ((((Float.floatToIntBits(this.d) + ((Float.floatToIntBits(this.c) + (((this.a * 31) + this.b) * 31)) * 31)) * 31) + this.e) * 31) + this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenshotRecorderConfig(recordingWidth=");
        sb.append(this.a);
        sb.append(", recordingHeight=");
        sb.append(this.b);
        sb.append(", scaleFactorX=");
        sb.append(this.c);
        sb.append(", scaleFactorY=");
        sb.append(this.d);
        sb.append(", frameRate=");
        sb.append(this.e);
        sb.append(", bitRate=");
        return AbstractC8235ym.l(sb, this.f, ')');
    }
}
