package com.huawei.hms.common.size;

import com.huawei.hms.common.internal.Objects;
import p000.AbstractC7222ym;

/* loaded from: classes.dex */
public class Size {

    /* renamed from: a */
    private final int f18980a;

    /* renamed from: b */
    private final int f18981b;

    public Size(int i, int i2) {
        this.f18980a = i;
        this.f18981b = i2;
    }

    public static Size parseSize(String str) {
        try {
            int iIndexOf = str.indexOf("x");
            if (iIndexOf < 0) {
                iIndexOf = str.indexOf("*");
            }
            return new Size(Integer.parseInt(str.substring(0, iIndexOf)), Integer.parseInt(str.substring(iIndexOf + 1)));
        } catch (Exception unused) {
            throw new IllegalArgumentException("Size parses failed");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        return this.f18980a == size.f18980a && this.f18981b == size.f18981b;
    }

    public final int getHeight() {
        return this.f18981b;
    }

    public final int getWidth() {
        return this.f18980a;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(getWidth()), Integer.valueOf(getHeight()));
    }

    public final String toString() {
        return AbstractC7222ym.m26229f(this.f18980a, "Width is ", this.f18981b, " Height is ");
    }
}
